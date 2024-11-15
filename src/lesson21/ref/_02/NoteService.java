package lesson21.ref._02;

public class NoteService extends Notification implements Calculator {

    NoteService(String msg) {
        super(msg);
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    private String formMessage(int res) {
        return "Result is " + res;
    }
}
