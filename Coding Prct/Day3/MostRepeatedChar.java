import java.util.*;
class MostRepeatedChar{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char mostRepeated = frequentlyRepeatedChar(str);
		System.out.println(""+mostRepeated);
	}
	
	static char frequentlyRepeatedChar(String str)
	{
		int [] charArray = new int[256];
		
		for(int i=0 ; i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			charArray[ch]++;
		}
		
		char mostRepeatedChar=' ';
		int maxCount=0;
		for(int i=0 ; i<charArray.length ; i++)
		{
			if(charArray[i]>maxCount)
			{
				maxCount=charArray[i];
				mostRepeatedChar=(char)i;
			}
		}
		
		return mostRepeatedChar;
	}
}