public class Q3
{
    public static void sort(int[] arr)
    {
        //QuickSort();
    }
    
    public int what (int[] a)
    {
        sort(a);
        int num = a[0];
        int count = 1;
        int max = 0;
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] == num)
            {
                count++;
            }
            else
            {
                if (count > max)
                {
                    max = count;
                }
                count = 1;
                num = a[i];
            }
        }
    }
}
