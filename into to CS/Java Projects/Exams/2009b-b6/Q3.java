public class Q3
{
    public static void main()
    {
        int[] arr = new int[]{};
        sortByFour(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public static void sortByFour(int[] arr)
    {
        int pointer = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i]%4) == 0)
            {
                tmp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = tmp;
                pointer++;
            }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i]%4) == 1)
            {
                tmp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = tmp;
                pointer++;
            }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            if ((arr[i]%4) == 2)
            {
                tmp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = tmp;
                pointer++;
            }
        }
    }
}