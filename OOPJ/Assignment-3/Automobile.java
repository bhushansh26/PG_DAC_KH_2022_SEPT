class Automobile
{
		String make;
		String type;
		int maxSpeed;
		double price;
		double mileage;
		String registrationNumber;
		
		void getDetails(String make,String type,int maxSpeed,double price,double mileage,String registrationNumber)
		{
			this.make = make;
			this.type = type;
			this.maxSpeed = maxSpeed;
			this.price = price;
			this.mileage = mileage;
			this.registrationNumber = registrationNumber;
		}
		void printDetails()
		{
			System.out.println("Make of Automobile :"+make);
			System.out.println("Type of Automobile :"+type);
			System.out.println("MaxSpeed of Automobile :"+maxSpeed);
			System.out.println("Price of Automobile in Lakh:"+price);
			System.out.println("Mileage of Automobile per litre :"+mileage);
			System.out.println("Registration Number of Automobile :"+mileage);
		}
}

class Track extends Automobile
{
	int capacity;
	String hoodType;
	int noOfWheels;
	
	void getDetails(String make,String type,int maxSpeed,double price,double mileage,String registrationNumber,int capacity , String hoodType , int noOfWheels)
	{
		super.getDetails(make,type, maxSpeed, price, mileage, registrationNumber);
		this.capacity = capacity;
		this.hoodType = hoodType;
		this.noOfWheels = noOfWheels;
	}
	
	void printDetails()
	{
		super.printDetails();
		System.out.println("Engine capacity of car in cc :"+capacity);
		System.out.println("Hood Type of car :"+hoodType);
		System.out.println("No. of wheels of car :"+noOfWheels);
		
	}
	
}

class car extends Automobile
{
	int noOfDoors;
	int seatingCapacity;
	
	void getDetails(String make,String type,int maxSpeed,double price,double mileage,String registrationNumber,int noOfDoors, int seatingCapacity)
	{
		this.getDetails(make,type,maxSpeed,price,mileage,registrationNumber);
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	}
	
	
	void printDetails()
	{
		super.printDetails();
		System.out.println("No. of doors in car :"+noOfDoors);
		System.out.println("Seating capacity of car :"+seatingCapacity);
	}
}

class AutomobileDemo{
	public static void main(String args[])
	{
		Track t1 = new Track();
		t1.getDetails("Ford","SUV",220,33.5,8.5,"MH15FX1237",3300 ,"Steel" ,5);
		t1.printDetails();
	}
}