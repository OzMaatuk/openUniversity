public class Q8
{
    public static void main (String [] args)
    {
        A a = (A) new B();
        A aa = new A();
        A ab = new B();
        //B ba = new A();
        B bb = new B();
        aa.yosef();
        ab.yosef();
        bb.yosef();
        ((A) aa).yosef();
        ((A) bb).yosef();
        //((A) bb).superYosef();
        //((B) aa).yosef();
        //((B) aa).superYosef();
        ((B) ab).superYosef();
        ((B) bb).superYosef();
    }
}
