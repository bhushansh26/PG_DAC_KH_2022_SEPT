class Q24
{
	public static void main (String args[])
	{
		for(int i =1; i<=5; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				if(j==1)
					System.out.print(i);
				else
					System.out.print(i+2*j);
			}
			System.out.println();
		}
	}
}