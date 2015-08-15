/**
 * Created by theFONZ on 06/04/2015.
 */

package ed_tool_server.tcp_server;

import ed_tool_server.EDTool_Server;
import ed_tool_server.utils.Constants;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

/**
 * The class extends the Thread class so we can receive and send messages at the same time
 */
public class TCPServer extends Thread {

    private PrintWriter mOut;
    private OnMessageReceived messageListener;

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

    @Override
    public void run() {
        super.run();

        boolean running = true;

        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(Constants.ServerPort);

            // Create client socket..
            Socket client = serverSocket.accept();

            try {
                // Sends the message to the client
                mOut = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())), true);
                String messageText = Constants.Handshake_OK;
                try {
                    sendMessage(messageText);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                // Read the message received from client
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                // In this while we wait to receive messages from client (it's an infinite loop)
                while (running) {
                    String message = in.readLine();
                    if (message != null && messageListener != null) {
                        // Call the method messageReceived from EDTool_Server class
                        messageListener.messageReceived(message);
                    }
                    if (Objects.equals(message, Constants.Restart_Request)) {
                        // Call the tcp restart and await reconnection
                        serverSocket.close();
                        EDTool_Server.startServer();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                client.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Declare the interface. The method messageReceived(String message) will must be implemented in the ED_Tool-Server
    // class at on startServer button click
    public interface OnMessageReceived {
        void messageReceived(String message);
    }
}