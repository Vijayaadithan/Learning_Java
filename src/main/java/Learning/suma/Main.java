package Learning.suma;
class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    @Override
    void display() {
        //super.display(); // calls A's method
        System.out.println("Class B");
    }
}



class D extends B  {

}

public class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
