public class Q2
{
    public static int count (int[] a, int x)
    {
        int middle = 0;
        int lower = 0;
        int upper = a.length-1;
        do {
            middle = ((lower + upper) / 2);
            if (x < a[middle])
                upper = middle - 1;
            else lower = middle + 1;
        } while ( (a[middle] != x) && (lower <= upper) );
        
        if (lower <= upper)
        {
            return -1;
        }
        lower = middle;
        upper = middle;
        while (a[lower] == a[middle])
        {
            lower--;
        }
        lower++;
        while (a[upper] == a[middle])
        {
            upper++;
        }
        upper--;
        
        return (upper - lower);
    }
}
