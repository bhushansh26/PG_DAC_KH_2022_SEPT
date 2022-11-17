class Q8
{
	public static int count=0;
	int a;
	Q8()
	{
		count++;
	}
	
	Q8(int a)
	{
		count++;
		this.a =a;
	}
	
	public static void main(String args[])
	{
		Q8 obj1 = new Q8();
		Q8 obj2 = new Q8();
		Q8 obj3 = new Q8(5);
		Q8 obj4 = new Q8();
		
		System.out.println(count);
	}
}