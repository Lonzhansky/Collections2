package lesson33.demo.server;


public class Main {
    public static void main(String[] args) {

        new Thread(() -> {
            MultiClientServer server = new MultiClientServer();
            server.start();
        }).start();
    }
}