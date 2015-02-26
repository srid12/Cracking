package linkedList;

public class LinkedList
{
Node head;
public LinkedList()
{
	head=null;
}
	
public void addAtEnd(int value)
{
 Node node=new Node(value);
 if(head==null)
	 head=node;
 else
 {
	 Node temp=head;
	 while(temp.next!=null)
	 {
		 temp=temp.next;
	 }
	 temp.next=node;
 }
}

public void addNodeAtEnd(Node node)
{
 if(head==null)
	 head=node;
 else
 {
	 Node temp=head;
	 while(temp.next!=null)
		 temp=temp.next;
	 temp.next=node;
 }
}
public void printLinkedList()
{
  Node temp=head;
  while(temp!=null)
  {
	  System.out.print(temp.data);
	  System.out.print(" ");
	  temp=temp.next;
  }
  System.out.println();
}

}
