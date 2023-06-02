import java.util.*;
class Program203{
public static boolean iseven(int n)
{
return((n/2)*2==n);
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n;
System.out.println("enter num:");
n=scob.nextInt();
if(iseven(n))
System.out.println("is even");
else
System.out.println("is odd");
}
}