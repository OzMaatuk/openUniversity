public class Tester extends B
{
    public Tester()
    {
    }
    
    public boolean f(int x)
    {
        return true;
    }
    
    public static void main(String [] args)
    {   
        Tester T = new Tester();
        System.out.println(T.f(2));
    }
}
