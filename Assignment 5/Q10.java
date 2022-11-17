class Q10
{
	static int checkJewels(String str1 , String str2)
	{
		int count =0;
		for(int  i =0 ; i<str1.length() ; i++)
		{
			for(int j =0 ; j< str2.length() ; j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String args[])
	{
		String str1 ="AYOPD";
		String str2 ="ayopd";
		
		System.out.println(checkJewels(str1,str2));
		
	}
}