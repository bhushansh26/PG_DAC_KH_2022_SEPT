class Q14
{
	static void reverse(String s1)
	{
		char [] c1 = s1.toCharArray();
		int n = c1.length;
		
		for(int i=0; i<n ;i++)
		{
			char temp = ' ';
			for(int j=n-1 ; j>0 ;j--)
			{
				temp = c1[j];
				c1[j] = c1[j-1];
				c1[j-1] = temp;
			}
		}
		display(c1);
		
		
	}
	
	static void display(char [] c2)
	{
		for(int i =0; i <c2.length ; i++)
		{
			System.out.print(c2[i]+" ");
		}
	}
	
	
	public static void main(String args[])
	{
		String str = "abcd";
		reverse(str);
		
	}
}