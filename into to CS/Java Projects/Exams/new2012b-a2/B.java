public class B extends A
{
    private int _y ;
    public B (int x) {
        super(x, x);
        _y = x;
    }

    public B(int x, int y) {
        this(x * y);
    }

    public B(String s) {
        System.out.println (s + _y);
    }

    public String toString() {
        return _x + " " + _y ;
    }

    public static void main(String[] args)
    {
        A a1 = new B(4, 2);
        System.out.println(a1 );
        A a2 = new A(4, 2);
        System.out.println(a2 );
        B a3 = new B(4, 2);
        System.out.println(a3);
        A b1 = new A();
        System.out.println(b1);
        A c1 = new B("something");
        System.out.println(c1 );
    }
}