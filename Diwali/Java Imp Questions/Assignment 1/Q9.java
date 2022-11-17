class Q9
{
	public static void main(String args[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0 ; j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1 ; i<5;i++)
		{
			for(int j=4 ; j>i ; j--)
			{
				System.out.print(" ");
			}
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print(j+5-i+" ");
			}
			System.out.println();
		}
	}
}