import java.util.*;
class CountWords{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=1;
		for(int i=0 ; i<str.length();i++)
		{
			char ch = ' ';
			if(str.charAt(i)==ch)
				count++;
		}
		
		System.out.println("number of words in string :"+count);
	}
}