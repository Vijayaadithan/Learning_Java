package Projects.UniversityCourseRegistrationSystem;

public class Professor extends Person
{
    /*Assignment 4: University Course Registration System

        Design a `Person` class with fields: `name`, `email`, `age`. Derive `Student` and `Professor`
        classes. `Student` should have `studentId`, `courseList`; `Professor` should have `subjectTaught`,
`employeeId`. Use encapsulation to manage all fields. Implement methods to register students to a
        course and list them. Simulate registration using a `Course` class.*/
    private String subjectTaught;
    private String empId;

    Professor(String name,String email,int age,String subjectTaught,String empId)
    {
        super(name,email,age);
        this.subjectTaught=subjectTaught;
        this.empId=empId;
    }
    public String getSubjectTaught()
    {
        return subjectTaught;
    }
    public String getEmpId()
    {
        return empId;
    }

}
