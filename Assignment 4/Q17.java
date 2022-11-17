import java.util.*;
class Q17
{
	static boolean isShuffle(String a ,String b )
	{
		int  n = a.length();
		int  m = b.length();
		
		if(m!=n)
			return false;
		
		for(int i=0 ; i<m ; i++)
		{
			if(a.charAt(i)!=b.charAt(i))
				return false;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String s1 = "abc";
		String s2 = "def";
		
		String s3 = "dabecfk";
		char[] c3 = s3.toCharArray();
		String res = s1+s2;
		char[] c4 = res.toCharArray();
		
		Arrays.sort(c3);
		Arrays.sort(c4);
		
		String res1 = new String(c3);
		String res2 = new String(c4);
		
		System.out.println("Is given strings are shuffled :"+isShuffle(res1,res2));
		
	}
}