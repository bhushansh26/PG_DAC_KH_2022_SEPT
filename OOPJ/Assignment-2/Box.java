
import java.util.*;

class Box{
	double height;
	double length;
	double width;
	
	Box()
	{
		height = 0;
		length = 0;
		width  = 0;
	}
	
	Box(double h, double l, double w)
	{
		height = h;
		length = l;
		width  = w;
	}
	
	double getVolume()
	{
		return (height*width*length);
	}
	
	double getArea()
	{
		return (2*((height*length)+(length*width)+(height*width)));
	}
	
	void printDetails()
	{
		System.out.printf("Volume of Box is : %.2f \n", getVolume());
		System.out.printf("Volume of Surface Area is : %.2f \n", getArea());
		System.out.println("========================================");
	}
	
	
	public static void main(String [] args)
	{
		Box b1 = new Box(2.00,5.00,6.00);
		Box b2 = new Box(2.15,5.60,7.0);
		b1.printDetails();
		b2.printDetails();
	}
}