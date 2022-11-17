import java.util.*;

class fahrenheitToCelcius
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter temperature in fahrenheit :");
		double fahrenheit =sc.nextDouble();
		
		double celcius = (5*(fahrenheit-32)/9);
		
		System.out.printf("Temperature in celcius is %.2f \n",celcius);
	}
}