class Account{
	int accountNumber;
	String holderName;
	int balance;
	
	
	void printDetails()
	{
		System.out.println("Name of Account Holder :"+this.holderName);
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Available Balance :"+this.balance);
		System.out.println("=====================================");
	}

	public static void main(String [] args)
	{
		SavingsAccount sa1 = new SavingsAccount("Ramesh",5623847,9000,12.8);
		
		
		SavingsAccount sa2 = new SavingsAccount("Suresh",5623848,9500,10);
		
		
		SavingsAccount sa3 = new SavingsAccount("Mahesh",5623849,25000,6.7);
		
		
		CurrentAccount ca1 = new CurrentAccount("Cdac Khargar",851963,5500000);
		CurrentAccount ca2 = new CurrentAccount("Cdac Juhu",851964,5500000);
	
		Manager m1 = new Manager();
		
		m1.addAccount(sa1);
		m1.addAccount(sa2);
		m1.addAccount(sa3);
		m1.addAccount(ca1);
		m1.addAccount(ca2);
		
		m1.print();
		
		/*sa1.printYearlyInterest();
		sa2.printYearlyInterest();
		sa3.printYearlyInterest();
		*/
	}

}

class SavingsAccount extends Account
{
	double interestRate;
	
	SavingsAccount()
	{
		this.accountNumber = 0;
		this.holderName = null;
		this.balance = 0;
	}
	
	SavingsAccount(String name, int acc , int bal ,double interest)
	{
		this.accountNumber = acc;
		this.holderName = name;
		this.balance = bal;
		this.interestRate = interest;
	}
	
	double calculateYearlyInterest()
	{
		return ((this.balance*this.interestRate)/100);
	}
	
	void printYearlyInterest()
	{
		System.out.println("Interest earn in year for this account is :"+this.calculateYearlyInterest());
	}
	
	void printDetails()
	{
		System.out.println("Name of Account Holder :"+this.holderName);
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Available Balance :"+this.balance);
		System.out.println("Interest earn yerly :"+this.calculateYearlyInterest());
		System.out.println("=====================================");
	}
	
}

class CurrentAccount extends Account
{
	double interestRate;
	
	CurrentAccount()
	{
		this.accountNumber = 0;
		this.holderName = null;
		this.balance = 0;
	}
	
	CurrentAccount(String name, int acc , int bal)
	{
		this.accountNumber = acc;
		this.holderName = name;
		this.balance = bal;
	}
	
	
}

class Manager
{
	Account ac[] = new Account[1];
	
	Manager()
	{
		ac[0]=new Account();
	}
	
	void addAccount(Account x)
	{
		int n =ac.length;
		Account temp[] = new Account[n+1];
		
		for(int i=0 ; i<ac.length ; i++)
		{	
			temp[i]=ac[i];
		}
		
		temp[n] = x;
		ac=temp;
	}
	
	void print()
	{
		for(int i=0; i<ac.length ; i++)
		{
			ac[i].printDetails();
		}
	}
	
}












