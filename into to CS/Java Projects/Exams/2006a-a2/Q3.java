public class Q3
{
    private int num;
    private Q3 next;
    
    public Q3()
    {
        num = 0;
        next = null;
    }
    
    public Q3(int x)
    {
        if ((x%2) == 0)
        {
            num = x;
            next = null;
        }
    }
    
    public Q3(int x, Q3 node)
    {
        num = x;
        next = node;
    }
    
    public Q3(Q3 other)
    {
        num = other.getNum();
        next = other.getNext();
    }
    
    public int getNum()
    {
        return (num);
    }
    
    public Q3 getNext()
    {
        return (next);
    }
    
    public void setNum(int x)
    {
        if ((x%2)==0)
        {
            num = x;
        }
    }
    
    public void setNext(Q3 other)
    {
        next = other;
    }
    
    
}

