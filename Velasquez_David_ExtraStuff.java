import java.util.*;
import java.io.*;

public class Velasquez_David_ExtraStuff{
   public static Scanner input = new Scanner (System.in);

   public static int takeTwo(int i, int j) throws Exception {
   
     int quotient = i / j;
     
     if (j == 7) {
        throw new Exception("7 is my number, got a problem with that? Try again");
     }
     
     return quotient;
   }

   
   public static void main(String[] args) throws Exception{
   //Scanner input = new Scanner(System.in);
   int first = -1;
   int second = -1;
   
   do {
      try {
         System.out.println("Enter first integer:");
         first = input.nextInt();
         System.out.println("Enter second integer:");
         second = input.nextInt();
         takeTwo(first, second);
      }
      catch (ArithmeticException a) {
         System.out.println("1st Commandment of Mathematics: Thou shall not divide by zero, try again");
      }
      catch (InputMismatchException b) {
         System.out.println("Please enter an integer: " + input.next());
      }
      catch (Exception David) {
         System.out.println(David);
      }
   }
   while (input.hasNext());
   
   
   
   
   
   
   
   
   
   }
   
}