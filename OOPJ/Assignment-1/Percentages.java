import java.util.*;
class Percentages
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks obtained in Marathi : ");
		int marks_marathi = sc.nextInt();
		System.out.println("Enter marks obtained in English : ");
		int marks_english = sc.nextInt();
		System.out.println("Enter marks obtained in Hindi : ");
		int marks_hindi = sc.nextInt();
		System.out.println("Enter marks obtained in Maths : ");
		int marks_maths = sc.nextInt();
		System.out.println("Enter marks obtained in Science : ");
		int marks_science = sc.nextInt();
		
		int sum = marks_english+marks_marathi+marks_hindi+marks_maths+marks_science;
		
		double percentage()
		{
			return ((sum/500)*100);
		}
		
		System.out.println("Percentage obtained : "+percentage());
		}
}