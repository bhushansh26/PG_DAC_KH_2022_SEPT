import java.util.*;
class Employee
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter basic Salary of an Employee :");
		double basicSalary = sc.nextDouble();
		double hra;
		double da;
		if(basicSalary <10000)
		{
			hra = 0.1*basicSalary;
			da = 0.9*basicSalary;
		}
		else
		{
			hra = 2000;
			da = 0.98* basicSalary;
		}
		
	System.out.println("Gross Salary of an Employee is "+(basicSalary+hra+da));
	}
}