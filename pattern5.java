import java.util.Scanner;
class Main{
static int x=0;
public static void printpattern(int n){
for(int i=0;x<=n;i++){printline(i);System.out.print("\n");
}
public static void printline(int stop){
for(int i=0;i<=stop;i++){System.out.print(x++);
if(i<stop)System.out.print(",");
}
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
printpattern(n);
}
}
