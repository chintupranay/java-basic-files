class cal implements Runnable{
public static void main(String args[]){
cal obj=new cal();
Thread o=new Thread(obj);
o.start();
System.out.println("Threads inside main are very helpfulin java");
}
public void run(){
System.out.print("Threads from overridden");
}
}