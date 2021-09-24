
import java.util.*;
class Lab5_e
{
public static void main(String args[])
{
System.out.println("before sorting strings");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
 Arrays.sort(args);
 System.out.println("after sorting");
 for(int i=0;i<args.length;i++)
 System.out.println(args[i]);
}
}


