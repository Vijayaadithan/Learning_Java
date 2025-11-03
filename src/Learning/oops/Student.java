package Learning.oops;
//import Learning.oops.staticexample.*;

public class Student
{
    static class Inner
    {
        String name;
        public Inner(String name)
        {
            this.name=name;
        }
    }

    public static void main(String[] args) {
//        Student s1=new Student();
//        Student.Inner a=s1.new Inner("Vijay");
        Inner a=new Inner("vijay");
        //Human h1=new Human(4,"vijay",3);


    }


}