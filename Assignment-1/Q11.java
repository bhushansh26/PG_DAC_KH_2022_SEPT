import java.util.Scanner;
class Q11{
	public static void main (String args[]){
		System.out.println("Enter any three numbers");
		Scanner sc= new Scanner (System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		if(a<b){
			if(a<c){
				System.out.println("Smallest number is "+ a);
			}
			else{
				System.out.println("Smallest number is "+ c);
			}
		}
		else{
			if(b<c){
				System.out.println("Smallest number is "+ b);
			}
			else{
				System.out.println("Smallest number is "+ c);
			}
		}
	}
}