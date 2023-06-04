class Student1{
int id;
String name;
}
class TestStudent1{
public static void main(String args[])
{
Student1 s1=new Student1();
Student1 s2=new Student1();
s1.id=492;
s1.name="Pranay";
s2.id=493;
s2.name="Ramu";
System.out.println(s1.id+" "+s1.name);
System.out.println(s2.id+"  "+s2.name);
}
}