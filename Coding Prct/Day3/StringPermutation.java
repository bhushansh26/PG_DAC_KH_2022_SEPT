
public class StringPermutation {
	
	static void permutation(String str , String res)
	{
		if(str.length()==0)
		{
			System.out.println(res+" ");
		}
		for(int  i =0 ; i<str.length() ; i++)
		{
			char c = str.charAt(i);
			String s1 = str.substring(0,i)+str.substring(i+1);
			permutation(s1 , res+c);
		}
	}

	public static void main(String[] args) {
		String s = "RAM";
		permutation(s,"");
	}

}
