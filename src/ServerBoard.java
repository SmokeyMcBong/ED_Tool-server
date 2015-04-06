/**
 * Created by the_FONZ on 06/04/2015.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ServerBoard extends JFrame {
    private JTextArea messagesArea;
    private JTextField message;
    private JTextField ipAddress;
    private JButton startServer;
    private TCPServer mServer;

    public ServerBoard() {

        super("ED_TOOL-server");

        InetAddress IP= null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        assert IP != null;
//        System.out.println("IP of my system is := " + IP.getHostAddress());

        JPanel panelFields = new JPanel();
        panelFields.setLayout(new BoxLayout(panelFields, BoxLayout.X_AXIS));

        JPanel panelFields2 = new JPanel();
        panelFields2.setLayout(new BoxLayout(panelFields2,BoxLayout.X_AXIS));

        JPanel panelFields3 = new JPanel();
        panelFields3.setLayout(new BoxLayout(panelFields3,BoxLayout.X_AXIS));

        //here we will have the text messages screen
        messagesArea = new JTextArea();
        messagesArea.setColumns(30);
        messagesArea.setRows(10);
        messagesArea.setEditable(false);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // get the message from the text view
                String messageText = message.getText();
                // add message to the message area
                messagesArea.append("\n" + messageText);
                // send the message to the client
                mServer.sendMessage(messageText);
                // clear text
                message.setText("");
            }
        });

        startServer = new JButton("Start Server");
        startServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // disable the start button
                startServer.setEnabled(false);

                //creates the object OnMessageReceived asked by the TCPServer constructor
                mServer = new TCPServer(new TCPServer.OnMessageReceived() {
                    @Override
                    //this method declared in the interface from TCPServer class is implemented here
                    //this method is actually a callback method, because it will run every time when it will be called from
                    //TCPServer class (at while)
                    public void messageReceived(String message) {
                        messagesArea.append("\n " + message);
                    }
                });
                mServer.start();

            }
        });

        JTextField ipAddress = new JTextField();
        ipAddress.setSize(100, 20);
        ipAddress.setEditable(false);
        ipAddress.setText("  The IP of this system is :=  " + IP.getHostAddress());

        //the box where the user enters the text (EditText is called in Android)
        message = new JTextField();
        message.setSize(200, 20);

        //add the buttons and the text fields to the panel
        panelFields.add(messagesArea);
        panelFields.add(startServer);

        panelFields2.add(message);
        panelFields2.add(sendButton);
        panelFields3.add(ipAddress);

        getContentPane().add(panelFields);
        getContentPane().add(panelFields2);
        getContentPane().add(panelFields3);

        getContentPane().setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        setSize(400, 170);
        setVisible(true);
    }
}
