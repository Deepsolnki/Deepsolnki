import java.util.Scanner;
class WeekDay{
public static void main(String args[])
{
	Scanner input = new Scanner(System.in);
	int daynum = 0;

	System.out.printf(" Enter the WeekDay-->>");
	daynum = input.nextInt();

	switch(daynum)
	{
	case 0:
		System.out.printf("SUNDAY");
		break;
	case 1:
		System.out.printf("MONDAY");
		break;
	case 2:
		System.out.printf("TUESDAY");
		break;	
	case 3:
		System.out.printf("WEDNESDAY");
		break;
	case 4:
		System.out.printf("THURSDAY");
		break;
	case 5:
		System.out.printf("FRIDAY");
		break;
	case 6:
		System.out.printf("SATURDAY");
		break;
	default:
		System.out.printf("invalid... plz enter the 0 to 6...");
		break;
	}
      }
}