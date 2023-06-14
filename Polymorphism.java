import java.util.Scanner;
class Polymorphism{
void print(){System.out.println("WELCOME");}
void print(String n){System.out.println("WELCOME "+n);}
}
class Test{
public static void main(String args[]){
Polymorphism ob=new Polymorphism();
ob.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type name");
String s=sc.next();
ob.print(s);
}
} 