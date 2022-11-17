class Q20
{
	public static void main(String args[])
	{
		String s1 = new String();
		System.out.println("s1 :"+s1);
		
		String s2 = new String("Welcome");
		System.out.println("s2 :"+s2);
		
		String s3 = new String(new char[]{'v','o','i','d'});
		System.out.println("s3 :"+s3);
		
		String s4 = new String(new char[]{'v','o','i','d'},1,2);
		System.out.println("s4 :"+s4);
		
		String s5 = new String(new byte[]{65,67,66,68,69,70});
		System.out.println("s5 :"+s5);
		
		String s6 = new String(new byte[]{65,67,66,68,69,70},2,3);
		System.out.println("s6 :"+s6);
				
		
	}
}