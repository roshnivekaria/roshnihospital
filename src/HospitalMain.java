import java.util.Scanner;

public class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter doctor name: ");
            String doctorName = sc.nextLine();

            Patient patient = new Patient(patientName);
            Doctor doctor = new Doctor(doctorName);
            Billing bill = new Billing();

            patient.schedule();
            doctor.work();
            bill.showBill();

        } catch (Exception e) {
            System.out.println("Error: Invalid input!");
        } finally {
            sc.close();
            System.out.println("Program ended safely.");
        }
    }
}