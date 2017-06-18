public class StudList
{
    private StudentNode _head;
    private int _noOfStud;
    public StudList( ) {}

    public StudList(StudentNode s) {}

    public StudentNode getStudents() {}

    public int getNoOfStudents() {}

    public void add (String name, int d, int m, int y){}

    public void remove (String name, int d, int m, int y){}

    public StudentList sort() {}
    
    public int maxDaysWithoutBirthdays() // Time: O(nLog(n)); Place: O(1);
    {
        sort(this);
        maxDaysWithoutBirthdays(_head, 0);
    }
    
    public int maxDaysWithoutBirthdays(StudentNode pointer, int max)
    {
        if (pointer.getNext() != null)
        {
            StudentNode nextPointer = pointer.getNext();
            int dis = pointer.getSudent().getBirthday().difference(nextPointer.getSudent().getBirthday());
            if (max < dis)
            {
                max = dis;
            }
            return maxDaysWithoutBirthdays(nextPointer, max);
        }
        else
        {
            int dis = pointer.getSudent().getBirthday().difference(_head.getSudent().getBirthday());
            if (max < dis)
            {
                max = dis;
            }
            return max;
        }
    }
}