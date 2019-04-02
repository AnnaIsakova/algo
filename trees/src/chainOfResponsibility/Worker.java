package chainOfResponsibility;

public abstract class Worker {

    boolean busy;
    Worker successor;
    String name;

    public Worker(Worker successor, String name) {
        this.successor = successor;
        this.name = name;
    }

    void dispatchCall(Call call){
        if (!this.busy) {
            answer(call);
        } else if (this.successor != null) {
            redirect(call);
        }
        this.busy = false;
    }

    void answer(Call call){
        this.busy = true;
        System.out.println(this + " answering the call " + call);
        call.answered = true;
    }

    void redirect(Call call){
        System.out.println("Redirecting the call to " + successor);
        successor.dispatchCall(call);
    }

}
