class Q6_BankAccount
{
	int principal=2000;
	int years=2;
	double rate=4.00;
	
	void interestDemo()
	{
		Interest i1 = new Interest();
		i1.displayInterest();
	}
	
	class Interest
	{
		void displayInterest()
		{
			System.out.println((principal*years*rate)/100);
		}
	}
	
	public static void main(String args[])
	{
		Q6_BankAccount obj1 = new Q6_BankAccount();
		obj1.interestDemo();
	}
}