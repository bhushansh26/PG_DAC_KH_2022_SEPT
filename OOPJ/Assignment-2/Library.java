class Book
{
	String title;
	String [] authors = new String[];
	int noOfPages;
	float price;
	String publisher;
	
	Book()
	{}
	
	Book(String title, int noOfPages,float price,String publisher)
	{
		this.title = title;
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisher = publisher;
	}
	
	void getAuthor(String a)
	{
		authors [0]=a;
	}
	
	void getAuthors(String a, String b)
	{
		authors[0] = a;
		authors[1] = b;
	}
	
	void getAuthors(String a, String b, String c)
	{
		authors[0] = a;
		authors[1] = b;
		authors[2] = c;
	}
	
	void printDetails()
	{
		System.out.println("Title of book :"+this.title);
		System.out.println("no of pages of book :"+this.noOfPages);
		System.out.println("Price of book :"+this.price);
		System.out.println("Publisher of book :"+this.publisher);
		for(int i=0 ; i < authors.length() ; i++ )
		{
			System.out.println("Name of Author "+(i+1)+"of the book is"+this.author[i]);
		}
		
	}
}

class Library
{
	Book [] b1;
	int totalBooks=0;
	
	Libray(int n)
	{
		b1 = new Book[n];
		for(int i=0;i<n;i++)
		{
			b1[i]=new Book();
		}
	}
	
	Libray()
	{
		b1 = new Book[5];
		for(int i=0;i<5;i++)
		{
			b1[i]=new Book();
		}
	}
	
	void add(String title, int noOfPages,float price,String publisher)
	{
		this.title = title;
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	
	
	
	
	
	
	b1.add();
}