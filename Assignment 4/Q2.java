import java.util.*;
import java.util.Collections;

class Q2
{
	public static void main(String [] args)
	{
		String str1 = "abcd";
		String str2 = "adcbe";
		
		char [] s1 = str1.toCharArray();
		char [] s2 = str2.toCharArray();
		
		boolean b=false;
		
		if(s1.length == s2.length)
		{
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			for(int i =0 ; i<s1.length ; i++)
			{
				if(s1[i]==s2[i])
				{
					b=true;
				}
				else
				{
					b=false;
				}
			}
		}
		else
		{ 
			b=false; 
		}
		
		if(b == true)
		{
			System.out.println("Both strings are anagram ");
			
		}
		else{
			System.out.println("both strings are not anagram");
		}
	}
}