package chainOfResponsibility;

public class Main {

    public static void main(String[] args) {
        Call call1 = new Call("Phil");
        Principal principal = new Principal(null, "Principal");
        Admin admin = new Admin(principal, "Admin");
        Secretary secretary = new Secretary(admin, "Secretary");
        secretary.busy = true;

        secretary.dispatchCall(call1);
    }
}
