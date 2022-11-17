class Q13
{
	static void permutation(String s1 ,String res )
	{
		if(s1.length() == 0)
		{
			System.out.println(res);
			return;
		}
		else{
			
			
			for(int i=0 ; i<s1.length() ; i++)
			{
				char r1 = s1.charAt(i);
				String s2 = s1.substring(0,i)+s1.substring(i+1);
				permutation(s2,res+r1);
				
			}
		}
	}
	
	public static void main(String args[])
	{
		String str = "abc";
		permutation(str ,"" );
	}
}