import java.util.*;
class Program202{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n;
System.out.print("enter num:");
n=scob.nextInt();
if((n/2)*2==n)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}