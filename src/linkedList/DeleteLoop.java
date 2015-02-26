package linkedList;

public class DeleteLoop
{
public static void main(String[] args)
{
  LinkedList LList=new LinkedList();
  LList.addAtEnd(1);
  Node n1=new Node(2);
  LList.addNodeAtEnd(n1);
  LList.addAtEnd(3);
  LList.addAtEnd(4);
  Node n2=new Node(5,n1);
  LList.addNodeAtEnd(n2);
  
  deleteLoop(LList);
  LList.printLinkedList();
} 

private static void deleteLoop(LinkedList LList)
{
	// TODO Auto-generated method stub
	Node sp=LList.head;
	Node fp=sp.next.next;
	Node temp=sp;
	
	//detect loop by keeping fast and slow pointers
	while(fp!=sp)
	{
		fp=fp.next.next;
		sp=sp.next;
	}
	
	
	//count the number of nodes in looop
	int loopLength=0;
	do
	{
		fp=fp.next;
		loopLength++;
	}while(sp!=fp);
	
	
	//keep a pointer at distance of loop length fron=m head
	for(int i=0;i<loopLength;i++)
	{
		temp=temp.next;
	}
	Node temp2=LList.head;
	
	//Increment both the pointers by one til they meet
	while(temp.next!=temp2.next)
	{
		temp=temp.next;
		temp2=temp2.next;
	}
	temp.next=null;
	
}
}
