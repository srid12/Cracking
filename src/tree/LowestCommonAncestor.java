package tree;

public class LowestCommonAncestor
{

	public static void main(String[] args)
	{
		BTree bt = new BTree();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		bt.root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n6.left = n7;
		n5.left = n8;
		
		System.out.println("lowest common ancestor="+lowestCommonAncestor(bt.root,n3,n8));
	}

	private static String lowestCommonAncestor(Node root, Node child1, Node child2)
	{
		return null;
	}

	
}
