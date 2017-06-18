public class Q2
{
    public static int fixedPoint (int [] a)
    {
        int low = 0;
        int hi = a.length-1;
        int mid = 0;
        boolean found = false;
        while ((!found) && (hi >= low))
        {
            if (a[mid] == mid)
            {
                found = true;
            }
            else if (a[mid] < mid)
            {
                mid = (hi + low)/2;
                low = mid;
            }
            else if (a[mid] > mid)
            {
                mid = (hi - low)/2;
                hi = mid;
            }
        }
        if (found)
        {
            System.out.print(mid);
            return mid;
        }
        else
        {
            mid++;
            if (a[mid] == mid)
            {
                System.out.print(mid);
                return mid;
            }
            else
            {
                System.out.print(-1);
                return -1;
            }
        }
    }
}
