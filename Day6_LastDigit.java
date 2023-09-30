import java.util.Scanner;
class LastTwoDigitNumber
{
	public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println(" enter the number ");
	int num = sc.nextInt();

	System.out.println(" Last two digit number is "+num%100);
}
}