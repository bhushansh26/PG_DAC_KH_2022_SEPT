import java.util.*;
class CountVowels{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0;
		for(int i=0 ; i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
		
		System.out.println("number of vowels in string :"+count);
	}
}