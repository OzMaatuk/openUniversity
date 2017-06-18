public class Q2
{
    private IntNode _head;
    public Q2( )
    {
        _head = null;
    }

    public Q2 (IntNode node)
    {
        _head = node;
    }

    public IntNode getHead () 
    {
        return _head;
    }

    public IntNode findMaxSuffix (IntNode other)
    {
        IntNode pointer1 = this.getHead();
        IntNode pointer2 = other;
        int length1 = 0;
        int length2 = 0;
        while (pointer1 != null)
        {
            length1++;
        }
        while (pointer2 != null)
        {
            length2++;
        }
        pointer1 = this.getHead();
        pointer2 = other;
        
        if (length1 > length2)
        {
            while (length1 > length2)
            {
                length1--;
                pointer1 = pointer1.getNext();
            }
        }
        else
        {
            while (length2 > length1)
            {
                length2--;
                pointer2 = pointer2.getNext();
            }
        }
        
        IntNode ans = pointer1;
        while ((pointer1 != null) && (pointer2 != null))
        {
            if (pointer1.getValue() == pointer2.getValue())
            {
                pointer1 = pointer1.getNext();
                pointer2 = pointer2.getNext();
            }
            else
            {
                pointer1 = pointer1.getNext();
                pointer2 = pointer2.getNext();
                ans = pointer1.getNext();
            }
        }
        
        return ans;
    }
}
