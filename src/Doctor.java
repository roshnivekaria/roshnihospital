// CONCRETE CLASS 2
class Doctor extends Staff {

    Doctor(String name) {
        super(name);
    }

    void work() {
        System.out.println("Doctor is busy ^_^");
    }
}