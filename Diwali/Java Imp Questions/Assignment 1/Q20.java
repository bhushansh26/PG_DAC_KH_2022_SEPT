class Q20
{
	public static void main(String args[])
	{
		for(int i=1 ; i<=7 ; i++)
		{
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=8-i ; j++)
			{
				System.out.print(i+j-1);
			}
			System.out.println();
		}
		
		for(int i=2 ; i<=7 ; i++)
		{
			for(int j=8 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(7-i+j);
			}
			System.out.println();
		}
	}
}