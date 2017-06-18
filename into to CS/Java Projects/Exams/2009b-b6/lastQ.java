public class lastQ
{
    public static void main()
    {
        First f1 = new First (10);
        System.out.println ("sum1 = " + f1.sum());
        System.out.println ("count = " + First.getCount());
        First f3 = new First (10, 20);
        System.out.println ("count = " + f3.getCount());
        Second s1 = new Second (1);
        First f4 = new Second (2);
        System.out.println ("count = " + f4.getCount());
        f3 = s1;
        System.out.println ("sum = " + f3.sum());
        //f3.setNum3 (2);
        //f4.setNum3 (2);
        s1.setNum3 (2);
        System.out.println ("sum = " + s1.sum());
        //s1 = f3;
        //s1 = f4;
        System.out.println ("sum = " + s1.sum());
    }
}
