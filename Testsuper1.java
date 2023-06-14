class Animal{
void eat(){System.out.println("Eating......");}
}
class Dog extends Animal{
void eat(){System.out.println("Eating bone...");}
void bark(){System.out.println("Bow bow....");}
void work(){
super.eat();
bark();
}
}
class TestSuper1{
public static void main(String args[])
{
Dog d=new Dog();
d.work();
}
}