public class Q1
{
    public static void main(String[] args)
    {
        int[] s = new int[]{4,5};
        int n = 13;
        isSumOf(s, n);
    }
    
    public static boolean isSumOf(int[] s, int n)
    {
        return isSumOf(s, n, 0);
    }
    
    private static boolean isSumOf(int[] s, int n, int i)
    {
        if ((i < s.length) && (n > 0))
        {
            if (n == 0)
            {
                System.out.println(s[i]);
                return true;
            }
            else
            {
                if (isSumOf(s, n-s[i], i) || isSumOf(s, n-s[i], (i+1)) || isSumOf(s, n, (i+1)))
                {
                    System.out.println(s[i]);
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
