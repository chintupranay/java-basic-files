import java.util.Vector;
class Main19{
public static void main(String args[]){
Vector<String>mammals=new Vector<>();
mammals.add("DOG");
mammals.add("HORSE");
mammals.add(2,"CAT");
System.out.println("Vector:"+mammals);
Vector<String>animals=new Vector<>();
animals.add("CROCODILE");
animals.addAll(mammals);
System.out.println("New Vector:"+animals);
}
}
