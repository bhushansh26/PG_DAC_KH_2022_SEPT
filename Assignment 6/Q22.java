import java.util.*;
class Q22
{
	public static void main(String args[])
	{
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1,"blue");
		hashMap.put(2,"black");
		hashMap.put(3,"red");
		hashMap.put(4,"white");
		hashMap.put(5,"yellow");
		
		System.out.println("Size of hashMap:"+hashMap.size());
		
		System.out.println("Is hashMap empty?"+hashMap.isEmpty());		//Q24
		
		HashMap<Integer,String> hashMap2 = new HashMap<Integer,String>();
		System.out.println("Is hashMap2 empty?"+hashMap2.isEmpty());		//Q24
		
		String val = (String) hashMap.get(3);
		System.out.println("Value forkey 3 is :"+ val);			//Q25
		
	}
}