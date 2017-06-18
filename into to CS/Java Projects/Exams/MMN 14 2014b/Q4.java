public class Q4
{
    public static boolean match (int [] a, int [] pattern)
    {
        if (a.length - pattern.length > 0)
        {
            return match(a, pattern, 0);
        }
        else if (a.length - pattern.length == 0)
        {
            return match(a, pattern, 0, 0);
        }
        else
        {
            return false;
        }
    }

    public static boolean match (int [] a, int [] pattern, int i)
    {
        if (a.length - pattern.length - i > 0)
        {
            return (match(a, pattern, i, 0) || match(a, pattern, i+1));

        }
        else
        {
            return match(a, pattern, i, 0);
        }
    }

    public static boolean match (int [] a, int [] pattern, int i, int j)
    {
        if (j < pattern.length)
        {
            if (pattern[j] == 0)
            {
                if (a[i] / 10 == 0 || a[i] / 100 == 0)
                {
                    return match (a, pattern, (i+1), (j+1));
                }
                else
                {
                    return false;
                }
            }
            else if (pattern[j] == 2)
            {
                if (a[i] / 10 != 0 && a[i] / 100 == 0)
                {
                    return match (a, pattern, (i+1), (j+1));
                }
                else
                {
                    return false;
                }
            }
            else if (pattern[j] == 1)
            {
                if (a[i] / 10 == 0)
                {
                    return match (a, pattern, (i+1), (j+1));
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return true;
        }
    }
}
