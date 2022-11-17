class Q12
{
	static void rotateLeft(int arr[],int n,int k)
	{
		for(int j=0; j<k;j++)
		{
			int temp = arr[0];
			for(int i=0 ; i<n ; i++)
			{			
				arr[i] = arr[i+1];
			}
			arr[4] = temp;
		}
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
	static void rotateRight(int arr1[],int n,int k)
	{
		for(int j=0; j<k+2;j++)
		{
			int temp = arr1[n];
			for(int i=n-1 ; i>=0 ; i--)
			{
				//int a= arr1[i+1];
				arr1[i+1] = arr1[i];
			}
			arr1[0] = temp;
		}
		for(int i=0 ; i<arr1.length ; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}
	
	public static void main(String args[])
	{
		int b1[] = {65,66,67,68,69};
		int n = b1.length-1;
		int k=2;
		
		rotateLeft(b1,n,k);
		System.out.println();
		rotateRight(b1,n,k);
		
		
		
	}	
}