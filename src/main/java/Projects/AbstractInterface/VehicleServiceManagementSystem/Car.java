package Projects.AbstractInterface.VehicleServiceManagementSystem;

public class Car extends Vehicle implements Repairable
{

    public Car(String brand,String model)
    {
        super(brand,model);
    }
    @Override
    protected void service()
    {
        System.out.println("Servicing Car : "+this.getBrand()+" "+this.getModel());
    }
    @Override
    public void repair()
    {
        System.out.println("Repairing Car Engine..");

    }

}
