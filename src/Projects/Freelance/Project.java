package Projects.Freelance;

public class Project
{
    private int projectId;
    private String status;
    private String description;
    private String title;
    private Client client;
    private Freelancer freelancer;
    private double budget;
    private Payment payment;

    public Project(int projectId,String title,String description,double budget)
    {
        this.status="OPEN";
        this.title=title;
        this.description=description;
        this.projectId=projectId;
        this.budget=budget;
    }
    public String getTitle()
    {
        return this.title;
    }
    public String getStatus()
    {
        return this.status;
    }

    public double getBudget() {
        return budget;
    }
    public Freelancer getFreelancer()
    {
        return freelancer;
    }

    public void assignFreelancer(Freelancer freelancer)
    {
        this.status="IN_PROGRESS";
        this.freelancer=freelancer;
        System.out.println("Freelancer "  + freelancer.getName() + " assigned to project " + this.title);
    }
    public void completeProject()
    {
        this.status="COMPLETED";
        this.payment=new Payment(this,this.budget);
        System.out.println("🎉 Project '" + title + "' marked as completed.");
    }

    public Payment getPayment() {
        return payment;
    }
}
