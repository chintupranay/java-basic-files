import java.util.ArrayList;
class Main6{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("CAT");
animals.add("DOG");
animals.add("COW");
System.out.println("ArrayList:"+animals);
String str=animals.get(1);
System.out.println("Elements at index 1:"+str);
str=animals.get(2);
System.out.println("ELements at index 2:"+str);
}
}
