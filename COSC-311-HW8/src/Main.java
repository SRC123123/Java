//Shawn Cummings
//http://tinyurl.com/guasspu
//COSC 311
//HW 11/28
//Fall 2016

public class Main {

	public static void main(String[] args) {
		MyNode queue = new MyNode();
		int data[] = {5, 3, 5, 3, 1, 2, 3, 4, 6, 3, 7, 1, 2};
		
		//insert and sort all data
		for(int i = 0; i < data.length; i++)
		{
			queue.insert(data[i]);
			System.out.println();
			queue.print();
		}
		
		//delete and print results		
		for(int i = 0; i < data.length-1; i++)
		{
			queue.delete();
			System.out.println();
			queue.print();
			System.out.println();
			queue.maxAge();
		}
		
	}
}