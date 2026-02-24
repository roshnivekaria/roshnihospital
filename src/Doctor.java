
// CONCRETE CLASS 2
public class Doctor extends Staff {

    public Doctor(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Doctor is busy ^_^");
    }
}