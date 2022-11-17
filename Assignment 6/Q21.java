import java.util.*;
class Q21
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("blue");
		pq1.add("black");
		pq1.add("red");
		pq1.add("white");
		pq1.add("yellow");
		
		System.out.println(pq1);
		
		//pq1.clear();				//Q21
		
		System.out.println(pq1);
		
		
		Object[] arr = pq1.toArray();
		
		System.out.println("Elements in array");
		for(int i =0 ; i< arr.length ; i++)
		{
			System.out.print(arr[i]+" ");			//Q23
		}
	}
}