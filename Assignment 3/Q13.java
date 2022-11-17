class Q13
{
	public static void main(String args[])
	{
		int [] arr = {1,2,12,4,5};
		
		int temp;
		int max;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		for(int i =0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}