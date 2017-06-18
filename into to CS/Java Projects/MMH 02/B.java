public class B extends A
{
    public boolean f(int x)
    {
        Object obj = new A();
        return this.equals(obj);
    }
}