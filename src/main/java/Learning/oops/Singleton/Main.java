package Learning.oops.Singleton;

public class Main
{
    public static void main(String[] args)
    {
        Singleton obj1=Singleton.getInstance();

        Singleton ob2=Singleton.getInstance();
       //both point to single object
        obj1=Singleton.getInstance();
       obj1.name="vijay";


    }
}
