abstract class Publication
{
	String publisherName;
	int noOfPages;
	double price;
	
	void printDetails()
	{
		System.out.println("Name of book :"+ this.publisherName);
		System.out.println("No. of pages of book :"+ this.noOfPages);
		System.out.println("Price of book :"+ this.price);
		System.out.println("========================================");
	}
	
	public static void main(String args[])
	{
		Book b1 = new Book( "B1" , 100 , 1000);
		Book b2 = new Book( "B2" , 150 , 2500);
		Book b3 = new Book( "B3" , 900 , 9000);
		
		Journal j1 = new Journal( "J1" , 15 , 5500); 
		Journal j2 = new Journal( "J2" , 35 , 6500);

		Library	l = new Library(b1);
		//l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(j1);
		l.add(j2);
		
		l.print();
		
		
	}

}

class Book extends Publication
{
	Book()
	{
		this.noOfPages = 0;
		this.price = 0.00;
		this.publisherName = null;
	}
	
	Book( String publisher , int page , double mrp )
	{
		this.noOfPages = page;
		this.price = mrp;
		this.publisherName = publisher;
	}
}
class Journal extends Publication
{
	Journal()
	{
		this.noOfPages = 0;
		this.price = 0.00;
		this.publisherName = null;
	}
	
	Journal( String publisher , int page , double mrp )
	{
		this.noOfPages = page;
		this.price = mrp;
		this.publisherName = publisher;
	}
}

class Library
{
	Publication p[]  = new Publication[1];
	Library(Publication a)
	{
		p[0] = a;
	} 
	
	void add(Publication a)
	{
		int n = p.length;
		
		Publication temp[] = new Publication[n+1];
		
		for(int i=0; i<p.length ; i++)
		{
			temp[i] = p[i];
			
		}
			temp[n] = a;
			
			p = temp;
	}
	
	void print()
	{
		for(int i= 0; i<p.length;i++)
		{
			p[i].printDetails();
		}
	}
}