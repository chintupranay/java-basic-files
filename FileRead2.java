import java.io.*;
class Filered{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i,c=0;
while((i=br.read())!=-1)
if(((char)i=='0')||((char)i=='1')||((char)i=='2')||((char)i=='3')||((char)i=='4')||((char)i=='5')||((char)i=='6')||((char)i=='7')||((char)i=='8')||((char)i=='9')){
c++;}
System.out.print(c);
br.close();
fr.close();
}
}
  