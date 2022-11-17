import java.util.*;
class Book
{
	String author;
	String title;
	String publisher;
	int cost;
	int stock;
	
	Book()
	{
		
	}
	
	Book(String author, String title, String publisher, int cost, int stock)
	{
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.cost = cost;
		this.stock = stock;
	}
	
	void printDetails()
	{
		System.out.println("Book details are as follows:");
		System.out.println("Title of book is : "+this.title);
		System.out.println("Name of author of book is :"+this.author);
		System.out.println("Name of publisher of book is :"+this.publisher);
		System.out.println("Price of book is :"+this.cost);
		System.out.println("Stock available for the book is :"+this.stock);
	}
	
}

class Bookshop
{
	Book bRef[];
	
	Bookshop()
	{
	}
	
	void displayAvailableBooks()
	{
		System.out.println("Available Books are as follows");
		for(int i=0;i<bRef.length;i++)
		{
			System.out.println(this.bRef[i].title);
			//bRef[i].printDetails();
		}
		System.out.println("=================================");
	}
	
	void isBookAvailable(String search)
	{	
		boolean b = false;
		for(int i=0;i<bRef.length;i++)
		{
			if(bRef[i].title.equalsIgnoreCase(search))
			{
				b = true;
				System.out.println("This book is available");
				bRef[i].printDetails();
				
				this.isStockAvailable(i);
			}
			
		}
		
		if( b == false )
		{
				System.out.println("Book is not available");
		}
	}
	
	void isStockAvailable(int index)
	{
		System.out.println("How many copies do you want");
		Scanner sc = new Scanner (System.in);
		int count = sc.nextInt();
		
		if(this.bRef[index].stock>=count)
		{
			System.out.println("Stock is available");
			System.out.println("Please pay "+(this.bRef[index].cost*count));
		}
		else
		{
			System.out.println("Sorry stock is not available");
		}
		
		
	}
	
	public static void main(String [] args)
	{
		Book b1 = new Book("a1","t1","p1",100,100);
		Book b2 = new Book("a2","t2","p2",200,200);
		Book b3 = new Book("a3","t3","p3",300,300);
	
		Bookshop bsObj = new Bookshop();
		bsObj.bRef = new Book[]{b1,b2,b3};
	
		Scanner sc= new Scanner(System.in);
		
		bsObj.displayAvailableBooks();
		
		System.out.println("Enter Title Of Book You Want:");
		String s = sc.nextLine();
		
		bsObj.isBookAvailable(s);
	
		System.out.println("Thank you for visiting !!!");
	
	}
}