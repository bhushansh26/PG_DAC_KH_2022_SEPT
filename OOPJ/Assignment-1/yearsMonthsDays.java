import java.util.*;

class yearsMonthsDays
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days :");
		int totDays = sc.nextInt();
		
		int years = totDays/365;
		int remainingDays = totDays%365;
		
		int months = remainingDays/30;
		int days = remainingDays%30;
		
		System.out.println("years "+years+" months "+months+" days "+ days );
	}
}