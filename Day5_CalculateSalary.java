import java.util.Scanner;
class CalculateSalary{
	public static void main(String args[]){
		Scanner input1=new Scanner(System.in);
		System.out.println("please enter your month salary");
		double MonthlySalary=input1.nextDouble();
		System.out.println(" 1 day salary "+(MonthlySalary/30));
	}
}