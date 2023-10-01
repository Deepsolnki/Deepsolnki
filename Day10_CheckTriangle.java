import java.util.Scanner;
class TriangleCheck{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the First Angle --> ");
	int Angle1 = sc.nextInt();
	
	System.out.println(" Enter the Second Angle --> ");
	int Angle2 = sc.nextInt();

	System.out.println(" Enter the Third Angle --> ");
	int Angle3 = sc.nextInt();

if((Angle1+Angle2+Angle3)==180)
	System.out.println("Triangle is valid");
else
	System.out.println("Triangle is not valid");
	}
}

