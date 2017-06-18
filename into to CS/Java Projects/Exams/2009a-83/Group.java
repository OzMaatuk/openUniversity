public class Group
{
    public final int MAX_STUDENTS = 400;
    private Student[] _stud;
    private int _noOfStud;

    public Group()
    {
        _stud = new Students[MAX_STUDENTS];
    }

    public Student[] getStudents() {}

    public int getNoOfStudents() {}

    public void remove (String name, int d, int m, int y){}

    public Student[] sort() {}

    public String toString() {}

    public void add (String name, int day, int month, int year) // Time: O(nLog(n)); Place: O(1);
    {
        if (!(getNoOfStudents() >= MAX_STUDENTS))
        {
            Student s = new Student(name, day, mounth, year);
            int place = 0;
            if (Check(s))
            {
                place = binary (_stu, s.getName());
                for (int i = getNoOfStudents(); i>place; i--)
                {
                    _stu[i] = _stu[i-1];
                }
                _stu[place] = s;
            }
        }
    }

    private boolean Check(Student s)
    {

    }

    private int binary (Student[ ] data, String name) // Time: O(nLog(n)); Place: O(1);
    {
        int middle, lower = 0, upper = (getNoOfStudents() - 1);
        do
        {
            middle = ((lower + upper) / 2);
            if (!isBigger(name,data[middle].getName()))
                upper = middle - 1;
            else lower = middle + 1;
        }   while ( (data[middle].getName() != name) && (lower <= upper) );
        
        return middle;
    } // binary search
    
    private boolean isBigger(String name1, String name2) // Time: O(n); Place: O(1);
    {
        int i = 0;
        int max = Math.abs(name1.length() - name2.length);
        while ((i <= max) && (name1[i] == name2[i]))
        {
            i++;
        }
        if (i == max)
        {
            if (name1.length() > name2.length())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            if (name1[i] > name2[i])
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public int howManyMonths() // Time: O(n); Place: O(1);
    {
        boolean[] 12Mounts = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};
        for (int i = 0; i < getNoOfStudents(); i++)
        {
            if (!12Mounts[_stu[i].getBirthday().getMonth())
            {
                12Mounts[_stu[i].getBirthday().getMonth() = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 12; i++)
        {
            if (!12Mounts[i])
            {
                count++
            }
        }
        return count;
    }
    
    public boolean biggerThan (int num) // Time: O(n); Place: O(1);
    {
        Date Max = new Date(_stu[0].getBirthday());
        Date Min = new Date(_stu[0].getBirthday());
        for (int i = 1; i < getNoOfStudents(); i++
        {
            if (Max.befor(_stu[i].getBirthday())
            {
                Max = _stu[i].getBirthday();
            }
            if (Min.after(_stu[i].getBirthday())
            {
                Min = _stu[i].getBirthday();
            }
        }
        if (Max.difference(Min) >= num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
