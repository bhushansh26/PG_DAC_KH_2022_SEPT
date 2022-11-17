class Area
{
	final int length =15;
	final int width = 20;
	final void area()
	{
		System.out.println(length*width);
	}
}
class Shape extends Area
{
	final void react()
	{
		System.out.println("This is rectangle");
	}
}
final class Q16 extends Shape
{
	public static void main(String args[])
	{
		Q16 obj1 = new Q16();
		obj1.react();
		obj1.area();
	}
}