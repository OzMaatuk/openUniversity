public class Q2
{
    public boolean single(int[] values)
    {
        //QuickSort(values);
        int min = values.length;
        int count = 1;
        int num = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (num == values[i])
            {
                count++;
            }
            else
            {
                num = values[i];
                if (min > count)
                {
                    min = count;
                }
                count = 1;
            }
        }
        if (min == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
