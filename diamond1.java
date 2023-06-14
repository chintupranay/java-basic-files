  import java.util.Scanner;
class Main{
public static void printline(char c1,int nhash,char c2,int nstar)
{
for(int i=0;i<nhash;i++)System.out.print(c1);
for(int i=0;i<nstar;i++)System.out.print(c2);
for(int i=0;i<nhash;i++)System.out.print(c1);
}
public static void upperpattern(int n,char ch){
int i,j;
for(i=n/2,j=1;i>0&&j<n;i--,j+=2)
{printline('#',i,ch,j);System.out.print("\n");}
}
public static void printlower(int n,char ch){
int i,j;
for(i=0,j=n;i<=n/2&&j>=1;i++,j-=2)
{
printline('#',i,ch,j);System.out.print("\n");}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
char ch=sc.next().charAt(0);
upperpattern(n,ch);
printlower(n,ch);
}
}