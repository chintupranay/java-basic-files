class Employee{
int id;
String name;
float salary;
void insert(int i,String n,float s){
id=i;
name=n;
salary=s;
}
void displayinfomation(){System.out.println(id+" "+name+" "+salary);}
}
class TestEmployee{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(111,"AAA",45000);
e2.insert(222,"BBB",40000);
e3.insert(333,"CCC",35000);
e1.displayinfomation();
e2.displayinfomation();
e3.displayinfomation();
}
}