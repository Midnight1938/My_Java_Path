package Socket_chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;

// Thread imports
import java.util.concurrent.Executors;

// Logging imports
import java.io.FileWriter;

/*
 * Runnable interface is used to create a thread that can run in the background and can be used to perform tasks while the main thread is busy.
 * A thread pool is a collection of threads that can be used to perform tasks in the background.
 */


 public class Server implements Runnable {

    private ArrayList<ConnectionHandler> connections; // An ArrayList that is used to store the ConnectionHandler, used
                                                      // to handle the connections of the clients, yes its a class
    private ServerSocket server; // A server socket that is used to accept connections from clients.

    private boolean done; // A boolean that is used to check if the server is done.
    private ExecutorService pool; // A thread pool that is used to create threads.

    public Server() { // This is the constructor of the class.
        connections = new ArrayList<>(); // Initializes the ArrayList for the connections.
        done = false; // Initializes the boolean
    }

    @Override
    public void run() { // Contains the code that will be executed by the thread when it is executed.
        try {
            server = new ServerSocket(9999); // Creates a server socket that will be used to accept
                                             // connections from clients.
            pool = Executors.newCachedThreadPool(); // Init a thread pool
            while (!done) {

                Socket client = server.accept(); // Accepts the connection from the client.

                ConnectionHandler handler = new ConnectionHandler(client); // Creates a ConnectionHandler object to
                                                                           // handle the connection of the client.
                connections.add(handler);
                pool.execute(handler); // Executes the thread at every new connection.
            }
        } catch (Exception e) {
            shutdown();

        }
    }

    public void broadcast(String message) {
        for (ConnectionHandler ch : connections) {
            if (ch != null) { // Checks if the message is not null.
                ch.pushMssg(message);
            }
        }
    }

    public void shutdown() {
        try {
            done = true;
            pool.shutdown();
            if (!server.isClosed()) { // Checks if the message is not null.
                server.close();
            }
            for (ConnectionHandler ch : connections) {
                if (ch != null) {
                    ch.shutdown();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger("Error shutting server!");
        }
    }

    // This class is used to handle the connection of the clients.
    // And it implements the Runnable interface so that it can be used to create a
    // thread, this is also an inner class. And an arraylist of this class is used
    class ConnectionHandler implements Runnable {

        private Socket client; // A socket that is used to communicate with the client.
        private BufferedReader in; // used to read the data sent by the client.
        private PrintWriter out; // used to send data to the client.
        private String nick; // used to store the nick of the client.

        // A contructor that is used to initialize the client socket.
        public ConnectionHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try {
                out = new PrintWriter(client.getOutputStream(), true); // Initializes the PrintWriter object.
                in = new BufferedReader(new InputStreamReader(client.getInputStream())); // Initializes the
                                                                                         // BufferedReader object with
                                                                                         // the input stream of the
                                                                                         // client.
                out.println("Hello from server! Enter a nick"); // Sends a message to the client.
                nick = in.readLine(); // Reads the nick sent by the client.

                out.println("Hello " + nick); // Sends a message to the client.
                logger(nick + " has joined the chat");
                broadcast(nick + " has joined the chat"); // Broadcast fn message to all the clients.

                String message; // A variable that is used to store the message sent by the client.
                while ((message = in.readLine()) != null) { // Reads the message sent by the client.
                    if (message.equals("/quit")) {
                        broadcast(nick + " has left the chat");
                        logger(nick + " has left the chat");
                        shutdown();
                    } else if (message.startsWith("/nick")) { // Checks if the message starts with /nick
                        String[] messageSplit = message.split(" ", 2); // Regexes the message to split it into 2 parts
                        if (messageSplit.length == 2) {
                            broadcast(nick + " changed their nick to " + messageSplit[1]);
                            logger(nick + " changed their nick to " + messageSplit[1]);
                            nick = messageSplit[1];
                            out.println("Your nick has been changed to " + nick);
                        } else {
                            out.println("Invalid new name");
                        }
                    } else {
                        logger(nick + ": " + message);
                        broadcast(nick + ": " + message); // Broadcast fn message to all the clients.
                    }
                }

            } catch (IOException e) {
                shutdown();
            }
        }

        public void pushMssg(String mssg) { // Used to send a message to the clients
            out.println(mssg);
        }

        public void shutdown() {
            try {
                in.close();
                out.close();
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
                logger("Error shutting client!");
            }
        }

    }

    public static void logger(String message) { // Used to retain a server log
        // Open or create a log file
        String log = "Socket_chat/log.txt";
        // Write the message to the log file with timestamp
        try {
            // timestamp with time
            java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
            // Add data to new line
            FileWriter writer = new FileWriter(log, true);
            writer.write(timestamp + "\t:::- " + message + "\n"); // \n is last because it will add a new line to the
                                                                // end of the
            // file
            writer.close();
        } catch (Exception e) {
            System.out.println("Error writing to log file!");
        }
    }


    public static void main(String[] args) {
        Server server = new Server(); // Creates the Server object.
        server.run(); // Runs the server.
    }
}