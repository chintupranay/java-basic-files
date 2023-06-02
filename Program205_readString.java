import java.util.*;
public class Program205_readstring
{
public static void main(String args[])
{
System.out.println("Enter ur name:");
Scanner scob=new Scanner(System.in);
String n=scob.next();
char ch=n.charAt(4);
System.out.println("hello"+n+ch);
}
}