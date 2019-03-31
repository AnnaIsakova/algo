package chainOfResponsibility;

public abstract class Worker {

    boolean busy;
    Worker successor;
    String name;

    public Worker(Worker successor, String name) {
        this.successor = successor;
        this.name = name;
    }

    abstract void answerTheCall(Call call);
}
