class Q10
{
	public static void main(String args[])
	{
		int [] a1 = {5,14,35,90,139};
		int [] a2 = {88,67,35,14,-12};
		int [] a3 = {65,14,129,34,7};
		
		int [] a ;
		a=a3;
		
		int countAscend =1;
		int countDescent =1;
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				countAscend++;
			}
		}
		if(countAscend == a.length)
		{
			System.out.println("ascending");
		}
	
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				countDescent++;
			}
		}
		if(countDescent == a.length)
		{
			System.out.println("Descending");
		}
		
		if(countAscend != a.length && countDescent != a.length)
		{
			System.out.println("Random");
		}
	}
}