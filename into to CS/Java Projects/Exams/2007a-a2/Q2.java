public class Q2
{   
   private int []_arr;
    
   public Q2(int size)
   {
       _arr= new int[size];
   }
    
   public Q2()
   {
       _arr= new int[]{};
   }
    
    /**
    * a.) השיטה מחזיקה כמה מספרים מופיעים המערך יותר מפעם אחת
    * b.) Time: O(N^2);
    *     Place: O(1);
    * 
    * d.) Time: O(NLog(N));
    *     Place: O(1);
    *     
    * c.)
    */
   
   public int what()
   {
       boolean check = false;
       int counter = 0;
       //quickSort(_arr); - nLog(n);
       for (int i=0; i<_arr.length-1; i++)
       {
           if ((_arr[i] == _arr[i+1]) && (!check))
           {
               counter++;
               check = true;
            }
            else if (check)
            {
                check = false;
            }
       }
       return counter;
   }
}
