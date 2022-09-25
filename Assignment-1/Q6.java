import java.util.Scanner;
class Q6{
	public static void main(String args []){
		System.out.println("Enter Year of your choice");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int s= n%4;
		if(s==0){
			System.out.println("This is leap year");
		}
		else{
			System.out.println("This is not leap year");
		}
	}
}