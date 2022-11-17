import java.util.*;
class Q22
{
	public static void main(String args[])
	{
		
		
 		Integer [] arr1 = {1,2,3,4,5,6};
		
		//a1 = Arrays.asList(arr1);
		List<Integer> a1 = Arrays.asList(arr1);
		System.out.println(a1);
		
		Set<Integer> set = new TreeSet<Integer>(a1);
		System.out.println(set);
	}
}