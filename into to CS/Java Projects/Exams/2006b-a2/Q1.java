public class Q1
{
    public static void main()
    {
        String s = "Java is a good language!";
        specialPrint(s);
    }
    
    public static void specialPrint (String s)
    {
        specialPrint (s, 0);
    }
    
    public static void specialPrint (String s, int i)
    {
        if (i < s.length() )
        {
            if (s.charAt(i) == 'a')
            {
                System.out.println();
                System.out.print(s.substring(i));
                /*
                for (int j=i; j<s.length; j++)
                {
                    System.out.print(s[j]);
                }
                */
            }
            specialPrint (s, (i+1));
        }
    }
}
