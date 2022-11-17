class Q8
{
	static boolean isPalindrome(String str)
	{
		int  low = 0;
		int  high = str.length()-1;
		while(low<=high)
		{
			
			if(str.charAt(low)!=str.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
		
	}
	
	static void findPalindrome(String str )
	{
		boolean flag = false;
		for(int  i =0 ; i< str.length()-1 ; i++)
		{
			String temp = str.substring(0,i)+str.substring(i+1);
			flag = isPalindrome(temp);
			if(flag)
			{
				System.out.println("true");
				return;
			}
		}
		
		
			System.out.println("false");
		
	}
	
	public static void main(String args[])
	{
		String str1 = "abcba";
		String str2 = "foobof";
		String str3 = "abccab";
		
		findPalindrome(str1);
		findPalindrome(str2);
		findPalindrome(str3);
		
	}
}