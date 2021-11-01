class lab21 extends Thread
{
 public void run()
 {
   System.out.println("thread is running");
 }
 public static void main(String args[])
 {
  lab21 ob1=new lab21();
  lab21 ob2=new lab21();
  Thread t1=new Thread(ob1);
  Thread t2=new Thread(ob2);
  System.out.println("t1="+t1.getState());
  System.out.println("t2="+t2.getState());
  t1.start();
  System.out.println("t1="+t1.getState());
  System.out.println("t2="+t2.getState());
  t2.start();
  System.out.println("t1="+t1.getState());
  System.out.println("t2="+t2.getState());
 }
}