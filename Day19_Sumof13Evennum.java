import java.util.Scanner;
class SUM13EVENNUM{
public static void main(String args[])
{
	System.out.println("SUM OF FIRST 13 EVEN NUMBER-->>");
	int i,n,sum=0;
	for(i=0; i<=12; i++)
{
	n=2*i;
	sum+=n;
}
	System.out.println(sum);
}
}