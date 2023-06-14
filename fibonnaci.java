import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,a=0,b=1;
System.out.println("enter the nth term:");
int n=sc.nextInt();
System.out.print("Fibbonacci series: ");
while(sum<n)
{
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;}
}
}
