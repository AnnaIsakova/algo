package chainOfResponsibility;

public class Principal extends Worker {

    public Principal(Worker successor, String name) {
        super(successor, name);
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                '}';
    }
}
