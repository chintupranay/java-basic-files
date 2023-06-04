class Student3{
int rollno;
String name;
Student3(){rollno=0;name=null;}
Student3(int r,String n){
rollno=r;
name=n;
}
void displayinformation(){System.out.println(rollno+" "+name);}
}
class TestStudent3{
public static void main(String args[])
{
Student3 s1;
s1=new Student3();
Student3 s2=new Student3(123,"SAI");
s1.displayinformation();
s2.displayinformation();
}
}
