package Projects.UniversityCourseRegistrationSystem;
import java.util.*;

public class Student extends Person
{
    /*Assignment 4: University Course Registration System

        Design a `Person` class with fields: `name`, `email`, `age`. Derive `Student` and `Professor`
        classes. `Student` should have `studentId`, `courseList`; `Professor` should have `subjectTaught`,
`employeeId`. Use encapsulation to manage all fields. Implement methods to register students to a
        course and list them. Simulate registration using a `Course` class.*/

    private String studId;
    private List<Course> courseList ;

    Student(String name,String email,int age,String studId)
    {
        super(name,email,age);

        this.studId=studId;
        this.courseList=new ArrayList<>();
    }

    public String getStudId()
    {
        return studId;
    }
    public List<Course> getCourseList()
    {
        return courseList;
    }

    public void registerCourse(Course course)
    {
        if(!this.courseList.contains(course))
        {
            this.courseList.add(course);
            course.enrollStudent(this);
        }
    }

}
