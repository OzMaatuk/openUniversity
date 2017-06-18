public class IntList
{
    private IntNode _head;
    
    public IntList( )
    {
        _head = null;
    }

    public IntList (IntNode node)
    {
        _head = node;
    }
    
    public int longestAscending ()
    {
        if (_head == null)
        {
            return 0;
        }
        else
        {
            IntNode pointer = getStart(_head);
            if (pointer == null)
            {
                return 0;
            }
            else
            {
                return (1+ longestAscending(pointer.getNext(), pointer.getValue()));
            }
        }
    }
    
    public int longestAscending (IntNode pointer, int lastValue)
    {
        if (pointer != null)
        {
            if (pointer.getValue() > lastValue)
            {
                return (1 + longestAscending(pointer.getNext(), pointer.getValue()));
            }
            else
            {
                return longestAscending(pointer.getNext(), pointer.getValue());
            }
        }
        else
        {
            return 0;
        }
    }
    
    public IntNode getStart(IntNode pointer)
    {
        if (pointer == null)
        {
            return null;
        }
        else
        {
            if (pointer.getNext() != null)
            {
                if (pointer.getValue() >= pointer.getNext().getValue())
                {
                    pointer = pointer.getNext();
                    return getStart(pointer);
                }
                else
                {
                    return pointer;
                }
            }
            else
            {
                return null;
            }
        }
    }
}