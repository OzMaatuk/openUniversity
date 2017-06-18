
/**
 * a.) not work becouse c is the father and e is the child, the child cant have the father without downcasting
 * b.) will not run becouse of illegal casting
 * c.) will work
 * d.) will work
 * e.) not comp, becouse they are not the same obj, and there is no casting.
 * f.) not running, becouse the casting is illegale **comp 
 * g.) b is abst, so you cant make an obj
 * h.) will work
 * i.) will not work becouse method a is private
 * j.) not comp, becouse g cant use method b as non static
 * k.) upcasting, will not do anything, so the line wiil not comp
 * l.) same same, method b in g class will not work
 */
public class Q4
{
    public static void main (String [] args)
    {
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        G g = new G();
        
        //e = c;
        //e = (E)c;
        c = e;
        c = (C)e;
        //d = e;
        //d = (D)e;
        //A ab = new B();
        A af = new G();
        //System.out.println (c.a());
        //System.out.println (g.b());
        //System.out.println (((B)g).b());
    }
}
