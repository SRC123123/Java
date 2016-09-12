//Shawn Cummings
//https://github.com/SRC123123/COSC-311-HW1.git
//COSC 311
//HW 09/07
//Fall 2016

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		int [] input = new int[1000];
		Scanner fin = new Scanner(new File("input.txt"));
		PrintWriter fout = new PrintWriter(new File("output.txt"));		
		int x, j = 0, i = 1;
		
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
		
		i = 0;
		while(input[i]!= -1){
			fout.println(input[i]);
			i++;
		}
		
		fin.close();
		fout.close();
		
	}
}
