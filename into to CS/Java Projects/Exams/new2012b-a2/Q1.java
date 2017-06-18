public class Q1
{    
    public static boolean isSumOf(int[] s, int n)
    {
        return (isSumOf(s, n, 0, 0));
    }
    
    public static boolean isSumOf(int[] s, int n, int i, int sum)
    {
        if (sum == n)
        {
            return true;
        }
        else
        {
            if (i == s.length)
            {
                return false;
            }
            else
            {
                boolean bool1 = isSumOf(s, n, (i+1), sum+s[i]);
                boolean bool2 = isSumOf(s, n, i, sum+s[i]);
                boolean bool3 = isSumOf(s, n, i+1, sum);
                if (bool1 || bool2 || bool3)
                {
                    System.out.print(s[i]+" ");
                }
                return (bool1 || bool2 || bool3);
            }
        }
    }
}
