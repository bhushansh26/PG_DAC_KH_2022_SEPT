class Q5
{
	public static void main(String args[])
	{
		int [] arr = {12,45,85,23,75,96};
		
		int n = arr.length;
		int max =arr[0];
		int min =arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max =arr[i];
			}
			
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	
	}
}