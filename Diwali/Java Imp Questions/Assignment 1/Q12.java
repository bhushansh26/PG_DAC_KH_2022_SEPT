class Q12
{
	public static void main(String args[])
	{
		int m =65;
		for(int i =0 ; i<=5 ; i++)
		{
			for(int j =5 ; j>i ; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0 ; j<i+1 ; j++)
			{
				System.out.print((char)(m+j)+" ");
			}
			System.out.println();
		}
	}
}