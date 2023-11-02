import java.util.Scanner;
class SUMOFLAST3DIGIT{
public static void main(String args [])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER THE NUMBER -->>");
	int num = sc.nextInt();
	int sum = 0;
int ThreeDigit = num%1000;
	System.out.println("Last Three Digits is -->>"+ThreeDigit);
while(ThreeDigit>0)
{
	int digit = ThreeDigit%10;
	sum = sum + digit;
	ThreeDigit = ThreeDigit/10;
}
		
		System.out.println("Sum of the last 3 Digits is -->>" +sum);

   }
} 