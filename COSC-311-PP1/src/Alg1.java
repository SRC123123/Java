//Shawn Cummings
//COSC 311 - Programming Project 1
//http://tinyurl.com/zygn8k5

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Alg1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Initialize
		int n = 10, k = 3;
		long time;		
		int [] array;
		boolean cont = true;
		
		//Random Generator
		Random gen = new Random();		
		gen.setSeed(System.nanoTime());
		
		//Open File
		Scanner fin = new Scanner(new File("input.txt"));
		
		//Output Header
		String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		System.out.println("Algorithm 1 \n" + date + "\n");

		//Input Loop and Algorithm Timing
		while(fin.hasNext())		
		{
			//Importing K and N
			k = fin.nextInt();
			n = fin.nextInt();
			array = new int [k];
			cont = true;
			
			//Algorithm & Measuring Time
			time = System.nanoTime();
			while(cont==true)
			{	
				//Fill array with Random numbers
				for(int i = 0; i < k; i++)
				{
					array[i] = gen.nextInt(n);
				}
				
				//Check for duplicates
				for(int i = 0; i < array.length-1; i++)
				{
					for(int y = i+1; y < array.length; y++)
					{
						if(array[i]==array[y])
						{
							cont = true;
							break;
						}
						else
						{
							cont = false;						
						}
					}
					
					//Check if duplicates found, if found break from 'for' loop
					if(cont==true)
					{						
						break;
					}						
				}				
			}
			
			//Calculate and print time
			time = System.nanoTime() - time;
			System.out.println("("+ n + ", " + k + "): " + time);
		}
		
		//Close File
		fin.close();
		
		//Sanity Check
		array = new int [5];		
		for(int check = 0; check < 5; check++)
		{			
			System.out.print("\nSanity Check " + (check+1) + ": ");
			cont = true;
			
			//Algorithm
			while(cont==true)
			{	
				//Fill array with Random numbers
				for(int i = 0; i < 5; i++)
				{
					array[i] = gen.nextInt(10);
				}
				
				//Check for duplicates
				for(int i = 0; i < array.length-1; i++)
				{
					for(int y = i+1; y < array.length; y++)
					{
						if(array[i]==array[y])
						{
							cont = true;
							break;
						}
						else
						{
							cont = false;						
						}
					}
					
					//check if duplicates found
					if(cont==true)
					{						
						break;
					}						
				}
				
				//print results, if no duplicates
				if(cont==false)
					for(int x = 0; x < 5; x++)
						System.out.print(array[x] + ", ");	
			}			
		}		
	}
}


