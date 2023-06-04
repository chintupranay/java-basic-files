class CharAtOdd{
public static void main(String args[])
{
String str="WELCOME TO JAVA";
for(int i=0;i<=str.length()-1;i++)
{
if(i%2==0)
System.out.println("char at"+i+"is:"+str.charAt(i));
}
}
}