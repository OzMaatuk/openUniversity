public class Q2
{
    public boolean firstFit(int n)
    {
        if (_start == null)
        {
            return false
        }
        DataNode pointer = _start;
        while (pointer != null)
        {
            if ((pointer.getSize() >= n) && (pointer.getFree()))
            {
                if (pointer.getSize() == n)
                {
                    pointer.setFree(false);
                    return true;
                }
                else
                {
                    DataNode extra = new DataNode(pointer.getSize() - n);
                    extra.setNext(pointer.getNext());
                    pointer.setSize(n);
                    pointer.setNext(extra);
                    pointer.setFree(false);
                    return true;
                }
                pointer = pointer.getNext();
            }
        }
        return false;
    }
}
