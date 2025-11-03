package Projects.AbstractInterface.OnlineLearningPlatform;

public abstract class Course
{

    private String courseName;
    private String duration;

    public Course(String courseName,String duration)
    {
        this.courseName=courseName;
        this.duration=duration;
    }
    public String getCourseName()
    {
        return this.courseName;
    }
    public String getDuration()
    {
        return this.duration;
    }

    abstract void enrollStudent(String studentName);
    abstract void startCourse();


}
