import java.util.Scanner;
class Q5{
	public static void main(String args []){
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=0){
			System.out.println("number is positive");
		}
		else{
			System.out.println("number is negative");
		}
	}
}