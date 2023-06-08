import java.util.Scanner;
class prodigits{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int p=1;
while(i>0){
p=p*(i%10);
i=i/10;
}
System.out.println(p);
}
}