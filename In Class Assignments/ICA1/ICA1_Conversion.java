/*********************
In Class Assignment #1
Due Date: 1/25/19
Ryan Hays
**********************/

import java.util.Scanner; // Needed for the Scanner class 2

public class ICA1_Conversion
{
   public static void main(String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      double meters;
      char inputChar;
      int inputNum = 0;
      
      while(true)
      {
         System.out.println("Enter a distance in meters: ");
         meters = scnr.nextDouble();
         System.out.println();
         if(meters < 0)
            System.out.println("Please enter a positive number.");
         else
            break;
      }
      
      while(inputNum != 4)
      {
         System.out.println("1. Convert to kilometers");
         System.out.println("2. Convert to inches");
         System.out.println("3. Convert to feet");
         System.out.println("4. Quit the program");
         System.out.println();
         
         while(true)
         {
            System.out.println("Enter your choice: ");
            inputChar = scnr.next().charAt(0);
            if(Character.isDigit(inputChar))
            {
               inputNum = Character.getNumericValue(inputChar);
               break;
            } 
            else
               System.out.println("Please enter a number");
         }
         
         if(inputNum == 1)
            showKilometers(meters);
         else if (inputNum == 2)
            showInches(meters);
         else if (inputNum == 3)
            showFeet(meters);
         else if (inputNum != 4)
            System.out.println("Please enter a number between 1 and 4.");
         System.out.println();
      }

      System.out.println("Bye!");
   }
   public static void showKilometers(double meters)
   {
      double kilometers = meters * 0.001;
      System.out.println(meters + " meters is " + kilometers + " kilometers.");
   }
   public static void showInches(double meters)
   {
      double inches = meters * 39.37;
      System.out.println(meters + " meters is " + inches + " inches.");
   }
   public static void showFeet(double meters)
   {
      double feet = meters * 3.281;
      System.out.println(meters + " meters is " + feet + " feet.");
   }
}
