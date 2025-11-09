package Learning.PriorityQueueComparatorInterface;

import java.util.PriorityQueue;

public class WithoutCustomClassDescending
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> a =new PriorityQueue<>((a1,b1)->b1-a1);
//        PriorityQueue<Integer> a =new PriorityQueue<>((a1,b1)->{
//            System.out.println("Lambda Functions");
//            return b1-a1;
//        });
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
