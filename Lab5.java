import java.util.*;
class Lab5
{
  void rev()
  {
   int i;
   String s1="";
   Scanner sc=new Scanner(System.in);
   System.out.println("enter a string:");
   String s2=sc.next();
   for(i=s2.length()-1;i>=0;i--)
   s1=s1+s2.charAt(i);
   System.out.println(s1);
  }
 void palin()
 {
  int i;
  String rev="";
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a string:");
  String str=sc.next();
  for(i=str.length()-1;i>=0;i--)
  rev=rev+str.charAt(i);
  if(str.equals(rev))
   System.out.println("given string is palindrom");
  else 
   System.out.println("given string is not palindrom");
  }
 void sort()
  {
  Scanner sc=new Scanner(System.in);
  String temp;
  System.out.println("enter n value");
  int n=sc.nextInt();
  String s[]=new String[n];
  System.out.println("enter  strings");
  for(int i=0;i<n;i++)
  {
   s[i]=sc.next();
  }
 
     for(int i=0;i<n-1;i++)
  {
   for(int j=0;j<n-1;j++)
   {
    if(s[j].compareTo(s[j+1])>0)
    {  
      temp=s[j];
      s[j]=s[j+1];
      s[j+1]=temp;
    }
   }
  }
    System.out.println("after sorting");
    for(int i=0;i<n;i++)
    System.out.println(s[i]);   
   }
   public static void main(String args[])
   {
    Lab5 ob=new Lab5();
    ob.rev();
    ob.palin();
    ob.sort();
    
 System.out.println("before sorting strings");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
 Arrays.sort(args);
 System.out.println("after sorting");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);


  }
}
  	
 
