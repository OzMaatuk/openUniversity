/*
 * Time: O(N);
 * Place: O(1);
 */
public class Q3
{
    public IntList addNumber (int num, int position)
    {
        IntNode newNode = newNode(num, null);
        IntNode pointer = _head;
        IntNode tmp = _head;
        if (position == 1)
        {
            newNode.setNext(pointer);
        }
        pointer = pointer.getNext();
        position--;
        while ((pointer != null) && (position > 1))
        {
            pointer = pointer.getNext();
            tmp = tmp.getNext();
            position--;
        }
        if (position == 1)
        {
            newNode.setNext(pointer);
            tmp.setNext(newNode);
        }
        if (pointer == null)
        {
            return null;
        }
        while (pointer != null)
        {
            if (pointer.getValue() > num)
            {
                newNode.setHowManyBig(newNode.getHowManyBig()+1);
            }
        }
    }
}
