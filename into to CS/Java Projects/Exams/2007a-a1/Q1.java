public class Q1
{
    static int []_arr = new int[]{2, 1, 6, 5, 4};
    public static void equalSum ()
    {
        System.out.println(equalSum(0, _arr.length-1, _arr[0], _arr[_arr.length-1]));
    }
    
    private static int equalSum(int leftI, int rightI, int leftSum, int rightSum)
    {
        if (leftI != rightI-1)
        {
            if (leftSum > rightSum)
            {
                return equalSum(leftI, (rightI-1), leftSum, rightSum + _arr[rightI-1]);
            }
            else
            {
                return equalSum((leftI+1), rightI, leftSum + _arr[leftI+1], rightSum);
            }
        }
        else
        {
            if (leftSum == rightSum)
            {
                return (leftI);
            }
            else
            {
                return (-1);
            }
        }
    }
}
