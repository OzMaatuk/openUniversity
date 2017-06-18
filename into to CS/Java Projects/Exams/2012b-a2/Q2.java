public class Q2
{
    public static int count (int[] a, int x)
    {
        boolean found = false;
        int Index = 0;
        int downIndex = 0;
        int upIndex = a.length;
        while ((!found) && (downIndex != upIndex))
        {
            if (a[downIndex] == x)
            {
                Index = downIndex;
                found = true;
            }
            else if (a[upIndex] == x)
            {
                Index = upIndex;
                found = true;
            }
            else if ((a[downIndex]) < x && (a[upIndex] > x))
            {
                if (a[upIndex/2] < x)
                {
                    downIndex = (downIndex+upIndex)/2;
                }
                else
                {
                    upIndex = (downIndex+upIndex)/2;
                }
            }
            else
            {
                break;
            }
        }
        if (found)
        {
            upIndex = a.length;
            downIndex = 0;
            return 0;
        }
        else
        {
            return 0;
        }
    }
}
