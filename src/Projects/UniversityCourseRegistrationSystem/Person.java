package Projects.UniversityCourseRegistrationSystem;

public class Person
{

    /*Assignment 4: University Course Registration System

        Design a `Person` class with fields: `name`, `email`, `age`. Derive `Student` and `Professor`
        classes. `Student` should have `studentId`, `courseList`; `Professor` should have `subjectTaught`,
`employeeId`. Use encapsulation to manage all fields. Implement methods to register students to a
        course and list them. Simulate registration using a `Course` class.*/


    private String name;
    private String email;
    private int age;

    Person(String name,String email,int age)
    {
        this.name=name;
        this.email=email;
        this.age=age;
    }
    //Encapsulation
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public int getAge()
    {
        return this.age;
    }

}
