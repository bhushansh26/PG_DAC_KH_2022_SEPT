import java.util.*;	
class Q2
{
	public static void main(String args[])
	{
		String str1 = "USA";
		String str2 = "Calvin";
		String str3 = "compUter";
		String str = "coding";
		
		System.out.println(str.length());
		
		//char [] s1 = str.charToArray();
		
		
			if(Character.isUpperCase(str.charAt(0))== true)
			{	int countUpper =1;
				int countLower =1;
				
				//check all other characters are small or upper
				for(int j=1 ;j<str.length();j++)
				{					
					if(Character.isUpperCase(str.charAt(j))==true)
					{					
						countUpper++;
					}
					else if(Character.isLowerCase(str.charAt(j))==true)
					{						
						countLower++;
					}										
				}
				if(countUpper==str.length())
					{
						System.out.println("True");
					}
					else if(countLower==str.length())
					{
						System.out.println("True");
					}
					else
						System.out.println("False");
			}
			
			else if(Character.isLowerCase(str.charAt(0))== true)
			{
				int count=1;
				//check all other characters are small
				for(int j=1 ;j<str.length();j++)
				{
					if(Character.isLowerCase(str.charAt(j))==true)
					{						
						count++;
					}
				}
				if(count == str.length())
					System.out.println("true");
				else
				{
					System.out.println("false");
				}
			}
			else
			{	
				System.out.println("false");
			}
	}
}