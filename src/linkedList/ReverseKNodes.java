package linkedList;

public class ReverseKNodes
{

	public static void main(String[] args)
	{
	LinkedList head=new LinkedList();
	head.addAtEnd(1);
	head.addAtEnd(2);
	head.addAtEnd(3);
	head.addAtEnd(4);
	head.addAtEnd(5);
	head.addAtEnd(6);
	head.addAtEnd(7);
	head.addAtEnd(8);
    head.addAtEnd(9);
	
	int k=3;
	
	reverseKNodes(head);
	
	head.printLinkedList();
	System.out.println("completed");
	}

	private static void reverseKNodes(LinkedList head)
	{
		// TODO Auto-generated method stub
	     Node temp=head.head;
	     Node end=null;
	     while(temp!=null)
	     {
	    	  
	    	Node curr=temp.next;
	    	Node prev=temp;
	    	 Node adv = curr;
            
	    	for(int i=0;i<3 && curr!=null;i++)
	    	{
	    		if(adv!=null)
	 	    	   adv=adv.next;
	    	   curr.next=prev;
	    	   prev=curr;
	    	   curr=adv;
	    	   
	    	}
	    	if(head.head==temp)
	    	{
	    		head.head=prev;
	    	}
	    	if(end != null)
	    		end.next=prev;
	    	end=temp;
	    	temp.next=curr;
	    	temp=curr;
	     }
	}
}
