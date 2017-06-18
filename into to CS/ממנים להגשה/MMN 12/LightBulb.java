
/**
 * Write a description of class LightBulb here.
 * the class present a colorful bulb, the color based on RGBColor class and there is a on-off switch.
 * there are methods thats sets the gets the bulb parameters.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 12 Q2 09/11/2014)
 */
public class LightBulb extends RGBColor
{
    // instance variables
    private RGBColor _color; // present the bulb color based on the RGBColor class.
    private boolean _witchedOn = false; // present the on-off bulb switch.

    /**
     * Constructor for objects of class LightBulb:
     */
    
    /**
    * empy constracture that does nothing.
    */
    public LightBulb()
    {
        
    }
    
    /**
    * Construct a new LightBulb with the given color component values.
    * The switch is initialized to false.
    * If one (or more) of the given values is illegal (not in the range 0-255),
    * it constructs a black RGBColor object. 
    * @param red: The red color component value.
    * @param green: The green color component value.
    * @param blue: The blue color component value.
    */
    public LightBulb(int red, int green, int blue)
    {
        // the constracture gets three colors and sets them to the bulb color, also it sets the switch off.
        this._witchedOn = false;
        this._color = new RGBColor(red,green,blue);
    }
   
    /**
    * Construct a new LightBulb with the RGBColor values that been given.
    * The switch is initialized to false. Assumes the given color is not null.  
    * @param other: The RGBColor to copy.
    */
    public LightBulb(RGBColor color)
    {
        // the constracture gets an RGBColor object (its a color...) the copy it to the bulb color, also it sets the switch off.
        this._color = new RGBColor(color);
        this._witchedOn = false;
    }
    
    /**
    * Construct a new LightBulb which is a copy of the given bulb. Assumes the given bulb is not null. 
    * @param other: The LightBulb to copy.
    */
    public LightBulb(LightBulb other)
    {
        // the constarcture gets other bulb the copy it.
        this._color = new RGBColor(other.getColor().getRed(),other.getColor().getGreen(),other.getColor().getBlue());
        this._witchedOn = other.isSwitchedOn();
    }
    
    /**
    * Returns the color component of this bulb.  
    * @return The color component of this bulb.
    */
    public RGBColor getColor()
    {
        // returns the color of the bulb as RGBColor object.
        return (new RGBColor(this._color));
    }
    
    /**
    * Sets the color component of this LightBulb.   
    * @param color: The color component to set.
    */
    public void setColor (RGBColor color)
    {
        // gets RGBColor object and sets the bulb color to his parameters.
        this._color.setRed(color.getRed());
        this._color.setGreen(color.getGreen());
        this._color.setBlue(color.getBlue());
    }
    
    /**
    * Returns true if this bulb is switched on. Otherwise, returns false.   
    * @return whether the bulb is switched on.
    */
    public boolean isSwitchedOn()
    {
        // returns the switch status.
        return (this._witchedOn);
    }
    
    /**
    * Changes the switch situation from true to false and vice versa.
    */ 
    public void switchLight()
    {
        // switch the switch status :P.
        this._witchedOn = (!(_witchedOn));
    }
    
    /**
    * Returns a string representation of this LightBulb. i.e. (255,127,0) On   
    * @return string representation of this LightBulb.
    */ 
    public String toString()
    {
        // returns a string thet present the bulb status in "(red,green,blue) on/off-switch".
        if (this.isSwitchedOn())
        {
            return (this._color.toString() + " On");
        }
        else
        {
            return (this._color.toString() + " Off");
        }
    }
}
