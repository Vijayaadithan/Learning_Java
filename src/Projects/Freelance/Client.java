package Projects.Freelance;

import java.util.ArrayList;
import java.util.List;

public class Client extends User
{

    private List<Project> postedprojects;

    public Client(String name,String email)
    {
        super(name,email);
        this.postedprojects=new ArrayList<>();
    }

    public Project postProject(int id, String title, String description, double budget)
    {
        Project newProject=new Project(id,title,description,budget);
        this.postedprojects.add(newProject);
        System.out.println("Client "+this.getName()+" has posted for the project."+title);
        return newProject;
    }
    public List<Project> getPostedProjects() {
        return postedprojects;

    }


    @Override
    public void getInfo()
    {
        System.out.println("Name of the User :"+this.getName()+"    Email : "+this.getEmail());
    }
}
