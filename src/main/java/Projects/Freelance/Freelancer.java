package Projects.Freelance;

import java.util.ArrayList;
import java.util.List;

public class Freelancer extends User {

    public List<Project> assignedprojects;
    private double earnings = 0.0;

    public Freelancer(String name, String email) {
        super(name, email);
        this.assignedprojects=new ArrayList<>();

    }

    public void acceptProject(Project project) {
        if (project.getStatus().equals("OPEN")) {
            project.assignFreelancer(this);
            assignedprojects.add(project);
            System.out.println("Freelancer " + this.getName() + " Accepted the project " + project.getTitle());
        } else {
            System.out.println("This Project is not open for assignment");
        }
    }

    public void completeProject(Project project) {
        if (assignedprojects.contains(project)) {
            project.completeProject();
            this.earnings += project.getBudget();
            System.out.println("Freelancer " + this.getName() + " Completed the project " + project.getTitle());
        } else {
            System.out.println("Cannot complete this project");
        }
    }

    public List<Project> getAssignedProjects() {
        return assignedprojects;
    }

    public double getEarnings()
    {
        return earnings;
    }


    @Override
    public void getInfo()
    {
        System.out.println("Name of the User :"+this.getName()+"    Email : "+this.getEmail());
    }
}

