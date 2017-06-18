public class Q1
{
    public static void main()
    {
        int[] arr = new int[]{5, 22, 13, 5, 7, -4};
        System.out.println(cover(arr, 17));
    }
    
    public static boolean cover (int [] values, int amount)
    {
        return cover(values, 0, amount);
    }
    
    public static boolean cover (int [] values, int i, int amount)
    {
        if (amount == 0)
        {
            return true;
        }
        if (i < values.length)
        {
            if ((amount - values[i]) > 0)
            {
                if ((cover(values, (i+1), amount)))
                {
                    return true;
                }
                if (cover(values, (i+1), (amount - values[i])))
                {
                    return true;
                }
                if (cover(values, i, (amount - values[i])))
                {
                    return true;
                }
                //return (cover(values, (i+1), amount) || cover(values, i, (amount - values[i])) || cover(values, (i+1), (amount - values[i])));
            }
            else if ((amount - values[i]) == 0)
            {
                return true;
            }
            else
            {
                return cover(values, (i+1), amount);
            }
        }
        return false;
    }
}
