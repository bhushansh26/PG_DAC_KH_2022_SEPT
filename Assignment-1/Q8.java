import java.util.Scanner;
class Q8{
	public static void main(String agrs []){
		System.out.println("Enter 4 digit number of your choice");
		Scanner sc=new Scanner (System.in);
		int r = sc.nextInt();
		int d;
		while(r>0){
		d=r%10;
		r=r/10;
		System.out.print(d+" ");
		}
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