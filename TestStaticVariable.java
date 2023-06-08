class Student{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
class TestStaticVariable1{

public static void main(String args[]){
Student s1=new Student(111,"AAA");
Student s2=new Student(222,"BBB");
Student.college="A.M.REDDY";
s1.display();
s2.display();
}
}