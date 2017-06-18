public class Second extends First
{
    private int _num3 = 0;
    public Second(int num)
    {
        super (num);
        _num3 = num;
        System.out.println ("Second constructor1");
    }

    public Second (int num1, int num2, int num3)
    {
        super (num1, num2);
        _num3 = num3;
        System.out.println ("Second constructor2");
    }

    public int sum ()
    {
        return super.sum() + _num3;
    }

    public void setNum3 (int num)
    {
        _num3 = num;
}
}