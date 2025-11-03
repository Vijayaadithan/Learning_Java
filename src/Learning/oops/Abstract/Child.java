package Learning.oops.Abstract;

public class Child extends Abstract
{

    public Child(int n)
    {
        super(n);
    }

    @Override
    void showN() {
        System.out.println(n);
    }
}



