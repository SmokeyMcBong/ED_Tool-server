import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Objects;

/**
 * Created by the_FONZ on 07/04/2015.
 */

public class CustomKeyMapRobot {
    public CustomKeyMapRobot(String key)  throws AWTException {
        try {
            Robot robot = new Robot();
            // Check what keymap symbol we received and SendKey the relevant keystroke
            if (Objects.equals(key, "{A}")) {
                robot.keyPress(KeyEvent.VK_A);
                robot.delay(5);
            }else if (Objects.equals(key, "{B}")) {
                robot.keyPress(KeyEvent.VK_B);
                robot.delay(5);
            }else if (Objects.equals(key, "{C}")) {
                robot.keyPress(KeyEvent.VK_C);
                robot.delay(5);
            }else if (Objects.equals(key, "{D}")) {
                robot.keyPress(KeyEvent.VK_D);
                robot.delay(5);
            }else if (Objects.equals(key, "{E}")) {
                robot.keyPress(KeyEvent.VK_E);
                robot.delay(5);
            }else if (Objects.equals(key, "{F}")) {
                robot.keyPress(KeyEvent.VK_F);
                robot.delay(5);
            }else if (Objects.equals(key, "{G}")) {
                robot.keyPress(KeyEvent.VK_G);
                robot.delay(5);
            }else if (Objects.equals(key, "{H}")) {
                robot.keyPress(KeyEvent.VK_H);
                robot.delay(5);
            }else if (Objects.equals(key, "{I}")) {
                robot.keyPress(KeyEvent.VK_I);
                robot.delay(5);
            }else if (Objects.equals(key, "{J}")) {
                robot.keyPress(KeyEvent.VK_J);
                robot.delay(5);
            }else if (Objects.equals(key, "{K}")) {
                robot.keyPress(KeyEvent.VK_K);
                robot.delay(5);
            }else if (Objects.equals(key, "{L}")) {
                robot.keyPress(KeyEvent.VK_L);
                robot.delay(5);
            }else if (Objects.equals(key, "{M}")) {
                robot.keyPress(KeyEvent.VK_M);
                robot.delay(5);
            }else if (Objects.equals(key, "{N}")) {
                robot.keyPress(KeyEvent.VK_N);
                robot.delay(5);
            }else if (Objects.equals(key, "{O}")) {
                robot.keyPress(KeyEvent.VK_O);
                robot.delay(5);
            }else if (Objects.equals(key, "{P}")) {
                robot.keyPress(KeyEvent.VK_P);
                robot.delay(5);
            }else if (Objects.equals(key, "{Q}")) {
                robot.keyPress(KeyEvent.VK_Q);
                robot.delay(5);
            }else if (Objects.equals(key, "{R}")) {
                robot.keyPress(KeyEvent.VK_R);
                robot.delay(5);
            }else if (Objects.equals(key, "{S}")) {
                robot.keyPress(KeyEvent.VK_S);
                robot.delay(5);
            }else if (Objects.equals(key, "{T}")) {
                robot.keyPress(KeyEvent.VK_T);
                robot.delay(5);
            }else if (Objects.equals(key, "{U}")) {
                robot.keyPress(KeyEvent.VK_U);
                robot.delay(5);
            }else if (Objects.equals(key, "{V}")) {
                robot.keyPress(KeyEvent.VK_V);
                robot.delay(5);
            }else if (Objects.equals(key, "{W}")) {
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(5);
            }else if (Objects.equals(key, "{X}")) {
                robot.keyPress(KeyEvent.VK_X);
                robot.delay(5);
            }else if (Objects.equals(key, "{Y}")) {
                robot.keyPress(KeyEvent.VK_Y);
                robot.delay(5);
            }else if (Objects.equals(key, "{Z}")) {
                robot.keyPress(KeyEvent.VK_Z);
                robot.delay(5);
            }else if (Objects.equals(key, "{0}")) {
                robot.keyPress(KeyEvent.VK_0);
                robot.delay(5);
            }else if (Objects.equals(key, "{1}")) {
                robot.keyPress(KeyEvent.VK_1);
                robot.delay(5);
            }else if (Objects.equals(key, "{2}")) {
                robot.keyPress(KeyEvent.VK_2);
                robot.delay(5);
            }else if (Objects.equals(key, "{3}")) {
                robot.keyPress(KeyEvent.VK_3);
                robot.delay(5);
            }else if (Objects.equals(key, "{4}")) {
                robot.keyPress(KeyEvent.VK_4);
                robot.delay(5);
            }else if (Objects.equals(key, "{5}")) {
                robot.keyPress(KeyEvent.VK_5);
                robot.delay(5);
            }else if (Objects.equals(key, "{6}")) {
                robot.keyPress(KeyEvent.VK_6);
                robot.delay(5);
            }else if (Objects.equals(key, "{7}")) {
                robot.keyPress(KeyEvent.VK_7);
                robot.delay(5);
            }else if (Objects.equals(key, "{8}")) {
                robot.keyPress(KeyEvent.VK_8);
                robot.delay(5);
            }else if (Objects.equals(key, "{9}")) {
                robot.keyPress(KeyEvent.VK_9);
                robot.delay(5);
            }else if (Objects.equals(key, "{N0}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD0);
                robot.delay(5);
            }else if (Objects.equals(key, "{N1}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD1);
                robot.delay(5);
            }else if (Objects.equals(key, "{N2}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD2);
                robot.delay(5);
            }else if (Objects.equals(key, "{N3}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD3);
                robot.delay(5);
            }else if (Objects.equals(key, "{N4}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD4);
                robot.delay(5);
            }else if (Objects.equals(key, "{N5}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD5);
                robot.delay(5);
            }else if (Objects.equals(key, "{N6}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD6);
                robot.delay(5);
            }else if (Objects.equals(key, "{N7}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD7);
                robot.delay(5);
            }else if (Objects.equals(key, "{N8}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD8);
                robot.delay(5);
            }else if (Objects.equals(key, "{N9}")) {
                robot.keyPress(KeyEvent.VK_NUMPAD9);
                robot.delay(5);
            }else if (Objects.equals(key, "{UP}")) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.delay(5);
            }else if (Objects.equals(key, "{DOWN}")) {
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.delay(5);
            }else if (Objects.equals(key, "{LEFT}")) {
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.delay(5);
            }else if (Objects.equals(key, "{RIGHT}")) {
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.delay(5);
            }else if (Objects.equals(key, "{BACKSPACE}")) {
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.delay(5);
            }else if (Objects.equals(key, "{BREAK}")) {
                robot.keyPress(KeyEvent.VK_PAUSE);
                robot.delay(5);
            }else if (Objects.equals(key, "{CAPSLOCK}")) {
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.delay(5);
            }else if (Objects.equals(key, "{DELETE}")) {
                robot.keyPress(KeyEvent.VK_DELETE);
                robot.delay(5);
            }else if (Objects.equals(key, "{END}")) {
                robot.keyPress(KeyEvent.VK_END);
                robot.delay(5);
            }else if (Objects.equals(key, "{ENTER}")) {
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(5);
            }else if (Objects.equals(key, "{ESC}")) {
                robot.keyPress(KeyEvent.VK_ESCAPE);
                robot.delay(5);
            }else if (Objects.equals(key, "{HOME}")) {
                robot.keyPress(KeyEvent.VK_HOME);
                robot.delay(5);
            }else if (Objects.equals(key, "{INSERT}")) {
                robot.keyPress(KeyEvent.VK_INSERT);
                robot.delay(5);
            }else if (Objects.equals(key, "{NUMLOCK}")) {
                robot.keyPress(KeyEvent.VK_NUM_LOCK);
                robot.delay(5);
            }else if (Objects.equals(key, "{PGDN}")) {
                robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                robot.delay(5);
            }else if (Objects.equals(key, "{PGUP}")) {
                robot.keyPress(KeyEvent.VK_PAGE_UP);
                robot.delay(5);
            }else if (Objects.equals(key, "{PRTSC}")) {
                robot.keyPress(KeyEvent.VK_PRINTSCREEN);
                robot.delay(5);
            }else if (Objects.equals(key, "{SCROLLLOCK}")) {
                robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
                robot.delay(5);
            }else if (Objects.equals(key, "{TAB}")) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.delay(5);
            }else if (Objects.equals(key, "{F1}")) {
                robot.keyPress(KeyEvent.VK_F1);
                robot.delay(5);
            }else if (Objects.equals(key, "{F2}")) {
                robot.keyPress(KeyEvent.VK_F2);
                robot.delay(5);
            }else if (Objects.equals(key, "{F3}")) {
                robot.keyPress(KeyEvent.VK_F3);
                robot.delay(5);
            }else if (Objects.equals(key, "{F4}")) {
                robot.keyPress(KeyEvent.VK_F4);
                robot.delay(5);
            }else if (Objects.equals(key, "{F5}")) {
                robot.keyPress(KeyEvent.VK_F5);
                robot.delay(5);
            }else if (Objects.equals(key, "{F6}")) {
                robot.keyPress(KeyEvent.VK_F6);
                robot.delay(5);
            }else if (Objects.equals(key, "{F7}")) {
                robot.keyPress(KeyEvent.VK_F7);
                robot.delay(5);
            }else if (Objects.equals(key, "{F8}")) {
                robot.keyPress(KeyEvent.VK_F8);
                robot.delay(5);
            }else if (Objects.equals(key, "{F9}")) {
                robot.keyPress(KeyEvent.VK_F9);
                robot.delay(5);
            }else if (Objects.equals(key, "{F10}")) {
                robot.keyPress(KeyEvent.VK_F10);
                robot.delay(5);
            }else if (Objects.equals(key, "{F11}")) {
                robot.keyPress(KeyEvent.VK_F11);
                robot.delay(5);
            }else if (Objects.equals(key, "{F12}")) {
                robot.keyPress(KeyEvent.VK_F12);
                robot.delay(5);
            }else if (Objects.equals(key, "{F13}")) {
                robot.keyPress(KeyEvent.VK_F13);
                robot.delay(5);
            }else if (Objects.equals(key, "{F14}")) {
                robot.keyPress(KeyEvent.VK_F14);
                robot.delay(5);
            }else if (Objects.equals(key, "{F15}")) {
                robot.keyPress(KeyEvent.VK_F15);
                robot.delay(5);
            }else if (Objects.equals(key, "{F16}")) {
                robot.keyPress(KeyEvent.VK_F16);
                robot.delay(5);
            }else if (Objects.equals(key, "{ADD}")) {
                robot.keyPress(KeyEvent.VK_ADD);
                robot.delay(5);
            }else if (Objects.equals(key, "{SUBTRACT}")) {
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.delay(5);
            }else if (Objects.equals(key, "{MULTIPLY}")) {
                robot.keyPress(KeyEvent.VK_MULTIPLY);
                robot.delay(5);
            }else if (Objects.equals(key, "{DIVIDE}")) {
                robot.keyPress(KeyEvent.VK_DIVIDE);
                robot.delay(5);
            }else if (Objects.equals(key, "{CONTROL}")) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(5);
            }else if (Objects.equals(key, "{SHIFT}")) {
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.delay(5);
            }else if (Objects.equals(key, "{ALT}")) {
                robot.keyPress(KeyEvent.VK_ALT);
                robot.delay(5);
            }else if (Objects.equals(key, "{SLASH}")) {
                robot.keyPress(KeyEvent.VK_SLASH);
                robot.delay(5);
            }else if (Objects.equals(key, "{BACKSLASH}")) {
                robot.keyPress(KeyEvent.VK_BACK_SLASH);
                robot.delay(5);
            }else if (Objects.equals(key, "{COMMA}")) {
                robot.keyPress(KeyEvent.VK_COMMA);
                robot.delay(5);
            }else if (Objects.equals(key, "{EQUALS}")) {
                robot.keyPress(KeyEvent.VK_EQUALS);
                robot.delay(5);
            }else if (Objects.equals(key, "{OPENBRACKET}")) {
                robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                robot.delay(5);
            }else if (Objects.equals(key, "{CLOSEBRACKET}")) {
                robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                robot.delay(5);
            }else if (Objects.equals(key, "{PERIOD}")) {
                robot.keyPress(KeyEvent.VK_PERIOD);
                robot.delay(5);
            }else if (Objects.equals(key, "{QUOTE}")) {
                robot.keyPress(KeyEvent.VK_QUOTE);
                robot.delay(5);
            }else if (Objects.equals(key, "{BACKQUOTE}")) {
                robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                robot.delay(5);
            }else if (Objects.equals(key, "{SEMICOLON}")) {
                robot.keyPress(KeyEvent.VK_SEMICOLON);
                robot.delay(5);
            }else if (Objects.equals(key, "{DECIMAL}")) {
                robot.keyPress(KeyEvent.VK_DECIMAL);
                robot.delay(5);
            }
        } catch (AWTException e) {
            e.printStackTrace();
            System.out.println("S: goofed");
        }
    }
}