package Projects.Freelance;

public class Main
{
    public static void main(String[] args)
    {
        Client client=new Client("Vijayaadithan","vijayaadithan.bk@gmail.com");
        Freelancer freelancer=new Freelancer("rd","rd@gmail.com");

        Project project=client.postProject(1, "Build a Portfolio Website",
                "Need a React-based portfolio site with 3 pages", 500.0);
        freelancer.acceptProject(project);
        freelancer.completeProject(project);
        project.getPayment().processPayment();
        System.out.println(project.getStatus());


    }
}
