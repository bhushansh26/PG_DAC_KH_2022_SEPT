class Q15
{
	public static void main(String args[])
	{
		int []arr1 = new int[100];
		for(int i=0 ; i<100; i++)
		{
			arr1[i]=i+1;
		}
		
		arr1[56]=0;
		int a=1;
		for(int i=0;i<100;i++)
		{
			if(arr1[i]!=a)
			{
				System.out.print(a);
			}
			a++;
		}
		
	}
}