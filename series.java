import java.util.Scanner;
class series{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=a;i>=0;i-=b){
if(i<a){
System.out.print(",");
}
System.out.print(i);
}
}
}
