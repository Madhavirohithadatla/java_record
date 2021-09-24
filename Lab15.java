
abstract class shape
{
  abstract void area();
}
class rectangle extends shape
{
 public void area()
 {
   int l=2,b=3;
   int a=l*b;
   System.out.println("area of rectangle:"+a);
  }
}
class square extends shape
{
  public void area()
  {
   int side=2;
   int a=side*side;
   System.out.println("area of square:"+a);
  }
}
class Lab15
{
  public static void main(String args[])
  {
   
   rectangle r=new rectangle();
        r.area();
   square s=new square();
        s.area();
  }
}
  
  