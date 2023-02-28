import java.util.*;
class SwapString{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String s1 = sc.nextLine();
		
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		
		int n1 = s1.length();
		int n2 = s2.length();
		
		s1 = s1.concat(s2);
		s2 = s1.substring(0,n1);
		s1 = s1.substring(n1);
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
	}
}