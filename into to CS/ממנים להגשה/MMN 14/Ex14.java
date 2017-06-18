
/**
 * Write a description of class Ex14 here.
 * 
 * @author (Oz Maatuk 305181158)
 * @version (MMN 14)
 */

public class Ex14
{
    
    public Ex14()
    {
        
    }
    
/**
 * Q1:
 * a)   public static int what (int []a)
 *      The method is counting maximum sequence of cells/numbers from the array, that the amount is complate distribution of 3.
 * 
 *      @param  a - is the number array we check
 *      @return maximum sequence cells/number that the amount is complate distribution of 3.
 *      
 * b)   O(N^3);
 * 
 * d)   O(N) -  Becouse im using only one loop each time, when the old method using three.
 *              it based on the idea that if the whole amount have a rest of 1,
 *              then there is a sequence from the left (not the whole array) that got a rest of 1,
 *              or / and there is a sequence from the right (not the whole array) that got a rest of 1,
 *              so the rest of the array got rest of 0, and thats what we need,
 *              so we choose the smallest rest 1 sequence one and we got the biggest rest 0 sequence, 
 *              or / and there is a sequence from the right (not the whole array) that got a rest of 2,
 *              and there is a sequence from the left (not the whole array) that got a rest of 2,
 *              so between those two there is a sequence with rest of 0,
 *              we find the biggest sequence between them,
 *              and compare it to the sequence the we found before (when we were searcing for rest of 1)
 *              same but the opposite we are doing if the amount got a rest of 2...
 * c)
 */

