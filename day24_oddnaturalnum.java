import java.util.Scanner;
class Sumofoddnatueralnum{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number:-> ");
 int n = sc.nextInt();
 
 int sum = 0;
 System.out.print("Odd number is:-> ");
 
 for(int i=1; i<=n*2; i++)
{
  if(i%2!=0)
{
  System.out.print(i);
  if(i<n*2-1)
{ 
  System.out.print(",");
}
sum =sum+i;
}
}
 System.out.println("\nSum of odd number is = " +sum);
}
}