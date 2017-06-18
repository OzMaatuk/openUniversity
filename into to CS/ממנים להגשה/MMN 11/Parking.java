import java.util.Scanner;
/**
 * Write a description of class Parking here.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN11 Q2)
 */
public class Parking
{
    /**
     *  Gets two time pairs from user, 
     *  checks their legality, 
     *  in case of illegal time - prints appropriate notice
     *  otherwise - calculates their difference
     */
    public static void main(String[]args)
    {
        final int AFTERTHREEHOURSPAY = 3;
        final int HOURSDIVISION = 4;
        final int TWOHOURSPAY = 10;
        final int CONST = 20;
        final int DEAFULTPAYMENTBOUND = 18;
        final int MINUTES_IN_HOUR = 60;  
        final int HOURS_IN_DAY = 24;  
        final int MINUTES_LOW_BOUND = 0;  
        final int HOURS_LOW_BOUND = 0;  
       
        boolean legalOperation = true;
        int payment = 0;
        
        //Gets first time pair from user
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter entrance time:");        
        int firstHours = scan.nextInt();
        int firstMinutes = scan.nextInt();
        //Gets second time pair from user          
         System.out.println("Enter exit time:");
         int secondHours = scan.nextInt();
         int secondMinutes = scan.nextInt();
         
        if ((firstHours < HOURS_LOW_BOUND) || 
               (firstHours >= HOURS_IN_DAY) || 
               (firstMinutes < MINUTES_LOW_BOUND) || 
               (firstMinutes >= MINUTES_IN_HOUR))
        {// Check legality of the first pair
            System.out.println("Error! Illegal data");
            legalOperation = false;
        }//if
         
        if ((secondHours < HOURS_LOW_BOUND) || 
               (secondHours >= HOURS_IN_DAY) || 
               (secondMinutes < MINUTES_LOW_BOUND) || 
               (secondMinutes >= MINUTES_IN_HOUR))
        {// Check legality of the second pair
           System.out.println("Error! Illegal data");
           legalOperation = false;
        }//if
        
        //check if exit time is after enter time
        if ( (secondHours < firstHours) || ((secondHours == firstHours) && (secondMinutes <= firstMinutes)))
        {
           System.out.println("Error! Entrance time must precede exit time.");
           legalOperation = false;
        }
        
        if ( legalOperation == true)
        {// calculation of the time difference
            //check the enter time, if its after 18:00 then default payment
            if (firstHours > DEAFULTPAYMENTBOUND)
            {
                System.out.println("Total charge is " + CONST + " NIS.");
            }
            else
            {
            //minutes calculation
            if (secondMinutes < firstMinutes)
            {
                secondMinutes+=MINUTES_IN_HOUR;
                if (secondHours>0)
                   secondHours--;
                else
                   secondHours = HOURS_IN_DAY - 1;
            }
            int minutes = secondMinutes - firstMinutes;            
           
            //hours calculation
            if (secondHours < firstHours)             
                 secondHours+=HOURS_IN_DAY;                   
            int hours = secondHours - firstHours;
             
            //calculate the payment you need.
            if ((hours - 1) >= 0) //if its after 1 hour.
            {
                hours = hours - 1;
                if ((hours - 1) >= 0) //if its after 2 hours.
                {
                    payment = payment + 10;
                    hours = hours - 1;
                    payment = payment + hours * HOURSDIVISION * AFTERTHREEHOURSPAY; //calculate for evry hour 12 NIS.
                    
                    //check how much 15 minutes you got.
                    
                    if (minutes > 15)
                    {
                        minutes = minutes - 15;
                        payment = payment + AFTERTHREEHOURSPAY;
                        if (minutes > 15)
                        {
                            minutes = minutes - 15;
                            payment = payment + AFTERTHREEHOURSPAY;
                            if (minutes > 15)
                            {
                                minutes = minutes - 15;
                                payment = payment + AFTERTHREEHOURSPAY;
                                if (minutes != 0)
                                {
                                    payment = payment + AFTERTHREEHOURSPAY;
                                }
                            }
                        }
                        
                        /*
                         * if its a double of 15 min, we finish calculating.
                         * and if its not a double of 15 min, you pay more. 
                         */
                        
                        
                        else
                        {
                            if (minutes != 0)
                            {
                            payment = payment + AFTERTHREEHOURSPAY;
                            }
                        }
                    }
                    else
                    {
                        if (minutes != 0) 
                        {
                            payment = payment + AFTERTHREEHOURSPAY;
                        }
                    }
                }
                else
                {
                    // if its between 1 hour and 2 hours.
                    payment = TWOHOURSPAY;
                }
                
                //prints the paymeny you need.
                System.out.println("Total charge is " + payment + " NIS.");
            }
            else
            {
                //if its low then 1 hour no payment needed.
                System.out.println("No charge.");
            }
   
        }
        }
    }
}
