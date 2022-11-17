import java.io.*;
import java.util.*;

class Q15
{
	public static void main(String args[])
	{
		HashSet<String> h_set = new HashSet<String>();
		h_set.add("black");
		h_set.add("blue");
		h_set.add("red");
		h_set.add("white");
		
		Iterator<String> p = h_set.iterator();	
		while(p.hasNext())						//Q15
		{
			System.out.println(p.next());		
		}
		
		//h_set.removeAll(h_set);				//Q16
		System.out.println(h_set);
		
		String [] str1 = new String[h_set.size()];
		
		int i =0;
		for(String s1 : h_set)
		{
			str1[i++]=s1;						//Q17
		}
		for(String s2 : str1)
		{
			System.out.print(s2+" ");
			System.out.println();
		}
		
		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("black");
		h_set2.add("green");
		h_set2.add("red");
		h_set2.add("violet");
		
		h_set.retainAll(h_set2);
		System.out.println(h_set);
		
		
	}
}