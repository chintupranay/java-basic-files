class Rectangle1{
int length;
int width;
void insert(int l,int w){
length=l;
width=w;
}
void CalculateArea(){System.out.println(length*width);}
}
class TestRectangle1{
public static void main(String args[])
{
Rectangle1 r1=new Rectangle1(),r2=new Rectangle1();
r1.insert(11,3);
r2.insert(14,5);
r1.CalculateArea();
r2.CalculateArea();
}
}