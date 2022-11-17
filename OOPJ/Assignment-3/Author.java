class Author
{
	private String name;
	private String email;
	private char gender;
	
	Author()
	{}
	Author(String name, String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender ;
	}
	
	public String getName()
	{
		return this.getName();
	}
	
	public String getEmail()
	{
		return this.getEmail();
	}
	
	public char getGender()
	{
		return this.getGender();
	}
	
	public String toString()
	{
	return "[ Name ="+this.name+" Email ="+this.email+" Gender ="+this.gender+"]";
	}
}

class Book
{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;

	Book()
	{}
	
	Book(String name, Author author,double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price= price;
		this.qtyInStock = qtyInStock;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public Author getAuthor()
	{
		return this.author;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getQtyInStock()
	{
		return this.qtyInStock;
	}
	
	public String toString()
	{
		return "Book name ="+this.name+" Author ="+this.author+" Price ="+this.price+" Stock ="+this.qtyInStock;
	}

}

class Question7
{
	public static void main(String args[])
	{
		Author a1 = new Author("ray dalio","raydalio@gmail.com",'M');
		Book b1 = new Book("Changing world order",a1,2000,550);
		
		System.out.println(b1);
	}
}
