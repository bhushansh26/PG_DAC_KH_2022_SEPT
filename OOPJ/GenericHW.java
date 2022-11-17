class Generic<T1,T2>
{
	T1 obj1;
	T2 obj2;
	
	void setObj1(T1 a)
	{
		this.obj1= a;
	}
	
	T1 getObj1()
	{
		return obj1;
	}
	
	void setObj2(T2 b)
	{
		this.obj2=b;
	}
	
	T2 getObj2()
	{
		return obj2;
	}
	
}

class Student
{
	int roll;
	double marks;
	
	Student()
	{
		this.roll=0;
		this.marks = 0;
	}
	
	Student(int roll , double marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
	
	public String toString()
	{
		return "roll ="+roll+" marks ="+marks;
	}
}

class MyGenHw
{
	public static void main(String [] args)
	{
		Generic<Integer,Double> gen1 = new Generic<Integer,Double>();
		gen1.setObj1(25);
		gen1.setObj2(53.63);
		int i = gen1.getObj1();
		double d = gen1.getObj2();
		System.out.println(i);
		System.out.println(d);

		Generic<Integer,Student> gen2 = new Generic<Integer,Student>();
		gen2.setObj1(33);
		gen2.setObj2(new Student(15,96.35));
		//int j = gen1.getObj1();
		//int k = gen1.getObj2();
		System.out.println(gen2.getObj1());
		System.out.println(gen2.getObj2());
	}
}