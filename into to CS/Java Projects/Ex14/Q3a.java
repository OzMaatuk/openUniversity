public class Q3a
{
    public int n = 29;
    public Q3a()
    {
        System.out.println("spiderman = " + spiderman(n));
        System.out.println("spidermanPhoneBooth20 = " + spidermanPhoneBooth20(n));
    }
    
    public static int spiderman(int n)
    {
        return (spiderman(0, n)); //you have to start from the first floor... calling the spiderman method to count from first floor to the n floor
    }
    
    private static int spiderman(int i,int n)
    {
        if (i == n && n != 0) //we reach the last floor
        {
            return (1); //return one to count this way of reaching the last floor, its exectlly adding one recursivly. 
        }
        else if (i < n) //we are not there yet
        {
            return (spiderman(i+1, n) + spiderman(i+2, n)); //continue climbing but send the two options for a check, one is climbing one floor, the other climbing two floors
        }
        else
        {
            return (0); //hey?! hey?! its too high, there is no floor there! so we are getting nowhere and adding zero to the count becouse its no a way to the to the last floor
        }
    }
    
    final static int ELEVATORFLOOR = 20;
    public static int spidermanPhoneBooth20(int n)
    {
       if (n > ELEVATORFLOOR) //if the target floor is above floor ELEVATORFLOOR, there is an option to use the elevtor, so we add it the the counting
       {
           return (spiderman(ELEVATORFLOOR) + spiderman(0, 19) * spiderman(21, n)); // calculate the ways to get to the ELEVATORFLOOR floor, and from there to the last floor, add to this the ways to get to the 19 floor double the ways to get from floor 21 to the last. beacouse there is noother way, if you skip the ELEVATORFLOOR floor its only by this way.
       }
       else if (n < ELEVATORFLOOR) //if we are not reaching the ELEVATORFLOOR floor, we can use the spiderman method
       {
           return (spiderman(n));
       }
       else //there is no other choice, you need to get to the ELEVATORFLOOR floor by using spiderman method
       {
           return (spiderman(ELEVATORFLOOR));
       }
    }
}
