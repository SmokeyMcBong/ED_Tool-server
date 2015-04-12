/**
 * Created by the_FONZ on 06/04/2015.
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * The class extends the Thread class so we can receive and send messages at the same time
 */
public class TCPServer extends Thread {

    public static final int SERVERPORT = 4444;
    private boolean running = false;
    private PrintWriter mOut;
    private OnMessageReceived messageListener;

    public static void main(String[] args) {

        // open the main gui
        CustomServerBoard frame = new CustomServerBoard();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.black);
        frame.setVisible(true);
    }

    /**
     * Constructor of the class
     * @param messageListener listens for the messages
     */
    public TCPServer(OnMessageReceived messageListener) {
        this.messageListener = messageListener;
    }

    /**
     * Method to send the messages from server to client
     * @param message the message sent by the server
     */
    public void sendMessage(String message){
        if (mOut != null && !mOut.checkError()) {
            mOut.println(message);
            mOut.flush();
        }
    }
// TODO - add checks for connection lost/client disconnect
    @Override
    public void run() {
        super.run();

        running = true;

        try {
            //create a server socket. A server socket waits for requests to come in over the network.
            ServerSocket serverSocket = new ServerSocket(SERVERPORT);
            System.out.println(" S: Openning Connection, Awaiting Client ... ");

            //create client socket... the method accept() listens for a connection to be made to this socket and accepts it.
            Socket client = serverSocket.accept();

            try {
                //sends the message to the client
                mOut = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true);
                System.out.println(" S: Client Connected, All is GOOD ! ");
                String messageText = "handshakeAccepted";
                try {
                    sendMessage(messageText);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(" S: Looks like messageText didnt make it ! " + e);
                }


                //read the message received from client
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                //in this while we wait to receive messages from client (it's an infinite loop)
                //this while it's like a listener for messages
                while (running) {
                    String message = in.readLine();
                    if (message != null && messageListener != null) {
                        //call the method messageReceived from CustomServerBoard class
                        messageListener.messageReceived(message);
                    }
                }
            } catch (Exception e) {
                System.out.println("S: Error");
                e.printStackTrace();
            } finally {
                client.close();
                System.out.println("S: Done.");
            }
        } catch (Exception e) {
            System.out.println("S: Error");
            e.printStackTrace();
        }
    }

    //Declare the interface. The method messageReceived(String message) will must be implemented in the CustomServerBoard
    //class at on startServer button click
    public interface OnMessageReceived {
        public void messageReceived(String message);
    }
}