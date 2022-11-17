class Subject
{
	int marks;
	Subject(int d)
	{
		this.marks = d;
	}
	
	static void swap(Subject s1 , Subject s2)
	{
		int temp = s1.marks;
		s1.marks = s2.marks;
		s2.marks = temp;
	}


//class Q10

	public static void main(String args[])
	{
		Subject maths = new Subject(50);
		Subject english = new Subject(48);
		System.out.println("Marks of maths "+ maths.marks+" Marks of english "+ english.marks);
		swap(maths , english);
		System.out.println("Marks of maths "+ maths.marks+" Marks of english "+ english.marks);
	}
}