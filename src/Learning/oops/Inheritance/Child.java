package Learning.oops.Inheritance;

public class Child extends Parent
{

    public Child()
    {
        super();
    }

    public Child(Child ob)
    {
        super(ob);
    }

    public void print()
    {
        System.out.println("Child");
    }

}
