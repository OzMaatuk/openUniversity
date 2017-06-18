public class Q2
{
    public static void what(int n)
    {
        System.out.println(f(n)%2 == 0);
        System.out.println(newf(n)%2 == 0);
    }
    
    public static int f(int n)
    {
        int c = 1;
        for (int i = 2; i <= n; i++)
        {
            if (n%i == 0)
            {
                c++;
            }
        }
        return c;
    }
    
    public static int newf(int n)
    {
        int c = 2;
        if (n%2 == 0)
        {
            c = n/2 + 1;
        }
        for (int i = 3; i < n; i=(i+2))
        {
            if (n%i == 0)
            {
                c++;
            }
        }
        
        return c;
    }
}
