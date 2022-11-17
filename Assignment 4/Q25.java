class Q25
{
	static boolean validPanindrome(String str)
	{
		if(str==null)
			return false;
		
		str = str.toLowerCase();
		str = str.replaceAll("[^a-zA-Z0-9]","");
		int  i = 0 ;
		int j = str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
  
	public static void main(String args[])
	{
		String str = "A man, a plan, a canal: Panama";
		System.out.println(validPanindrome(str));
	}
}