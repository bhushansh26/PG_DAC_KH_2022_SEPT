class Q4
{
	static void addBinary(String str1 , String str2)
	{
		int i =str1.length()-1;
		int j =str2.length()-1;
		int sum = 0;
		int carry=0;
		StringBuilder res=new StringBuilder();
		while(i>=0 || j>=0)
		{
			sum = sum+carry;
			if(i>=0)
				sum=sum+str1.charAt(i) - '0';
			if(j>=0)
				sum=sum+str2.charAt(j) - '0';
			
			carry = sum>1 ? 1:0;
			res.append(sum%2);
			
			i--;
			j--;
			sum=0;
		}
		
		if(carry == 1)
			res.append(1);
		
		res = res.reverse();
		System.out.println(res);
	}
	public static void main(String args[])
	{
		String str1 = "1";
		String str2 = "0";
		addBinary(str1,str2);
	}
}