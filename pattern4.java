 import java.util.Scanner;
class pattern4{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=0;
for(int i=1;i<=n;i++){if(k<n)System.out.print("\n");
for(int j=1;j<=i;j++){
if(k<=n){
System.out.print(k);
k++;}
if(j<i&&k<=n)
{System.out.print(",");}
}
}
}}