public class Q1
{
    public static int longeastWorm(int[][] mat)
    {
        return longeastWorm(mat, 0, 0);
    }
    
    public static int longeastWorm(int[][] mat, int i, int j)
    {
        int path1 = 0;
        int path2 = 0;
        int path3 = 0;
        int path4 = 0;
        int path5 = 0;
        if (i >= mat.length)
        {
            return 0;
        }
        if (j >= mat[0].length)
        {
            return 0;
        }
        if (((i+1) < mat.length) && (mat[i+1][j] == (mat[i][j]+1)))
        {
            path1 = 1 + longeastWorm(mat, (i+1), j);
        }
        if ((i-1) >= 0  && mat[i-1][j] == mat[i][j]+1)
        {
            path2 = 1 + longeastWorm(mat, (i-1), j);
        }
        if ((j+1) < mat[0].length  && mat[i][j+1] == mat[i][j]+1)
        {
            path1 = 1 + longeastWorm(mat, (i+1), j);
        }
        if ((j-1) >= 0  && mat[i][j-1] == mat[i][j]+1)
        {
            path1 = 1 + longeastWorm(mat, (i+1), j);
        }
        if ((i==0) || (i == mat.length-1))
        {
            path5 = longeastWorm(mat, i, (j+1));
        }
        else
        {
            if ((j%2)==1)
            {
                path5 = longeastWorm(mat, (i-1), j);
            }
            else
            {
                path5 = longeastWorm(mat, (i+1), j);
            }
        }
        path5 = longeastWorm(mat, (i+1), (j+1));
        return Max(path1, path2, path3, path4, path5);
    }
    
    public static int Max(int x, int y)
    {
        if (x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    
    public static int Max(int x, int y, int z)
    {
        int a = Max(x,y);
        if (a > z)
        {
            return a;
        }
        else
        {
            return z;
        }
    }
    
    public static int Max(int x, int y, int z, int p)
    {
        int a = Max(x,y,z);
        if (a > p)
        {
            return a;
        }
        else
        {
            return p;
        }
    }
    
    public static int Max(int x, int y, int z, int p, int q)
    {
        int a = Max(x,y,z,p);
        if (a > q)
        {
            return a;
        }
        else
        {
            return q;
        }
    }
}
