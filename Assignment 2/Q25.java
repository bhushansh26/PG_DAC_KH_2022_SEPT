class Q25
{
	static 
	{
		System.out.println("Inside Static block");
	}
	static void method()
	{
		System.out.println("Inside static method");
	}
	public static void main(String args[])
	{
		Q25.method();
	}
}