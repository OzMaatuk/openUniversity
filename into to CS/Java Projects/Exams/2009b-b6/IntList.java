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

    public IntList selectionSort()
    {
        voidselectionSort(_head, null);
        return this;
    }

    public void voidselectionSort(IntNode pointer, IntNode prev)
    {
        if (pointer == null)
        {
            IntNode prevMax = findPrevMax(pointer, pointer, null ,null);
            IntNode tmp = prevMax;
            tmp = tmp.getNext().getNext();
            IntNode Max = prevMax.getNext();
            prevMax.setNext(tmp);
            Max.setNext(pointer);
            if (prev != null)
            {
                prev.setNext(Max);
            }
            voidselectionSort(pointer.getNext(), prev.getNext().getNext());
            if (prev == null)
            {
                _head = Max;
            }
        }
    }

    private IntNode findPrevMax(IntNode pointer, IntNode Max, IntNode prevMax, IntNode prev)
    {
        if (pointer != null)
        {
            if (pointer.getValue() > Max.getValue())
            {
                Max = pointer;
                prevMax = prev;
            }
            prev = pointer;
            pointer = pointer.getNext();
            return findPrevMax(pointer, Max, prevMax, prev);
        }
        else
        {
            return (prevMax);
        }
    }
}