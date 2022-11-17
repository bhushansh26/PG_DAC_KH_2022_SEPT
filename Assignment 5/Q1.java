import java.util.*;

class Q1
{
	public static void main(String args[])
	{
		String s1= "abcdcbaj";

		char a1[] = s1.toCharArray();
		
		int n= a1.length;
		boolean b=false;
		
		for(int i=0 ; i<a1.length ; i++)
		{
			if(a1[i]==a1[a1.length-1-i])
			{
				b=true;
			}
			else
			{	
				b=false;
				break;
			}
		}
		if(b==true)
		{
			System.out.println("This is palindrome");
		}
		else
			System.out.println("This is not palindrome");
	}
}