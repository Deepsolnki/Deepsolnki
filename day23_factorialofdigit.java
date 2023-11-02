import java.util.Scanner;
class digitfactorial
{
public static void main(String args[])
{
int n = 40585;
int num =n;
int sumOfFactorial = 0;
while (num!=0)
{
int mod = num % 10;
int fact = 1;

for(int i = mod;i>0; i--)
{
fact = fact*i;
}
sumOfFactorial = sumOfFactorial+fact;

num= num/10;
}
if(n == sumOfFactorial)
{
System.out.println(n +"is a strong number");
}
else
{
System.out.println(n +"is  not a strong number"); 
 
}
}
}
