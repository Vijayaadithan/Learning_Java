package Learning.oops.Interface;

interface Engine {
    default void start() {
        System.out.println("Engine starting...");
    }
}

interface Speaker {
    default void start() {
        System.out.println("Speaker starting...");
    }
}

class Car implements Engine, Speaker {
    @Override
    public void start() {
        Engine.super.start();   // ✅ picks Engine’s version
        Speaker.super.start();  // ✅ picks Speaker’s version
        System.out.println("Car starting...");
    }
}


public class Interface
{
    public static void main(String[] args)
    {
        Car a =new Car();
        a.start();
    }

}