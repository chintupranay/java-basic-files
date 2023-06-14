 class point{
double x;
double y;
public void setX(double x_value){x=x_value;}
public void setY(double y_value){y=y_value;}
public double getX(){return x;}
public double getY(){return y;}
public double square_distance_from_origin()
{return x*x+y*y;}
}
class Test11{
public static void main(String args[]){
point ob=new point();
ob.setx=5;
ob.sety=7;
System.out.print(ob.square_distance_from_origin());
}
}