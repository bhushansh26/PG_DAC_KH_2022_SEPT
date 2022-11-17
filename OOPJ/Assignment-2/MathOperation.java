/*Create a class MathOperation that has four static methods. add() method that takes two integer numbers as
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the
product. power() method that takes two integer numbers as parameter and returns the power of first number to
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four
methods of MathOperation class by providing entered numbers and prints the return values of every method.*/
import java.util.*;
class MathOperation
{
	static int x; 
	static int y;

	static int add(int x,int y)
	{
		return (x+y);
	}
	
	static int sub(int x,int y)
	{
		if(x>y)
		{
			return (x-y);
		}
		else
		{
			return (y-x);
		}
	}
	static int multiply(int x,int y)
	{
		return (x*y);
	}
	static int power(int x, int y)
	{
		return ((int)Math.pow(y,x));
	}
}
class demo{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt(); 		
		System.out.println("Enter second number :");	
		int num2 = sc.nextInt();
		
		System.out.println("=============================");
		System.out.println("Addition of two numbers :"+MathOperation.add(num1, num2));
		System.out.println("Difference between two numbers :"+MathOperation.sub(num1, num2));
		System.out.println("Multiplication of two numbers is:"+MathOperation.multiply(num1, num2));
		System.out.println(num1+" power of "+num2+" is equal to: "+MathOperation.power(num1, num2));
		
	}
}