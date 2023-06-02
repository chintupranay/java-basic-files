import java.util.Scanner;
class Input2{
public static int mul(int a,int b)
{
int c=a*b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("enter number:");
int num1;
num1=scob.nextInt();
System.out.println("enter number:");
int num2;
num2=scob.nextInt();
System.out.println(num1+"*"+num2+"="+mul(num1,num2));
}
}