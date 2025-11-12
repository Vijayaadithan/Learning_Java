package Learning.PriorityQueueComparatorInterface;

import java.util.PriorityQueue;

public class AscendingOnlyExample
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> a =new PriorityQueue<>();
        a.offer(1);
        a.offer(10);
        a.offer(67);
        a.offer(54);

        while(!a.isEmpty())
        {
            System.out.println(a.poll());
        }

        //prints only Ascending we cant do anything to print it descending

    }
}
