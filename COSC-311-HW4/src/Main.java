//Shawn Cummings
//http://tinyurl.com/ztgoqdt
//COSC 311
//HW 10/17
//Fall 2016

public class Main {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push(3);
		stack.push(5);
		
		System.out.println(stack.max()); //max == 5
		
		stack.pop();
		stack.push(4);
		stack.push(1);
		
		System.out.println(stack.max()); //max == 4

	}

}