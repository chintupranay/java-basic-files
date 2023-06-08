import java.util.Scanner;
class reversedigits{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the positive integer:");
int i=sc.nextInt();
int rd=0;
while(i>0){
rd=rd*10+i%10;
i=i/10;
}
System.out.println("Reverse of digit :"+rd);
}
}