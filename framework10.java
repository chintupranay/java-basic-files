import java.util.ArrayList;
class Main7{
public static void main(String args[]){
ArrayList<String>languages=new ArrayList<>();
languages.add("JAVA");
languages.add("PYTHON");
languages.add("C++");
System.out.println("ArrayList:"+languages);
languages.set(2,"JAVASCRIPT");
System.out.println("Modified ArrayList:"+languages);
}
}