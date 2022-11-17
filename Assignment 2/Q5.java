class Q5{
	void test1()
	{
		System.out.println("outer Q5");
	}
	
	static class Inner_Q5
	{
		void test2()
		{
			Q5 obj1 = new Q5();
			obj1.test1();
		}
	}
	public static void main(String args[])
	{
		Inner_Q5 obj2 = new Inner_Q5();
		obj2.test2();
	}
}