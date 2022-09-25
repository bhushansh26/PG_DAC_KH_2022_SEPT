import java.util.Scanner;
class Q13{
	public static void main (String args[]){
		System.out.println("Enter any number");
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		int d,r;
		r=0;
		while(a>=1){
			d=a%10;
			a=a/10;
			r=r*10+d;
		}
		System.out.println("Reverse of number is "+r);
		
		
	}
}