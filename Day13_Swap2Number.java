import java.util.Scanner;
class Swaptwonum{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number ->");
	int num1=sc.nextInt();
	System.out.println("Enter 2nd Number ->");
	int num2=sc.nextInt();
	System.out.println("Before Swapping number are ->");
	System.out.println("The 1st Number"+num1);
	System.out.println("The 2nd Number"+num2);
	
	int temp=num1;
	num1=num2;
	num2=temp;
	System.out.println("After Swapping number are ->");
	System.out.println("The 1st Number"+num1);
	System.out.println("The 2nd Number"+num2);
	}
}