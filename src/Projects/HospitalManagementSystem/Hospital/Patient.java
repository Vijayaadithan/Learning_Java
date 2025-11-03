package Projects.HospitalManagementSystem.Hospital;

public class Patient
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




    private String medicalHistory;
    String hospitalId;//default (Package-Private)
    protected String insuranceDetails;
    public String name;

    public Patient(String medicalHistory, String hospitalId, String insuranceDetails, String name) {
        this.medicalHistory = medicalHistory;
        this.hospitalId = hospitalId;
        this.insuranceDetails = insuranceDetails;
        this.name = name;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public String getHospitalId() {
        return hospitalId;
    }
    public String getInsuranceDetails()
    {
        return this.insuranceDetails;
    }
    public String getName()
    {
        return this.name;
    }



}
