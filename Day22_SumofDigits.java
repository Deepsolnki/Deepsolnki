import java.util.Scanner;
class SUMOFDIGITNUM {
public static void main(String []args)
{
	long n,sum;
	Scanner sc = new Scanner(System.in);
	System.out.println(" ENTER A NUMBER-->>");
	n=sc.nextInt();
	for (sum=0; n!=0; n/=10)
	{
		sum+=n%10;
	}
System.out.println("SUM OF DIGIT OF A NUMBERE IS -->>" +sum);
	}
}