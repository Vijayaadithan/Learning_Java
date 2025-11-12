package Learning.PriorityQueueComparatorInterface;

import java.util.PriorityQueue;

public class Main

{
    public static void main(String[] args)
    {
        //This will print descending order
        PriorityQueue<Integer> a =new PriorityQueue<>(new CustomClass());
        a.offer(1);
        a.offer(10);
        a.offer(67);
        a.offer(54);

        while(!a.isEmpty())
        {
            System.out.println(a.poll());
        }

    }
}
