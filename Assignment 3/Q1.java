class Q1
{
	public static void main(String args[])
	{
		int x=7;
		int [] arr = new int [5];
		//int [] arr = {1,2,3,4,5,6};
		for(int j=0 ; j< arr.length;j++)
		{
			arr[j]=x;
			x+=7;
		}
		for(int i=0 ; i< 5; i++)
		{
			System.out.println(arr[i]);
		}
	}
}