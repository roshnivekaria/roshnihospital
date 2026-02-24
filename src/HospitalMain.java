// MAIN CLASS
public class HospitalMain {

    public static void main(String[] args) {

        Patient patient = new Patient("Roshni");
        Doctor doctor = new Doctor("Dr Manji");
        Billing bill = new Billing();

        patient.schedule();
        doctor.work();
        bill.showBill();
    }
}