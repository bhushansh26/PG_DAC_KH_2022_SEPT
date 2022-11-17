import java.util.*;
class Q14
{
	static boolean equalArray(int ar1[],int ar2[])
	{
		int n =ar1.length;
		int m =ar2.length;
		if(m!=n)
			return false;
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		for(int i=0 ; i<n ;i++)
		{
			if(ar1[i]!=ar2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		int [] arr1 ={1,2,3,14,5};
		int [] arr2 ={1,2,3,4,5};
		
		System.out.println("Are given strings equal? :"+equalArray(arr1,arr2));
		
	}
}