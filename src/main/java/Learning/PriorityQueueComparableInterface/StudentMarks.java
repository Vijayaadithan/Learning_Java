package Learning.PriorityQueueComparableInterface;

public class StudentMarks implements Comparable<StudentMarks>
{

    private int maths;
    private int science;

    public StudentMarks(int maths,int science)
    {
        this.maths=maths;
        this.science=science;
    }

    public int getScience() {
        return science;
    }

    public int getMaths() {
        return maths;
    }

    @Override
    public int compareTo(StudentMarks o)
    {
       /* if(this.maths<o.maths)
            return -1;
        else if(this.maths>o.maths)
            return 1;
        else
            return 0;

        this will return Minimum maths marks first


        */
        if(this.maths<o.maths)
            return 1;
        else if(this.maths>o.maths)
            return -1;
        else
            return 0;
        //This return maximum maths marks first

    }
}
