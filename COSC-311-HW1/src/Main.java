import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		int [] input = new int[1000];
		Scanner fin = new Scanner(new File("input.txt"));		
		
		int x;
		int j = 0;
		int i = 1;
		
		while(fin.hasNextInt())
		{
			input[j] = fin.nextInt();
			j++;
		}
		
		while(input[i] != -1)
		{
			j = i;
			while(j > 0 && input[j-1] > input[j])
			{
				x = input[j-1];
				input[j-1] = input[j];
				input[j] = x;
				j--;
			}
			i++;
		}
		
		for(i = 0; i < input.length-1; i++)
			System.out.println(input[i]);
		
		fin.close();
		
	}

}
