public class Concat1{
public static void main(String args[])
{
String str1="HELLO";
String str2="THIS IS";
String str3="PRANAY";
String str4=str1.concat(" ").concat(str2).concat(" ").concat(str3);
System.out.println(str4);
String str5=str3.concat("@@@");
System.out.println(str5);
}
}