
/**
 * Write a description of class Disco here.
 * the class present a disco line of 4 lightbulbs that based on lightbulb class
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 12 Q3 09/11/2014)
 */
public class Disco extends LightBulb
{
    // instance variables
    private LightBulb _bulb1; // present the first lightbulb
    private LightBulb _bulb2; // present the second lightbulb
    private LightBulb _bulb3; // present the third lightbulb
    private LightBulb _bulb4; // present the forth lightbulb

    /**
     * empty Constructor for objects of class Disco
     */
    public Disco()
    {
        //empty constracture that does nothing
    }
    
    /**
    * Constructor of the Disco which is compound of 4 light bulbs.
    * @param b1: The first light bulb.
    * @param b2: The second light bulb.
    * @param b3: The third  light bulb.
    * @param b4: The forth  light bulb.
    */
    public Disco(LightBulb b1, LightBulb b2, LightBulb b3, LightBulb b4)
    {
        // the constarcture get 4 lightbulbs and set them in the disco line
        this._bulb1 = new LightBulb(b1);
        this._bulb2 = new LightBulb(b2);
        this._bulb3 = new LightBulb(b3);
        this._bulb4 = new LightBulb(b4);
    }
    
    /**
    * Returns the first LightBulb 
    * @return Returns the first LightBulb
    */
    public LightBulb getFirstBulb()
    {
        // Returns the first LightBulb
        return (new LightBulb(this._bulb1));
    }
    
    /**
    * Returns the second LightBulb 
    * @return Returns the second LightBulb
    */
    public LightBulb getSecondBulb()
    {
        // Returns the second LightBulb 
        return (new LightBulb(this._bulb2));
    }
    
    /**
    * Returns the third LightBulb 
    * @return Returns the third LightBulb
    */
    public LightBulb getThirdBulb()
    {
        // Returns the third LightBulb
        return (new LightBulb(this._bulb3));
    }
    
    /**
    * Returns the fourth LightBulb 
    * @return Returns the fourth LightBulb
    */
    public LightBulb getFourthBulb()
    {
        // Returns the fourth LightBulb 
        return (new LightBulb(this._bulb4));
    }
    
    /**
    * Switches the state of the light bulb with the given index. 
    * @param num: The index of the light bulb whose state will change (will be switched On <=> Off)
    */
    public void switchBulb(int num)
    {
        // Switches the status of the light bulb that it gets.
        if (num == 1)
        {
            this._bulb1.switchLight();
        }
        else if (num == 2)
        {
            this._bulb2.switchLight();
        }
        else if (num == 3)
        {
            this._bulb3.switchLight();
        }
        else if (num == 4)
        {
            this._bulb4.switchLight();
        }
    }
    
    /**
    * Turns all the light bulbs on.
    */ 
    public void turnAllOn()
    {
        // Turns all the light bulbs on 
        if (!this._bulb1.isSwitchedOn())
        {
            this._bulb1.switchLight();
        }
        if (!this._bulb2.isSwitchedOn())
        {
            this._bulb2.switchLight();
        }
        if (!this._bulb3.isSwitchedOn())
        {
            this._bulb3.switchLight();
        }
        if (!this._bulb4.isSwitchedOn())
        {
            this._bulb4.switchLight();
        }
    }
    
    /**
    * Turns all the light bulbs off. 
    */
    public void turnAllOff()
    {
        // Turns all the light bulbs off 
        if (this._bulb1.isSwitchedOn())
        {
            this._bulb1.switchLight();
        }
        if (this._bulb2.isSwitchedOn())
        {
            this._bulb2.switchLight();
        }
        if (this._bulb3.isSwitchedOn())
        {
            this._bulb3.switchLight();
        }
        if (this._bulb4.isSwitchedOn())
        {
            this._bulb4.switchLight();
        }
    }
    
    /**
    * Checks if all the light bulbs are on. 
    * @return Returns true if all the light bulbs are on, otherwise false.
    */
    public boolean areAllOn()
    {
        // Checks if all the light bulbs are on.
        if ((this._bulb1.isSwitchedOn()) && (this._bulb2.isSwitchedOn()) && (this._bulb3.isSwitchedOn()) && (this._bulb4.isSwitchedOn()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
    * Checks if all the light bulbs are off. 
    * @return Returns true if all the light bulbs are off, otherwise false.
    */
    public boolean areAllOff()
    {
        // Checks if all the light bulbs are off. 
        if ((!this._bulb1.isSwitchedOn()) && (!this._bulb2.isSwitchedOn()) && (!this._bulb3.isSwitchedOn()) && (!this._bulb4.isSwitchedOn()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
    * Checks if all the light bulbs have the same color.
    * @return Returns true if all the light bulbs have the same color, otherwise false.
    */
    public boolean allSameColor()
    {
        // Checks if all the light bulbs have the same color. 
        boolean _boolEzer = false;
        if (this._bulb1.getColor().equals(this._bulb2.getColor()))
        {
            if (this._bulb1.getColor().equals(this._bulb3.getColor()))
            {
                if (this._bulb1.getColor().equals(this._bulb4.getColor()))
                {
                    _boolEzer = true;
                }
            }
        }
        return (_boolEzer);
    }
}
