import java.util.*;
class CheckRotationString{
	public static void main(String args[])
	{
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("Enter another String");
		
		String str1 = sc.nextLine();
		
		int n = str.length();
		boolean flag = true;
		
		for(int i=0 ; i<str.length() ; i++)
		{
			
			char ch = str.charAt(0);
			str = str.substring(1)+ch;
			
			if(str.equals(str1))
			{
				flag = false;
				System.out.println("This are rotational strings");
				break;
			}
		}
		if(flag)
			System.out.println("Strings are Not matching");
		
	}
}