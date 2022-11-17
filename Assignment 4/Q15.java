import java.util.*;
class Q15
{
	public static void main(String args[])
	{
		String s = "bananas";
		System.out.println("Old String :"+s);
		System.out.println("new String :"+removeDuplicate(s));
	}
	
	static String removeDuplicate(String s2)
	{
		String newStr="";
		for(int i=0 ; i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			if(newStr.indexOf(ch)==-1)
			{
				newStr+=ch;
			}
			
		}
		return newStr;
	}
}