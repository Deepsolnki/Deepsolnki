import java.util.Scanner;
class Lastdigit{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter a number");
	int num = sc.nextInt();

	System.out.println("The last digit of number is" +num%10);
	}
}