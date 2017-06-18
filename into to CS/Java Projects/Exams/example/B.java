public abstract class B extends A
{
    private int _y;
    public B()
    {
        super();
        _y = 1;
    }

    public String toString()
    {
        return ""+_x + "."+_y;
    }
}