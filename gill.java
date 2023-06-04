class Teststringcomparison1{
public static void main(String args[])
{
String s1="SACHIN";
String s2="SACHIN";
String s3=new String("SAchIN");
char ch[]={'G','I','L','L'};
String s4=new String(ch);
String s5="GILL";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s3));
System.out.println(s1.equals(s4));
System.out.println(s1.equals(s5));
}
}
