import java.util.Scanner;
class palindrome{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num:");
int i=sc.nextInt();
int m=i;
int sum=0;
while(i>0)
{
sum=sum*10+i%10;
i=i/10;
}
if(sum==m)
{
System.out.print(m+" is a palindrome");
}
else
{
System.out.println(m+" is not a palindrome");
}
}
}