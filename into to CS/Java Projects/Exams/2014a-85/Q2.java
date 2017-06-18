public class Q2 // ze lo yaailll!!!!
{
    public static void findMax (int[] arr)
    {
        int i = 0;
        while ((i < arr.length) && (!isitMax(arr,i)))
        {
            i++;
        }
        System.out.print(i);
    }
    
    public static boolean isitMax(int[] arr, int i)
    {
        int before = 0;
        int after = 0;
        if (i == 0)
        {
            before = arr.length-1;
        }
        else
        {
            before = i-1;
        }
        if (i == arr.length-1)
        {
            after = 0;
        }
        else
        {
            after = i+1;
        }
        if ((arr[before] < arr[i]) && (arr[after] < arr[i]))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
