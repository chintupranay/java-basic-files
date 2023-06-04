import java.util.Scanner;
public class Table{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int num,i;
num=scob.nextInt();
char ch=' ';
for(i=0;i<=10;i++)
{
System.out.print(num);
System.out.println(ch+"*"+ch+i+"="+(num*i));
}
}
}