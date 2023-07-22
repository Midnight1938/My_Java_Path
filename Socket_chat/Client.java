package Socket_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;

// Runnable implies that the class is a thread.
//! A Thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.
public class Client implements Runnable {

    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    private boolean done;

    @Override
    public void run() {
        try {
            Socket client = new Socket("localhost", 9999); // Creates a socket that will be used to connect to the
                                                           // server.
            out = new PrintWriter(client.getOutputStream(), true); // autoflush means buffer is flushed when line is
                                                                   // written.
            in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            InputHandler inHandler = new InputHandler(); // Creates an object for handling the input from the user.
            Thread inputThread = new Thread(inHandler); // Creates a thread to handle the input.
            inputThread.start();

            String inMessage;
            while ((inMessage = in.readLine()) != null) { // Reads the message from the server.
                System.out.println(inMessage); // Prints the message from the server.
            }
        } catch (Exception e) {
            shutdown();
        }
    }

    public void shutdown() {
        done = true;
        try {
            in.close();
            out.close();
            if (!client.isClosed()) {
                client.close();
            }
        } catch (Exception e) {
            // ignore
        }
    }

    // Handles the input from the user.
    public class InputHandler implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in)); // Creates a Reader to read user input.
                while (!done) {
                    String message = inReader.readLine(); // Reads the input from the user.
                    if (message.equals("/quit")) {
                        inReader.close();
                        shutdown();
                    } else {
                        out.println(message); // Sends the message to the server.
                    }
                }
            } catch (IOException e) {
                shutdown();
            }

        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}
