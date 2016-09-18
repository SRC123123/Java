//Shawn Cummings
//https://github.com/SRC123123/Java/tree/master/COSC-311-HW2
//COSC 311
//HW 09/14
//Fall 2016

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int [] deck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		boolean [] index = new boolean [deck.length];
		int curr = 0, x = 0;
		
		Random gen = new Random();		
		gen.setSeed(System.nanoTime());		
		
		while (x < 3)
		{	
			while(true)
			{
				curr = gen.nextInt(deck.length);

				if(index[curr]==false)
				{
					index[curr] = true;
					break;					
				}			
			}
			x++;			
		}
		
		for(int i = 0; i < deck.length; i++)
		{
			if(index[i]== true)
			{
				System.out.println(deck[i]);
			}
		}
	}
}
