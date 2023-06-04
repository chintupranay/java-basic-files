class Student2{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent2{
public static void main(String args[])
{
Student2 s1=new Student2();
Student2 s2=new Student2();
s1.insertRecord(492,"PRANAY");
s2.insertRecord(444,"SAI");
s1.displayinformation();
s2.displayinformation();
}
}
