
/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends A
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class C
     */
    public C(int n)
    {
       super (n);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean equals(A a)
    {
       return a instanceof C && _num == a._num;
    }
}
