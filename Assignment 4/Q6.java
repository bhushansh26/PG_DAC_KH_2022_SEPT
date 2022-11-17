class Q6
{
	public static void main(String args[])
	{
		String str = "hello World";
		
		char [] c1 = str.toCharArray();	
		int count =1;
		
		for(int i = 0 ; i< c1.length ; i++)
		{
			for(int j=i+1;j<c1.length ; j++)
			{
				if(c1[i]==c1[j] && c1[j]!='0')
				{
					count++;
					System.out.println(c1[i]+" "+count);
					c1[j]='0';
					
				}
				
			}
			count =1;
		}
	}
}