public class Q1
{
    public static void main()
    {
        String s1 = "TheExamIsEasy";
        String s2 = "The*IsHard";
        System.out.println(samePattern(s1, s2, false));
    }
    
    public static boolean samePattern (String s1, String s2, boolean after)
    {
        if ((s1.length() == 1) && (s2.length() == 1) && (s1.charAt(0) == s2.charAt(0)))
        {
            return true;
        }
        else if (all(s2))
        {
            return true;
        }
        else if (s1 == "")
        {
            if (s2 == "")
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (s1.length() == 1)
        {
            if (s2.charAt(0) == '*')
            {
                return samePattern(s1, s2.substring(1), after);
            }
            else
            {
                if (all(s2.substring(1)))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else if (s2.length() == 1)
        {
            if (after)
            {
                return (samePattern(s1.substring(1), s2, true));
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (s1.charAt(0) == s2.charAt(0))
            {
                if (after)
                {
                    return (samePattern(s1.substring(1), s2.substring(1), false) || samePattern(s1.substring(1), s2, true));
                }
                else
                {
                     return (samePattern(s1.substring(1), s2.substring(1), false));
                }
            }
            else
            {
                if (s2.charAt(0) == '*')
                {
                    return samePattern(s1, s2.substring(1), true);
                }
                else
                {
                    if (after)
                    {
                        return samePattern(s1.substring(1), s2, true);
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
    }
    
    private static boolean all(String s)
        {
            if (s.length() == 1)
            {
                if (s == "*")
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                if (s.charAt(0) == '*')
                {
                    return all(s.substring(1));
                }
                else
                {
                    return false;
                }
            }
        }
}
