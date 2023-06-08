import java.util.Scanner;
class power{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i=scob.nextInt();
int j=scob.nextInt();
int k=1;
for(int l=1;l<=j;l++){
k=k*i;
}
System.out.println(k);
}
}