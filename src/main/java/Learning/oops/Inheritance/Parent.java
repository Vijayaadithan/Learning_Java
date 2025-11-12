package Learning.oops.Inheritance;

public class Parent {

    int n;
    double l;
    public Parent()
    {
        this.n=0;
        this.l=0.0;
    }

    public Parent(Parent ob) {
        this.n = ob.n;
        this.l = ob.l;
    }

    public void print()
    {
        System.out.println("Parent");
    }

}
