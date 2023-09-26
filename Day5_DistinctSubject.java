import java.util.Scanner;
class DistinctSubject{
public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	System.out.println("please enter English subject marks :");
	double Englishmarks = sc.nextDouble();
	System.out.println("please enter Hindi subject marks :");
	double Hindimarks = sc.nextDouble();
	System.out.println("please enter Maths subject marks :");
	double Mathsmarks = sc.nextDouble();
if(Englishmarks>=75)
{
	System.out.println("hey you got distinct in English :" +Englishmarks);
}
if(Hindimarks>=75)
{
	System.out.println("hey you got distinct in Hindi :" +Hindimarks);
}
if(Mathsmarks>=75)
{
	System.out.println("hey you got distinct in Maths :" +Mathsmarks);
}
	}
}