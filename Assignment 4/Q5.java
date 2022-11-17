class Q5
{
	static boolean onlyDigits(String s1)
	{
		for(int i =0;i<s1.length(); i++)
		{
			if(!Character.isDigit(s1.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
			String s1 = "1a234";
			System.out.println("String contains only digits :"+onlyDigits(s1));
	}
}