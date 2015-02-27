package linkedList;

public class SumOfNumbers
{
	public static void main(String[] args)
	{
       LinkedList ll1=new LinkedList();
       LinkedList ll2=new LinkedList();
       LinkedList ll3=new LinkedList();
       LinkedList op=new LinkedList();
       
       //number=432
       ll1.addAtEnd(2);
       ll1.addAtEnd(3);
       ll1.addAtEnd(4);
       
       //number=1988
       ll2.addAtEnd(8);
       ll2.addAtEnd(8);
       ll2.addAtEnd(9);
       ll2.addAtEnd(1);
       
       //number=859
       ll3.addAtEnd(9);
       ll3.addAtEnd(5);
       ll3.addAtEnd(8);
       
       Node temp1=ll1.head;
       Node temp2=ll2.head;
       Node temp3=ll3.head;
       //op=2277       7-->7-->2-->2
       int num1,num2,num3,sum;
       int carry=0;
       while(temp1!=null || temp2!=null || temp3!=null)
       {
    	    num1=(temp1!=null)?temp1.data:0;
    	    num2=(temp2!=null)?temp2.data:0;
    	    num3=(temp3!=null)?temp3.data:0;
            
    	    if(temp1!=null) temp1=temp1.next;
    	    if(temp2!=null) temp2=temp2.next;
    	    if(temp3!=null) temp3=temp3.next;
    	    
    	    sum=num1+num2+num3+carry;
    	    op.addAtEnd(sum%10);
    	    carry=sum/10;
       }
       if(carry>0)
       op.addAtEnd(carry);
       op.printLinkedList();
	}
}
