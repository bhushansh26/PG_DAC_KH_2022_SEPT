class Q13
{
	public static void main(String args[])
	{
		int n=65;
		for(int i =0 ; i<6 ; i++)
		{
			for(int j= 5 ; j>i ; j--)
			{
				System.out.print(" ");
			}
			System.out.print((char)(n+i));
			for(int j =0 ;j<=2*(i-1) ; j++ )
			{
				System.out.print(" ");
			}
			if(i == 0)
			{
				System.out.print(" ");
			}
			else{
			System.out.print((char)(n+i));
			}
			System.out.println();
		}
		for(int i= 0 ; i<5 ; i++)
		{
			for(int j=0 ; j<=i ; j++)
			{
				System.out.print(" ");
			}
			System.out.print((char)(n+4-i));
			for(int j =5 ;j>2*(i-1) ; j-- )
			{
				System.out.print(" ");
			}
			if(i == 4)
			{
				System.out.print(" ");
			}
			else{
			System.out.print((char)(n+4-i));
			}
			System.out.println();
		}
	}
}