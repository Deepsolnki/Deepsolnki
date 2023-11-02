import java.util.Scanner;
class AVERAGEOFNUM1TON{
public static void main(String args [])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number for Print number of Averag-->>");	
	int num = sc.nextInt();
	float averag = 0;

for(int i=1; i<=num; i++)
{
	averag = averag + i;
}
	System.out.println("averag = "+averag/num);
    }
}
