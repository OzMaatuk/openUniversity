public class Hmatrix
{
    public static void main()
    {
        int[][] a = new int[8][8];
        fillHadamard(a);
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(a[i][j] + " ,");
            }
            System.out.println();
        }
    }
    
    public static void fillHadamard (int mat[][])
    {
        fillHadamard(mat, 0,0,mat.length, 1);
    }

    private static void fillHadamard (int [][] mat, int top, int left, int size, int sign)
    {
        if (size == 1)
            mat[top][left] = sign;
        else
        {
            fillHadamard (mat, top, left, size/2, sign);
            fillHadamard (mat, top+size/2, left, size/2, sign);
            fillHadamard (mat, top, left+size/2, size/2, sign);
            fillHadamard (mat, top+size/2, left+size/2, size/2, (-1)*sign);
        }
    }
}
