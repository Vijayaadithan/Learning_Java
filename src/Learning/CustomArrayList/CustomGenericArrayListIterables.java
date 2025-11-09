package Learning.CustomArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class CustomGenericArrayListIterables<T>implements Iterable<T>
{
    private Object arr[];
    private final int DEFAULT_SIZE=10;
    private int size=0;

    CustomGenericArrayListIterables()
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

    @Override
    public Iterator<T> iterator()
    {
        return new OurGenericIterator(this);
    }
    private class OurGenericIterator implements Iterator<T>
    {
        private CustomGenericArrayListIterables <T>list;
        private int index=0;
        public OurGenericIterator(CustomGenericArrayListIterables<T> list)
        {
            this.list=list;
        }

        @Override
        public boolean hasNext() {
            return index<list.size;
        }

        @Override
        public T next() {
            return (T)list.arr[index++];
        }
    }
}
