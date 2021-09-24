import java.util.*;
class demo
{
   int fib(int n)
   {
     if(n==1)
      return 1;
     else if(n==2)
       return 1;
     else
       return(fib(n-1)+fib(n-2));
   }
}
class Lab11
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter n value::");
    int n=s.nextInt();
    demo d=new demo();
    int rec=0;
    System.out.println("The recursive fibbonocci sequence is");
    System.out.println(rec);
    int i;
    for(i=1;i<n;i++)
    {
      rec=d.fib(i);
      System.out.println(rec);
    }
    System.out.println(n+"The value of serice is"+rec);
    int a=1,b=1,c=0;
    System.out.println("The non recursive fibonocci sequence is");
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);
    for(i=1;i<n-2;i++)
    {
      c=a+b;
      System.out.println(c);
      a=b;
      b=c;
    }
    
    
    System.out.println(n+"th value of serice is"+c);
  }
} 



    
