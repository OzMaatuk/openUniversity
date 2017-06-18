/*
 * a.) answare in the code;
 * b.) 1 if you mean to the original str, but if not then n;
 */
public class Q6
{
    public static void main()
    {
        String a1 = " ";
        String a2 = "ab";
        recCheck(a1, a2);
    }

    public static void recCheck (String a1, String a2)
    {
        if (a2.length() == 1)
        {
            System.out.println (a1+a2);
            System.out.println (a1);
        }
        else
        {
            String a3 = new String (a1 + a2.charAt(0));
            String a4 = new String (a2.substring (1));
            recCheck (a3, a4);
            recCheck (a1, a4);
        }
    }
}
