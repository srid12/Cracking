package Arith;

public class NextHighestNumber
{
  public static void main(String[] args)
  {
	  int n=9788;
	  System.out.println("Next Highest Number="+nextHighestNumber(n));
  }

private static int nextHighestNumber(Integer n)
{
	String s=n.toString();
	StringBuilder s1=new StringBuilder(s);
	for(int i=s.length()-1;i>=1;i--)
	{
       if(s1.charAt(i)>s1.charAt(i-1))
       {
    	   char temp=s.charAt(i);
    	   s1.setCharAt(i, s1.charAt(i-1));
    	   s1.setCharAt(i-1,temp);
    	   break;
       }
	}
	return Integer.valueOf(s1.toString());
}
}
