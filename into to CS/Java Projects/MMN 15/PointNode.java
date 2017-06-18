
/**
 * class PointNode is a linked list of Points
 * 
 * @author (Oz Maatuk) 
 * @version (MMN 15 Q2)
 */
public class PointNode extends Point
{
    // instance variables
    private Point _point = null; // presenting a point (a place) on the plain by his cartesian values
    private PointNode _next = null; // presenting the next point at the node.

    /**
     * Constructor for objects of class PointNode
     */   
    /**
     * empty constracture:
     * public PointNode() - sets null values for the point and the tail (the next point).
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public PointNode()
    {
        this._point = null;
        this._next = null;
    }
    
    /**
     * first constracture:
     * public PointNode(Point p) - gets a point and copy his values to this node point, the next point will be null;
     * 
     * @param p - the point to copy values from.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public PointNode(Point p)
    {
        this._point = new Point(p);
        this._next = null;
    }
    
    /**
     * secound constracture:
     * public PointNode(Point p, PointNode n) - get a Point and copy it to this Point PointNode, get a PointNode (the next value) and set it to this PointNode next value.
     * 
     * @param   p - the point to copy.
     * @param   n - the nodePoint (the next value) to set.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public PointNode(Point p, PointNode n)
    {
        this._point = new Point(p);
        this._next = n;
    }
    
    /**
     * third constracture:
     * public PointNode(PointNode p) - gets a new PointNode and set it as this PointNode.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public PointNode(PointNode p)
    {
        this._point = new Point(p.getPoint());
        this._next = p.getNext();
    }
    
    /**
     * public Point getPoint() - return the point (_point).
     * 
     * @return  this point (_point). 
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public Point getPoint()
    {
        return (new Point(this._point));
    }
    
    /**
     * public PointNode getNext() - return the next PointNode (_next).
     * 
     * @return  the next PointNode (_next).
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public PointNode getNext()
    {
        return (this._next);
    }
    
    /**
     * public void setPoint(Point p) - gets a Point and copy his values to this Point.
     * 
     * @param   p - the Point to copy from.
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public void setPoint(Point p)
    {
        this._point.setX(p.getX());
        this._point.setY(p.getY());
    }
    
    /**
     * public void setNext(PointNode next) - gets a PoinNode and set is as this nextPoint (_next).
     * 
     * @param   next - the PointNode to set. 
     * 
     * @Time:   O(1);
     * @Place:  O(1);
     */
    public void setNext(PointNode next)
    {
        this._next = next;
    }
}
