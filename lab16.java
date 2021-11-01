import java.util.*;
final class Box
{
 final double length=4;
 final double width=3;
 Box(double l, double w)
 {
  length=l;
  width=w;
 }
 final void vol()
 {
  double v=length*width;
  System.out.println("the area is :"+v);
 }
}
class Room extends Box
{
 double height;
 Room(double l, double w, double h)
 {
  super(l,w);
  height=h;
 }
void vol()
{
 double v=length*width*height;
 System.out.println(" the volume is :"+v);
}
}
class Lab16
{
 public static void main(String args[])
 {
  Room r1=new Room(4,5,6);
   r1.vol();
  }
}