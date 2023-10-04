import java.util.Scanner;
class Calculater{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number-->");
	int X = sc.nextInt();
	System.out.println("Enter Second Number-->");
	int Y = sc.nextInt();
System.out.println("Choose and enter the type of operation you want to perform\n 1>Addition (+)\n 2>Substraction (-)\n 3>Multiply(*)\n 4>Divide(/)");
	char operation = sc.next().charAt(0);
if(operation == '+')
{
	System.out.println("Your ans is"+(X+Y));
}
else if(operation == '-')
{
	System.out.println("Your ans is"+(X-Y));
}
else if(operation == '*')
{
	System.out.println("Your ans is"+(X*Y));
}
else if(operation == '/')
{
	System.out.println("Your ans is"+(X/Y));
}
  }
}