 import java.util.Scanner;
import java.util.Arrays;
class array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<=(n-1);i++)
 a[i]=sc.nextInt();
Arrays.sort(a);
System.out.println(a[0]);
System.out.println(a[n-1]);
int sum=0;
for(int j=0;j<n;j++){
sum=sum+a[j];}
System.out.println(sum);
double average=((double)sum/(double)n);
System.out.print(average);
}
}

