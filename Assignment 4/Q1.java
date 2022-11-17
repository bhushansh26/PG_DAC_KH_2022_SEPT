class Q1
{
	public static void main(String args[])
	{
		String s1 = "Java";
		int count=0;
		
		char [] str = s1.toCharArray();
		
		for(int i =0; i<str.length ; i++)
		{
			for(int j =str.length-1; j>i ; j--)
			{
				if(str[i] == str[j])
				{
					count++;
					System.out.println(str[i]);
				}
			}
		}
		
		System.out.println("Number of duplicate charachters in string are :"+count);
		
	}
}