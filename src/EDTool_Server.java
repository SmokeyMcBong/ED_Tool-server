/**
 * Created by theFONZ on 06/04/2015.
 */

import utils.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Objects;
import java.util.Scanner;

public class EDTool_Server extends JFrame {
    static JLabel imageHeader;
    static JLabel imageFooter;
    static JLabel appInfoFooter;
    static JLabel startGameFooter;
    static JTextField ipAddressTitle;
    static JTextField ipAddressValue;
    static JCheckBox autoRun;
    static JButton startServer;
    static JButton stopServerExit;
    static JButton startGame;

    public static void main(String[] args) {

        // Open the main gui
        EDTool_Server frame = new EDTool_Server();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.black);
        frame.setVisible(true);
        // Run Update Checker
        UpdateCheck();
    }

    private static TCPServer mServer;

    public EDTool_Server() {

        super(Constants.Me);

        // Check folder and resource structure. Create them if needed
        StructureCheck();

        // Check for host ip address and show the user
        InetAddress IP = null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        assert IP != null;

        // UI Here ..
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
        JPanel panelFields_startGame = new JPanel();
        JPanel panelFields_startGameFooter = new JPanel();

        imageHeader = new JLabel();
        imageHeader.setSize(100, 100);
        imageHeader.setFont(Constants.fontSmall);
        imageHeader.setOpaque(true);
        imageHeader.setBackground(Constants.MyColor);
        imageHeader.setForeground(Color.WHITE);
        imageHeader.setText(Constants.Version);

        JLabel icon = new JLabel("", JLabel.CENTER);
        ImageIcon iconLogo = new ImageIcon(getClass().getResource(String.valueOf(Constants.logo)));
        icon.setIcon(iconLogo);
        icon.setOpaque(true);
        icon.setBackground(Color.darkGray);

        imageFooter = new JLabel();
        imageFooter.setText(" ");
        imageFooter.setSize(100, 100);
        imageFooter.setFont(Constants.fontNormal);
        imageFooter.setOpaque(true);
        imageFooter.setBackground(Color.darkGray);

        JLabel appName = new JLabel("", JLabel.CENTER);
        appName.setForeground(Color.white);
        appName.setOpaque(true);
        appName.setFont(Constants.fontLarge);
        appName.setBackground(Color.darkGray);

        JLabel appInfo = new JLabel(Constants.Written_By, JLabel.CENTER);
        appInfo.setForeground(Color.white);
        appInfo.setOpaque(true);
        appInfo.setFont(Constants.fontSmall);
        appInfo.setBackground(Color.darkGray);

        appInfoFooter = new JLabel();
        appInfoFooter.setText(" ");
        appInfoFooter.setSize(100, 100);
        appInfoFooter.setFont(Constants.fontNormal);
        appInfoFooter.setOpaque(true);
        appInfoFooter.setBackground(Color.darkGray);

        startServer = new JButton(Constants.Start);
        startServer.setBackground(Color.lightGray);
        startServer.setForeground(Color.WHITE);
        startServer.setFont(Constants.fontLarge);
        startServer.setToolTipText(Constants.Start_Tooltip);

        stopServerExit = new JButton(Constants.Exit);
        stopServerExit.setBackground(Color.lightGray);
        stopServerExit.setForeground(Color.WHITE);
        stopServerExit.setFont(Constants.fontLarge);
        stopServerExit.setToolTipText(Constants.Exit_Tooltip);

        ipAddressTitle = new JTextField();
        ipAddressTitle.setEditable(false);
        ipAddressTitle.setForeground(Color.lightGray);
        ipAddressTitle.setOpaque(true);
        ipAddressTitle.setBackground(Color.darkGray);
        ipAddressTitle.setText(Constants.IP_Header);

        ipAddressValue = new JTextField();
        ipAddressValue.setEditable(false);
        ipAddressValue.setForeground(Color.white);
        ipAddressValue.setOpaque(true);
        ipAddressValue.setBackground(Color.darkGray);
        ipAddressValue.setFont(Constants.fontNormal);
        ipAddressValue.setText(" " + IP.getHostAddress() + " ");

        autoRun = new JCheckBox();
        autoRun.setForeground(Color.white);
        autoRun.setOpaque(true);
        autoRun.setBackground(Color.darkGray);
        autoRun.setFont(Constants.fontSmall);
        autoRun.setText(Constants.Autorun);
        autoRun.setToolTipText(Constants.Autorun_Tooltip);

        startGame = new JButton(Constants.LaunchED_1);
        startGame.setEnabled(false);
        startGame.setBackground(Color.lightGray);
        startGame.setForeground(Color.WHITE);
        startGame.setFont(Constants.fontLarge);
        startGame.setToolTipText(Constants.LaunchED_Tooltip);

        startGameFooter = new JLabel();
        startGameFooter.setText(" ");
        startGameFooter.setSize(100, 100);
        startGameFooter.setFont(Constants.fontSmall);
        startGameFooter.setOpaque(true);
        startGameFooter.setBackground(Color.darkGray);

        panelFields_imageHeader.setLayout(new BorderLayout());
        panelFields_iconHolder.setLayout(new BorderLayout());
        panelFields_ImageFooter.setLayout(new BorderLayout());
        panelFields_appName.setLayout(new BorderLayout());
        panelFields_appInfo.setLayout(new BorderLayout());
        panelFields_appInfoFooter.setLayout(new BorderLayout());
        panelFields_startServer.setLayout(new BorderLayout());
        panelFields_stopServer.setLayout(new BorderLayout());
        panelFields_ipAddress.setLayout(new BoxLayout(panelFields_ipAddress, BoxLayout.X_AXIS));
        panelFields_startGame.setLayout(new BorderLayout());
        panelFields_startGameFooter.setLayout(new BorderLayout());

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
        panelFields_autoRun.setBackground(Color.darkGray);
        panelFields_autoRun.add(autoRun);
        panelFields_startGame.add(startGame);
        panelFields_startGameFooter.add(startGameFooter);

        // add final JPanel's to main gui
        getContentPane().add(panelFields_imageHeader);
        getContentPane().add(panelFields_ImageFooter);
        getContentPane().add(panelFields_iconHolder);
        getContentPane().add(panelFields_appName);
        getContentPane().add(panelFields_appInfo);
        getContentPane().add(panelFields_appInfoFooter);
        getContentPane().add(panelFields_startServer);
        getContentPane().add(panelFields_startGame);
        getContentPane().add(panelFields_stopServer);
        getContentPane().add(panelFields_startGameFooter);
        getContentPane().add(panelFields_autoRun);
        getContentPane().add(panelFields_ipAddress);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().setBackground(Color.darkGray);
        setPreferredSize(new Dimension(290, 594));
        setResizable(false);
        setVisible(true);
        //  .. End of UI

        // Check for autostart file, if it exists then set Jcheckbox accordingly and then autostart the server
        File as = new File(String.valueOf(Constants.autostart));
        if (as.exists()) {
            autoRun.setSelected(true);
            startServer();
            try {
                Thread.sleep(500);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        } else {
            autoRun.setSelected(false);
        }

        startServer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startServer();
            }
        });

        stopServerExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitServer();
            }
        });

        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String exeLocation = new Scanner(new File(String.valueOf(Constants.config))).useDelimiter("\\A").next();
                    Runtime.getRuntime().exec(exeLocation);
                } catch (Exception w) {
                    w.printStackTrace();
                }
            }
        });

        autoRun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the current state of the checkbox
                boolean ar = autoRun.isSelected();
                boolean bool;
                File f;
                if (ar) {
                    // Check if autostart file exists
                    f = new File(String.valueOf(Constants.autostart));
                    if (!f.exists()) {
                        try {
                            bool = f.createNewFile();
                            System.out.println("File created: "+bool);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                } else {
                    f = new File(String.valueOf(Constants.autostart));
                    if (f.exists()) {
                        bool = f.delete();
                        System.out.println("File deleted: "+bool);
                    }
                }
            }
        });

        imageHeader.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String test = imageHeader.getText();
                if (test.contains("Update")) {
                    Runtime rt = Runtime.getRuntime();
                    try {
                        rt.exec( "rundll32 url.dll,FileProtocolHandler " + Constants.ReleasesURL);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }

    public void exitServer() {
        try {
            mServer.interrupt();
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(10);
                    System.exit(0);
                } catch (InterruptedException f) {
                    Thread.currentThread().interrupt();
                }
            }
        } catch (Exception w) {
            w.printStackTrace();
        }
        System.exit(0);
    }

    public static void startServer() {
        startServer.setEnabled(false);
        startServer.setText(Constants.Server_Started);
        startGame.setEnabled(true);
        startGame.setText(Constants.LaunchED_2);
        stopServerExit.setText(Constants.Stop_Exit);

        // Create the object OnMessageReceived asked by the TCPServer constructor
        mServer = new TCPServer(new TCPServer.OnMessageReceived() {

            // This method declared in the interface from TCPServer class is implemented here. This is actually a callback
            // method because it will run every time when it will be called from TCPServer class (at while)
            public void messageReceived(String message) {
                // Check to see if the message was the connection verification, if it is then change the buttons text
                if (Objects.equals(message, "OK")) {
                    startServer.setText(Constants.Server_Connected);
                    startGame.setText(Constants.LaunchED_3);
                    stopServerExit.setFocusable(false);
                    startGame.setFocusable(true);
                }
                // Send incoming data (message) to KeyMapRobot to process the correct SendKeys
                try {
                    new KeyMapRobot(message);
                } catch (AWTException e1) {
                    e1.printStackTrace();
                }
            }
        });
        mServer.start();
    }

    public static void StructureCheck() {
        // Check if directory structure is intact, if not then create it and make checks before continuing
        boolean bool;
        if (!Constants.basedir.exists()) {
            bool = Constants.basedir.mkdir();
            System.out.println(Constants.basedir+" created: "+bool);
        }
        if (!Constants.usrdir.exists()) {
            bool = Constants.usrdir.mkdir();
            System.out.println(Constants.usrdir+" created: "+bool);
        }
        if (!Constants.bindir.exists()) {
            bool = Constants.bindir.mkdir();
            System.out.println(Constants.bindir+" created: "+bool);
            PrintWriter out = null;
            try {
                // Create getRegLocation.bat using predefined string
                out = new PrintWriter(new FileWriter(String.valueOf(Constants.bat)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert out != null;
            out.println(Constants.RegLocBat);
            out.close();
        }

        // Check if location.conf exists, If it doesn't then check for EDLaunch.exe location and store that in location.conf
        File f = new File(String.valueOf(Constants.config));
        if (!f.exists()) {
            try {
                Process p = Runtime.getRuntime().exec(String.valueOf(Constants.bat));
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while (true) {
                    line = input.readLine();
                    if (line == null) {
                        break;
                    }
                    // Create a print writer for writing to a file
                    PrintWriter out = new PrintWriter(new FileWriter(String.valueOf(Constants.config)));
                    out.println(line + Constants.ED_Exe);
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void UpdateCheck () {
        try {
            int remoteV;
            int localV = Integer.parseInt(String.valueOf(Constants.Vc_Version));
            URL url = new URL(Constants.VersionCheckURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str = in.readLine()) != null) {
                remoteV = Integer.parseInt(String.valueOf(str));
                if (remoteV > localV) {
                    // Take raw version number from Constants and add "." between each number
                    String FormattedOnlineVersion = str.replaceAll(".(?=.)", "$0.");
                    imageHeader.setText(" >> Update Available ! (v" + FormattedOnlineVersion+")");
                }
            }
            in.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}