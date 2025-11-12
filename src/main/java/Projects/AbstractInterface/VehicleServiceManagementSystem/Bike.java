package Projects.AbstractInterface.VehicleServiceManagementSystem;

public class Bike extends Vehicle implements Repairable
{

    public Bike(String brand, String model)
    {
        super(brand,model);
    }
    @Override
    protected void service()
    {
        System.out.println("Servicing Bike : "+this.getBrand()+" "+this.getModel());
    }
    @Override
    public void repair()
    {
        System.out.println("Repairing Bike Brakes..");

    }

}
