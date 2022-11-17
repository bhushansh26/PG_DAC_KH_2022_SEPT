import java.util.*;

class Shape
{
	int length , breadth , area;
	
	Shape area1(Shape obj1)
	{
		obj1 = new Shape();
		obj1.length = this.length;
		obj1.breadth = this.breadth;
		obj1.area = obj1.length * obj1.breadth;
		return obj1;
	}
	
	Shape area2(Shape obj2)
	{
		obj2 = new Shape();
		obj2.length = this.length+5;
		obj2.breadth = this.breadth+5;
		obj2.area = obj2.length * obj2.breadth;
		return obj2;
	}
}

class Q9
{
	public static void main(String args[])
	{
		Shape obj = new Shape();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		obj.length = sc.nextInt();
		System.out.println("Enter Width");
		obj.breadth = sc.nextInt();
		
		Shape a = obj.area1(obj);
		Shape b = obj.area2(obj);
		
		System.out.println("Area: "+a.area);
		System.out.println("Area: "+b.area);
		
	}
}