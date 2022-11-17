class Q11
{
	public static void main(String args[])
	{
		int n = 70;
		int m = 65;
		for(int i = 0 ; i<=5 ; i++)
		{
			for(int j =5 ; j>=i ; j--)
			{
				System.out.print((char) (n-j));
			}
			
			System.out.println();
		}
		for(int i=0 ; i<5 ; i++)
		{
			for(int j = 0 ; j<i+2 ; j++)
			{
				System.out.print((char)(m+j));
			}
			System.out.println();
		}
	}
}