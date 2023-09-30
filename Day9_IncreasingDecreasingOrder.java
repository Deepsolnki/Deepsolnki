import java.util.Scanner;
class IncreasingOrDecreasing{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a First Number ");
	int num1 = sc.nextInt();
	System.out.println(" Enter a Second Number ");
	int num2 = sc.nextInt();
	System.out.println(" Enter a Third Number ");
	int num3 = sc.nextInt();
if (num1 < num2 && num2 < num3)
	System.out.println(" Increasing Order ");
else if (num1 > num2 && num2 > num3)
	System.out.println(" Decreasing Order ");
else
	System.out.println("No Specific Order ");
	}
}