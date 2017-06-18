public class Nat
{
    private Nat _pre;
    
    public Nat()
    {
        _pre = null;
    }

    public Nat(Nat pre)
    {
        _pre = pre;
    }

    public boolean isZero ()
    {
        if (_pre == null)
            return true;
        else
            return false;
    }

    public Nat succ()
    {
        return new Nat(this);
    }
    
    public boolean equals(Nat other)
    {
        return (equals(_pre, other));
    }
    
    public boolean equals(Nat head, Nat other)
    {
        if ((head._pre != null) && (other._pre != null))
        {
            head = head._pre;
            other = other._pre;
            return equals(head, other);
        }
        else
        {
            if ((head._pre == null) && (other._pre == null))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public Nat plus(Nat other)
    {
        return plus(other, other);
    }
    
    public Nat plus(Nat head, Nat other)
    {
        if (other == null)
        {
            return null;
        }
        else if (other._pre == null)
        {
            other = new Nat(this);
            return head;
        }
        else
        {
            return plus(head, other._pre);
        }
    }
}