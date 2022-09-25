import java.util.Scanner;
class P5{
	public static void main(String args[]){
		int n=65;
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)(n+i)+" ");
			}
			System.out.println();
		}
	}
}