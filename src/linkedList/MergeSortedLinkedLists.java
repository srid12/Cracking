package linkedList;

public class MergeSortedLinkedLists
{
	public static void main(String[] args)
	{
		LinkedList head1 = new LinkedList();
		LinkedList head2 = new LinkedList();
		head1.addAtEnd(2);
		head1.addAtEnd(4);
		head1.addAtEnd(6);
		head1.addAtEnd(8);
		head1.addAtEnd(11);
		head1.addAtEnd(14);
		head1.printLinkedList();

		head2.addAtEnd(1);
		head2.addAtEnd(3);
		head2.addAtEnd(5);
		head2.addAtEnd(7);
		head2.addAtEnd(9);
		head1.addAtEnd(12);
		head2.printLinkedList();

		mergeLinkedLists(head1, head2).printLinkedList();

	}

	private static LinkedList mergeLinkedLists(LinkedList head1, LinkedList head2)
	{
		// TODO Auto-generated method stub
		Node temp1 = head1.head;
		Node temp2 = head2.head;
		Node curr;
		if (temp1.data < temp2.data)
		{
			curr = temp1;
			temp1 = temp1.next;
		}
		else
		{
			curr = temp2;
			temp2 = temp2.next;
		}
		while ((temp1) != null && (temp2) != null)
		{
			if (temp1.data < temp2.data)
			{
				curr.next = temp1;
				temp1 = temp1.next;
			}
			else
			{
				curr.next = temp2;
				temp2 = temp2.next;
			}
			curr=curr.next;
		}
		if(temp1==null)
			curr.next=temp2;
		if(temp2==null)
			curr.next=temp1;
		return (head1.head.data<head2.head.data)?head1:head2;
	}
}
