// VERY BASIC Hospital Management System

// -------- ABSTRACT CLASS 1 --------
abstract class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

// -------- ABSTRACT CLASS 2 --------
abstract class Staff extends Person {

    Staff(String name) {
        super(name);
    }

    abstract void work();
}

// -------- INTERFACE 1 --------
interface Billable {
    void showBill();
}

// -------- INTERFACE 2 --------
interface Schedulable {
    void schedule();
}

// -------- CONCRETE CLASS 1 --------
class Patient extends Person implements Schedulable {

    Patient(String name) {
        super(name);
    }

    public void schedule() {
        System.out.println("Appointment scheduled for " + name);
    }
}

// -------- CONCRETE CLASS 2 --------
class Doctor extends Staff {

    Doctor(String name) {
        super(name);
    }

    void work() {
        System.out.println("Doctor is busy ^_^");
    }
}

// -------- CONCRETE CLASS 3 --------
class Billing implements Billable {

    public void showBill() {
        System.out.println("Bill is generated successfully");
    }
}

// -------- MAIN CLASS --------
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
