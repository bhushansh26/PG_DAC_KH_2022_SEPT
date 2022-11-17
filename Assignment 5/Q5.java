import java.util.*;
class Q5
{
	public static void main(String args[])
	{
		String str[] = {"spot","spotty","spotted"};
		String str1 = str[0];
		String str2 = str[1];
		String str3 = str[2];
		String res = "";
		
		int min = str1.length();
		if(min>str2.length())
			min=str2.length();
		if(min>str3.length())
			min = str3.length();
		
		System.out.println(min);
		int i=0;
		while(i<min)
		{
			if(str1.charAt(i)==str2.charAt(i) && str3.charAt(i)==str2.charAt(i) && str1.charAt(i)==str3.charAt(i))
			{
				res = res+ str1.charAt(i);
			}
			else
				break;
			
			i++;
		}
		
		System.out.println(res);
	}
}