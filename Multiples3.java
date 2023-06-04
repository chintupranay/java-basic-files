import java.util.Scanner;
class Mul{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int a,b,c,d;
a=scob.nextInt();
b=scob.nextInt();
c=0;
for(d=0;d<=b;d++)
{
c=d*a;
if(c<=15)
{
System.out.print(c+",");
}
}
}
}