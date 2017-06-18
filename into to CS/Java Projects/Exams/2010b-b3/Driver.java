/*
 * (6)
 * a.)  class bus is iilegal, becouse there is no move method.
 *      -- fixed --;
 *      you cant creat a new vehicle becouse its abstract!
 *      
 * prints:  Truck.sketch()
 *          Sedan.sketch()
 *          Vehicle.sketch()
 *          Bus.sketch()
 *          
 *          Truck.move()
 *          Sedan.move()
 *          Car.move()
 * 
 */
public class Driver
{
    public static void main (String [] args)
    {
        Vehicle [] s = new Vehicle[4];
        s[0] = new Truck();
        //s[1] = new Vehicle();
        s[1] = new Sedan();
        s[2] = new Car();
        s[3] = new Bus();
        for (int i = 0; i < s.length; i++)
            s[i].sketch();
        System.out.println();
        for (int i = 0; i < s.length; i++)
            s[i].move();
    }
}