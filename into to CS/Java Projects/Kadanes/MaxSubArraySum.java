public class MaxSubArraySum
{
    public static void main()
    {
        int [] a = new int[]{1,2,3,4,5};
        System.out.println(kadanes(a));
    }
    
    public static int kadanes(int[] a)
    {
        int cur_max = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (cur_max < 0)
            {
                cur_max = a[i];
            }
            else
            {
                cur_max = cur_max + a[i];
            }
            
            if (cur_max > max)
            {
                max = cur_max;
            }
        }
        return max;
    }
}
