import java.util.*;
class CheckAnagramto{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Enter another String");
		String str1 = sc.nextLine();
		
		boolean flag = true;
		str = str.toLowerCase().replaceAll("\\s","");
		str1 = str1.toLowerCase().replaceAll("\\s","");
		
		if(str.length()!=str1.length())
		{
			flag = false;
		}
		
		char [] s1 = str.toCharArray();
		char [] s2 = str1.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		flag =Arrays.equals(s1,s2);
		
		if(flag)
		{
			System.out.println("Both strings are anagram");
		}
		else
			System.out.println("Both strings are not anagram");
	}
}