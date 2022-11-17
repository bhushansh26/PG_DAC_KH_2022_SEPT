import java.util.*;

class Q3{
	public static void main(String args[])
	{
		///int [] arr = new int [10];
		int count = 0;
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 11;
		for(int i =0; i<arr.length ; i++)
		{
			for(int j=i; j<arr.length ; j++)
			{	
				if (arr[i] + arr[j] == sum)
				{
					count++;
				}
			}
	
		}
		
		System.out.println("Number of pairs having sum equal to 11 is :"+count);
	}
}