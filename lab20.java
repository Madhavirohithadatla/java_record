import java.util.Scanner;

    class OddNumberException extends Exception 
    {
        OddNumberException()
        {
           super("Odd number exception");
        }
       
    }

    class Lab20
    {
        public static void main(String[] args)
        {
            int num;

            Scanner Sc = new Scanner(System.in);

            System.out.print("\n\tEnter any number : ");
            num = Integer.parseInt(Sc.nextLine());

            try
            {
                if(num%2 != 0)
                    throw(new OddNumberException());   
                else
                    System.out.print("\n\t" + num + " is an even number");
            }
            catch(OddNumberException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }

        }
    }