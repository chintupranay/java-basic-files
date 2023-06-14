import java.io.*;
class Buff{
public static void main(String args[])throws Exception{
InputStreamReader  a=new  InputStreamReader(System.in);
BufferedReader br=new BufferedReader(a);
String name="";
while(!name.equals("stop")){
System.out.println("Enter data :");
name=br.readLine();
System.out.println("data is:"+name);
}
br.close();
a.close();
}
}
