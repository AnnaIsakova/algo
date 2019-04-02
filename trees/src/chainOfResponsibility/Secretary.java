package chainOfResponsibility;

public class Secretary extends Worker{

    public Secretary(Worker successor, String name) {
        super(successor, name);
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                '}';
    }
}
