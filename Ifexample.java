import java.util.Scanner;
class Ifexample{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int i,j;
i=scob.nextInt();
j=scob.nextInt();
if(j==0)
System.out.println("Division error");
else
System.out.println(i+" divided by "+j+" is:"+(i/j));
}
} 