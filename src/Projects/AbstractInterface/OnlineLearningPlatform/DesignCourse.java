package Projects.AbstractInterface.OnlineLearningPlatform;

public class DesignCourse extends Course implements CertificateProvider
{
    public DesignCourse(String courseName, String duration)
    {
        super(courseName,duration);
    }

    @Override
    public void enrollStudent(String studentName)
    {
        System.out.println("Enrolling "+studentName+" in"+this.getCourseName()+" Design Course");
    }
    @Override
    public void startCourse()
    {
        System.out.println("Starting "+this.getCourseName()+" Design Course");
    }

    @Override
    public void generateCertificate(String studentName)
    {
        System.out.println("Certificate Generated for "+studentName+" in"+this.getCourseName()+" Design Course");
    }





}
