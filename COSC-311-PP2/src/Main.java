import java.util.Random;

public class Main {

	public static void main(String[] args) {

		//Initialize		
		Random gen = new Random();
		int [] nRanges = {4, 8, 12, 16, 20, 2000, 4000, 6000, 8000, 10000};
		int [] cc = {5, 3, 5, 3, 1, 2, 3, 4, 6, 3, 7, 1, 2};

		//Main Loop
		//Changes the value of N
		//Allows the program to run every variation of N we need it to
		//so all of the Project data will be in the output
		for(int n : nRanges){

			System.out.println("N == " + n);

			for(int i = 0; i < 1000; i++)
				System.out.print("=");
			System.out.println();

			//Initialize arrays
			int [] sc1 = new int [n];
			int [] sc2 = new int [n];
			int [] sc3 = new int [n];
			int [] data = new int[n];
			int [] temp = null;

			//Populate arrays with data
			for(int i = 0; i < n; i++)
			{
				sc1[i] = 1;
				sc2[i] = i+1;
				sc3[i] = n - i;
				data[i] = gen.nextInt(); //Randomly generate data
			}

			//Insert/Delete/Output
			//This will select a data set to be used
			//Then insert all of the data into the priority queue
			//Then delete all of the data in the priority queue
			//Then output the results of the max age
			for(int x = 0; x < 5; x++)
			{	
				//Select Data Set
				switch(x){
				case 0:
					temp = cc;
					System.out.println("Correctness Check");
					break;
				case 1:
					temp = sc1;
					System.out.println("Sanity Check 1");
					break;
				case 2:
					temp = sc2;
					System.out.println("Sanity Check 2");
					break;
				case 3:
					temp = sc3;
					System.out.println("Sanity Check 3");
					break;
				case 4:
					temp = data;
					System.out.println("Random Data");
					break;			
				}

				//Initialize PriorityQueue - necessary to reset counter after change of data set
				PriorityQueue cue = new PriorityQueue();

				//Insert Data into Priority Queue
				for(int i : temp)
				{
					cue.insert(i);
				}			
				cue.print(); //Print list of all data in queue

				//Delete Data inside the Priority Queue
				for(int i : temp)
				{
					cue.delete();			
				}
				cue.print(); //Print max
				
			}
		}

	}
}
