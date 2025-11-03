package Projects.BankManagementSystem;

public class Customer
{
    private String name;

    private int age;
    private String salary ;

    public Customer(String name,int age,String salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSalary() {
        return this.salary;
    }

    @Override
    public String toString()
    {
        return "Customer Name: "+this.name+" Age: "+this.age+" Salary: ";
    }
}
