package Projects.AbstractInterface.VehicleServiceManagementSystem;

public class Main
{
    public static void main(String[] args) {
        Vehicle v1=new Car("Toyota","Corolla");
        v1.service();
        ((Car)v1).repair();

        Vehicle v2=new Bike("Yamaha","FZ");
        v2.service();
        ((Repairable)v2).repair();
    }
}
