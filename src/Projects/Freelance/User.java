package Projects.Freelance;

public abstract class User
{
    private String name;
    private String email;

    User(String name,String email)
    {
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public abstract void getInfo();

}
