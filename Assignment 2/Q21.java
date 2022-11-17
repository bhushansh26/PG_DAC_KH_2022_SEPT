class Shape
{
	int length;
	int breadth;
	
	Shape()
	{}
	Shape(int a , int b)
	{
		this.length =a ;
		this.breadth = b;
	}
}

class Rectangle extends Shape
{
	Rectangle()
	{}
	
	Rectangle(int a, int b)
	{
		super(a,b);
	}
	
	int area()
	{
		return this.length*this.breadth;
	}
	
}
class Q21
{
	
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(5,3);
		System.out.println(r1.area());
	}
}