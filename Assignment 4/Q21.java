class Q21
{
	static String removeCharachter(String s1, char c1)
	{
		int n = s1.length();
		int i , j=0, count=0;
		char [] c3 = s1.toCharArray();
		for( i=0 ; i<n ; i++)
		{
			if(c3[i]!=c1)
			{
				c3[j++]=c3[i];
			}
			else
				count++;
		}
		
		while(count>0)
		{
			c3[j++]='\0';
			count--;
		}
		String res = new String(c3);
		return res;
	}
	
	public static void main(String args[])
	{
		String str = "hello";
		System.out.println(str);
		char c = 'l';
		String str1 = removeCharachter(str,c);
		System.out.println(str1);
	}
}