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
    private JLabel imageHeader;
    private JLabel imageFooter;
    private JLabel appInfoFooter;
    private JTextField ipAddressTitle;
    private JTextField ipAddressValue;
    private JCheckBox autoRun;
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

        //create new Fonts
        Font fontSmall = new Font("Copperplate Gothic", Font.PLAIN,12);
        Font fontNormal = new Font("Courier", Font.PLAIN,14);
        Font fontLarge = new Font("Copperplate Gothic", Font.PLAIN,16);

        // GUI HERE ....
        // create new JPanel's
        JPanel panelFields_imageHeader = new JPanel();
        JPanel panelFields_iconHolder = new JPanel();
        JPanel panelFields_ImageFooter = new JPanel();
        JPanel panelFields_appName = new JPanel();
        JPanel panelFields_appInfo = new JPanel();
        JPanel panelFields_appInfoFooter = new JPanel();
        JPanel panelFields_startServer = new JPanel();
        JPanel panelFields_stopServer = new JPanel();
        JPanel panelFields_ipAddress = new JPanel();
        JPanel panelFields_autoRun = new JPanel();

        imageHeader = new JLabel();
        imageHeader.setSize(100, 100);
        imageHeader.setFont(fontNormal);
        imageHeader.setOpaque(true);
        imageHeader.setBackground(Color.black);
        imageHeader.setText(" ");

        JLabel icon = new JLabel("", JLabel.CENTER);
        // Import ImageIcon
        ImageIcon iconLogo =  new ImageIcon(getClass().getResource("/imagelight.PNG"));
        icon.setIcon(iconLogo);
        icon.setOpaque(true);
        icon.setBackground(Color.black);

        imageFooter = new JLabel();
        imageFooter.setText(" ");
        imageFooter.setSize(100, 100);
        imageFooter.setFont(fontNormal);
        imageFooter.setOpaque(true);
        imageFooter.setBackground(Color.black);

        JLabel appName = new JLabel(" ED_Tool  -  Server ", JLabel.CENTER);
        appName.setForeground(Color.white);
        appName.setOpaque(true);
        appName.setFont(fontLarge);
        appName.setBackground(Color.black);

        JLabel appInfo = new JLabel(" ( By 'theFONZ' ) ", JLabel.CENTER);
        appInfo.setForeground(Color.white);
        appInfo.setOpaque(true);
        appInfo.setFont(fontSmall);
        appInfo.setBackground(Color.black);

        appInfoFooter = new JLabel();
        appInfoFooter.setText(" ");
        appInfoFooter.setSize(100, 100);
        appInfoFooter.setFont(fontNormal);
        appInfoFooter.setOpaque(true);
        appInfoFooter.setBackground(Color.black);

        JButton startServer = new JButton("Start Server");
        JButton stopServerExit = new JButton("Stop Server and Exit");

        ipAddressTitle = new JTextField();
        ipAddressTitle.setEditable(false);
        ipAddressTitle.setForeground(Color.lightGray);
        ipAddressTitle.setOpaque(true);
        ipAddressTitle.setBackground(Color.black);
        ipAddressTitle.setText("  The IP of this Server is :  ");

        ipAddressValue = new JTextField();
        ipAddressValue.setEditable(false);
        ipAddressValue.setForeground(Color.white);
        ipAddressValue.setOpaque(true);
        ipAddressValue.setBackground(Color.black);
        ipAddressValue.setFont(fontNormal);
        ipAddressValue.setText(" " + IP.getHostAddress() + " ");

        autoRun = new JCheckBox();
        autoRun.setForeground(Color.white);
        autoRun.setOpaque(true);
        autoRun.setBackground(Color.black);
        autoRun.setFont(fontSmall);
        autoRun.setText("Auto-Start Server on app startup ?");

        panelFields_imageHeader.setLayout(new BoxLayout(panelFields_imageHeader, BoxLayout.X_AXIS));
        panelFields_iconHolder.setLayout(new BoxLayout(panelFields_iconHolder, BoxLayout.X_AXIS));
        panelFields_ImageFooter.setLayout(new BoxLayout(panelFields_ImageFooter, BoxLayout.X_AXIS));
        panelFields_appName.setLayout(new BoxLayout(panelFields_appName, BoxLayout.X_AXIS));
        panelFields_appInfo.setLayout(new BoxLayout(panelFields_appInfo, BoxLayout.X_AXIS));
        panelFields_appInfoFooter.setLayout(new BoxLayout(panelFields_appInfoFooter, BoxLayout.X_AXIS));
        panelFields_startServer.setLayout(new BoxLayout(panelFields_startServer, BoxLayout.X_AXIS));
        panelFields_stopServer.setLayout(new BoxLayout(panelFields_stopServer, BoxLayout.X_AXIS));
        panelFields_ipAddress.setLayout(new BoxLayout(panelFields_ipAddress, BoxLayout.X_AXIS));

        //add the buttons and the text fields to the panel
        panelFields_imageHeader.add(imageHeader);

        panelFields_iconHolder.add(icon);

        panelFields_ImageFooter.add(imageFooter);

        panelFields_appName.add(appName);

        panelFields_appInfo.add(appInfo);

        panelFields_appInfoFooter.add(appInfoFooter);

        panelFields_startServer.add(startServer);

        panelFields_stopServer.add(stopServerExit);

        panelFields_ipAddress.add(ipAddressTitle);
        panelFields_ipAddress.add(ipAddressValue);

        panelFields_autoRun.setBackground(Color.black);
        panelFields_autoRun.add(autoRun);

        // add final JPanel's to main gui
        getContentPane().add(panelFields_imageHeader);
        getContentPane().add(panelFields_iconHolder);
        getContentPane().add(panelFields_ImageFooter);
        getContentPane().add(panelFields_appName);
        getContentPane().add(panelFields_appInfo);
        getContentPane().add(panelFields_appInfoFooter);
        getContentPane().add(panelFields_startServer);
        getContentPane().add(panelFields_stopServer);
        getContentPane().add(panelFields_autoRun);
        getContentPane().add(panelFields_ipAddress);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().setBackground(Color.black);
        setSize(400, 170);
        setVisible(true);

        // The Business End HERE ...



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
                            // Send incoming data (key) to CustomKeyMapRobot to process
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
                    while (!Thread.currentThread().isInterrupted()) {
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
//                TCPServer.stopServer();
                    System.exit(0);
                }
            }
        });
    }
}