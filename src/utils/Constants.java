/**
 * Created by theFONZ on 31/07/2015.
 */
package utils;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Constants {
    /**
     *  Elite:Dangerous Registry Key Locations For Reference ..
     *  Steam version  : HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Windows\CurrentVersion\Uninstall\Steam App 359320
     *  Retail version : HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Windows\CurrentVersion\Uninstall\{696F8871-C91D-4CB1-825D-36BE18065575}_is1
     */

    // ED_Tool-server Logo ..
    public static final ImageIcon logo = new ImageIcon("/imagelight.PNG");

    // ED_Tool-Server Port ..
    public static final int ServerPort = 4444;

    // Files ..
    public static final File config = new File("data/usr/location.conf");
    public static final File bat = new File("data/bin/getRegLocation.bat");
    public static final File autostart = new File("data/usr/autostart");

    // Folders ..
    public static final File basedir = new File("data");
    public static final File usrdir = new File("data/usr");
    public static final File bindir = new File("data/bin");

    // Update checker URLs
    public static final String VersionCheckURL = "https://raw.githubusercontent.com/SmokeyMcBong/ED_Tool-server/master/cVersion";
    public static final String ReleasesURL = "https://github.com/SmokeyMcBong/ED_Tool-server/releases";

    // getRegLocation.bat PrintWriter String ..
    public static final String RegLocBat =
            "@echo OFF" +
            "\n\n" +
            "setlocal ENABLEEXTENSIONS\n" +
            "set KEY_NAME_STEAM=\"HKEY_LOCAL_MACHINE\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\Steam App 359320\"\n" +
            "set KEY_NAME_RETAIL=\"HKEY_LOCAL_MACHINE\\SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\{696F8871-C91D-4CB1-825D-36BE18065575}_is1\"\n" +
            "set VALUE_NAME=InstallLocation\n\n" +
            "FOR /F \"usebackq skip=2 tokens=1-2*\" %%A IN (`REG QUERY %KEY_NAME_STEAM% /v %VALUE_NAME% `) DO (\n" +
            "    set ValueName=%%A\n" +
            "    set ValueValue=%%C\n" +
            ")" +
            "\n\n" +
            "if defined ValueName (\n" +
            "    @echo %ValueValue%\n" +
            ")" +
            "\n\n" +
            "FOR /F \"usebackq skip=2 tokens=1-2*\" %%A IN (`REG QUERY %KEY_NAME_RETAIL% /v %VALUE_NAME% `) DO (\n" +
            "    set ValueName=%%A\n" +
            "    set ValueValue=%%C\n" +
            ")" +
            "\n\n" +
            "if defined ValueName (\n" +
            "    @echo %ValueValue%\n" +
            ")";

    // UI Strings ..
    public static final String Me = "ED_TOOL-server";
    public static final String Version = " ED_Tool - Server (v2.0.1.0) ";
    public static final String Vc_Version = "2010";
    public static final String Written_By = " ( By 'theFONZ' ) ";
    public static final String IP_Header = "  The IP of this Server is :  ";
    public static final String Start = "Start Server";
    public static final String Start_Tooltip = "Start the ED_Tool-server";
    public static final String Server_Started = "Server Started || Awaiting client";
    public static final String Server_Connected = "Server Started || Connected";
    public static final String Handshake_OK = "handshakeAccepted";
    public static final String Restart_Request = "SERVER_RESTART";
    public static final String ED_Exe = "\\EDLaunch.exe";
    public static final String LaunchED_1 = "Launch E:D  (server isn't running yet)";
    public static final String LaunchED_2 = "Launch E:D  (Awaiting client)";
    public static final String LaunchED_3 = ">> Launch Elite: Dangerous <<";
    public static final String LaunchED_Tooltip = "Launch Elite:Dangerous Game";
    public static final String Exit = "Exit to Desktop";
    public static final String Exit_Tooltip = "Stop the ED_Tool-server and Exit to Desktop";
    public static final String Stop_Exit = "Stop Server and Exit";
    public static final String Autorun = "Auto-Start Server on app startup ?";
    public static final String Autorun_Tooltip = "Set the app to Auto-Start the ED_Tool-server on launch";

    // UI Colors ..
    public static final Color MyColor = Color.decode("#008080");

    // UI Fonts ..
    public static final Font fontSmall = new Font("Copperplate Gothic", Font.PLAIN, 12);
    public static final Font fontNormal = new Font("Courier", Font.PLAIN, 14);
    public static final Font fontLarge = new Font("Copperplate Gothic", Font.PLAIN, 14);
}