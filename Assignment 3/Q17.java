class Q17
{
	public static void main(String args[])
	{
		int [] arr1 = {1,2,3,4,5,6};
		int [] arr2 = {11,12,4,13,45,1};
		
		int n,m;
		if(arr1.length>=arr2.length)
		{
			n=arr1.length;
			m=arr2.length;
				for(int i=0 ; i<m ; i++)
			{
				for(int j=0 ; j<n ;j++)
				{
					if(arr1[j]==arr2[i])
					{
						System.out.print(arr1[j]);
					}
				}
			}
		
		}
		else
		{
			n=arr2.length;
			m=arr1.length;
			
				for(int i=0 ; i<m ; i++)
			{
				for(int j=0 ; j<n ;j++)
				{
					if(arr1[i]==arr2[j])
					{
						System.out.print(arr1[j]);
					}
				}
			}
		}
		
		
	}
}