import java.util.Scanner; 
class student
{ 
 int sno; 
 String sname; 
 student() 
 { 
  sno=1; 
  sname="rama";
 }
  student(int sno1,String sname1)
  {
   this.sno=sno1;
   this.sname=sname1;
  } 
  student( student s)
  {
   sno=s.sno;
   sname=s.sname;
  }


  void display()
  { 
   System.out.println(sno + " " +  sname);
  } 
  public static void main(String args[])
  {
   student s=new student();
   s.display();
   student s1=new student(3,"sita");
   s1.display();
   Scanner ob=new Scanner(System.in); 
    System.out.println("Enter student number");

   int sno2=ob.nextInt();
   System.out.println("Enter student name");


   String sname2=ob.next();
   student s3=new student(sno2,sname2);
   s3.display();

   student s4=new student(s3);

    System.out.println("s3 is copied to s4");
    s4.display();
  }
 }