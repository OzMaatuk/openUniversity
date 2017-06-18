public class Q2
{
    private IntNode _head;
    public Q2()
    {
        _head = null;
    }

    public Q2 (IntNode node)
    {
        _head = node;
    }
    
    public boolean isPalindrome()
    {
        if (_head == null)
        {
            return false;
        }
        int length = 0;
        IntNode pointer1 = _head;
        
        while (pointer1 != null)
        {
            length++;
            pointer1 = pointer1.getNext();
        }
        
        pointer1 = _head;
        length = length / 2;
        IntNode pointer2 = _head;
        
        for (int i = 0; i < length; i++)
        {
            pointer2 = pointer2.getNext();
        }
        
        boolean equals = true;
        
        while ((length > 0) && (equals))
        {
            if (pointer1.getValue() == pointer2.getValue())
            {
                length--;
            }
            else
            {
                equals = false;
            }
        }
        
        return equals;
    }
}