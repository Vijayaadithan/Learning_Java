package Projects.HospitalManagementSystem.Hospital;

public class Reception
{
    //    Context:
//    In a hospital app:
//        - Patient class contains sensitive medical history (private), hospital ID (default), insurance details
//(protected), and name (public).
//        - Reception (same package) must print patient name and ID but not medical history.
//        - InsuranceClaim (different package) should access insurance details via inheritance.
//        - Billing (different package, non-subclass) should only use public getters.
//    Assignment Tasks:
//        1. Implement Patient with correct modifiers.
//2. Demonstrate that Reception, InsuranceClaim, and Billing follow the security rules automatically
//    via compiler.
//        3. Create a table mapping each field to which classes can access it.
    public void printPatientDetails(Patient p)
    {
        System.out.println("Patient Name: "+p.getName());
        System.out.println("Hospital Id: "+p.getHospitalId());
        System.out.println("InsuranceDetails: "+p.getInsuranceDetails());
    }
}
