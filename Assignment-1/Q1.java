import java.util.Scanner;
public class Q1{
public static void main(String [] args)
{
System.out.println("Enter number=");
Scanner sc=new Scanner(System.in);
int N= sc.nextInt();
int R;
R=N%2;
if(R==0)
{
System.out.println("Number is even");
}
else
{System.out.println("Number is odd");
}

}
}