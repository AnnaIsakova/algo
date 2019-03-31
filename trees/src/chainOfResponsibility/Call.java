package chainOfResponsibility;

public class Call {

    String from;
    Type type;
    boolean answered;

    enum Type {
        REGULAR,
        BUSSINESS,
        CONFIDENTIAL
    }
}
