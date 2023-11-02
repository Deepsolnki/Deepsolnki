import java.util.Scanner;
class printsumoftheseries{
 public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number :-> ");
  int n = sc.nextInt();
  
int sum = 0;
int p = 0;

 for(int i=1; i<=n; i++)
{
  p = p*10 + 2;
  System.out.print(p);
  if(i<n)
  {
    System.out.print("+");
  }
  
  sum = sum + p;
}
  
 System.out.print("\nSum :->  "+sum);
}  
}