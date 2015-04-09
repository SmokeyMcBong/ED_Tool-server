/**
 * Created by the_FONZ on 06/04/2015.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class CustomServerBoard extends JFrame {
//    private JTextArea messagesArea;
//    private JTextField message;
    private JTextField ipAddressTitle;
    private JTextField ipAddressValue;
    private JButton startServer;
    private JButton stopServerExit;
    private TCPServer mServer;

    public CustomServerBoard() {

        super("ED_TOOL-server");

        // check for host ip address and show the user
        InetAddress IP= null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        assert IP != null;
        System.out.println("IP of my system is := " + IP.getHostAddress());

        // create new JPanel's
        JPanel panelFields0 = new JPanel();
        JPanel panelFields1 = new JPanel();
        JPanel panelFields2 = new JPanel();
        JPanel panelFields3 = new JPanel();
        JPanel panelFields4 = new JPanel();
        JPanel panelFields5 = new JPanel();

        JLabel icon = new JLabel("", JLabel.CENTER);
        // Import ImageIcon
        ImageIcon iconLogo = new ImageIcon("Images/ic_Launcher.png");
        icon.setIcon(iconLogo);

        JLabel appName = new JLabel(" ED_Tool - Server ", JLabel.CENTER);
        JLabel appInfo = new JLabel(" ( Created by 'theFONZ' ) ", JLabel.CENTER);

        JButton startServer = new JButton("Start Server");
        JButton stopServerExit = new JButton("Stop Server and Exit");

        ipAddressTitle = new JTextField();
        ipAddressTitle.setEditable(false);
        ipAddressTitle.setText("  The IP of this Server is :=  ");

        ipAddressValue = new JTextField();
        ipAddressValue.setEditable(false);
        //create new Font
        Font font = new Font("Courier", Font.BOLD,16);
        ipAddressValue.setFont(font);
        ipAddressValue.setText(" " + IP.getHostAddress() + " ");

        panelFields0.setLayout(new BoxLayout(panelFields0, BoxLayout.X_AXIS));
        panelFields1.setLayout(new BoxLayout(panelFields1, BoxLayout.X_AXIS));
        panelFields2.setLayout(new BoxLayout(panelFields2, BoxLayout.X_AXIS));
        panelFields3.setLayout(new BoxLayout(panelFields3, BoxLayout.X_AXIS));
        panelFields4.setLayout(new BoxLayout(panelFields4, BoxLayout.X_AXIS));
        panelFields5.setLayout(new BoxLayout(panelFields5, BoxLayout.X_AXIS));

        //add the buttons and the text fields to the panel
        panelFields0.add(icon);

        panelFields1.add(appName);

        panelFields2.add(appInfo);

        panelFields3.add(startServer);

        panelFields4.add(stopServerExit);

        panelFields5.add(ipAddressTitle);
        panelFields5.add(ipAddressValue);

//        // Send the connected status back to the android client...
//        // create connection status string
//        String messageText = " something,something ";
//        // send the message to the client
//        mServer.sendMessage(messageText);
//        // simples.

        startServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // disable the start button
                startServer.setEnabled(false);
                startServer.setText("Server Started, awaiting client");

                //creates the object OnMessageReceived asked by the TCPServer constructor
                mServer = new TCPServer(new TCPServer.OnMessageReceived() {

                    //this method declared in the interface from TCPServer class is implemented here
                    //this method is actually a callback method, because it will run every time when it will be called from
                    //TCPServer class (at while)
                    public void messageReceived(String message) {
//                        messagesArea.append(" " + message);
                        String key = message;
                        try {
                            // Send incoming data (test/message) to CustomKeyMapRobot to process
                            // and send the correct SendKeys
                            new CustomKeyMapRobot(key);
                        } catch (AWTException e1) {
                            e1.printStackTrace();
                        }
                    }
                });
                mServer.start();
            }
        });

        stopServerExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mServer.interrupt();
                    while(!Thread.currentThread().isInterrupted()) {
                        try {
                            System.out.println("S: Exiting");
                            Thread.sleep(10);
                            System.exit(0);
                        } catch (InterruptedException f) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Exception w) {
                    w.printStackTrace();
                    System.out.println("W: mServer was not already connected to client > " + w);
                }
                {
                    System.out.println("S: Exiting");
                    System.exit(0);
                }
            }
        });

        // add final JPanel's to main gui
        getContentPane().add(panelFields0);
        getContentPane().add(panelFields1);
        getContentPane().add(panelFields2);
        getContentPane().add(panelFields3);
        getContentPane().add(panelFields4);
        getContentPane().add(panelFields5);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(400, 170);
        setVisible(true);
    }
}