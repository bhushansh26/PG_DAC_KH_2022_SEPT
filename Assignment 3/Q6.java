class Q6
{
	public static void main(String args[])
	{
		int [] arr = {24,54,31,16,82,45,67};
		int firstMax=0;
		int secondMax=0;
		int thirdMax=0;
		
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]>firstMax)
			{
				firstMax =arr[i];
			}
		}
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]>secondMax && arr[i]<firstMax)
			{
				secondMax =arr[i];
			}
		}
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]>thirdMax && arr[i]<firstMax && arr[i]<secondMax)
			{
				thirdMax =arr[i];
			}
		}
		
		System.out.println("Third max from array is : "+thirdMax);
	}
}