package Learning.CustomArrayList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomGenericArrayListIterables<Integer>list=new CustomGenericArrayListIterables<>();
        list.add(5);
        list.add(6);

//        Iterator<Integer>iterator=list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
        for(int x:list)
        {
            System.out.println(x);
        }
    }
}
