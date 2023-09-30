import java.util.Scanner;
class NumberEqualOrNot{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println(" First Number ");
	int num1 = sc.nextInt();
	System.out.println(" Second Number ");
	int num2 = sc.nextInt();
	System.out.println(" third Number ");
	int num3 = sc.nextInt();
if(num1 == num2 && num2 == num3)
	System.out.println(" Number is Equal");
else
	System.out.println(" Number is not Equal");
	}
}