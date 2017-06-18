public class IntListTwo
{
    private IntNodeTwo _head, _tail;
    public IntListTwo()
    {
        _head = null;
        _tail = null;
    }

    public IntListTwo(IntNodeTwo node)
    {
        _head = node;
        _tail = node;
        while (_tail.getNext() != null)
            _tail = _tail.getNext();
    }

    public IntListTwo something1()
    {
        IntNodeTwo t = _tail;
        while (t!=null)
        {
            if (t.getNum() < 9)
            {
                t.setNum(t.getNum()+1);
                return new IntListTwo(_head);
            }
            else
            {
                t.setNum(0);
                t = t.getPrev();
            }
        }
        IntNodeTwo temp = new IntNodeTwo(1, _head, null);
        _head.setPrev(temp);
        _head = temp;
        return new IntListTwo(_head);
    }

    public long something2()
    {
        long num = 0;
        IntNodeTwo curr = _head;
        while (curr != null)
        {
            num = num * 10 + curr.getNum();
            curr = curr.getNext();
        }
        return num;
}
}