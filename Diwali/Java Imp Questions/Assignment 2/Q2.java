abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is created");
	}
	
	abstract void run();					//abstract method cannot have body {};
	
	
	void changeGear()
	{
		System.out.println("Gear change successfully");
	}
	
	final void colour()
	{
		System.out.println("Colour of bike is black");
	}
}

class Honda extends Bike
{
	void run()									// need to override abstract method in child class
	{
		System.out.println("Honda Bike running safely");
	}
	
	void speed()
	{
		System.out.println("Bike id speeding");
	}
}


class Q1
{
	public static void main(String args[])
	{
		//Bike b1 = new Bike();					//object of Abstract class cannot be created;
		//Bike b1 = new Honda();
		Honda b1 = new Honda();
		b1.run();
		b1.changeGear();
		b1.colour();
		b1.speed();								// object of Bike type cannot access method of child class
	}
}



/*
Output:
Bike is created
Honda Bike running safely
Gear change successfully
Colour of bike is black
*/