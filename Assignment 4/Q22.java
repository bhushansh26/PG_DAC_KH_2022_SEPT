import java.util.*;
class Q22
{
	static String checkPalindrome(String s)
	{
		String hold = ""; 
		String res = "";
		StringBuilder sb;
		int len =0;
		for(int i=0 ; i<s.length();i++)
		{
			for(int j=i+1 ; j<s.length() ; j++)
			{
				hold = s.substring(i,j);
				if(new StringBuilder(hold).reverse().toString().equals(hold)&&hold.length()>len)
				{
					res = hold;
					len = res.length();
				}
			}
		}
		return res;
	}
	
	public static void main(String args[])
	{
		String str1 = "forgeeksskeegfor";
		System.out.println("Longest palindrome is :"+checkPalindrome(str1));
	}
}