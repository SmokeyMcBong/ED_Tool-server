/**
 * Created by theFONZ on 07/04/2015.
 */

package ed_tool_server.tcp_keymap_robot;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.*;

public class KeyMapRobot {

    private Robot robot;

    public static void processKey(String message) throws Exception {
        KeyMapRobot KeyMapRobot = new KeyMapRobot();
        KeyMapRobot.type(message);
    }

    public KeyMapRobot() throws AWTException {
        this.robot = new Robot();
        setNumbLockOff();
    }

    public void type(String message)   throws AWTException {
        switch (message) {
            case "1": doType(VK_A); break;
            case "2": doType(VK_B); break;
            case "3": doType(VK_C); break;
            case "4": doType(VK_D); break;
            case "5": doType(VK_E); break;
            case "6": doType(VK_F); break;
            case "7": doType(VK_G); break;
            case "8": doType(VK_H); break;
            case "9": doType(VK_I); break;
            case "10": doType(VK_J); break;
            case "11": doType(VK_K); break;
            case "12": doType(VK_L); break;
            case "13": doType(VK_M); break;
            case "14": doType(VK_N); break;
            case "15": doType(VK_O); break;
            case "16": doType(VK_P); break;
            case "17": doType(VK_Q); break;
            case "18": doType(VK_R); break;
            case "19": doType(VK_S); break;
            case "20": doType(VK_T); break;
            case "21": doType(VK_U); break;
            case "22": doType(VK_V); break;
            case "23": doType(VK_W); break;
            case "24": doType(VK_X); break;
            case "25": doType(VK_Y); break;
            case "26": doType(VK_Z); break;
            case "27": doType(VK_0); break;
            case "28": doType(VK_1); break;
            case "29": doType(VK_2); break;
            case "30": doType(VK_3); break;
            case "31": doType(VK_4); break;
            case "32": doType(VK_5); break;
            case "33": doType(VK_6); break;
            case "34": doType(VK_7); break;
            case "35": doType(VK_8); break;
            case "36": doType(VK_9); break;
            case "37": setNumbLockOn(); doType(VK_NUMPAD0); break;
            case "38": setNumbLockOn(); doType(VK_NUMPAD1); break;
            case "39": setNumbLockOn(); doType(VK_NUMPAD2); break;
            case "40": setNumbLockOn(); doType(VK_NUMPAD3); break;
            case "41": setNumbLockOn(); doType(VK_NUMPAD4); break;
            case "42": setNumbLockOn(); doType(VK_NUMPAD5); break;
            case "43": setNumbLockOn(); doType(VK_NUMPAD6); break;
            case "44": setNumbLockOn(); doType(VK_NUMPAD7); break;
            case "45": setNumbLockOn(); doType(VK_NUMPAD8); break;
            case "46": setNumbLockOn(); doType(VK_NUMPAD9); break;
            case "47": doType(VK_UP); break;
            case "48": doType(VK_DOWN); break;
            case "49": doType(VK_LEFT); break;
            case "50": doType(VK_RIGHT); break;
            case "51": doType(VK_BACK_SPACE); break;
            case "52": doType(VK_PAUSE); break;
            case "53": doType(VK_CAPS_LOCK); break;
            case "54": doType(VK_DELETE); break;
            case "55": doType(VK_END); break;
            case "56": doType(VK_ENTER); break;
            case "57": doType(VK_ESCAPE); break;
            case "58": doType(VK_HOME); break;
            case "59": doType(VK_INSERT); break;
            case "60": doType(VK_NUM_LOCK); break;
            case "61": doType(VK_PAGE_DOWN); break;
            case "62": doType(VK_PAGE_UP); break;
            case "63": doType(VK_PRINTSCREEN); break;
            case "64": doType(VK_SCROLL_LOCK); break;
            case "65": doType(VK_TAB); break;
            case "66": doType(VK_F1); break;
            case "67": doType(VK_F2); break;
            case "68": doType(VK_F3); break;
            case "69": doType(VK_F4); break;
            case "70": doType(VK_F5); break;
            case "71": doType(VK_F6); break;
            case "72": doType(VK_F7); break;
            case "73": doType(VK_F8); break;
            case "74": doType(VK_F9); break;
            case "75": doType(VK_F10); break;
            case "76": doType(VK_F11); break;
            case "77": doType(VK_F12); break;
            case "78": doType(VK_F13); break;
            case "79": doType(VK_F14); break;
            case "80": doType(VK_F15); break;
            case "81": doType(VK_F16); break;
            case "82": doType(VK_ADD); break;
            case "83": doType(VK_SUBTRACT); break;
            case "84": doType(VK_MULTIPLY); break;
            case "85": doType(VK_DIVIDE); break;
            case "86": doType(VK_CONTROL); break;
            case "87": doType(VK_SHIFT); break;
            case "88": doType(VK_ALT); break;
            case "89": doType(VK_SLASH); break;
            case "90": doType(VK_BACK_SLASH); break;
            case "91": doType(VK_COMMA); break;
            case "92": doType(VK_EQUALS); break;
            case "93": doType(VK_OPEN_BRACKET); break;
            case "94": doType(VK_CLOSE_BRACKET); break;
            case "95": doType(VK_PERIOD); break;
            case "96": doType(VK_QUOTE); break;
            case "97": doType(VK_BACK_QUOTE); break;
            case "98": doType(VK_SEMICOLON); break;
            case "99": doType(VK_DECIMAL); break;
            // Modifier keys here
            case "SD": doModifierDown(VK_SHIFT); break;
            case "SU": doModifierUp(VK_SHIFT); break;
            case "CD": doModifierDown(VK_CONTROL); break;
            case "CU": doModifierUp(VK_CONTROL); break;
            case "AD": doModifierDown(VK_ALT); break;
            case "AU": doModifierUp(VK_ALT); break;
            default:
        }
    }

    // Modifier keypress and keyrelease here
    private void doModifierDown(int keyCodes) {
        robot.keyPress(keyCodes);
    }
    private void doModifierUp(int keyCodes) {
        robot.keyRelease(keyCodes);
    }

    // Set Numlock state
    public static void setNumbLockOn() {
        if (!Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_NUM_LOCK)) {
            Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, true);
        }
    }
    public static void setNumbLockOff() {
        if (Toolkit.getDefaultToolkit().getLockingKeyState(KeyEvent.VK_NUM_LOCK)) {
            Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
        }
    }

    private void addDelay() {
        final int delay = 100;
        robot.delay(delay);
    }

    private void doType(int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length);
    }

    private void doType(int[] keyCodes, int offset, int length) {
        if (length == 0) {
            return;
        }
        robot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        addDelay();
        robot.keyRelease(keyCodes[offset]);
    }
}