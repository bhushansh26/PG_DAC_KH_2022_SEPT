import java.util.*;
class Q19
{
	public static void main(String args[])
	{
		String str = "abbccc";
		int [] arr1 = new int[256];
		for(int i=0 ; i<str.length() ; i++)
		{
			arr1[str.charAt(i)]	= arr1[str.charAt(i)]+1;
		}
		int max = -1;
		char c = ' ';
		for(int  i=0 ; i<str.length() ; i++)
		{
			if(max<arr1[str.charAt(i)])
			{
				max = arr1[str.charAt(i)];
				c = str.charAt(i);
			}
		}
		System.out.println(c+" is occurred in string "+max+" times." );
	}
}