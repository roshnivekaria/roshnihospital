
// CONCRETE CLASS 1
public class Patient extends Person implements Schedulable {

    public Patient(String name) {
        super(name);
    }

    @Override
    public void schedule() {
        System.out.println("Appointment scheduled for " + name);
    }
}