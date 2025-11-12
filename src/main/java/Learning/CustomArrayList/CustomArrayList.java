package Learning.CustomArrayList;

import java.util.Arrays;

public class CustomArrayList
{
    private int arr[];
    private final int DEFAULT_SIZE=10;
    private int size=0;

    CustomArrayList()
    {
        this.arr=new int[DEFAULT_SIZE];
    }
    public void add(int num)
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
        int[] temp =new int[this.size*2];

        //copying current data into another bigger array.
        for(int i=0;i<size;i++)
            temp[i]=arr[i];

        this.arr=temp;
    }
    public int remove()
    {
        int removed=this.arr[--size];
        return removed;
    }

    public int get(int index)
    {
        return this.arr[index];
    }

    public int size()
    {
        return this.size;
    }
    public void set(int index,int value)
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
        CustomArrayList list=new CustomArrayList();
        list.add(10);
        list.remove();
        System.out.println(list);
    }
}
