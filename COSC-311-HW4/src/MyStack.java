//Shawn Cummings
//http://tinyurl.com/h8bqnhl
//COSC 311
//HW 10/17
//Fall 2016

public class MyStack {

	private int data;
	private Node head;
	private Node max;
	
	//Constructor
	public MyStack()
	{
		head = new Node();
		max = new Node();
		data = 0;
	}

	//Push method - adding item to top of stack
	public void push(int data)
	{
		//Create new node
		Node temp = new Node();
		temp.prev = head;
		
		//Shift head
		head.next = temp;
		head.data = data;
		head = temp;		
	}
	
	//Pop method - removing the item on top of stack (LIFO)
	public void pop()
	{
		if(head.prev != null)
		{
			head = head.prev;
			head.next = null;
		}
	}
	
	//Peak method - returns the value of item on top of stack
	public int peak()
	{
		return head.prev.data;
	}
	
	//Max method - returns the largest value in the stack
	public int max()
	{	
		//Checking Linked list
		if(head.prev == null)
			return 0;
		else if(head.prev.prev == null)
			return head.prev.data;
		
		max = head;
		Node temp = max.prev;
		
		//Searching through linked list for max
		while(temp.prev != null)
		{			
			if(max.data < temp.data)
			{
				max = temp;
			}
			temp = temp.prev;			
		}
		
		return max.data;
	}
	
	//Node Class - used in creating linked list
	private class Node {
		private int data;
		private Node next;
		private Node prev;
	}

}