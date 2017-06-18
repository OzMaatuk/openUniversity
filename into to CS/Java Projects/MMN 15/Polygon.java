
/**
 * class Polygon presenting a polygon that all internal angles smaller than 180 degrees.
 * the polygon lines connecting Any two points of the polygon moves only within the polygon.
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 15 Q3)
 */
public class Polygon extends PointNode
{
    // instance variables
    private PointNode _head = null; // the "head" of the polygone - the first point.

    /**
     * Constructor for objects of class Polygon
     */
    /**
     * empty constracture:
     * public Polygon() - sets the head to null.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public Polygon()
    {
        this._head = null;
    }
    
    /**
     * public boolean addVertex(Point p, int pos) - gets Point (p) and a integer Position (pos) to add the Point to the Polygon at that position.
     * 
     * @param   p - the point to add.
     * @param   pos - the position to add at.
     * @return  true if the process succeed,
     *          false if not.
     * 
     * @Time:   O(N);
     * @Place:  O(1);
     */
    public boolean addVertex(Point p, int pos)
    {
        if (pos < 1)
        {
            return false;
        }
        if ((_head == null) && (pos == 1))
        {
            _head = new PointNode(p);
            return true;
        }
        else if (_head == null)
        {
            return false;
        }
        else if (this.findVertex(p) != (-1))
        {
            return false;
        }
        PointNode newPoint = new PointNode(p);
        PointNode pointer = _head;
        PointNode nodeBefore = _head;
        if (pos == 1)
        {
            newPoint.setNext(_head);
            _head = newPoint;
            return true;
        }
        while ((pointer !=null) && (pos > 1))
        {
            nodeBefore = pointer;
            pointer = pointer.getNext();
            pos--;
        }
        if ((pos == 1) && (pointer != null))
        {
            newPoint.setNext(pointer);
            nodeBefore.setNext(newPoint);
            return true;
        }
        else if ((pos == 1) && (pointer == null))
        {
            nodeBefore.setNext(newPoint);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * public Point highestVertex() - returns the highest Point at the Polygon.
     * 
     * @return  the highest Point at the Polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N); - getPoint creats a new every loop...
     */
    public Point highestVertex()
    {
        if (this._head == null)
        {
            return null;
        }
        else
        {
            PointNode pointer = _head;
            PointNode highest = _head;
            while (pointer != null)
            {
                if ((pointer.getPoint().isAbove(highest.getPoint())))
                {
                    highest = pointer;
                }
                pointer = pointer.getNext();
            }
            return (new Point(highest.getPoint()));
        }
    }
    
    /**
     * private Point lowestVertex() - returns the lowest Point at the Polygon.
     * 
     * @return  the lowest Point at the Polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N); - getPoint creats a new every loop...
     */
    private Point lowestVertex()
    {
        if (this._head == null)
        {
            return null;
        }
        else
        {
            PointNode pointer = _head;
            PointNode lowest = _head;
            while (pointer != null)
            {
                if ((pointer.getPoint().isUnder(lowest.getPoint())))
                {
                    lowest = pointer;
                }
                pointer = pointer.getNext();
            }
            return (new Point(lowest.getPoint()));
        }
    }
    
        /**
     * private Point leftestVertex() - returns the leftest Point at the Polygon.
     * 
     * @return  the leftest Point at the Polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N); - getPoint creats a new every loop...
     */
    private Point leftestVertex()
    {
        if (this._head == null)
        {
            return null;
        }
        else
        {
            PointNode pointer = _head;
            PointNode leftest = _head;
            while (pointer != null)
            {
                if ((pointer.getPoint().isLeft(leftest.getPoint())))
                {
                    leftest = pointer;
                }
                pointer = pointer.getNext();
            }
            return (new Point(leftest.getPoint()));
        }
    }
    
        /**
     * private Point rightestVertex() - returns the rightest Point at the Polygon.
     * 
     * @return  the rightest Point at the Polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N); - getPoint creats a new every loop...
     */
    private Point rightestVertex()
    {
        if (this._head == null)
        {
            return null;
        }
        else
        {
            PointNode pointer = _head;
            PointNode rightest = _head;
            while (pointer != null)
            {
                if ((pointer.getPoint().isRight(rightest.getPoint())))
                {
                    rightest = pointer;
                }
                pointer = pointer.getNext();
            }
            return (new Point(rightest.getPoint()));
        }
    }
    /**
     * public String toString() - returns the polygon vertices by a string.
     * 
     * @return  the polygon vertices by a string.
     * 
     * @Time:   O(N); - or, depedents on the time that the string methods use, if its O(N) the this method is O(N^2).
     * @Place:  O(1); - or, depedents on the place that the string methods use, if its O(N) the this method is O(N)
     */
    public String toString()
    {
        PointNode pointer = _head;
        String outPut = "(";
        int counter = 0;
        while (pointer != null)
        {
            if (counter != 0)
            {
                outPut = outPut + ",";
            }
            outPut = outPut + pointer.getPoint().toString();
            counter++;
            pointer = pointer.getNext();
        }
        outPut = "The polygon has " + counter + " vertices:\n" + outPut + ")";
        return outPut;
    }

    /**
     * public double calcPerimeter() - calculate the perimeter of the Polygon.
     * 
     * @return  the perimeter of the Polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N);
     */
    public double calcPerimeter()
    {
        double distace = 0;
        PointNode pointer = null;
        if (_head != null)
        {
            pointer = _head;
        }
        else
        {
            return 0;
        }
        Point lastPoint = pointer.getPoint();
        pointer = pointer.getNext();
        while (pointer != null)
        {
            distace = distace + (lastPoint.distance(pointer.getPoint()));
            lastPoint = pointer.getPoint();
            pointer = pointer.getNext();
        }
        pointer = _head;
        distace = distace + (lastPoint.distance(pointer.getPoint()));
        return (distace);
    }
    
    /**
     * public double calcArea() - calculate the area of the Polygon.
     * 
     * @return  the area of the Polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N); - becouse of the getPoint at the heron method;
     */
    public double calcArea()
    {
        PointNode pointer = _head;
        PointNode pointer1 = _head;
        PointNode pointer2 = _head;
        pointer1 = pointer1.getNext();
        if (pointer1 == null)
        {
            return 0;
        }
        pointer2 = pointer2.getNext();
        pointer2 = pointer2.getNext();
        if (pointer2 == null)
        {
            return 0;
        }
        double area = 0;
        while (pointer2 != null)
        {
            area = area + heron(pointer, pointer1, pointer2);
            pointer2 = pointer2.getNext();
            pointer1 = pointer1.getNext();
        }
        return (area);
    }
    
    /**
     * private double heron(PointNode Point1, PointNode Point2, PointNode Point3) - calculate the area of the tryangle thats the three points make by heron.
     * 
     * @return  the area of the tryangle.
     * 
     * @Time:   O(1); - its acctually the O(Math.sqrt());
     * @Place:  O(1); - its acctually the O(Math.sqrt());
     */
    private double heron(PointNode Point1, PointNode Point2, PointNode Point3)
    {
        double s = (Point1.getPoint().distance(Point2.getPoint()) + Point2.getPoint().distance(Point3.getPoint()) + Point3.getPoint().distance(Point1.getPoint())) / 2;
        return (Math.sqrt(s*(s - Point1.getPoint().distance(Point2.getPoint())) * (s - Point2.getPoint().distance(Point3.getPoint())) * (s - Point3.getPoint().distance(Point1.getPoint()))));
    }
    
    /**
     * public boolean isBigger(Polygon other) - gets an other Polygon (other) and check if it got smaller area then this Polygon.
     * 
     * @param   other - the other Polygone to compare to.
     * @return  true if the other Polygone has a smaller area then this Polygon.
     *          false if not.
     *          
     * @Time:   O(N);
     * @Place:  O(N);
     */
    public boolean isBigger(Polygon other)
    {
        if (this.calcArea() > other.calcArea())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * public int findVertex(Point p) - gets a point and search it on the Polygon
     * 
     * @param   p - the point we need to search for.
     * @return  the place of the point in the Polygine.
     * 
     * @Time:   O(N);
     * @Place:  O(N); - becouse of the getPoint in the while;
     */
    public int findVertex(Point p)
    {
        PointNode pointer = _head;
        int pos = 1;
        boolean found = false;
        while ((pointer != null) && (!found))
        {
            found = p.equals(pointer.getPoint());
            pointer = pointer.getNext();
            pos++;
        }
        if (found)
        {
            return (pos - 1);
        }
        else
        {
            return (-1);
        }
    }
    
    /**
     * public Point getNextVertex(Point p) - gets a Point, search it on the Polygon, returns the next Point at the Polygon.
     * 
     * @param   p - the Point we need to search.
     * @return  the Point after p.
     * 
     * @Time:   O(N);
     * @Place:  O(N);
     */
    public Point getNextVertex(Point p)
    {
        PointNode pointer = _head;
        
        int pos = this.findVertex(p);
        
        for (int i = 0; i<pos; i++)
        {
            pointer = pointer.getNext();
        }
        
        if (pointer != null)
        {
            return (new Point(pointer.getPoint()));
        }
        else
        {
            return (new Point(_head.getPoint()));
        }
        /*
        while (pointer != null)
        {
            if (pointer.getPoint().equals(p))
            {
                if (pointer.getNext() == null)
                {
                    return (new PointNode(_head));
                }
                else
                {
                    return (new PointNode(pointer));
                }
            }
        }
        return null;
        */
    }
    
    /**
     * public Polygon getBoundingBox() - returns the corresponding rectangle blocks delegates The polygon.
     * 
     * @return  the corresponding rectangle blocks delegates The polygon.
     * 
     * @Time:   O(N);
     * @Place:  O(N);
     */
    public Polygon getBoundingBox()
    {
        int counter = 0;
        Point cornerRightUp = new Point(this.highestVertex());
        Point cornerRightDown = new Point(this.lowestVertex());
        Point cornerLeftDown = new Point(this.leftestVertex());
        Point cornerLeftUp = new Point(this.rightestVertex());
        
        cornerRightUp.setX(cornerLeftUp.getX());      //is alreay have the highest value, now set the rightest from cornerLeftUp;
        cornerRightDown.setX(cornerLeftUp.getX());    //is alreay have the lowest value, now set the rightest from cornerLeftUp;
        cornerLeftDown.setY(cornerRightDown.getY());  //is already have the leftest value, new set the lowest from cornerRightDown;
        cornerLeftUp.setY(cornerRightUp.getY());      //set his y to the highest from cornerRightUp;
        cornerLeftUp.setX(cornerLeftDown.getX());      //set his x to the leftest from cornerLeftDown;
        
        /*
        while (pointer != null)                                             // The highest
        {
            if (pointer.getPoint().isAbove(cornerRightUp.getPoint()))
            {
                cornerRightUp.getPoint().setY(pointer.getPoint().getY()); 
            }
            counter++;
            pointer = pointer.getNext();
        }
        if (counter < 3)
        {
            return null;
        }
        pointer = _head;
        while (pointer != null)                                             // The lowest
        {
            if (pointer.getPoint().isUnder(cornerRightDown.getPoint()))
            {
                cornerRightDown.getPoint().setY(pointer.getPoint().getY());
            }
            pointer = pointer.getNext();
        }
        pointer = _head;
        while (pointer != null)                                             // The leftest
        {
            if (pointer.getPoint().isLeft(cornerLeftUp.getPoint()))
            {
                cornerLeftUp.getPoint().setX(pointer.getPoint().getX());
            }
            pointer = pointer.getNext();
        }
        pointer = _head;
        while (pointer != null)                                             // The rightest
        {
            if (pointer.getPoint().isRight(cornerLeftDown.getPoint()))
            {
                cornerLeftDown.getPoint().setX(pointer.getPoint().getX());
            }
            pointer = pointer.getNext();
        }
        
        pointer = null;
        
        cornerRightUp.getPoint().setX(cornerLeftDown.getPoint().getX());
        cornerRightDown.getPoint().setX(cornerLeftDown.getPoint().getX());
        cornerLeftUp.getPoint().setY(cornerRightUp.getPoint().getY());
        cornerLeftDown.getPoint().setY(cornerRightDown.getPoint().getY());
        cornerLeftDown.getPoint().setX(cornerLeftUp.getPoint().getX());
        */
       
        Polygon BoundingBox = new Polygon();
        BoundingBox.addVertex(cornerRightUp, 1);
        BoundingBox.addVertex(cornerLeftUp, 2);
        BoundingBox.addVertex(cornerLeftDown, 3);
        BoundingBox.addVertex(cornerRightDown, 4);
        return (BoundingBox);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
