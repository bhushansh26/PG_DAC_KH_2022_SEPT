import java.util.*;
class SimpleInterest
{
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount of loan you are taking : ");
		double amount = sc.nextDouble();
	
		System.out.println("Enter time period in years :");
		int years = sc.nextInt();
	
		System.out.println("Enter rate of interest for loan :");
		double interest = sc.nextDouble();
		
		double interestAmount = ((amount*years*interest)/100);
		
		System.out.println("Simple Interest on "+amount+" for period of "+years+" with "+interest+" is :"+interestAmount);
		
	}
}