public class Q2
{
    private CharNode _head;
    public Q2() {
        _head = null;
    }

    public Q2(CharNode node){
        _head = node;
    }

    public boolean parentheses()
    {
        return parentheses(_head, 0);
    }
    
    public boolean parentheses(CharNode pointer, int sum)
    {
        if (sum < 0)
        {
            return false;
        }
        if (pointer.getData() == ')')
        {
            sum--;
        }
        if (pointer.getData() == '(')
        {
            sum++;
        }
        if (pointer == null)
        {
            if (sum != 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        pointer = pointer.getNext();
        return parentheses(pointer, sum);
    }
}