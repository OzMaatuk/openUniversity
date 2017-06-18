public class BB extends AA
{
    public int _x;
    public BB()
    {
        this(2);
    }

    public BB(int k)
    {
        super(k+1);
        _x = super.getX() + 1;
    }

    public int getX()
    {
        return _x;
    }
}