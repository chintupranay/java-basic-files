import java.util.Scanner;
class Sumdigits{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int sum=0;
while(i>0){
sum=sum+i%10;
i=i/10;
}
System.out.println(sum);
}
}