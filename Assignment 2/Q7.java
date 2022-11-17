class Q7{
	public static void main(String args[])
	{
		Circle c1 = new Circle(5);
		c1.areaOfShape();
		c1.printDetails();
		
		Rectangle r1 = new Rectangle(10,5);
		r1.areaOfShape();
		r1.printDetails();
		
	}
}

interface Shape
{
	//double area=0;
	void areaOfShape();
	void printDetails();
}

class Circle implements Shape
{
	double area;
	double radius;
	Circle(double r)
	{
		this.radius = r;
	}
	
	public void areaOfShape()
	{
		this.area = 3.14*(Math.pow(radius,2));
	}
	
	public void printDetails()
	{
		System.out.println("Area of circle "+this.area);
	}
}

class Rectangle implements Shape
{
	double area;
	double length;
	double width;
	
	Rectangle(int l,int w)
	{
		this.length = l;
		this.width = w;
	}
	
	public void areaOfShape()
	{
		this.area = this.length*this.width;
	}
	
	public void printDetails()
	{
		System.out.println("Area of Rectangle "+this.area);
	}
}