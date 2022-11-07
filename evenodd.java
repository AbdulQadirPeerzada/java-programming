import java.util.*;
class evenodd
{
        public static void main(String[]args)
        {
           System.out.println("Enter a Number");
               Scanner ob=new Scanner(System.in);

               int a=ob.nextInt();

               if(a%2==0)
                        {
                            System.out.println("Even Number");
                        }
           else         {
                            System.out.println("Odd Number");
                        }
        }
}