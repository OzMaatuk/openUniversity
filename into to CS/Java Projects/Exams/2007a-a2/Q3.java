/*
 * Time: O(nLog(n));
 * Place: O(1);
 */
public class Q3
{
    public boolean isSubset (IntList other)
    {
        IntList pointer = _head;
        quickSort(pointer); // O(nLog(n));
        boolean found = true;
        while (other != null && found)
        {
            found = pointer.binarySearch(other.getValue()); // O(Log(n));
            if (found)
            {
                other = other.getNext();
            }
        }
        return found;
    }
}
