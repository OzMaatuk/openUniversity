public class Q1
{
    public static void main()
    {
        int[][] arr = new int[][]{{3,8,7,1},{5,15,2,4},{12,14,-13,22},{13,16,17,52}};
        printPath(arr);
    }

    public static void printPath (int[][] mat)
    {
        if (mat != null)
        {
            printPath(mat, 0, 0);
        }
    }

    public static void printPath (int[][] mat, int i, int j)
    {
        if (i >= 0 && i< mat.length && j>=0 && j< mat[0].length )
        {
            if (check(mat,i,j))
            {
                System.out.println(mat[i][j]);
            }
            else
            {
                System.out.println(mat[i][j]);
                int rest = j%2;
                if (rest == 0)
                {
                    if (i == (mat.length-1))
                    {
                        printPath(mat, i, j+1);
                    }
                    else
                    { 
                        printPath(mat, i+1, j);
                    }
                }
                else
                {
                    if (i == 0)
                    {
                        printPath(mat, i, j+1);
                    }
                    else
                    { 
                        printPath(mat, i-1, j);
                    }
                }
            }
        }

    }

    public static boolean check(int[][] mat, int i, int j)
    {
        boolean up = false;
        boolean down = false;
        boolean right = false;
        boolean left = false;
        if ( i-1 >=0)
        {
            if ( mat [i][j] > mat [i-1][j])
            {
                up = true;
            }
        }
        else
        {
            up= true;
        }

        if ( i+1 <mat.length)
        {
            if ( mat [i][j] > mat [i+1][j])
            {
                down = true;
            }
        }
        else
        {
            down= true;
        }

        if ( j+1 <mat[0].length)
        {
            if ( mat [i][j] > mat [i][j+1])
            {
                right = true;
            }
        }
        else
        {
            right= true;
        }

        if ( j-1 >= 0)
        {
            if ( mat [i][j] > mat [i][j-1])
            {
                left = true;;
            }
        }
        else
        {
            left = true;
        }

        return (up && down && left && right);
    }
}
