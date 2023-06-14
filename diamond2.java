import java.util.Scanner;
class Diamond1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int row=sc.nextInt();
printpattern(c,row);
printpattern2(c,row);
}
public static void printpattern(char ch,int n){
for(int i=n,j=1;j<=n;i--,j+=2)printline(ch,i,j);
}
public static void printpattern2(char e,int n){
for(int i=n,j=n;j>=0;i--,j-=4)printline(e,i,j);}
public static void printline(char d,int n1,int n2){
System.out.println();
char a='#';
for(int i=0;i<n1;i++)System.out.print(a);
for(int j=0;j<n2;j++)System.out.print(d);
for(int i=0;i<n1;i++)System.out.print(a);
}
}