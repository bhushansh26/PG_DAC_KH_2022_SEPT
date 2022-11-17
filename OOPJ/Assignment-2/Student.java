import java.util.Scanner;
class Student{
	String name;
	int marks_math;	
	int marks_marathi;	
	int marks_english;	
	int totMarks;
	
	void getDetails(String name, int marks_math,int marks_marathi,int marks_english)
	{
		this.name = name;
		this.marks_math = marks_math;
		this.marks_marathi = marks_marathi;
		this.marks_english = marks_english;
		this.totMarks = this.marks_math+this.marks_marathi+this.marks_english;
	
	}
	
	
	double totAvg()
	{	
	
		//sum = this.marks_math+this.marks_marathi+this.marks_english;
		return (this.totMarks/3);
	}
	
	void displayDetails()
	{
		System.out.println("name :"+ this.name+" total marks : "+this.totMarks+" Avg of all :"+this.totAvg() );
	}
	
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Details of studets");
		/*String name = sc.nextLine();
		int marks_math = sc.nextInt();
		int marks_marathi = sc.nextInt();
		int marks_english = sc.nextInt();
		
		
		Student s1=new Student();
		s1.getDetails(name,marks_math,marks_marathi,marks_english);
		s1.displayDetails();
		*/
		System.out.println("Enter number of students :");
		int size = sc.nextInt();
		
		Student std1[]=new Student[size];
		
		String name;
		
		int marks_math;
		
		int marks_marathi;
		
		int marks_english;
		
		for(int i=0;i<size;i++)
		{
			sc.nextLine();
			System.out.println("Enter name of students :");
			name = sc.nextLine();
			System.out.println("Enter marks of math :");
			marks_math = sc.nextInt();
			System.out.println("Enter marks of marathi :");
			marks_marathi = sc.nextInt();
			System.out.println("Enter marks of english :");
			marks_english = sc.nextInt();
			
			System.out.println("==================================");
			std1[i]=new Student();
			std1[i].getDetails(name,marks_math,marks_marathi,marks_english);                
		
		}
		System.out.println("=============================");
		System.out.println("Entered Students Details Are");
		for(int i=0;i<size;i++)
		{
			std1[i].displayDetails();
		}  
		       
	}
}