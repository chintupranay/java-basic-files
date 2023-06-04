import java.util.Scanner;
public class Table5{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i,j,k;
i=scob.nextInt();
for(j=0;j<=10;j++)
{
k=i*j;
System.out.println(i+"*"+j+"="+k);
}
}
}