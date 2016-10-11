import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Alg2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Initialize
		int n = 10, k = 3, x=0, i = 0, curr;
		long time;	
		
		Random gen = new Random();		
		gen.setSeed(System.nanoTime());
		Scanner fin = new Scanner(new File("input.txt"));

		String date = new SimpleDateFormat("MM-dd-yyyy").format(new Date());
		System.out.println("Algorithm 2 \n" + date + "\n");

		while(fin.hasNext())		
		{
			//Importing K and N
			k = fin.nextInt();
			n = fin.nextInt();
			boolean used [] = new boolean[n];			
			
			//Algorithm & Measuring Time
			time = System.nanoTime();			
			for(x = 0; x < k; x++)
			{				
				while(true)
				{
					curr = gen.nextInt(n);

					if(used[curr]==false)
					{
						used[curr] = true;
						break;					
					}			
				}
			}
			
			//Calculate and print time
			time = System.nanoTime() - time;
			System.out.println("("+ n + ", " + k + "): " + time);
						
		}
		
		//Sanity Check
		for(i = 0; i < 5; i++)		
		{			
			boolean used [] = new boolean[10];
			
			System.out.print("\nSanity Check " + (i+1) +": ");	
			
			//Algorithm
			for(x = 0; x < 5; x++)
			{				
				while(true)
				{
					curr = gen.nextInt(10);

					if(used[curr]==false)
					{
						used[curr] = true;
						break;					
					}			
				}
			}
			
			//Print
			for(x = 0; x < used.length; x++)
			{
				if(used[x] == true)
					System.out.print(x + ", ");
			}				
		}		
		
	}		
}	
	
	


