import java.util.Scanner;
class ReplaceAllString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String c=sc.next();
//String r=sc.next();
String res=str.replaceAll(c,"");
System.out.println(res);
}
}
