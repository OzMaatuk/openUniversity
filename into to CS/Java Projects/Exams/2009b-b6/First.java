public class First
{
    private int _num1 = 0;
    private int _num2 = 0;
    private static int _count = 0;
    public First(int num)
    {
        this (num, num);
        _count++;
        System.out.println ("First constructor1");
    }

    public First(int num1, int num2)
    {
        _num1 = num1;
        _num2 = num2;
        _count++;
        System.out.println ("First constructor2");
    }

    public int sum ()
    {
        return _num1 + _num2;
    }

    public static int getCount()
    {
        return _count;
    }
}