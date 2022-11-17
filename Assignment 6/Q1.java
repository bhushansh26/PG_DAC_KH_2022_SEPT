import java.util.*;

class Q1
{
	public static void main(String args[])
	{
		 ArrayList<String> arrList1 = new ArrayList<String>();
		 
		 arrList1.add("Yellow");
		 arrList1.add("Blue");
		 arrList1.add("Brown");
		 arrList1.add("Black");
		 arrList1.add(0,"White");			//Q2 solution
		 
		 System.out.println(arrList1);
		 
		 System.out.println(arrList1.get(3));		//Q3
		 
		 //Collections.sort(arrList1);				//Q4
		 
		 System.out.println(arrList1);
		 
		 Collections.reverse(arrList1);			//Q5
		 System.out.println(arrList1);				
		 
		 Collections.swap(arrList1 , 2,4);			//Q6
		 System.out.println("List after swapping 2nd and 4th member");
		 System.out.println(arrList1);
		 
		 for(String s :arrList1)				//Q7
		 {
			 System.out.println(s);
		 }
		 
			
	}
}