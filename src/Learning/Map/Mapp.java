package Learning.Map;

import java.util.*;

public class Mapp
{
    public static void main(String[] args)
    {

        Map <Integer,String> map=new HashMap<>();
        map.put(1,"Vijay");
        map.put(2,"rd");
        map.put(3,"kolukatta");
        map.put(4,"Kuttiii rd");
        map.put(5,"Suma");

        map.remove(5);
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("rd"));


        //traverse

        Set<Map.Entry<Integer,String>>entrySet=map.entrySet();

        for(Map.Entry<Integer,String> entry: entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


        //Keys alone

        Set<Integer> keys=map.keySet();
        for(Integer key:keys)
        {
            System.out.println(key+" : "+map.get(key));
        }
    }
}
