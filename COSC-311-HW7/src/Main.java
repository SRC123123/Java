//Shawn Cummings
//
//COSC 311
//HW 11/14
//Fall 2016

public class Main {
		
	public static void main(String[] args) {
		int data[] = {10, 5, 15, 3, 13, 17, 18, 22, 21};
		
		//Initialize root of tree
		BST tree = new BST(data[0]);
		
		//Fill the tree
		for(int i = 1; i < data.length; i++)
		{
			tree.insert(data[i], tree.root);
		}
		
		//Calculate and print Height and Balance
		System.out.println(tree.height(tree.root));
		System.out.println(tree.balance(tree.root));		
	}
}
