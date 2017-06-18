
/**
 * a.) finds the maximum sum of subarrays;
 * b.) O(n^3);
 */
public class Q2
{
    public static int what (int[] _arr)
    {
        int m =_arr[0];
        for (int i=0; i<_arr.length; i++)
            for (int j=i; j<_arr.length; j++)
            {
                int s=_arr[i];
                for (int k=i+1; k<=j; k++)
                    s += _arr[k];
                if (s > m)
                    m=s;
            }
        System.out.println(m);    
        return m;
    }

    public static int summing(int[] arr)
    {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            maxSum = maxSum + arr[i];
        }

        int upLim = arr.length-1;
        int downLim = 0;
        int sum = maxSum;

        while (upLim != downLim)
        {
            if ((sum - arr[upLim]) > maxSum)
            {
                maxSum = maxSum - arr[upLim];
                sum = maxSum;
                upLim--;
            }
            else if ((sum - arr[downLim]) > maxSum)
            {
                maxSum = maxSum - arr[downLim];
                sum = maxSum;
                downLim++;
            }
            else if ((sum - arr[upLim]) <= maxSum)
            {
                sum = (arr[upLim]);
                upLim--;
            }
            else if ((sum - arr[downLim]) <= maxSum)
            {
                sum = (arr[downLim]);
                downLim++;
            }
        }
        if ((sum - arr[upLim]) > maxSum)
            {
                maxSum = maxSum - arr[upLim];
                sum = maxSum;
                upLim--;
            }
            else if ((sum - arr[downLim]) > maxSum)
            {
                maxSum = maxSum - arr[downLim];
                sum = maxSum;
                downLim++;
            }
            else if ((sum - arr[upLim]) <= maxSum)
            {
                sum = (arr[upLim]);
                upLim--;
            }
            else if ((sum - arr[downLim]) <= maxSum)
            {
                sum = (arr[downLim]);
                downLim++;
            }
        System.out.println(maxSum);
        return(maxSum);
    }
}
