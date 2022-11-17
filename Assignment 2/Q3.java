class Outer
{
	int outer_x = 100;
	void test()		
	{
		Inner inner = new Inner();			// need to create object of inner class to access inner methods;
		inner.display();
	}
	class Inner
	{
		int y = 10;
		void display()
		{
			System.out.println("display: outer_x = "+outer_x);
		}
		
	}
	
	void showy()
	{
		System.out.println("Outer Showy");		
		//System.out.println(y);				// error y is not known here.
	}
}


class Q3{
	public static void main(String args[])
	{
		Outer outer = new Outer();
		outer.test();
		outer.showy();
		//Inner inner = new Inner();			//cannot create object of inner class.
		//inner.showy();
	}
}