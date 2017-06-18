public class CharList
{
    private CharNode _head;

    public CharList( )
    {
        _head = null;
    }

    public static void main()
    {
        CharNode list1 = new CharNode('d', null);
        CharNode tmp = new CharNode('c', null);
        tmp.setNext(list1);
        list1 = new CharNode('b', null);
        list1.setNext(tmp);
        tmp = new CharNode('b', null);
        tmp.setNext(list1);
        list1 = new CharNode('a', null);
        list1.setNext(tmp);

        CharNode list2 = new CharNode('d', null);
        tmp = new CharNode('c', null);
        tmp.setNext(list2);
        list2 = new CharNode('c', null);
        list2.setNext(tmp);
        tmp = new CharNode('b', null);
        tmp.setNext(list2);
        list2 = new CharNode('b', null);
        list2.setNext(tmp);
        tmp = new CharNode('b', null);
        tmp.setNext(list2);
        list2 = new CharNode('a', null);
        list2.setNext(tmp);

        System.out.print(isTrans(list1, list2, ' '));
    }

    public static boolean isTrans(CharList llist1, CharList llist2)
    {
        CharNode list1 = llist1._head;
        CharNode list2 = llist2._head;
        return isTrans(list1, list2, ' ');
    }

    public static boolean isTrans(CharNode list1, CharNode list2, char c)
    {
        if ((list1 == null) && (list2 == null))
        {
            return true;
        }
        else if (list1 == null)
        {
            if (list2.getValue() == c)
            {
                return isTrans(list1, list2.getNext(), c);
            }
            else
            {
                return false;
            }
        }
        else if (list2 == null)
        {
            return false;
        }
        else
        {
            if (list2.getValue() == c)
            {
                if (list1.getValue() == list2.getValue())
                {
                    c = list1.getValue();
                    return isTrans(list1.getNext(), list2.getNext(), c) || isTrans(list1, list2.getNext(), c);
                }
                return isTrans(list1, list2.getNext(), c);
            }
            else if (list1.getValue() == list2.getValue())
                {
                    c = list1.getValue();
                    return isTrans(list1.getNext(), list2.getNext(), c);
                }
            else
            {
                return false;
            }
        }
    }
}