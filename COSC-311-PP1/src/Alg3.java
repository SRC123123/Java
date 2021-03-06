//Shawn Cummings
//COSC 311 - Programming Project 1
//http://tinyurl.com/hlqjqkq

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Alg3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Initialize
		int n = 10, k = 3, i = 0, temp, size;
		int [] deck, hand;		
		long time;
		
		//Random Generator
		Random gen = new Random();		
		gen.setSeed(System.nanoTime());	
		
		//Open File
		Scanner fin = new Scanner(new File("input.txt"));
		
		//Output Header
		String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		System.out.println("Algorithm 3 \n" + date + "\n");
		
		//Input Loop and Algorithm Timing
		while(fin.hasNext())		
		{	
			//Importing K and N
			k = fin.nextInt();
			n = fin.nextInt();
			deck = new int[n];
			hand = new int[k];
			size = deck.length;
			
			//Loading deck with values
			for(int x = 0; x < n; x++)
				deck[x] = x;
			
			//Algorithm & Measuring Time
			time = System.nanoTime();		
			for (int x =0; x < k; x++, size--)
		    {
				temp = gen.nextInt(size);		       
		        deck[temp] = deck[size-1];
		    }
			
			//Calculate and print time
			time = System.nanoTime() - time;			
			System.out.println("("+ n + ", " + k + "): " + time);
			i++;
		}
		
		//Close File
		fin.close();
		
		//Sanity Check					
		for(i = 0; i < 5; i++)
		{
			deck = new int[10];
			size = deck.length;
			for(int x = 0; x < 10; x++)
				deck[x] = x;			
			
			System.out.print("\nSanity Check " + (i+1) +": ");			
			
			for (int x =0; x < 5; x++, size--)
		     {
		          temp = gen.nextInt(size);
		          System.out.print(deck[temp] + ", ");
		          deck[temp] = deck[size-1];
		     }
		}		
		
	}
}
