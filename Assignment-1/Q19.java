import java.util.Scanner;
class Q19{
public static void main(String args[]){
	System.out.println("Enter number till which you want list");
	Scanner sc= new Scanner(System.in);
	int i= sc.nextInt();
	int d=0;
	System.out.println("Series of even number till "+i+"is as follows" );
	while(d<=i){
		
		System.out.print(d+" ");
		d=d+2;
	}
}
}