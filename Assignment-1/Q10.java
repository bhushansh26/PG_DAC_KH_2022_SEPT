import java.util.Scanner;
class Q10{
	public static void main(String agrs []){
		System.out.println("Enter number of your choice");
		Scanner sc=new Scanner (System.in);
		int r = sc.nextInt();
		int d,s;
		s=0;
		while(r>0){
		d=r%10;
		r=r/10;
		s=s+d;
		//System.out.print(d+" ");
		}
		System.out.print("Sum of digits is "+s);
		/*		d=r%10;
		r=r/10;
		System.out.print(d+" " );
		d=r%10;
		r=r/10;
		System.out.print(d+" ");
		d=r%10;
		r=r/10;
		System.out.print(d);
		*/
		
	}
}