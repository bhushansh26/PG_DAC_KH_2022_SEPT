import java.util.*;

class Q13
{

	static boolean areIdentical(LinkedList l1 , LinkedList l2)
	{
		if(l1.size() != l2.size())
		{
			return false;
		}
		for(int i=0 ; i<l1.size() ; i++)
		{
			if(	l1.get(i) != l2.get(i))
				return false;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println(list1);
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		System.out.println(list2);
		
		System.out.println(areIdentical(list1,list2));		//Q13
		
		list2.add(4);
		System.out.println(areIdentical(list1,list2));			//Q13
		
		list2.set(3,0);
		System.out.println(list2);			//Q14
		
	}
}