package Projects.UniversityCourseRegistrationSystem;
import java.util.*;
public class Course
{
    /*Assignment 4: University Course Registration System

        Design a `Person` class with fields: `name`, `email`, `age`. Derive `Student` and `Professor`
        classes. `Student` should have `studentId`, `courseList`; `Professor` should have `subjectTaught`,
`employeeId`. Use encapsulation to manage all fields. Implement methods to register students to a
        course and list them. Simulate registration using a `Course` class.*/

    private String courseName;
    private String courseId;
    private Professor professor;
    private List<Student> enrolledList;

    Course(String courseName,String courseId,Professor professor)
    {
        //checking professor
        if (!courseName.equalsIgnoreCase(professor.getSubjectTaught())) {
            throw new IllegalArgumentException(
                    "Professor " + professor.getName() + " cannot teach " + courseName +
                            ". They specialize in " + professor.getSubjectTaught());}

        this.courseName=courseName;
        this.courseId=courseId;
        this.professor=professor;
        this.enrolledList=new ArrayList<>();
    }

    public String getCourseName()
    {
        return courseName;
    }
    public String getCourseId()
    {
        return courseId;
    }
    public  Professor getProfessor()
    {
        return professor;
    }
    public void enrollStudent(Student student)
    {
        if(!enrolledList.contains(student))
        {
            enrolledList.add(student);
            student.registerCourse(this);
        }
    }
    public void listStudents()
    {
        if(enrolledList.size()==0)
        {
            System.out.print("No Students enrolled for this Course "+this.courseName);
        }
        else
        {
            System.out.println("Students enrolled in the Course "+this.courseName+" :");
            for(Student student:enrolledList)
            {
                System.out.println("- "+student.getName()+" ("+student.getStudId()+")");
            }
        }
    }

}
