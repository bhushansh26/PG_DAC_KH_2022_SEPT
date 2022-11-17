class Q7
{
	static void mergeArrays(int [] a1,int [] a2,int n1,int n2, int [] a3)
	{
		int i=0, j=0, k=0;
		
		while(i<n1)
		{
			a3 [k++] = a1[i++];
		}
		//k = n1;
		while(j<n2)
		{
			a3 [k++] = a2[j++];
		}
		
	}
	
	public static void main(String args[])
	{
		int []a1 = {23,60,94,3,102};
		int []a2 = {42,16,74};
		int n1 = a1.length;
		int n2 = a2.length;
		
		int [] a3 = new int[n1+n2];
		
		mergeArrays(a1 , a2, n1, n2, a3);
		for(int i=0; i <(n1+n2) ; i++)
		{
			System.out.println(a3[i]);
		}
	}
}