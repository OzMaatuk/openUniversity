
/**
 * (3)
 * a.) f counts num of node from the root;
 * b.) g counts num of sons
 * c.) ehat id finding the biggest value thats not a leaf
 * 
 * (4)
 * a.) O(n⋅ log 4 n);
 * 
 * (5)
 * a.) 8;
 * b.) 4;
 * c.) 
 * 
 * (6)
 * a.) 1;
 * b.) nonstop;
 * c.) 2;
 */
public class Q3456
{
    public static void main()
    {
        //C c = new C(4);
        //D d = new D(1);
        D d = new D(3);
    }

    public static int foo (int a, int b)
    {
        if (a>3)
            return 2 + foo (b-1, a+1);
        if (b<=4)
            return 1 + foo (a-1, b+1);
        return 0;
    }
}
