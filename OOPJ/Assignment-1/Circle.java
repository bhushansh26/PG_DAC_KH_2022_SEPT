import java.util.*;
class Circle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextInt();
		
		double area()
		{
			return(3.14*radius*radius);
		}
		
		double circumference()
		{
			return(2*3.14*radius);
		}
}