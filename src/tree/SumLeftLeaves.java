package tree;

public class SumLeftLeaves
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

		int n = sumLeftLeaves(bt.root, bt.root);
		System.out.println(n);
	}

	private static int sumLeftLeaves(Node root, Node parent)
	{
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
		{
			if (parent.left == root)
				return root.value;
			else
				return 0;
		}
		return sumLeftLeaves(root.left, root) + sumLeftLeaves(root.right, root);
	}

}
