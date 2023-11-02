import java.util.Scanner;
class NATURALNUM{
public static void main(String args[])
{
	int num , i;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please Enter any number-->>");
	num = sc.nextInt();

	for(i=1; i<=num; i++)
	{
		System.out.println(i+"\t");
	}
    }
}