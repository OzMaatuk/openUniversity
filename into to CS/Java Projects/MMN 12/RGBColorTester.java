
/**
 * Write a description of class Tester here.
 * 
 * @author Assaf Weiner
 * @version (a version number or a date)
 */
public class RGBColorTester
{
    /**
     * 
     */
    public static void main(String[] args)
    {
        // Create two color objects
        RGBColor color1 = new RGBColor(0,100,77);
        RGBColor color2 = new RGBColor(color1);
        
        // Print (test the get method)
        System.out.println("Welcome to RGB Color tester");
        System.out.println("1) R:" + color1.getRed() + " G:" + color1.getGreen() + " B:" + color1.getBlue());
        
        // Test the set method
        color1.setRed(100);
        color1.setGreen(100);
        color1.setBlue(100);
        System.out.println("2) The new color1 is:" + color1);
        
        // Test the mix
        color2.mix(color1);
        System.out.println("3) color1 mixed with color2:" + color2);
        
        // Test the invert
        color1.invert();
        System.out.println("4) color1 inverted:" + color1);
        
        // Test equal
        System.out.println("5) " + color1 + " equals " + color2 + " = " + color1.equals(color2));
        
        // Test convert to grayscale
        System.out.println("6) color1 in grayscale: " + color1.convertToGrayscale());
        System.out.println("Good luck!");
    }
}
