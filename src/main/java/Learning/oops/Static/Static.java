package Learning.oops.Static;

class Parent {
    static void show() {
        System.out.println("Parent's static method");
    }
}

class Child extends Parent {
    static void show() { // hides, not overrides
        System.out.println("Child's static method");
    }
}

public class Static
{
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Child c = new Child();

        p1.show(); // Parent's static method
        p2.show(); // Parent's static method (because reference is Parent)
        c.show();  // Child's static method
    }
}
