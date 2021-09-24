class Lab10
{
 static int count=0;
 static void incr()
 {
  count++;
 }
 public static void main(String args[])
 {
 Lab10 c1=new Lab10();
 incr();
 Lab10 c2=new Lab10();
 incr();
 Lab10 c3=new Lab10();
 incr();
 Lab10 c4=new Lab10();
 incr();
 System.out.println("number of objects="+count);
 }
}
