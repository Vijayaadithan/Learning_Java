package Learning.oops.Interface;


interface Engine1 {
    default void start() {
        System.out.println("Engine starting...");
    }
}

interface Speaker1 {
    void start(); // abstract
}

class Car1 implements Engine1, Speaker1 {
    @Override
    public void start()
    {
        Engine1.super.start();
        System.out.println("Car starting...");
    }
}


public class Interface2
{
    public static void main(String[] args)
    {
        Car1 a =new Car1();
        a.start();
    }
}
