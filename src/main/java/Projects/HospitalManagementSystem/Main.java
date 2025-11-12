package Projects.HospitalManagementSystem;
import Projects.HospitalManagementSystem.Hospital.*;
import Projects.HospitalManagementSystem.Insurance.*;
import Projects.HospitalManagementSystem.Billing.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Patient patient1=new Patient("Sugar and BP","HsptlID1","Premium Insurance","XYZ");

        Reception reception=new Reception();
        reception.printPatientDetails(patient1);

        Insurance insurance1=new Insurance(patient1);
        insurance1.getInsurance();

        new Billing().getBill(patient1);

    }
}
