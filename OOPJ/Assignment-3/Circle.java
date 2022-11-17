interface Shape
{
	double area();
	void draw();
	void rotate();
	void move(double a , double b);
	
}

class Circle implements Shape
{
	double x,y,r;
	Circle()
	{
		
	}
	Circle(double x, double y , double r)
	{
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public double area()
	{
		return (3.14*this.r*this.r);
	}
	
	public void move(double a , double b)
	{
		this.x+=a;
		this.y+=b;
		System.out.println("New coordinate for center of shape are"+this.x+" , "+this.y);
	}
	
	public void rotate()
	{
		
	}
	
	public void draw()
	{
		
	}
	
	public static void main(String args[])
	{
		Circle c1 = new Circle(3,5,2);
		System.out.println("Area of the shape is :"+c1.area());
	
		Rectangle r1 = new Rectangle(5,5,6,9);
		System.out.println("Area of the Rectangle is :"+r1.area());
	}
}

class Rectangle implements Shape
{
	double x,y,l,w;
	
	Rectangle()
	{}
	
	Rectangle(int x, int y,int l, int w)
	{
		this.x = x;
		this.y = y;
		this.l = l;
		this.w = w;
	}
	
	public double area()
	{
		return (this.l*this.w);
	}
	
	public void move(double a ,double b)
	{
		this.x+=a;
		this.y+=b;
		System.out.println("New coordinate for center of shape are"+this.x+" , "+this.y);
	}
	
	public void rotate()
	{}
	
	public void draw()
	{}
}