class Q4
{
	
	static String s1 = "Hello";		//need to make it static so that it can access by static contex.
	
	static class Inner
	{
		void display()				//making this static or not does not make any difference
		{
			System.out.println("Inner class says "+s1);
		}
	}
	public static void main(String args[])
	{
		Q4.Inner obj1 =new Q4.Inner();		// creating instance of inner class through instance of outer class
		//Inner obj1 = new Inner();			// directly creating instance of inner class
		obj1.display();
	}
}