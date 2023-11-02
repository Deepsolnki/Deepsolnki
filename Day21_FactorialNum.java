import java.util.Scanner;
class FACTORIALNUMBER {
public static void main(String []args)
{
	int i,factorial=1,num;
	System.out.println("ENTER THE NUMBER TO WHICH YOU NEED TO FIND THE FACTORIAL-->>");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
for(i=1; i<=num; i++)
	{
		factorial = factorial * i;
	}
	System.out.println("factorial of the given number is -->>"+factorial);
		}
}