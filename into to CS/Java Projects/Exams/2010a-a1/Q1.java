public class Q1
{
    public static void main()
    {
        int[] arr = new int[]{5, 15, 3, 22, 12, 7, 27, 14};
        System.out.print(maximalDrop(arr));
    }

    public static int maximalDrop (int [] a)
    {
        if (a.length == 2)
        {
            return (a[0] - a[1]);
        }
        if (a.length <= 1)
        {
            return 0;
        }
        int maxDis = (a[0] - a[1]);
        int min = 1;
        int max = 0;
        int newMax = 0;
        for (int j = 1; j < a.length; j++)
        {
            if ((a[max] - a[j]) < (a[newMax] - a[j]))
            {
                if ((a[newMax] - a[j]) > maxDis)
                {
                    maxDis = a[newMax] - a[j];
                    max = newMax;
                }
            }
            else if ((a[max] - a[j]) > maxDis)
            {
                maxDis = (a[max] - a[j]);
            }
            else // ((a[max] - a[j]) <= maxDis))
            {
                if (a[newMax] < a[j])
                {
                    newMax = j;
                }
            }
        }
        return maxDis;
    }
}
