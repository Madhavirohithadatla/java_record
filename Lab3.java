import java.util.*;

class Lab3
{
  int a[],n;
  Lab3()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of array:");
    n=s.nextInt();
    a=new int[n];
    System.out.println("Enter elements for array:");
    for(int i=0;i<n;i++)
    {
     a[i]=s.nextInt();
    }
  }
  void display()
  {
    System.out.println("Elements are:");
    for(int i=0;i<n;i++)
    {
      System.out.println(a[i]);
    }
  }
  void minmax()
  {
    int max=a[0],min=a[0];
    for(int i=0;i<n;i++)
    {
     if(max<=a[i])
     {
      max=a[i];
     }
     else if(min>=a[i])
     {
      min=a[i];
     }
    }
    System.out.println("maximum element is:"+max);
    System.out.println("minimum element is :"+min);
  }
  void sum()
  {
    int sum=0;
    for(int i=0;i<n;i++)
    {
      sum=sum+a[i];
    }
     System.out.println("sum of array elements are:"+sum);
  }
  void sort()
  {
   int t;
   for(int i=0;i<n;i++)
   {
    for(int j=i+1;j<n;j++)
    {
     if(a[i]>a[j])
     {
       t=a[i];
       a[i]=a[j];
       a[j]=t;
     }
    }
   }
   System.out.println("after sorting the elements");
  }
   void search()
   {
    int f=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter search element");
    int ele=s.nextInt();
    for(int i=0;i<n;i++)
    {
     if(ele==a[i])
     {
      f=1;
      break;
     }
    }
    if(f==1)
    {
     System.out.println("Element is found");
    }
     else
     {
      System.out.println("Element is not found");
     }
   }
   void dup()
   {
    System.out.println("After removing duplicate:");
    for(int i=0;i<n;i++)
    {
     for(int j=i+1;j<n;j++)
     {
       if(a[i]==a[j])
       {
         for(int k=j;k<n-1;k++)
         {

           a[k]=a[k+1];
           n--;
           j--;
         }
       }
     }
    }
   }
    public static void main(String args[])
    {
      Lab3 ob=new Lab3();
      ob.display();
      ob.minmax();
      ob.sum();
      ob.sort();
      ob.display();
      ob.search();
      ob.dup();
      ob.display();
    }
} 

