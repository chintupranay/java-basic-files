import java.util.Scanner;
class print2{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j,fact=1;
for(j=1;j<=i;j++)
{
 fact=fact*j;
}
 System.out.print("fact: "+fact);
}
}