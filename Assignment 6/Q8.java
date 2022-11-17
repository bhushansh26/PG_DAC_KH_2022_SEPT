import java.util.*;

class Q8
{
	
	public static void main(String args[])
	{
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("red");
		list1.add("yellow");
		list1.add("blue");
		list1.add("white");
		list1.add("black");
		list1.add("orange");
		System.out.println(list1);
		
		list1.add(3,"purple");			//Q9
		System.out.println(list1);
		
		list1.addFirst("maroon");
		list1.addLast("violet");
		System.out.println(list1);		//Q10		
		
		int i=0;
		for(String s:list1)
		{
			System.out.println((i++)+"---"+s);			//Q11
		}
		
		int count=0;
		String str = "black";
		for(String k:list1)
		{
			if(k == str)
				count++;
		}
		if(count>0)
		{
			System.out.println("element is found");
		}
		
		System.out.println(list1.contains("white"));	//Q12
	}
}