//Shawn Cummings
//
//COSC 311
//HW 10/19
//Fall 2016

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		String parens;;
		int num = 0;
		Scanner fin = new Scanner(new File("Input.txt"));
		
		while(fin.hasNextLine())
		{					
			parens = fin.nextLine().replaceAll("\\s", ""); //import, remove spaces
			System.out.print(parens + ": ");
			num = 0;
			
			while(parens.isEmpty() == false)
			{
				//Check for unmatched parentheses
				if (parens.charAt(0) == ')' || parens.charAt(parens.length()-1) == '(')
				{
					num = -1;
					break;
				}			
				
				parens = parens.substring(1); //Remove first '('					
							
				if(parens.charAt(0)==')')
				{
					parens = parens.substring(1);
					
					if(parens.isEmpty()) //Checks for last level
						num++;
				}
				else if(parens.charAt(parens.length()-1) == ')')
				{
					parens = parens.substring(0, (parens.length()-1)); //remove right most ')'
					num++;				
				}
				else
					break;			
			}
			
			System.out.println(num);
		}
	}
}
