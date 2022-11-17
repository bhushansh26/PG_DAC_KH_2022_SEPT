import java.util.*;
class Q23
{
	public static void main(String args[])
	{
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Abcd");
		a1.add("Efgh");
		a1.add("Ijkl");
		a1.add("Mnop");
		
		String [] str1 = new String[a1.size()];
		
		for(int i=0 ; i<a1.size() ; i++)
		{
			str1[i] = a1.get(i);
		}
		
		System.out.println(Arrays.toString(str1));
	}
}