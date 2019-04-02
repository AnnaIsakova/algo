package chainOfResponsibility;

public class Admin extends Worker {

    public Admin(Worker successor, String name) {
        super(successor, name);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                '}';
    }
}
