import java.util.Scanner;
class Rectangle{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Length = ");
	int Length = sc.nextInt();
	System.out.println("width = ");
	int width = sc.nextInt();
	
	System.out.println("perimeter of rectangle is : " +2*(Length+width));
	}
}