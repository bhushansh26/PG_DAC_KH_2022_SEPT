class DateDemo
{
	int day;
	int month;
	int year;
	
	DateDemo()
	{
		this.day = 1;
		this.month = 1;
		this.year = 1970;
	}
	
	DateDemo(int day)
	{
		this.day = day;
		this.month = 1;
		this.year = 1970;
	}
	
	DateDemo(int day, int month)
	{
		this.day = day;
		this.month = month;
		this.year = 1970;
	}
	
	DateDemo(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void nextDay()
	{	
		if(this.days == totalDayOfMonth(this.month))
		{
			if(this.month == 12)
			{
				printDetails(1,1,this.year+1);
			}
			else
			{
			printDetails(1,this.month+1,this.year);
			}
		}
		else
		{
				printDetails(this.day+1,this.month,this.year);
		}	
	}
	
	void previousDay()
	{
		if(this.day == 1)
		{
			if (this.month == 1)
			{
				printDetails(31,12,this.year-1);
			}
			else
			{
				printDetails(totalDayOfMonth(this.month-1),this.month-1,this.year)
			}
		}
		else{
			printDetails(this.day-1,this.month,this.year);
		}
	}
	
	boolean leapYear(int year)
	{
		if(year%400==0||year%4==0&&year%100!==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	int totalDayOfMonth(int month)
	{
		switch(month)
		case 1: return 31; 
		case 2: if(leapYear(this.year)== true)
				{return 29;}
				else
				{return 28;}
		case 3: return 31; 
		case 4: return 30; 
		case 5: return 31; 
		case 6: return 30; 
		case 7: return 31; 
		case 8: return 31; 
		case 9: return 30; 
		case 10: return 31; 
		case 11: return 30; 
		case 12: return 31; 
		 
	}
}

class Q2{
	public static void main(String args[])
	{
		DateDemo d1 = new DateDemo();
		
	}
}