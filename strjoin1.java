class StrJoin{
public static void main(String args[])
{
String s1=new String("HELLO");
String s2=new String("WORLD");
String s3=new String("JAVA");
String s=String.join(" ",s1,s2,s3);
System.out.println(s);
}
}