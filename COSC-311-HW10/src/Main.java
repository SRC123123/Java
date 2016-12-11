//Shawn Cummings
//http://tinyurl.com/gwpofcb
//COSC 311
//HW 12/12
//Fall 2016

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		String [] data = {"ikeji", "bahorski", "chaudhuri", "evette", 
				"haynes", "maniccam", "moore", "narayanan", "panja", 
				"poh", "sverdlik", "tehranipour", "zeiger", "zhang",
				"cowan", "francis", "mansour"};
		
		ms.mergeSort(data);
		
		for(String s: data)
			System.out.println(s);
		
		System.out.println("\nCounter: " + ms.getCounter());

	}

}
