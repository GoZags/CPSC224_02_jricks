/*
Jackson Ricks
username: jricks
ICA1 Conversion program
CPSC224_02
*/

import java.util.Scanner;
import java.util.*;

public class conversion
{	
	public static void main(String[] args)
	{	
        Scanner reader = new Scanner(System.in);
        double meters = -1;
        while (meters < 0)
        {
        try
        {
            System.out.println("Enter a distance in meters");
            meters = reader.nextDouble();
        }
        //Checks to see if user input a number
        catch (InputMismatchException e)
        {
            System.out.println("Not a valid input");
            System.out.println();
            reader.nextLine();
        }
        }
        System.out.println();
        
        
        int choice = 0;
        while (choice != 4)
        {
           try
           {
            menu();
            choice = reader.nextInt();
            System.out.println();
            if (choice == 1)
            {
              showKilometers(meters);
            }
            else if (choice == 2)
            {
              showInches(meters);
            }
            else if (choice == 3)
            {
              showFeet(meters);
            }   
            else if (choice == 4)
            {
              System.out.println("Exiting program");
              System.exit(0);
            }
            else 
            {
              System.out.println("Only enter 1, 2, 3, or 4");
            }
            System.out.println();
            }
            
            //Checks if a user input something other than a number
            catch (InputMismatchException e)
            {
               System.out.println("Not a valid input");
               System.out.println();
               reader.nextLine();
            }
        }
	}
	
	public static void showKilometers(double meters)
	{	
        double kilometers = meters * .001;
        System.out.println(meters + " meters is " + kilometers + " kilometers");
	}
	
	public static void showInches(double meters)
	{	
        double inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches");
	}
	
	public static void showFeet(double meters)
	{	
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet");
    }
    
    public static void menu()
	{	
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
        System.out.println();
        System.out.println("Enter your choice");    
    }
}