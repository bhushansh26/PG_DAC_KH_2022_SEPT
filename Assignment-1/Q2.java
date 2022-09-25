import java.util.Scanner;
class Q2{
public static void main (String args[]){
System.out.print("Enter number of your choice");
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int i;
int fact =1;
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of given number is "+fact);
}
}
