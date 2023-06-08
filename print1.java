import java.util.Scanner;
class print1{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=0;
while(j<=i)
{

System.out.print(j);
j++;
if(j<=i)
System.out.print(",");
}
}
}
