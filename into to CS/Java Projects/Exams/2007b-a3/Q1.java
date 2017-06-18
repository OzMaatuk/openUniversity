
/**
 * 
 */
public class Q1
{
    public static void main()
    {
        String s1 = "substring";
        String s2 = "string";
        System.out.println(isSubstring(s1,s2));
    }
    public static boolean checkInside (String s1, String s2)
    {
        if (s1 == s2)
        {
            return true;
        }
        if (s2.length() == 1)
        {
            if (s1.charAt(0) == s2.charAt(0))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (s1.charAt(0) == s2.charAt(0))
        {
            return (checkInside(s1.substring(1), s2.substring(1)));
        }
        else // (s1.charAt(0) != s2.charAt(0))
        {
            return false;
        }
    }
    
    public static boolean isSubstring (String s1, String s2)
    {
        if (s1.length() - s2.length() >= 0)
        {
            return (checkInside(s1, s2) || isSubstring(s1.substring(1),s2));
        }
        else
        {
            return false;
        }
    }
}
