import java.util.*;
import java.util.Scanner;
class MyExceptionHW extends Exception
{
	public MyExceptionHW()
	{
		super ("You are not eligible");
	}
	
	public MyExceptionHW(String msg)
	{
		super(msg);
	}
	
	
	public String getMessage()
	{
		return "This is user defined";
	}
}

class ExceptionHW
{
	public static void main(String [] args)
	{
		System.out.println("Enter your age :");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
	
		if(age>21)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			try{
					throw new MyExceptionHW();
			}
			catch(Exception ae)
			{
				System.out.println(ae.getMessage());
			}
			System.out.println("Program terminated successfully");
		}
	
	}
}