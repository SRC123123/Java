import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Initialization
		int [] deck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		boolean [] index = new boolean [deck.length];
		int curr = 0, x = 0;
		int [] hand = new int[3];
		boolean cont = true;
		long timeStart, timeEnd;
		
		
		//Generator
		Random gen = new Random();		
		gen.setSeed(System.nanoTime());		
		
		//Algorithm 1
		timeStart = System.nanoTime();
		while(cont==true)
		{
			
			for(int i = 0; i < 3; i++)
			{
				hand[i] = gen.nextInt(deck.length);
			}
			
			for(int i = 0; i < hand.length-1; i++)
			{
				for(int y = i+1; y < hand.length; y++)
				{
					if(hand[i]==hand[y])
					{
						cont = true;
						break;
					}
					else
					{
						cont = false;						
					}
				}
				
				if(cont==true)
					break;
			}
			
		}
		timeEnd = System.nanoTime();
		
		System.out.println("Alg 1 Time : " + (timeEnd-timeStart) + "\n");
		
		for(int i = 0; i < hand.length; i++)
		{
			System.out.println("A1: " + hand[i]);
		}
		
		//Algorithm 2
		timeStart = System.nanoTime();
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
		
		timeEnd = System.nanoTime();
		
		System.out.println("Alg 2 Time : " + (timeEnd-timeStart) + "\n");
		
		//Algorithm 3
		timeStart = System.nanoTime();
		int size = deck.length;
		for (int i =0; i < 3; i++, size--)
		     {
		          x = gen.nextInt(size);
		          hand[i] = deck[x];
		          deck[x] = deck[size-1];
		     }
		timeEnd = System.nanoTime();
		
		System.out.println("Alg 3 Time : " + (timeEnd-timeStart));
		
		
		

	}

}
