import java.util.Scanner;
/**
 * Write a description of class HeartRate here.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 11 Q1)
 */
public class HeartRate
{
    /* 
     * HeartRate gets you age, then
     * calculate and prints your estimated target heart rate zone.
     */
    public static void main (String [] args)
    {
        final int CONST = 220;
        final double MINPRECENT = 0.65;
        final double MAXPRECENT = 0.85;
        
        //variables for decimal calculations
        double minResoult = 0;
        double maxResoult = 0;
        double longAge = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("This program calculates your " + "target heart rate while exercising ");
        System.out.print ("Enter your age: ");
        
        //gets your age and decreace it from 220
        int age = scan.nextInt();
        longAge = CONST - age;
        
        //puts in the decimale variables the colculations of 65% and 85%
        minResoult = longAge * MINPRECENT;
        maxResoult = longAge * MAXPRECENT;
        
        //print the output line with complete numbers
        System.out.println ("Your estimated target heart rate zone is " + (int)minResoult + " – " + (int)maxResoult + " beats per minute.");        
    } // end of method main
}
