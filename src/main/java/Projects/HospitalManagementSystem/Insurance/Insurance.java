package Projects.HospitalManagementSystem.Insurance;

import Projects.Exception.FileTooLargeException;
import Projects.HospitalManagementSystem.Hospital.Patient;

public class Insurance extends Patient
{

//    2. Access Modifiers – Scenario 2: Hospital Management System
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

    public Insurance(String medicalHistory, String hospitalId, String insuranceDetails, String name )
    {
        super(medicalHistory,hospitalId,insuranceDetails,name);
    }
    public Insurance(Patient p)
    {
        super(p.getMedicalHistory(),p.getHospitalId(),p.getInsuranceDetails(),p.getName());
    }

    public void getInsurance()
    {
        System.out.println("Insurance type of the Patient: "+super.getInsuranceDetails());;
    }


}
