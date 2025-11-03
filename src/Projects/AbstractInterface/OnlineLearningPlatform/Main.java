package Projects.AbstractInterface.OnlineLearningPlatform;

public class Main
{
    public static void main(String[] args) {
        Course c1=new ProgrammingCourse("Jave","1hr");
        ((CertificateProvider)c1).generateCertificate("Vijay");
        c1.enrollStudent("Vijay");
        c1.startCourse();

        c1=new DesignCourse("Graphics","1hr");
        ((CertificateProvider)c1).generateCertificate("Vijay");
        c1.enrollStudent("Vijay");
        c1.startCourse();


    }
}
