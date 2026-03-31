import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

// ABSTRACT CLASS 1
abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// ABSTRACT CLASS 2
abstract class Staff extends Person {
    Staff(String name) {
        super(name);
    }

    abstract void work();
}

// INTERFACES
interface Billable {
    void showBill();
}

interface Schedulable {
    void schedule();
}

// CONCRETE CLASSES
class Patient extends Person implements Schedulable {
    Patient(String name) {
        super(name);
    }

    public void schedule() {
        System.out.println("Appointment scheduled for " + name);
    }
}

class Doctor extends Staff {
    Doctor(String name) {
        super(name);
    }

    void work() {
        System.out.println("Doctor is busy ^_^");
    }
}

class Billing implements Billable {
    public void showBill() {
        System.out.println("Bill is generated successfully");
    }
}

// MAIN CLASS
public class HospitalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        try {
            // LOOP TO ADD MULTIPLE PATIENTS
            while (true) {
                System.out.print("Enter patient name (or type 'exit' to stop): ");
                String patientName = sc.nextLine();

                if (patientName.equalsIgnoreCase("exit")) {
                    break;
                }

                if (!patientName.matches("[a-zA-Z ]+")) {
                    System.out.println("Invalid patient name!");
                    continue;
                }

                patients.add(new Patient(patientName));
            }

            // SAVE ALL PATIENTS TO FILE
            try {
                FileWriter writer = new FileWriter("patients.txt");
                for (Patient p : patients) {
                    writer.write(p.name + "\n");
                }
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing file");
            }

            // READ FROM FILE
            try {
                BufferedReader reader = new BufferedReader(new FileReader("patients.txt"));
                String line;
                System.out.println("\nSaved Patients:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file");
            }

            // DOCTOR INPUT
            System.out.print("\nEnter doctor name: ");
            String doctorName = sc.nextLine();

            if (!doctorName.matches("[a-zA-Z ]+")) {
                System.out.println("Invalid doctor name!");
                return;
            }

            // CREATE OBJECTS
            Doctor doctor = new Doctor(doctorName);
            Billing bill = new Billing();

            // PROCESS ALL PATIENTS
            for (Patient p : patients) {
                p.schedule();
            }

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
