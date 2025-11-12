package Projects.LibraryManagementSystem;

public abstract class Member
{
    int id;
    String name;
    public Member(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    public abstract void borrowBook(Books book);
    public abstract void returnBook(Books book);

    @Override

    public String toString()
    {
        return "id : "+this.id+" Name : "+this.name;
    }


}
