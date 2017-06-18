/**
 * Write a description of class RGBColor here.
 * the class present a pixel which includes three type of colors: red, green, and blue.
 * with the class methods you can performe sets activities, gets,
 * mixing with other color,
 * invert the color,
 * convert to a gray scale,
 * and check if its equals to other color.
 * 
 * color describes with three integers, and legale only if its between 0 and 255.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 12 Q1 - 09/11/2014)
 */
public class RGBColor
{
    //fix variables:
    /**
    * @param MINCOLOR the minimun value of the color.
    * @param MAXCOLOR the maximum value of the color.
    * @param GRAYFROMRED the value you need to double red for a grayscale value.
    * @param GRAYFROMGREEN the value you need to double green for a grayscale value.
    * @param GRAYFROMBLUE the value you need to double blue for a grayscale value.
    */
    final int MINCOLOR = 0;
    final int MAXCOLOR = 255;
    final double GRAYFROMRED = 0.3;
    final double GRAYFROMGREEN = 0.59;
    final double GRAYFROMBLUE = 0.11;
    
    // instance variables:
    private int _red = 0; // _red presents the red color in integer.
    private int _green = 0; // _green presents the green color in integer.
    private int _blue = 0; // _blue presents the blue color in integer.

    /**
     * Constructor for objects of class RGBColor.
     * creates a new "black" RGBColor object:
     * @param _red is the value of the red color in the object.
     * @param _green is the value of the green color in the object.
     * @param _blue is the value of the blue color in the object.
     */
    public RGBColor()
    {
        // empty constractur that sets all three colors to 0.
       this._red = 0;
       this._green = 0;
       this._blue = 0;
    }

    /**
    * Sets Constructor:
    * @param red to be copied and check leagel value (0-255).
    * @param green to be copied and check leagel value (0-255).
    * @param blue to be copied and check leagel value (0-255).
    */
    public RGBColor(int red, int green, int blue)
    {
        //constractur that gets three colors and sets them to the contemporary RGBColor only if they legal.
        if ((red >= MINCOLOR && red <= MAXCOLOR) && (green >= MINCOLOR && green <= MAXCOLOR) && (blue >= MINCOLOR && blue <= MAXCOLOR))
        {
            this._red = red;
            this._green = green;
            this._blue = blue;
        }
        else
        {
            this._red = 0;
            this._green = 0;
            this._blue = 0; 
        }
    }
    
    /**
    * Copy Constructor
    * @param other (RGBColor object) to be copied.
    */
    public RGBColor(RGBColor other)
    {
        //constracture that gets RGBColor object and copy his colors to the the contemporary RGBColor.
        this._red = other.getRed();
        this._green = other.getGreen();
        this._blue = other.getBlue();
    }

    /** gets the red color value. */
    public int getRed()
    {
        return this._red;
    }
    
    /** gets the green color value. */
    public int getGreen()
    {
        return this._green;
    }
    
    /** gets the blue color value. */
    public int getBlue()
    {
        return this._blue;
    }
    
    /** Sets the red color value
    * @param num the value to be set
    */
    public void setRed (int num)
    {
        if (num >= MINCOLOR && num <= MAXCOLOR)
        {
            this._red = num;
        }
    }

    /** Sets the green color value
    * @param num the value to be set
    */
    public void setGreen (int num)
    {
        if (num >= MINCOLOR && num <= MAXCOLOR)
        {
            this._green = num;
        }
    }
    
    /** Sets the blue color value
    * @param num the value to be set
    */
    public void setBlue(int num)
    {
        if (num >= MINCOLOR && num <= MAXCOLOR)
        {
            this._blue = num;
        }
    }
    
    /**
    * @return String that represents the colors
    * in the following format: (red,green,blue).
    */
    public String toString()
    {
        return ("(" + this._red + "," + this._green + "," + this._blue + ")");
    }

    /**
    * check if the contemporary RGBColor is the same as the other that it gets.
    * @param other the given RGBColor object.
    * @retun true if they equals by them red-green-blue values.
    */
    public boolean equals (RGBColor other)
    {
        if ((this._red == other.getRed()) && (this._green == other.getGreen()) && (this._blue == other.getBlue()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
    * mix the RGBColor with an other one that it gets,
    * it making an avarage of the contemporary RGBColor and the new one thats it gets and sets it.
    * @param other the given RGBColor object.
    */
    public void mix (RGBColor other)
    {
        //mix the RGBColor with an other one that it gets, it making an avarage of the contemporary RGBColor and the new one thats it gets and sets it.
        this._red = ((this._red + other.getRed()) / 2);
        this._green = ((this._green + other.getGreen()) / 2);
        this._blue = ((this._blue + other.getBlue()) / 2);
    }
    
    /**
    * making a gray scale of the RGBColor, its returning 30%red, 59%green, and 11%blue.
    * @retun a double value of (30%red, 59%green, 11%blue).
    */
    public double convertToGrayscale ()
    {
        // returns the gray scale of the RGBColor, its returning 30%red, 59%green, and 11%blue.
        return ((this._red * GRAYFROMRED) + (this._green * GRAYFROMGREEN) + (this._blue * GRAYFROMBLUE));
    }
   
    /**
    * sets the colors to the inversed values,
    * taking the MAXCOLOR and Subtracte the colors values.
    */
    public void invert()
    {
        // sets the colors to the inversed values
        this._red = (255 - this._red);
        this._green = (255 - this._green);
        this._blue = (255 - this._blue);
    }
}
