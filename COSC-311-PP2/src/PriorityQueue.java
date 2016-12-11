public class PriorityQueue {
	private Node head;
	private int counter;
	private int [] max;

	//Constructor
	public PriorityQueue()
	{
		counter = 0;
		max = new int [2];
	}

	//Inserting Node into Queue
	public void insert(int data)
	{	
		Node node = new Node(data, counter);
		sortNode(node, head);
		counter++;
	}

	//Finding the Node's proper location and insert it there
	private void sortNode(Node node, Node head)
	{	
		if(head == null) //If head is null, node is first to enter queue
		{
			this.head = node;
		}		
		else if(head.data > node.data) //Node is smaller than head, first in queue
		{	
			if(head.prev != null)
				head.prev.next = node;

			node.prev = head.prev;
			head.prev = node;
			node.next = head;

			if(node.prev == null) //Check Head
				this.head = node;
		}
		else if(head.next == null) //End of Queue, insert node
		{
			head.next = node;
			node.prev = head;
		}
		else //node is larger than head, continue search
		{
			sortNode(node, head.next);
		}				
	}

	//Delete Head
	public void delete()
	{
		if(head == null)
			return;	

		max();

		if(this.head.next != null)
		{
			this.head = this.head.next;
			this.head.prev.next = null;
			this.head.prev = null;
		}
		else
		{
			head = null;
		}
		counter++;
	}

	//Check current max
	private void max()
	{
		if(counter - this.head.ts > max[1])
		{
			max[0] = this.head.data; //max[0] == data
			max[1] = counter - this.head.ts; //max[1] == age of data
		}		
	}

	//Print Queue
	public void print()
	{
		//Print Max
		if(head == null)
			System.out.print("The oldest element is data = " + max[0] + ", with age = " + max[1] + "\n");
		
		//Print Everything Else
		Node temp = head;

		while(temp != null)
		{
			System.out.print("(D: " + temp.data + " TS: " + temp.ts + "), ");
			temp = temp.next;
		}
		
		System.out.println();
	}

	//Private Node Class
	private class Node {
		private int data;
		private int ts;
		private Node next;
		private Node prev;

		public Node(int data, int ts)
		{
			this.data = data;
			this.ts = ts;
		}
	}
}
