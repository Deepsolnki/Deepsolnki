import java.util.Scanner;
class SUMOFMULTIPLES{
public static void main(String []args)
{
	int i,sum=0,n;
	for(i=1;i<=40;i++)
{
	n=i*3;
	sum=sum+i;
}
	System.out.println("sum ="+sum);
	System.out.println("sum of multiples of 3 from 1 to 40 -->>");
	System.out.println(sum);
   }
}