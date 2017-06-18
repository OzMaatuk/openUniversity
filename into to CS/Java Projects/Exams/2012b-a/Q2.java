public class Q2
{
    public static void fillHadamard (int mat[][])
    {
        int num = 2;
        int count = 1;
        while (num != mat.length)
        {
            num = num * 2;
            count++;
        }
        fillHadamard(mat, count, 0, 0);
    }   

    public static void fillHadamard(int mat[][], int count, int i, int j)
    {
        if (i < (mat.length - count - 1))
        {
            mat[i][j] = 1;
            mat[i+1][j] = 1;
            mat[i][j+1] = 1;
            mat[i+1][j+1] = -1;
            if ((j+1) == (mat[0].length-1))
            {
                i = i + 2;
                j = 0;
            }
            else
            {
                j = j + 2;
            }
            fillHadamard(mat, count, i, j);
        }
        else if (j < (mat[0].length - count - 1))
        {
            mat[i][j] = 1;
            mat[i+1][j] = 1;
            mat[i][j+1] = 1;
            mat[i+1][j+1] = -1;
            if ((i+1) == (mat.length-1))
            {
                j = j + 2;
                i = (mat.length - count - 1);
            }
            else
            {
                i = i + 2;
            }
            fillHadamard(mat, count, i, j);
        }
        else 
        {
            //print the negativ box from i,j to the end...
        }
    }
}
/*
mat[i][j] = 1;
mat[i+1][j] = 1;
mat[i][j+1] = 1;
mat[i+1][j+1] = -1;

mat[i][j] = -1;
mat[i+1][j] = -1;
mat[i][j+1] = -1;
mat[i+1][j+1] = +1;
 */
