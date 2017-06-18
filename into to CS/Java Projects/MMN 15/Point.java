
/**
 * The class Point presenting a point (a place) on the plain by his cartesian values.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 15 Q1)
 */
public class Point
{
    // instance variables.
    private double _x = 0; // presenting the transverse place on the plain.
    private double _y = 0; // presenting the horizontal place on the plain.

    /**
     * Constructors for objects of class Point.
     */
    
    /**
     * empty constartur:
     * public Point() - sets zero values for transverse place (x) and horizontal place (y).
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public Point()
    {
        this._x = 0;
        this._y = 0;
    }
    
    /**
     * first constartur:
     * public Point(double x, double y) - gets values for transverse place (x) and horizontal place (y) and set a new Point with those values.
     * 
     * @param   double x - the transverse value of the point.
     * @param   double y - the horizontal value of the point.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public Point(double x, double y)
    {
        this._x = x;
        this._y = y;
    }
    
    /**
     * secound constartur:
     * public Point(Point other) - gets an other Point object and creat a new onr with the same transverse (x), and horizontal (y) value.
     * 
     * @param   Point other - the object to copy from.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public Point(Point other)
    {
        this.setX(other.getX());
        this.setY(other.getY());
    }

    /**
     * public double getX() - returns the transverse value (_x) of the point.
     * 
     * @return  the transverse value (_x) of the point.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public double getX()
    {
        return (this._x);
    }
    
    /**
     * public double getY() - returns the horizontal value (_y) of the point.
     * 
     * @return  the horizontal value (_y) of the point.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public double getY()
    {
        return (this._y);
    }
    
    /**
     * public void setX(double num) - get a new value (num) and set it as the transverse value (_x).
     * 
     * @param   num - the value to be set as the transverse value (_x).
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public void setX(double num)
    {
        this._x = num;
    }
    
    /**
     * public void setY(double num) - get a new value (num) and set it as the horizontal value (_y).
     * 
     * @param   num - the value to be set as the horizontal value (_y).
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public void setY(double num)
    {
        this._y = num;
    }
    
    /**
     * public String toString() - returns the Point value by his math expression.
     * 
     * @return  the Point value by his math expression.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public String toString()
    {
        return ("(" + this._x + "," + this._y + ")");
    }
    
     /**
     * public boolean equals(Point other) - get a other Point and check if the transverse (x), and horizontal (y) values are same as this Point.
     * 
     * @param   other - the other Point with the values to compare.
     * @return  ture if the values are the same,
     *          false if they are differents.
     *          
     * @Time:   O(1);
     * @Place:  O(1);
     */
    
    public boolean equals(Point other)
    {
        if ((other.getX() == this.getX()) && (other.getY() == this.getY()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * public boolean isAbove(Point other) - gets an other point and check if its under this point.
     * 
     * @param   other - the point we check if it under this point.
     * @return  true if the other point is under this point,
     *          false if its not.
     *          
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public boolean isAbove(Point other)
    {
        if (this.getY() > other.getY())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * public boolean isUnder(Point other) - gets an other point and check if its above this point.
     * 
     * @param   other - the point we check if it above this point.
     * @return  true if the other point is above this point,
     *          false if its not.
     *          
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public boolean isUnder(Point other)
    {
        if (this.isAbove(other))
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * public boolean isLeft(Point other) - gets an other point and check if it left to this point.
     * 
     * @param   other - the point we check if it left to this point.
     * @return  true if the other point is left to this point,
     *          false if its not.
     *          
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public boolean isLeft(Point other)
    {
        if (this.getX() < other.getX())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * public boolean isRight(Point other) - gets an other point and check if it right to this point.
     * 
     * @param   other - the point we check if it right to this point.
     * @return  true if the other point is right to this point,
     *          false if its not.
     *          
     * @Time:   O(1);
     * @Place:  O(1);         
     */
    public boolean isRight(Point other)
    {
        if (this.isLeft(other))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /**
     * public double distance(Point p) - get an other (p) Point calculate the distance between it and this Point
     * 
     * @param   p - the other point we calculate the distance from.
     * @return  the distance betweenthe new point (p) and this Point.
     * 
     * @Time:   O(Math.sqrt()) = O(1)?;
     * @Place:  O(1);
     */
    public double distance(Point p)
    {
        //System.out.println(Math.sqrt(((this._x - p.getX())*(this._x - p.getX())) + ((this._y - p.getY())*(this._y - p.getY()))));
        return (Math.sqrt(((this._x - p.getX())*(this._x - p.getX())) + ((this._y - p.getY())*(this._y - p.getY()))));
    }
    
    /**
     * public void move(double dx, double dy) - change the transverse (x), and horizontal (y) values of the Point by the values it gets (dx and dy)
     * 
     * @param dx - the value to add on the transverse line (_x value),
     * @param dy - the value to add on the horizontal line (_y value).
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public void move(double dx, double dy)
    {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }
}
