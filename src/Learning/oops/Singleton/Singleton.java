package Learning.oops.Singleton;

public class Singleton
{
    //making constructor private to not allowing to create any object
    //can be only called within this class
     String name;
    private Singleton()
    {

    }

    private static Singleton ob;//cannot create object so static

    public static Singleton getInstance()
    {
        if(ob==null)
        {
            //creates object only one time
            ob=new Singleton();

        }
        return ob;
    }


}
