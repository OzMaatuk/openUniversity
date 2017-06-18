public class Q2
{
    public Element shita(Element list1, Element list2)
    {
        int max = 0;
        Element save = null;
        while (list1 != null && list2 != null)
        {
            while (list1.getNumber() != list2.getNumber())
            {
                if (list1.getNumber() > list2.getNumber())
                {
                    list2 = list2.getNextElement();
                }
                else
                {
                    list1 = list1.getNextElement();
                }
            }
            int count = 0;
            Element remember = list1;
            while (list1.getNumber() != list2.getNumber())
            {
                count++;
            }
            if (count > max)
            {
                max = count;
                save = remember;
            }
        }
        Element remember = new Element(max);
        remember.setNextElement(save);
        return remember;
    }
}
