package Learning.oops.Interface;


interface Shape
{
    static void print()
    {
        System.out.println("I'm Static");
    }
}

class Demo implements Shape
{
    static void print()
    {
        System.out.println("I'm Static 2");
    }

}


public class Main {
    public static void main(String[] args)
    {
        Shape a=new Demo();
        Shape.print();
        
    }
}
