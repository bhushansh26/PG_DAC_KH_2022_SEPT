class Q19
{
	int num;
	String str;
	Q19()
	{}
	Q19(int a)
	{
		this.num = a;
		this.str = null;
	}
	Q19(int a , String s1)
	{
		this.num = a;
		this.str = s1;
	}
	
	public static void main(String args[])
	{
		Q19 obj1 = new Q19(5);
		Q19 obj2 = new Q19(48 , "here");
		
		System.out.println(obj1.num+" "+obj1.str);
		System.out.println(obj2.num+" "+obj2.str);
	}
}