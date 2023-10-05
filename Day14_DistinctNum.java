import java.util.Scanner;
class Distinct{
public static void main(String args[])
{
	System.out.println("Enter marks of English");
	Scanner sc=new Scanner(System.in);
	int mark1=sc.nextInt();

	System.out.println("Enter marks of Maths");
	int mark2=sc.nextInt();

	System.out.println("Enter marks of Hindi");
	int mark3=sc.nextInt();

	System.out.println("Enter marks of Scince");
	int mark4=sc.nextInt();

	System.out.println("Enter marks of Social Scince");
	int mark5=sc.nextInt();
	
	if(mark1>=75)
	{
	System.out.println("distinct in English marks ->"+mark1);
	}
	if(mark2>=75)
	{
	System.out.println("distinct in Maths marks ->"+mark2);
	}
	if(mark3>=75)
	{
	System.out.println("distinct in Hindi ->"+mark3);
	}
	if(mark4>=75)
	{
	System.out.println("distinct in Scince ->"+mark4);
	}
	if(mark5>=75)
	{
	System.out.println("distinct in Social Scince ->"+mark5);
	}
   }
}


