import java.util.*;
class CountWordsUsingSplit{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String [] wordCount = str.split("\\s+");
		int count = wordCount.length;
		
		System.out.println("number of words in string :"+count);
	}
}