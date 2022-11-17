class Q20
{
	public static void main(String args[])
	{
		int [] arr1 = {1,0,2,0,3,0,4,0,5,0,6};
		int n = arr1.length;
		int m=0;
		for(int i=0 ; i<arr1.length ; i++)
		{
			if(arr1[i]!=0)
			{
				arr1[m]=arr1[i];
				m++;
			}
			
		}
		for(int j=m ; j<arr1.length ;j++)
		{
			arr1[j]=0;
		}
		
		for(int i=0 ; i<arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		
	}
}