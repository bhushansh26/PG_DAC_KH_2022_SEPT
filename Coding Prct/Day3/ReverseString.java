class ReverseString{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1="";
		for(int i=0 ; i<str.length();i++)
		{
			char ch = str.charAt(i);
			str1=ch+str1;
		}
		
		
			System.out.println("Reverse String is : "+ str1);
	}
}