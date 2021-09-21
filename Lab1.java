import java.util.*;
class Lab1
{
 public static void main(String args[])
 {
  int a,b,c;
  double r1,r2,d;
  Scanner s=new Scanner(System.in);
  System.out.println("enter a value");
  a=s.nextInt();
  System.out.println("enter b value");
  b=s.nextInt();
  System.out.println("enter c value");
  c=s.nextInt();
  System.out.println("given quadratic eq is:"+a+"x^2+"+b+"x+"+c);
  d=b*b-4*a*c;
  if(d>0)
  {
   System.out.println("roots are real and unequal");
   r1=(-b+Math.sqrt(d))/(2*a);
   r2=(-b-Math.sqrt(d))/(2*a);
   System.out.println("first root is"+r1);
   System.out.println("second root is"+r2);
  }
   else if(d==0)
  {
    System.out.println("roots are real and equal");  
     r1=(-b+Math.sqrt(d))/(2*a);
    System.out.println(" root is "+r1);
  }
  else
  {
   System.out.println("roots are imaginary");
  }
 }
}
    
 
  
  