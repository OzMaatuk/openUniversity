
/**
 * Write a description of class Tester here.
 * 
 * @author Assaf Weiner 
 * @version (a version number or a date)
 */
public class LightBulbTester
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        // Create two light bulb objects
        LightBulb l1 = new LightBulb(127,0,127);
        LightBulb l2 = new LightBulb(new RGBColor(127,0,127));
        LightBulb l3 = new LightBulb(l2);
        
        // Print (test the get method)
        System.out.println("Welcome to Light Bulb tester");
        System.out.println("1) color of light object is " + l1.getColor());
        
        // Test the set method
        l1.setColor(new RGBColor(50,40,30));
        System.out.println("2) The new color of light is :" + l1);
        
        // Test isSwitchedOn
        System.out.println("3) Light object is switched on? " + l1.isSwitchedOn());
        
        // Now switch on
        l1.switchLight();
        System.out.println("4) Light after switchLight():" + l1);
        System.out.println("Good luck!");
    }
}