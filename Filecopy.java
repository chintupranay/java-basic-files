import java.io.*;
import java.io.FileWriter;
import java.io.CharArrayWriter;
class Filecopy{
public static void main(String args[])throws Exception{
CharArrayWriter out=new CharArrayWriter();
FileReader r=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferedReader(r);
int i;
while((i=br.read())!=-1){
out.write((char)i);
}
FileWriter w=new FileWriter("C:\\fh\\res.txt");
out.writeTo(w);
w.close();
System.out.print("success....");
}
}