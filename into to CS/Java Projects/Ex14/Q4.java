
/**
 * Write a description of class Q4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Q4
{
    int[][] mat;
    public Q4()
    {
        mat = new int[5][5];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                mat[i][j] = 1;
            }
        }
        System.out.println(numPaths(mat, 0, 1, 2, 4));
    }
    
    public int numPaths (int[][] mat,int x1, int y1, int x2, int y2)
    {
        if ((x1 == x2) && (y1 == y2)) //found a path!
        {
            return (1); //return one is exaclly add one to the result, so if we found a path, return one!
        }
        else if ((x1 < mat.length) && (y1 < mat[0].length) && (x1 >= 0) && (y1 >=0) && (y1 >= x1) && (mat[x1][y1] > 0)) //if the cell is leagel
        {
            mat[x1][y1] = (-1 * mat[x1][y1]);                   //we "mark" the cell for the reason not to reach it again
            
            //temp is the integer who count the paths, we are sending to check paths at the neighbors cell,
            //and the methods is returning 1 if the path found and 0 if not.
            //temp getting the amount of the answares from all the neighbors.
            
            int _temp =( numPaths (mat,x1,y1 + 1, x2,y2) +
                        numPaths (mat,x1 - 1,y1, x2,y2) +
                        numPaths (mat,x1,y1 - 1, x2,y2) +
                        numPaths (mat,x1 + 1,y1, x2,y2)   );    //we are sending all the neighbors cells to start check the path from them
            mat[x1][y1] = (-1 * mat[x1][y1]);                   //return the original cell value, becouse you asked to...
            return _temp;                                        //returning the amount of all paths calculates from the neighbors 
        }
        else
        {
            return (0); //a path was not found in this addition, beacous the cell is not leagal
        }
        
    }
}
