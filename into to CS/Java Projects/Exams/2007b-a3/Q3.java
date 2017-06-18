/*
 * a.) O(Log(n));
 * b.) "3,1,2,3";
 * c.) noone;
 * d.) the answare down...
 * e.) no answare is right;
 * f.)  1 - no beacouse of the private method f
 *      2 - comp...!
 *      3 - comp...!
 *      4 - only if they are in the same packege;
 * g.) 4;
 * h.) 4;
 * i.) 3;
 * j.) 4;
 */
public class Q3
{
    public static void d()
    {
        C cd = new D();
        D dd = (D)cd;
        dd.foo(dd);
        System.out.println();
        dd.foo(cd);
        System.out.println();
        cd.foo(dd);
        System.out.println();
        //cd.foo(cd);
    }
}