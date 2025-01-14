package lesson33.demo.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

public class ClientHandler implements Runnable {

    private final Socket clientSocket;
    private final String clientName;
    private final ConcurrentHashMap<String, Socket> activeConnections;

    public ClientHandler(Socket socket, String name, ConcurrentHashMap<String, Socket> activeConnections) {
        this.clientSocket = socket;
        this.clientName = name;
        this.activeConnections = activeConnections;
    }

    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println("[SERVER] Отримано від " + clientName + ": " + inputLine);
                if ("exit".equalsIgnoreCase(inputLine.trim())) {
                    System.out.println("[SERVER] " + clientName + " відключився.");
                    activeConnections.remove(clientName);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}