class TryCatchEx{
public static void main(String args[]){
try
{
int data=50/0;
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("cant divided by zero...");
}
}
