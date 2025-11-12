package Projects.AbstractInterface.VehicleServiceManagementSystem;

public abstract class Vehicle
{

    private String brand;
    private String model;

    public Vehicle(String brand,String model)
    {
        this.brand=brand;
        this.model=model;
    }

    public String getBrand()
    {
        return this.brand;
    }
    public String getModel()
    {
        return this.model;
    }

    protected abstract void service();

}
