class Q11
{
	
	static String mergeStrings(String str1 , String str2)
	{
		String res = "";
		int i =0 , j=0;
		while(i<str1.length() && j<str2.length())
		{
			res += str1.charAt(i);
			i++;
			res += str2.charAt(j);
			j++;
		}
		
		while(i<str1.length())
		{
			res += str1.charAt(i);
			i++;
		}
		while(j<str2.length())
		{
			res += str2.charAt(j);
			j++;
		}
		
		return res;
	}
	
	public static void main(String args[])
	{
		String str1 ="abc";
		String str2 ="defk";
		
		String temp = mergeStrings(str1, str2);
		
		System.out.println(temp);
	}
}