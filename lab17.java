import java.util.*;
interface Student
{
 void name(int no,String name,int age);
}
interface Depertment
{
 void cource(String cource);
}
interface Attandance extends Student,Depertment
{
 void Attand(int attandance);
}
class Lab17 implements Attandance
{
 public void name(int no,String name,int age)
 {
  System.out.println("rool no :"+no);
  System.out.println("student name :"+name);
  System.out.println("student age :"+age);
 }
 public void cource(String cource)
 {
  System.out.println("student cource :"+cource);
 }
 public void Attand(int attandance)
 {
  System.out.println("attandance is :"+attandance);
  if(attandance>=75)
  System.out.println("he is eligible for exams");
  else
  System.out.println("he is not eligible for exams");
 }
 public static void main(String args[])
 {
  Lab17 e=new Lab17();
  e.name(84,"vasu",23);
  e.cource("mca");
  e.Attand(80);
  Lab17 e1=new Lab17();
  e1.name(1,"teja",21);
  e1.cource("mca");
  e1.Attand(60);
 }
}