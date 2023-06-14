abstract class Bank{
abstract int getRateOfIntrest();
}
class SBI extends Bank{
int getRateOfIntrest(){return 7;}
}
class PNB extends Bank{
int getRateOfIntrest(){return 8;}
}
class TestBank{
public static void main(String args[]){
Bank b;
b=new SBI();
System.out.println("Rate of intrest is: "+b.getRateOfIntrest()+"%");
b=new PNB();
System.out.println("Rate of Intrest is: "+b.getRateOfIntrest()+"%");
}
}