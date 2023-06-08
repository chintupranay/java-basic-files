class Student{
int rollno;
String name;
static String college="MTIET";
static void change(){
college="PIET";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
class TestStaticmethod{
public static void main(String args[]){
Student s1=new Student(111,"AAA");
Student s2=new Student(222,"BBB");
Student.change();
Student s3=new Student(333,"CCC");
s1.display();
s2.display();
s3.display();
}
}