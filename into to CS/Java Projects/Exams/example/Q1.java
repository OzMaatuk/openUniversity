
public class Q1
{
    public Q1()
    {
    }
    
    public static void main()
    {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] vec = new int[]{1,5,9};
        
        Q1 q = new Q1();
        
        System.out.println(what(mat, vec));
        System.out.println(q.what2(mat, vec, 0));
    }
    public static boolean what (int [] [] mat, int [] vec)
    {
        int n = mat.length;
        int m = vec.length;
        for (int i=0; i < m; i++)
        {
            if ( (vec[i] != mat[i][n-m+i]) ||
            (vec[i] != mat[n-m+i][i]) )
            {
                return false;
            }
        }
        return true;
    }

    public boolean what2(int [] [] mat, int [] vec, int i)
    {
        int n = mat.length;
        int m = vec.length;
        if (i == m)
        {
            return true;
        }
        else if ( (vec[i] != mat[i][n-m+i]) || (vec[i] != mat[n-m+i][i]) )
        {
            return false;
        }
        else
        {
            return what2(mat,vec, (i+1));
        }
    }
}

