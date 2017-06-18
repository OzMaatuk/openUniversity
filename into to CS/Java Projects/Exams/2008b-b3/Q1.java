public class Q1
{
    public static void main()
    {
        int [][] _mat = new int [][]{};
        Cell c1 = new Cell(0,0);
        Cell c2 = new Cell(_mat.length-1,_mat[0].length-1);
        while ((c1.getX() != c2.getX()) && (c1.getY() != c2.getY()))
        {
            while (_mat[c1.getX()][c1.getY()] < 0)
            {
                c1 = c1.nextCell(c1.getX(),c1.getY());
            }
            while (_mat[c2.getX()][c2.getY()] >= 0)
            {
                c2 = c2.nextCell(c2.getX(),c2.getY());
            }
            
            int tmp = _mat[c1.getX()][c1.getY()];
            _mat[c1.getX()][c1.getY()] = _mat[c2.getX()][c2.getY()];
            _mat[c2.getX()][c2.getY()] = tmp;
        }
    }
}

// Time: O(N^2);
// Place:O(1);
