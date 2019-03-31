package chainOfResponsibility;

public class Principal extends Worker {

    public Principal(Worker successor, String name) {
        super(successor, name);
    }

    @Override
    void answerTheCall(Call call) {
        if (!busy) {
            System.out.println(this + " answering the call.");
            call.answered = true;
        }
    }

    @Override
    public String toString() {
        return "Principal{" +
                "name='" + name + '\'' +
                '}';
    }
}
