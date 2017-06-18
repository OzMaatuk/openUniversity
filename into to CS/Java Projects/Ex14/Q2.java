public class Q2
{
    public Q2()
    {
        int [] a = new int[] {0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1};
        zeroDistance(a);
        
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]);
    }
    
    public static void zeroDistance (int[] a)
    {
        int j = (a.length - 1); //help index, moving from the right to the left
        // i is an index whos moving from the left to the right
        int _counterRight = a.length; //counting the distance from the right
        int _counterLeft = a.length; //counting the distance from the left
        
        for (int i = 0; i < a.length; i++) //get to the array cells one by one
        {
            
            //work on the index from the left, to check the smallest distance from a zero cell on the left
            
            if (a[i] == 0) //found a zero
            {
                _counterRight = 0; //the distance from zero is zero
            }
            else //its not a zero
            {
                _counterRight++; //count the cell becouse he is seperating from the last zero cell
                if ((a[i] == 1) && (i < j)) //if the other index wasnt here
                {
                    a[i] = _counterRight; //put the distance from the left zero cell 
                }
                else if (a[i] > _counterRight) //the other index was here, so is the distance from the right is smaller the the distance from the left?
                {
                    a[i] = _counterRight; //put the distance from the left zero cell 
                }
            }
            
            //now work on the index from the right, to check the smallest distance from a zero cell on the right
            
            if (a[j] == 0) //found a zero
            {
                _counterLeft = 0; //the distance from zero is zero
            }
            else //its not a zero
            {
                _counterLeft++; //count the cell becouse he is seperating from the last zero cell
                if ((a[j] == 1) && (j > i)) //if the other index wasnt here
                {
                    a[j] = _counterLeft; //put the distance from the right zero cell 
                }
                else if (a[j] > _counterLeft) //the other index was here, so is the distance from the left is smaller the the distance from the right?
                {
                    a[j] = _counterLeft; //put the distance from the right zero cell 
                }
            }
            j--; //move one to the left
        }
    }
}
