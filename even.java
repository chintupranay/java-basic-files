  import java.util.*;
class Program201{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int n;
System.out.println("enter the num:");
n=scob.nextInt();
if(n%2==0)
{
System.out.println("even");
System.out.println(n+"is even");
}
else
{
System.out.println("odd");
System.out.println(n+"is odd");
}
}
}