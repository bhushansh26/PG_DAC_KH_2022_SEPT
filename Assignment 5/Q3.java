import java.util.*;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int countVertical=0;
		int countHorizontal=0;
		for(int  i =0 ; i<str.length() ; i++)
		{
			if(str.charAt(i)=='R'||str.charAt(i)=='r')
				countHorizontal++;
			if(str.charAt(i)=='L'||str.charAt(i)=='l')
				countHorizontal--;
			if(str.charAt(i)=='u'||str.charAt(i)=='U')
				countVertical++;
			if(str.charAt(i)=='D'||str.charAt(i)=='d')
				countVertical--;
			
			System.out.println(countHorizontal+" "+countVertical+" ---->");
		}
		
		if(countHorizontal==0 && countVertical==0)
			System.out.println("true");
		else
			System.out.println("false");
	}
}