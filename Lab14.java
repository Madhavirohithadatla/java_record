class A
{
  public void display()
  {
   System.out.println("hai");
  }
}
class B extends A
{
  public void display()
  {
   System.out.println("hello");
  }
}
class Lab14
{
  public static void main(String args[])
  {
   A ref;
   A a=new A();
   B b=new B();
   ref=a;
   ref.display();
   ref=b;
   ref.display();
  }
}

 
