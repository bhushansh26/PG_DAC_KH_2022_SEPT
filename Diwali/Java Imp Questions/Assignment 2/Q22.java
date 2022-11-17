class Q22
{
	static int num;
	int price;
	
	static void setData(int a )
	{
		num = a;
		//price = b	;				//non-static variable cannot be access from static contex;
	}
	
	static void getData()
	{
		System.out.println(num+"  ");
	}
	
	void set2Data(int a,int b)
	{
		num = a;					//Static variable can be access by non static contex 
		this.price = b;
	}
	
	void printData()
	{
		System.out.println(num+"  "+this.price);
	}
	public static void main(String args[])
	{
		Q22 obj1 = new Q22();
		setData(89);
		getData();
		obj1.set2Data(25,52);
		obj1.printData();
	}
}