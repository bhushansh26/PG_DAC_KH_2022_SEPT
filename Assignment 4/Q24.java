class Q24
{
	static String[] sort(String s1[] , int n)
	{
		for(int i=1 ; i<n ; i++)
		{
			String temp = s1[i];
			int j=i-1;
			while(j>=0 && temp.length()<s1[j].length())
			{
				s1[j+1]= s1[j];
				j--;
			}
			
			s1[j+1] = temp;
			
		}
		
		return s1;

	}
	
	static void printArray(String str[])
	{
		for(int  i =0 ; i<str.length ; i++)
		{
			System.out.println(str[i]);
		}
	}
	public static void main(String args[])
	{
		String [] arr = {"abcde","abc","ab","abcd"};
		int n = arr.length;
		
		printArray(arr);
		String res[] = sort(arr,n);
				
		printArray(res);
		
	}
}