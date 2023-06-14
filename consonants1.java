import java.io.*;
class consonants{
public static void main(String args[])throws Exception{
FileReader r=new FileReader("C:\\fh\\res.txt");
BufferedReader br=new BufferedReader(r);
int i,c=0,z=0,j=0;
while((i=br.read())!=-1){
if(((char)i!='a')||((char)i!='e')||((char)i!='i')||((char)i!='o')||((char)i!='u')||((char)i!='A')||((char)i!='E')||((char)i!='I')||((char)i!='O')||((char)i!='U')){
c++;}
else if((char)i!=' ')||((char)i>=0)&&((char)i<=9)
{j++;}
else{
z++;}
System.out.println(j);
System.out.println(c);
System.out.println(z);
br.close();
r.close();
}
}