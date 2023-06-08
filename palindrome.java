import java.util.Scanner;
class Reverse{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n;
String r="";
System.out.print(" Enter the String:");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--)
{
r=r+n.charAt(i);}
if(n.equals(r)){
System.out.println(n+" is a palindrome");
}
else{
System.out.println(n+" is not a palindrome");
}
}
}