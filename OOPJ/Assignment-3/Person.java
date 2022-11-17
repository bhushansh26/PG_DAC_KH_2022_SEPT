class Person
{
	int age;
	double weight;
	double height;
	String dateOfBirth;
	String address;
	
	Person()
	{
		this.age=0;
		this.weight=0;
		this.height=-0;
		this.dateOfBirth=null;
		this.address=null;
	}
	
	Person(int age, int weight, int height, String dob, String add)
	{
		this.age=age;
		this.weight=weight;
		this.height=-height;
		this.dateOfBirth=dob;
		this.address=add;
	}
	
	void printDetails()
	{
		System.out.println("Age of Person :"+this.age );
		System.out.println("Weight of Person :"+this.weight );
		System.out.println("Height of Person :"+this.height );
		System.out.println("DOB of Person :"+this.dateOfBirth );
		System.out.println("Address of Person :"+this.address );
	}
	
	public static void main(String [] args)
	{
		Person p1 = new Person();
		
		Employee e1 = new Employee();
		
		Technician t1 = new Technician();
		
		Professor pr1 = new Professor();
		
		Student s1 = new Student(21,"Maths",75);
		s1.calculateGrade();
	}
}

class Employee extends Person
{
	int salary;
	String dateOfJoining;
	int Experience;
	
	Employee()
	{
		this.salary = 0;
		this.dateOfJoining = null;
		this.Experience = 0;
	}
	
	Employee()
	{	
		
		this.salary = 0;
		this.dateOfJoining = null;
		this.Experience = 0;
	}
}

class Technician extends Employee
{
	
}

class Professor extends Employee
{
	Professor()
	{
		
	}
	
	String courses[] = new String[1];
	
	String listOfAdvisee[] = new String[1];
	
	void addCourses(String c)
	{
		int i , n = courses.length;
		String temp [] = new String [n+1];
		for(i=0 ; i<courses.length ; i++)
		{
			temp [i] = courses [i];
			
		}
		temp[n]=c;
		courses = temp;
	}
	
	void removeCourses(String e)
	{
			int i,k,n = courses.length;
			String temp [] = new String [n-1];
			for(i=0,k=0;i<courses.length;i++)
			{
				if(courses[i].equals(e))
				{
					continue;
				}
				else
				{
					temp[k++]=courses[i];
				}
			}
			courses = temp;
	}
	
	void addListOfAdvisee(String d)
	{
		int i , n = listOfAdvisee.length;
		String temp [] = new String [n+1];
		for( i=0 ; i<listOfAdvisee.length ; i++)
		{
			temp [i] = listOfAdvisee [i];
			
		}
		temp[n]=d;
		listOfAdvisee = temp;
	}
	
	void removeListOfAdvisee(String f)
	{
		int i,k=0,n=listOfAdvisee.length;
		String temp[] = new String[n-1];
		for( i=0; i<listOfAdvisee.length ; i++)
		{
			if(listOfAdvisee[i].equals(f))
			{
				continue;
			}
			else{
				temp[k++]=listOfAdvisee[i];
			}
		}
		listOfAdvisee = temp;
	}
}


class Student extends Person
{
	int roll;
	String listOfSubjects;
	int marks;
	
	Student()
	{
		this.roll = 0;
		this.listOfSubjects = null;
		this.marks = 0;
	}
	
	Student( int roll , String sub ,int marks)
	{
		this.roll = roll;
		this.listOfSubjects = sub;
		this.marks = marks;
	}
	
	void calculateGrade()
	{
		if(marks>60)
		{
			System.out.println("Your grade is : Distinction");
		}
		else if(marks>50 && marks<=60)
		{
			System.out.println("Your grade is : First Class");
		}
		else if(marks>=40 && marks <=50)
		{
			System.out.println("Your grade is : Second Class");
		}
		else
		{
				System.out.println("Your grade is : Fail");
		}
	}
}