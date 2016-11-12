//Source code for insert function found at http://tinyurl.com/jhahdkr
public class BST {
	
	Node root;
		
	public BST(int x)
	{
		root = new Node(x, null, null);
	}
	
	//Sorts data into a BST
	public Node insert(int x, Node n)
	{
		if(n == null)
		{			
			return (new Node(x, null, null));
		}
		else if(x<n.data)
		{
			n.left = insert(x, n.left);			
		}
		else
		{
			n.right = insert(x, n.right);			
		}
		return n;
	}
	
	//Recursive Height Function
	public int height(Node node)
	{
		if(node == null)
			return -1;
		else
			return 1 + Math.max(height(node.right), height(node.left));
	}
	
	//Non-recursive Balance Function
	public int balance(Node node)
	{
		if(node == null)
			return 0;
		else
			return height(node.right)-height(node.left);
	}
	
	//Node Class
	public static class Node {
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data, Node left, Node right)
		{
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}
}


