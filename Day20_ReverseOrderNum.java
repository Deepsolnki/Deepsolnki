import java.util.Scanner;
class REVERSEORDER {
public static void main(String []args)
{
	int num,i;
	Scanner sc = new Scanner(System.in);

	System.out.println("PLEASE ENTER THE NATURAL REVERSE ORDER NUMBER -->>");
	num = sc.nextInt();

	for(i=num;i>=1;i--)
	{
		System.out.println(i+"\t");
	}
    }
}
	