package Learning.CustomArrayList;

import java.util.Arrays;

public class CustomGenericArrayList<T>
{
    private Object arr[];
    private final int DEFAULT_SIZE=10;
    private int size=0;

    CustomGenericArrayList()
    {
        this.arr=new Object[DEFAULT_SIZE];
    }
    public void add(T num)
    {
        if(isFull())
        {
            resize();
        }
        arr[size++]=num;
    }

    private boolean isFull()
    {
        return size == arr.length;
    }
    private void resize()
    {
        Object[] temp =new Object[this.size*2];

        //copying current data into another bigger array.
        for(int i=0;i<size;i++)
            temp[i]=arr[i];

        this.arr=temp;
    }
    public T remove()
    {
        T removed=(T)this.arr[--size];
        this.arr[size]=null;
        return removed;
    }

    public T get(int index)
    {
        return (T)this.arr[index];
    }

    public int size()
    {
        return this.size;
    }
    public void set(int index,T value)
    {
        arr[index]=value;
    }



    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + arr.length +
                '}';
    }

    public static void main(String[] args) {
        CustomGenericArrayList<String> list=new CustomGenericArrayList<>();
        list.add("Vijay");
        list.add("Vijayaadithan");
        list.remove();
        System.out.println(list);
    }
}
