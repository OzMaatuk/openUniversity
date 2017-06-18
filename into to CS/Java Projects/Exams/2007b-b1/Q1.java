public class Q1
{
    public static void main()
    {
        int[] ar1 = new int[]{1, 2, 2};
        int[] ar2 = new int[]{2, 4, 6};
        int[] arr = new int[ar1.length+ar2.length];
        arr = merge(ar1,ar2);
        for (int i = 0; i < (ar1.length+ar2.length); i++)
        {
            System.out.println(arr[i]);
        }
    }
    
    public static int[] merge (int[] ar1, int[] ar2)
    {
        int[] arr = new int[ar1.length+ar2.length];
        merge(arr,ar1, ar2, 0, 0, 0);
        return arr;
    }
    
    public static void merge (int[] arr, int[] ar1, int[] ar2, int i, int j, int pos)
    {
        if ((i<ar1.length) && (j<ar2.length))
        {
            if (ar1[i] < ar2[j])
            {
                arr[pos] = ar1[i];
                merge(arr, ar1, ar2, (i+1), j, (pos+1));
            }
            else
            {
                arr[pos] = ar2[j];
                merge(arr, ar1, ar2, i, (j+1), (pos+1));
            }
        }
        else
        {
            if (i<ar1.length)
            {
                arr[pos] = ar1[i];
                merge(arr, ar1, ar2, (i+1), j, (pos+1));
            }
            else if (j<ar2.length)
            {
                arr[pos] = ar2[j];
                merge(arr, ar1, ar2, i, (j+1), (pos+1));
            }
        }
    }
}
