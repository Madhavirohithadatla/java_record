import java.util.Scanner;
class Lab7
{
int r,im;
Lab7()
{
}
Lab7(int r,int im)
{
this.r=r;
this.im=im;
}
Lab7 add(Lab7 c2)
{
Lab7 ob=new Lab7();
ob.r=r+c2.r;
ob.im=im+c2.im;
return ob;
}
Lab7 sub(Lab7 c2)
{
Lab7 ob=new Lab7();
ob.r=r-c2.r;
ob.im=im-c2.im;
return ob;
}
Lab7 mul(Lab7 c2)
{
Lab7 ob=new Lab7();
ob.r = r*c2.r-im*c2.im;
ob.im =im*c2.r +r*c2.im;
return ob;
}
void display()
{
System.out.println(r +"+"+ im +"i");
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a,b values");
int a=s.nextInt();
int b=s.nextInt();
Lab7 ob1=new Lab7(a,b);
System.out.println("first complex");
ob1.display();
System.out.println("enter c,d values");
int c=s.nextInt();
int d=s.nextInt();
Lab7 ob2=new Lab7(c,d);
System.out.println("second complex");
ob2.display();
Lab7 ob3=ob1.add(ob2);
System.out.println("sum of two complex numbers");
ob3.display();
Lab7 ob4=ob1.sub(ob2);
System.out.println("subtraction of two complex numbers");
ob4.display();
Lab7 ob5=ob1.mul(ob2);
System.out.println("multiplication of two complex numbers");
ob5.display();
}
}