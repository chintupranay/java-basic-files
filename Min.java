import java.util.Scanner;
class Min{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i,j;
i=scob.nextInt();
j=scob.nextInt();
if(i<j)
{
System.out.println(i+" is Min");
}
else
{
System.out.println(j+" is Min");
}
if(i>j)
{
System.out.println(i+" is Max");
}
else{
System.out.println(j+" is Max");
}
}
}