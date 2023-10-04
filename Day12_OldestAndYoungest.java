import java.util.Scanner;
class OldestYoungest{
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the age of Chetan-->");
	int age1=input.nextInt();
	System.out.print("Enter the age of Abhishek-->");
	int age2=input.nextInt();
	System.out.print("Enter the age of Aadi-->");
	int age3=input.nextInt();
	if(age1<age2 && age1<age3)
		System.out.print("The youngest age is Chetan-->");
	else if(age2<age1 && age2<age3)
		System.out.print("The youngest age is Abhishek-->");
	else
		System.out.print("The youngest age is Aadi-->");
	}
}