public class Q4
{
    public boolean what (int [] arr) //O(N^2);
    {
        for (int i=0; i < arr.length; i++)
            for (int j=0; j < arr.length; j++)
                if (arr[j] >= 2*arr[i])
                    return true;
        return false;
    }

    public boolean shita(int[] arr) //O(N);
    {
        int max = 0;
        int min = 0;

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] > arr[max])
            {
                max = i;
            }
        }

        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] < arr[min])
            {
                min = i;
            }
        }

        if (2*arr[min] > arr[max])
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
