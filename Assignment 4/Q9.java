class Q9
{
	public static void main(String args[])
	{
		String str = "67263";
		try{
			int number = Integer.parseInt(str);
		
			System.out.println(number);
		}
		catch (NumberFormatException ex)
		{
			ex.printStackTrace();
		}
	}
}