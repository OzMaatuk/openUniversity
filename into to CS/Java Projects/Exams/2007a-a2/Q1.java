public class Q1
{
    private int [][] _mat;
    /**
    * Constructor for objects of class MaxLineRecursion
    */
    public Q1(int sizeRow, int sizeCol)
    {
        _mat = new int[sizeRow][sizeCol];
    }
    
    public Q1()
    {
        _mat = new int[][]{{2,6,5,4},{3,17,2,6},{1,3,21,0}};
        System.out.println(maxRow());
    }
    
    public int maxRow ()
    { 
        return maxRow(_mat, 0, 0, 0);
    }
    
    private int maxRow(int[][] arr, int i, int maxSum, int maxI)
    {
        if (i < arr.length)
        {
            int sum = sumOfRow(arr[i], 0, 0);
            if (sum > maxSum)
            {
                return (maxRow(arr, (i+1), sum, i));
            }
            else
            {
                return (maxRow(arr, (i+1), maxSum, maxI));
            }
        }
        return maxI;
    }
    
    private int sumOfRow(int[] arr, int i, int sum)
    {
        if (i < arr.length)
        {
            sum = sum + arr[i];
            i++;
            return (sum + sumOfRow(arr, i, sum));
        }
        else return 0;
    }
}
