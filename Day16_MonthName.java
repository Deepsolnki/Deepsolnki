import java.util.Scanner;
class MONTHNAME{
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	int Monthnum = 1;
	
	System.out.println("Enter the Month -->>");
	Monthnum = input.nextInt();

	switch(Monthnum)
	{
	case 1:
		System.out.println("JANUARY");
		break;
	case 2:
		System.out.println("FEBRUARY");
		break;
	case 3:
		System.out.println("MARCH");
		break;
	case 4:
		System.out.println("APRIL");
		break;
	case 5:
		System.out.println("MAY");
		break;
	case 6:
		System.out.println("JUN");
		break;
	case 7:
		System.out.println("JULY");
		break;
	case 8:
		System.out.println("AUGEST");
		break;
	case 9:
		System.out.println("SEPTEMBER");
		break;
	case 10:
		System.out.println("OCTOBER");
		break;
	case 11:
		System.out.println("NOVEMBER");
		break;
	case 12:
		System.out.println("DECMBER");
		break;
	default:
		System.out.println("Invalid.... plzz Enter The 1 to 12....");
		break;
	}
    }
}
