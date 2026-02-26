// CONCRETE CLASS 1
class Patient extends Person implements Schedulable {

    Patient(String name) {
        super(name);
    }

    public void schedule() {
        System.out.println("Appointment scheduled for " + name);
    }
}