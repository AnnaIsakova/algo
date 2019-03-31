package chainOfResponsibility;

public class Secretary extends Worker{

    public Secretary(Worker successor, String name) {
        super(successor, name);
    }

    @Override
    public void answerTheCall(Call call) {
        if (call.type.equals(Call.Type.REGULAR) && !busy) {
            System.out.println(this + " answering the call.");
            call.answered = true;
        } else {
            System.out.println("Redirecting the call to " + successor);
            successor.answerTheCall(call);
        }
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                '}';
    }
}
