package linkedList;

public class Node
{
	
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public Node(int i, Node n1)
	{
		// TODO Auto-generated constructor stub
		this.data=i;
		this.next=n1;
	}

}