    /**
     * public static int what (int []a) -
     * The method is counting maximum sequence of cells/numbers from the array, that the amount is complate distribution of 3.
     * 
     * @param  a - is the number array we check
     * @return maximum sequence cells/number that the amount is complate distribution of 3.
     */
    public static int what(int[] a)
    {
        final int   MODVALUE = 3;                                   // The value of the mod action you want to calculate.
        int _leftSum = 0;                                           // The amount od the array cells from the left.
        int _rightSum = 0;                                          // The amount od the array cells from the right.
        int _leftEndingPoint1 = a.length;                           // Presenting the ending index of a path with rest of 1 from the left.
        int _rightEndingPoint1 = a.length;                          // Presenting the ending index of a path with rest of 1 from the right.
        int _rightEndingPoint2 = a.length;                          // Presenting the ending index of a path with rest of 2 from the right.
        int _leftEndingPoint2 = a.length;                           // Presenting the ending index of a path with rest of 2 from the left.
        int _mod2Length = 0;                                        // The biggenst sequence with rest of 2.
        int _mod1Length =0;                                         // The biggenst sequence with rest of 1.
        boolean _stillAProb = true;                                 // boolean that tells us if we found the smallest array we reach for.
        
        for (int i = 0; i < a.length; i++)                          // Calculate the amount of the array cells.
        {
            _leftSum = _leftSum + a[i];
        }
        
        if ((_leftSum % MODVALUE) == 0)                             // The biggest sequence is all the array.
        {
            return (a.length);
        }
        
        else if ((_leftSum % MODVALUE) == 1)                        // if the amount has rest of 1, then...
        {
            _rightSum = 0;
            _leftSum = 0;
            int i = 0;                                              // index.
            while ((i < a.length) && (_stillAProb))                 // Find the min rest 1 sequence thats not the whole array.
            {
                _rightSum = _rightSum + a[i];
                _leftSum = _leftSum + a[a.length - i - 1];
                if ((_rightSum % MODVALUE) == 1)                    // From the right.
                {
                    _rightEndingPoint1 = i;
                    _stillAProb = false;
                }
                if (((_leftSum % MODVALUE) == 1))                   // And from the left.
                {
                    _leftEndingPoint1 = i;
                    _stillAProb = false;
                }
                i++;
            }
            if (_leftEndingPoint1 > _rightEndingPoint1)             // the rest of the array have a rest of 0, so save the biggest sequence with rest 0.
            {
                _mod1Length = a.length - _rightEndingPoint1 - 1;
            }
            else
            {
                _mod1Length = a.length - _leftEndingPoint1 - 1;
            }
            
            _rightSum = 0;
            _leftSum = 0;
            i = 0;
            _stillAProb = true;
            while ((i < a.length) && (_stillAProb))                 // Find the min sequence with rest 2.
            {
                _rightSum = _rightSum + a[i];
                _leftSum = _leftSum + a[a.length - i - 1];
                if ((_rightSum % MODVALUE) == 1)                    // From the right.
                {
                    _rightEndingPoint2 = i;
                    _stillAProb = false;
                }
                if (((_leftSum % MODVALUE) == 1))                   // And from the left.
                {
                    _leftEndingPoint2 = i;
                    _stillAProb = false;
                }
                i++;
            }
            
            if ((_rightEndingPoint2 + _leftEndingPoint2) < a.length)// The mid between those sequnces have a rest of 0, so save it. 
            {
                _mod2Length = (a.length - _leftEndingPoint2 - _rightEndingPoint2 - 1 - 1);
            }
            
            if (_mod1Length > _mod2Length)                          // Check who is the biggest sequence.
            {
                return (_mod1Length);
            }
            else
            {
                return (_mod2Length);
            }
        }
        
        else if ((_leftSum % MODVALUE) == 2)                        // if the amount has rest of 2, then...
        {
            _rightSum = 0;
            _leftSum = 0;
            int i = 0;                                              // index.
            while ((i < a.length) && (_stillAProb))                 // Find the min rest 2 sequence thats not the whole array.
            {
                _rightSum = _rightSum + a[i];
                _leftSum = _leftSum + a[a.length - i - 1];
                if ((_rightSum % MODVALUE) == 2)                    // From the right.
                {
                    _rightEndingPoint2 = i;
                    _stillAProb = false;
                }
                if (((_leftSum % MODVALUE) == 2))                   // And from the left.
                {
                    _leftEndingPoint2 = i;
                    _stillAProb = false;
                }
                i++;
            }
            if (_leftEndingPoint2 > _rightEndingPoint2)             // the rest of the array have a rest of 0, so save the biggest sequence with rest 0.
            {
                _mod2Length = a.length - _rightEndingPoint2 - 1;
            }
            else
            {
                _mod2Length = a.length - _leftEndingPoint2 - 1;
            }
            
            _rightSum = 0;
            _leftSum = 0;
            i = 0;
            _stillAProb = true;
            while ((i < a.length) && (_stillAProb))                 // Find the min rest 2 sequence thats not the whole array.
            {
                _rightSum = _rightSum + a[i];
                _leftSum = _leftSum + a[a.length - i - 1];
                if ((_rightSum % MODVALUE) == 1)                    // From the right.
                {
                    _rightEndingPoint1 = i;
                    _stillAProb = false;
                }
                if (((_leftSum % MODVALUE) == 1))                   // And from the left.
                {
                    _leftEndingPoint1 = i;
                    _stillAProb = false;
                }
                i++;
            }
            
            if ((_rightEndingPoint1 + _leftEndingPoint1) < a.length)// The mid between those sequnces have a rest of 0, so save it.
            {
                _mod1Length = (a.length - _leftEndingPoint1 - _rightEndingPoint1 - 1 - 1);
            }
            
            if (_mod1Length > _mod2Length)                          // Check who is the biggest sequence.
            {
                return (_mod1Length);
            }
            else
            {
                return (_mod2Length);
            }
        }
        else
        {
            return (0);
        }
        // and you said that it need to be short and easy! oh god it wasnt! hope youll enjoy...
    }


/**
 * Q2:
 */

    /**
     * public static void zeroDistance (int[] a) - overiting the array,
     * in every cell that is value is one, the method will write the smallest distance to a "zero cell".
     * 
     * @param      a - the array to be overwrite.
     */
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
    
