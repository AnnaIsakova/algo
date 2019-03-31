package chainOfResponsibility;

public class Admin extends Worker {

    public Admin(Worker successor, String name) {
        super(successor, name);
    }

    @Override
    void answerTheCall(Call call) {
        if ((call.type.equals(Call.Type.BUSSINESS) || call.type.equals(Call.Type.REGULAR)) && !busy) {
            System.out.println(this + " answering the call.");
            call.answered = true;
        } else {
            System.out.println("Redirecting the call to " + successor);
            successor.answerTheCall(call);
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                '}';
    }
}
