import java.util.*;
class Rectangle
{
	int length;
	int breadth;
	Rectangle()
	{}
	Rectangle(int l , int b)
	{
		this.length = l;
		this.breadth = b;
	}
	
	void area()
	{
		System.out.println("Area :"+(this.length*this.breadth));
	}
}

class Q17
{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle(5,3);
		r1.area();
	}
}