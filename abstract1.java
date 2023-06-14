abstract class Bike{
abstract void run();
}
class Honda1 extends Bike{
void run(){System.out.println("running safely");}
public static void main(String args[]){
Bike ob=new Honda1();
ob.run();
}
}