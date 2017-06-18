
/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm
{
    public static void main()
    {
        int[][] array = new int[4][5];
        array[0][0] = 3;
        array[0][1] = 13;
        array[0][2] = 15;
        array[0][3] = 28;
        array[0][4] = 30;
        array[1][0] = 50;
        array[1][1] = 51;
        array[1][2] = 52;
        array[1][3] = 29;
        array[1][4] = 30;
        array[2][0] = 51;
        array[2][1] = 10;
        array[2][2] = 53;
        array[2][3] = 54;
        array[2][4] = 55;
        array[3][0] = 53;
        array[3][1] = 12;
        array[3][2] = 14;
        array[3][3] = 53;
        array[3][4] = 56;
        System.out.print(longestWorm(array));
    }

    public static int longestWorm(int[][] a)
    {
        if (a == null)
        {
            return 0;
        }
        boolean[][] beenThere = new boolean[a.length][a[0].length];

        return (longestWorm(a, 0, 0, beenThere));
    }

    public static int longestWorm(int[][] a, int i, int j, boolean[][] beenThere)
    {
        beenThere[i][j] = true;
        int path1 = 0;
        int path2 = 0;
        int path3 = 0;
        int path4 = 0;
        if (((i+1) < a.length) && (beenThere[i+1][j] == false))
        {
            if (a[i+1][j] == a[i][j] + 1)
            {
                path1 = (1 + longestWorm(a, (i+1), j, beenThere));
            }
            else
            {
                path1 = longestWorm(a, (i+1), j, beenThere);
            }
        }
        if (((i-1) > 0) && (beenThere[i-1][j] == false))
        {
            if (a[i-1][j] == a[i][j] + 1)
            {
                path2 = (1 + longestWorm(a, (i-1), j, beenThere));
            }
            else
            {
                path2 = longestWorm(a, (i-1), j, beenThere);
            }
        }
        if (((j+1) < a[0].length)  && (beenThere[i][j+1] == false))
        {
            if (a[i][j+1] == a[i][j] + 1)
            {
                path3 = (1 + longestWorm(a, i, (j+1), beenThere));
            }
            else
            {
                path3 = longestWorm(a, i, (j+1), beenThere);
            }
        }
        if (((j-1) > 0) && (beenThere[i][j-1] == false))
        {
            if (a[i][j-1] == a[i][j] + 1)
            {
                path4 = (1 + longestWorm(a, i, (j-1), beenThere));
            }
            else
            {
                path4 = longestWorm(a, i, (j-1), beenThere);
            }
        }

        int path = Math.max(path1, path2);
        path = Math.max(path,path3);
        path = Math.max(path,path4);

        return path;
    }
}
