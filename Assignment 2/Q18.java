class Q18
{
	Q18()
	{
		this(43);
		System.out.println("Hello");
	}
	
	Q18(int x)
	{
		this(4,3);
		System.out.println("Hello"+x);
	}
	
	Q18(int x, int y)
	{
		
		System.out.println("Hello"+ (x*y));
	}
	public static void main(String args [])
	{
		//Q18 obj = new Q18();
		new Q18();
	}
}