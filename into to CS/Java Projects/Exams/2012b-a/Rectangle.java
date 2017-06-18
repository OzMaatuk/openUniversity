public class Rectangle
{
    private int _length;
    private int _width;
    private Point _sw;

    public Rectangle(int l, int w, Point sw)
    {
        _length = l;
        _width = w;
        _sw = new Point (sw);
    }

    public static Rectangle smallestRect1 (Point [] p)
    {
        Point head = new Point(p[0]);
        Point max = new Point(p[0]);
        Point min = new Point(p[0]);
        for (int i = 1; i < p.length; i++)
        {
            if (p[i].getX() > max.getX())
            {
                max.setX((int)p[i].getX());
            }
            if (p[i].getY() > max.getY())
            {
                max.setY((int)p[i].getY());
            }
            if (p[i].getX() < min.getX())
            {
                min.setX((int)p[i].getX());
            }
            if (p[i].getY() < min.getY())
            {
                min.setY((int)p[i].getY());
            }
        }
        int w = (int)(max.getX() - min.getX());
        int l = (int)(max.getY() - min.getY());
        return (new Rectangle(l, w, min));
    }
    
    public static Rectangle smallestRect2(Point [] p)
    {
        Point min = new Point(p[0]);
        Point max = new Point(p[p.length-1]);
        if (min.getX() > max.getX())
        {
            int tmp = (int)min.getX();
            min.setX((int)max.getX());
            max.setX(tmp);
        }
        int l = (int)(max.getX() - min.getX());
        int w = (int)(max.getY() - min.getY());
        return (new Rectangle(l, w, min));
    }
}