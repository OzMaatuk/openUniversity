
/**
 * Write a description of class Tester here.
 * 
 * @author Assaf Weiner
 * @version (a version number or a date)
 */
public class RGBColorTester2{
    /**
     * 
     */
    public static void main(String[] args)
    {
        // Create two color objects
        RGBColor color1 = new RGBColor(127,0,127);
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
        
        // creating another object
        RGBColor color3 = new RGBColor(0,255,9);
        System.out.println("Color 3 is: " + color3);
        // Another one, using copy constructor
        RGBColor color4 = new RGBColor(color3);
        System.out.println("Color 3 is: " + color3);
        System.out.println("Color 4 is: " + color4);
        // Set the red color for color4 - ALIASING CHECK!
        color4.setRed(120);
        System.out.println("Color3 after color4 update: " +color3);
        System.out.println("Color4 after it's update: " + color4);
        System.out.println("NOTICE! They must be different, otherwise, you got alliasing!");
        // Checking with invalid values.
        RGBColor color5 = new RGBColor(300,10,10);
        System.out.println("Color5 is: " + color5);
        
        color5.mix(color4);
        System.out.println("Color5 after mix is: " + color5);
        
        color5.invert();
        System.out.println("Inverted color 5: " + color5);
        
        System.out.println("Summarize the 2 last prints, if you got 255, you are right!");
        
        RGBColor color6 = new RGBColor (255,255,255);
        System.out.println("Created color6: "+ color6);
        // Boundary tests for the setters.
        color6.setBlue(300);
        color6.setBlue(-3);
        color6.setGreen(500);
        color6.setGreen(-90);
        color6.setRed(256);
        color6.setRed(-1);
        System.out.println("Color6 after try to set illegal colors: " + color6);
        // Set using get.
        color6.setRed(color2.getGreen());
        color6.setBlue(color5.getBlue());
        color6.setGreen(color5.getRed());
        System.out.println("Updated color6 " + color6);
        System.out.println("Good luck!");
    }
}
