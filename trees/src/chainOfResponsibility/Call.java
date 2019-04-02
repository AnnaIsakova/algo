package chainOfResponsibility;

public class Call {

    String from;
    boolean answered;

    public Call(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Call{" +
                "from='" + from + '\'' +
                ", answered=" + answered +
                '}';
    }
}
