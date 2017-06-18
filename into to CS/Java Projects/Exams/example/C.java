public class C extends B
{
    private int _z;
    public C()
    {
        super();
        _z = 10;
    }

    public void d(int y)
    {
        _x += (y+_z);
    }

    public String toString()
    {
        return
        super.toString()+"."+_z;
    }
}