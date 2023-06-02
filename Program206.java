import java.util.*;
class Program206
{
public static void main(String args[])
{
char ch;
Scanner scob=new Scanner(System.in);
ch=scob.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
System.out.println(ch+"is an alphabet");
else if(ch>='0'&&ch<='9')
System.out.println(ch+"is digit");
else
System.out.println(ch+"is special character");
}
}