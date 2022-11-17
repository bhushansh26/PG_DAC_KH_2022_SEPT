class Q8
{
	public static void main(String args[])
	{
		int [] arr = {5,14,35,89,140};
		int n1 = arr.length;
		
		int [] arr1 = new int[arr.length-2];
		for(int i=0; i<arr.length-2	 ; i++)
		{
			arr1[i]=(arr[i]+arr[i+1]+arr[i+2])/3;
		}
		
		for(int i =0 ; i<arr1.length ; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}