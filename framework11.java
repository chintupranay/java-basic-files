import java.util.ArrayList;
class Main8{
public static void main(String args[]){
ArrayList<String>animals=new ArrayList<>();
animals.add("COW");
animals.add("CAT");
animals.add("DOG");
System.out.println("ArrayList:"+animals);
System.out.println("Accessing individual elements:");
for(String temp : animals){
System.out.print(temp);
System.out.print(",");
}
}
}