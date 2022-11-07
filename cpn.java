import java.util.*;
class cpn
{
  public static void main(String []args)
  {
    Scanner sc=new Scanner(System.in);

      System.out.println("Enter Matriccution Marks");
        double Matric=sc.nextDouble();

      System.out.println("Enter Intermediate Marks");
        double Inter=sc.nextDouble();

      System.out.println("Enter Test Score");
        double Test=sc.nextDouble();

       double Cpn=(Matric/850)*10+(Inter/1100)*30+(Test/100)*60;

       System.out.println("Cpn is"+(Cpn));

  }
} 