package Learning.PriorityQueueComparableInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main
{
    public static void main(String[] args)
    {
        StudentMarks s1=new StudentMarks(100,90);
        StudentMarks s2=new StudentMarks(10,90);
        StudentMarks s3=new StudentMarks(50,90);
        StudentMarks s4=new StudentMarks(40,90);
        StudentMarks s5=new StudentMarks(90,90);
        PriorityQueue<StudentMarks> a=new PriorityQueue<>();
        a.offer(s1);
        a.offer(s2);
        a.offer(s3);
        a.offer(s4);
        a.offer(s5);

        List<StudentMarks> topTwo = new ArrayList<>();
        int index=0;
        while(!a.isEmpty())
        {
            if(index==2)
                break;
            topTwo.add(a.poll());
            index++;
        }
        for(StudentMarks i:topTwo)
        System.out.println(i.getMaths());



    }
}
