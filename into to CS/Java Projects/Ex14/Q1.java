
public class Q1
{
    public Q1()
    {
        int[] a = new int[] {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1};
        //int[] a = new int[] {0, 1, 4, 3};
        //int[] a = new int[] {1, 2, 3, 4, 5, 1};
        //int[] a = new int[] {3, 5, 1, 1, 1, 1, 0, 0, 0, 2, 5, 5, 7, 7, 2, 0};
        //int[] a = new int[] {3, 5, 1, 1, 1, 1, 0, 0, 0, 2, 5, 5, 7, 7, 2, 0, 1};
        System.out.println(what(a));
        System.out.println(q1(a));
    }
    
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


private static int f (int[]a, int low, int high)
{
int res = 0;
for (int i=low; i<=high; i++)
res += a[i];
return res;
}
public static int q1 (int []a)
{
int temp = 0;
for (int i=0; i<a.length; i++)
{
for (int j=i; j<a.length; j++)
{
int c = f(a, i, j);
if (c%3 == 0)
{
if (j-i+1 > temp)
temp = j-i+1;
}
}
}
return temp;
}

}
