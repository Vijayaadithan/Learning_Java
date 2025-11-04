package Projects.Freelance;

public class Payment
{
    private Project project;
    private double amount;
    private String status;//PENDING, PAID

    public Payment(Project project,double budget)
    {
        this.amount=budget;
        this.project=project;
        this.status="PENDING";
    }
    public void processPayment()
    {
        this.status="PAID";
        System.out.println("💸 Payment of $" + amount + " processed for project: " + project.getTitle());
    }

    public String getStatus()
    {
        return this.status;
    }
}