    /**
     * Time: O(N);
     * Space: O(1);
     */
        
/**
 * Q3.a:
 */
    
    /**
     * public static int spiderman(int n) - the method is counting the ways that spiderman can climb a tower with 'n' floors from the zero floor,
     * spiderman can only climb one floor, or two floors each time.
     * 
     * @param      n - the number of floors in the tower.
     * @return     the number of ways that spiderman can climb the tower.
     */
    public static int spiderman(int n)
    {
        return (spiderman(0, n)); //you have to start from the first floor... calling the spiderman method to count from first floor to the n floor
    }
    
    /**
     * private static int spiderman(int i,int n) - the method is counting the ways that spiderman can climb a tower with 'n' floors from the 'i' floor,
     * spiderman can only climb one floor, or two floors each time.
     * 
     * @param      n - the number of floors in the tower.
     * @param      i - the floor that spiderman start climbing from.
     * @return     the number of ways that spiderman can climb the tower.
     */
    private static int spiderman(int i,int n)
    {
        if (i == n && n != 0) //we reach the last floor
        {
            return (1); //return one to count this way of reaching the last floor, its exectlly adding one recursivly. 
        }
        else if (i < n) //we are not there yet
        {
            return (spiderman(i+1, n) + spiderman(i+2, n)); //continue climbing but send the two options for a check, one is climbing one floor, the other climbing two floors
        }
        else
        {
            return (0); //hey?! hey?! its too high, there is no floor there! so we are getting nowhere and adding zero to the count becouse its no a way to the to the last floor
        }
    }
    
    
 /**
 * Q3.b:
 */
    
    /**
     * public static int spidermanPhoneBooth20(int n) - the method is counting the ways that spiderman can climb a tower with 'n' floors from the zero floor,
     * spiderman can only climb one floor, or two floors each time.
     * if spiderman visit the ELEVATORFLOOR he must to use it and the elevator will take him to the last floor.
     * 
     * final static int ELEVATORFLOOR = 20;
     * 
     * @param      n - the number of floors in the tower.
     * @return     the number of ways that spiderman can climb the tower.
     */
    final static int ELEVATORFLOOR = 20;
    public static int spidermanPhoneBooth20(int n)
    {
       if (n > ELEVATORFLOOR) //if the target floor is above floor ELEVATORFLOOR, there is an option to use the elevtor, so we add it the the counting
       {
           return (spiderman(ELEVATORFLOOR) + spiderman(0, 19) * spiderman(21, n)); // calculate the ways to get to the ELEVATORFLOOR floor, and from there to the last floor, add to this the ways to get to the 19 floor double the ways to get from floor 21 to the last. beacouse there is noother way, if you skip the ELEVATORFLOOR floor its only by this way.
       }
       else if (n < ELEVATORFLOOR) //if we are not reaching the ELEVATORFLOOR floor, we can use the spiderman method
       {
           return (spiderman(n));
       }
       else //there is no other choice, you need to get to the ELEVATORFLOOR floor by using spiderman method
       {
           return (spiderman(ELEVATORFLOOR));
       }
    }
    
 /**
 * Q4:
 */
    
    /**
     * public int numPaths (int[][] mat,int x1, int y1, int x2, int y2) - the method is calculating recursively the number of paths to get from cell (x1,y1) to cell (x2,y2)
     * in a two demeintion array, without returning on cells and crossing the main diagonal. 
     * 
     * @param      mat - the two demeintion array (matrix) that the method is calculating paths on.  
     * @param      x1 - row number od the source cell
     * @param      y1 - col number of the source cell
     * @param      x2 - row number od the target cell
     * @param      y2 - col number of the target cell
     * @return     the number of pathes to get from cell (x1,y1) to cell (x2,y2) without returning on cells and crossing the main diagonal. 
     */
    
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
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the _sum of x and y 
     */
}
