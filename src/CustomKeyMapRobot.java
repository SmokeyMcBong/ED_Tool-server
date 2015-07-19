import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Objects;

/**
 * Created by the_FONZ on 07/04/2015.
 */

/** KeyCodes KeyMap for reference ...
 *
 *  KeyCode received  |  KeyEvent to send
 *
    1  = KeyEvent.VK_A
    2  = KeyEvent.VK_B
    3  = KeyEvent.VK_C
    4  = KeyEvent.VK_D
    5  = KeyEvent.VK_E
    6  = KeyEvent.VK_F
    7  = KeyEvent.VK_G
    8  = KeyEvent.VK_H
    9  = KeyEvent.VK_I
    10 = KeyEvent.VK_J
    11 = KeyEvent.VK_K
    12 = KeyEvent.VK_L
    13 = KeyEvent.VK_M
    14 = KeyEvent.VK_N
    15 = KeyEvent.VK_O
    16 = KeyEvent.VK_P
    17 = KeyEvent.VK_Q
    18 = KeyEvent.VK_R
    19 = KeyEvent.VK_S
    20 = KeyEvent.VK_T
    21 = KeyEvent.VK_U
    22 = KeyEvent.VK_V
    23 = KeyEvent.VK_W
    24 = KeyEvent.VK_X
    25 = KeyEvent.VK_Y
    26 = KeyEvent.VK_Z
    27 = KeyEvent.VK_0
    28 = KeyEvent.VK_1
    29 = KeyEvent.VK_2
    30 = KeyEvent.VK_3
    31 = KeyEvent.VK_4
    32 = KeyEvent.VK_5
    33 = KeyEvent.VK_6
    34 = KeyEvent.VK_7
    35 = KeyEvent.VK_8
    36 = KeyEvent.VK_9
    37 = KeyEvent.VK_NUMPAD0
    38 = KeyEvent.VK_NUMPAD1
    39 = KeyEvent.VK_NUMPAD2
    40 = KeyEvent.VK_NUMPAD3
    41 = KeyEvent.VK_NUMPAD4
    42 = KeyEvent.VK_NUMPAD5
    43 = KeyEvent.VK_NUMPAD6
    44 = KeyEvent.VK_NUMPAD7
    45 = KeyEvent.VK_NUMPAD8
    46 = KeyEvent.VK_NUMPAD9
    47 = KeyEvent.VK_UP
    48 = KeyEvent.VK_DOWN
    49 = KeyEvent.VK_LEFT
    50 = KeyEvent.VK_RIGHT
    51 = KeyEvent.VK_BACK_SPACE
    52 = KeyEvent.VK_PAUSE
    53 = KeyEvent.VK_CAPS_LOCK
    54 = KeyEvent.VK_DELETE
    55 = KeyEvent.VK_END
    56 = KeyEvent.VK_ENTER
    57 = KeyEvent.VK_ESCAPE
    58 = KeyEvent.VK_HOME
    59 = KeyEvent.VK_INSERT
    60 = KeyEvent.VK_NUM_LOCK
    61 = KeyEvent.VK_PAGE_DOWN
    62 = KeyEvent.VK_PAGE_UP
    63 = KeyEvent.VK_PRINTSCREEN
    64 = KeyEvent.VK_SCROLL_LOCK
    65 = KeyEvent.VK_TAB
    66 = KeyEvent.VK_F1
    67 = KeyEvent.VK_F2
    68 = KeyEvent.VK_F3
    69 = KeyEvent.VK_F4
    70 = KeyEvent.VK_F5
    71 = KeyEvent.VK_F6
    72 = KeyEvent.VK_F7
    73 = KeyEvent.VK_F8
    74 = KeyEvent.VK_F9
    75 = KeyEvent.VK_F10
    76 = KeyEvent.VK_F11
    77 = KeyEvent.VK_F12
    78 = KeyEvent.VK_F13
    79 = KeyEvent.VK_F14
    80 = KeyEvent.VK_F15
    81 = KeyEvent.VK_F16
    82 = KeyEvent.VK_ADD
    83 = KeyEvent.VK_SUBTRACT
    84 = KeyEvent.VK_MULTIPLY
    85 = KeyEvent.VK_DIVIDE
    86 = KeyEvent.VK_CONTROL
    87 = KeyEvent.VK_SHIFT
    88 = KeyEvent.VK_ALT
    89 = KeyEvent.VK_SLASH
    90 = KeyEvent.VK_BACK_SLASH
    91 = KeyEvent.VK_COMMA
    92 = KeyEvent.VK_EQUALS
    93 = KeyEvent.VK_OPEN_BRACKET
    94 = KeyEvent.VK_CLOSE_BRACKET
    95 = KeyEvent.VK_PERIOD
    96 = KeyEvent.VK_QUOTE
    97 = KeyEvent.VK_BACK_QUOTE
    98 = KeyEvent.VK_SEMICOLON
    99 = KeyEvent.VK_DECIMAL
 *
 *  End of KeyCodes KeyMap
 */

public class CustomKeyMapRobot {
    public CustomKeyMapRobot(String key)  throws AWTException {
        try {
            Robot robot = new Robot();
            // Check what KeyCode we received and Send the relevant KeyEvent to the active window
            if (Objects.equals(key, "1")) {
                robot.keyPress(KeyEvent.VK_A);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_A);
            }else if (Objects.equals(key, "2")) {
                robot.keyPress(KeyEvent.VK_B);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_B);
            }else if (Objects.equals(key, "3")) {
                robot.keyPress(KeyEvent.VK_C);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_C);
            }else if (Objects.equals(key, "4")) {
                robot.keyPress(KeyEvent.VK_D);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_D);
            }else if (Objects.equals(key, "5")) {
                robot.keyPress(KeyEvent.VK_E);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_E);
            }else if (Objects.equals(key, "6")) {
                robot.keyPress(KeyEvent.VK_F);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F);
            }else if (Objects.equals(key, "7")) {
                robot.keyPress(KeyEvent.VK_G);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_G);
            }else if (Objects.equals(key, "8")) {
                robot.keyPress(KeyEvent.VK_H);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_H);
            }else if (Objects.equals(key, "9")) {
                robot.keyPress(KeyEvent.VK_I);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_I);
            }else if (Objects.equals(key, "10")) {
                robot.keyPress(KeyEvent.VK_J);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_J);
            }else if (Objects.equals(key, "11")) {
                robot.keyPress(KeyEvent.VK_K);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_K);
            }else if (Objects.equals(key, "12")) {
                robot.keyPress(KeyEvent.VK_L);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_L);
            }else if (Objects.equals(key, "13")) {
                robot.keyPress(KeyEvent.VK_M);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_M);
            }else if (Objects.equals(key, "14")) {
                robot.keyPress(KeyEvent.VK_N);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_N);
            }else if (Objects.equals(key, "15")) {
                robot.keyPress(KeyEvent.VK_O);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_O);
            }else if (Objects.equals(key, "16")) {
                robot.keyPress(KeyEvent.VK_P);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_P);
            }else if (Objects.equals(key, "17")) {
                robot.keyPress(KeyEvent.VK_Q);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_Q);
            }else if (Objects.equals(key, "18")) {
                robot.keyPress(KeyEvent.VK_R);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_R);
            }else if (Objects.equals(key, "19")) {
                robot.keyPress(KeyEvent.VK_S);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_S);
            }else if (Objects.equals(key, "20")) {
                robot.keyPress(KeyEvent.VK_T);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_T);
            }else if (Objects.equals(key, "21")) {
                robot.keyPress(KeyEvent.VK_U);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_U);
            }else if (Objects.equals(key, "22")) {
                robot.keyPress(KeyEvent.VK_V);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_V);
            }else if (Objects.equals(key, "23")) {
                robot.keyPress(KeyEvent.VK_W);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_W);
            }else if (Objects.equals(key, "24")) {
                robot.keyPress(KeyEvent.VK_X);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_X);
            }else if (Objects.equals(key, "25")) {
                robot.keyPress(KeyEvent.VK_Y);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_Y);
            }else if (Objects.equals(key, "26")) {
                robot.keyPress(KeyEvent.VK_Z);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_Z);
            }else if (Objects.equals(key, "27")) {
                robot.keyPress(KeyEvent.VK_0);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_0);
            }else if (Objects.equals(key, "28")) {
                robot.keyPress(KeyEvent.VK_1);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_1);
            }else if (Objects.equals(key, "29")) {
                robot.keyPress(KeyEvent.VK_2);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_2);
            }else if (Objects.equals(key, "30")) {
                robot.keyPress(KeyEvent.VK_3);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_3);
            }else if (Objects.equals(key, "31")) {
                robot.keyPress(KeyEvent.VK_4);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_4);
            }else if (Objects.equals(key, "32")) {
                robot.keyPress(KeyEvent.VK_5);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_5);
            }else if (Objects.equals(key, "33")) {
                robot.keyPress(KeyEvent.VK_6);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_6);
            }else if (Objects.equals(key, "34")) {
                robot.keyPress(KeyEvent.VK_7);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_7);
            }else if (Objects.equals(key, "35")) {
                robot.keyPress(KeyEvent.VK_8);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_8);
            }else if (Objects.equals(key, "36")) {
                robot.keyPress(KeyEvent.VK_9);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_9);
            }else if (Objects.equals(key, "37")) {
                robot.keyPress(KeyEvent.VK_NUMPAD0);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD0);
            }else if (Objects.equals(key, "38")) {
                robot.keyPress(KeyEvent.VK_NUMPAD1);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD1);
            }else if (Objects.equals(key, "39")) {
                robot.keyPress(KeyEvent.VK_NUMPAD2);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD2);
            }else if (Objects.equals(key, "40")) {
                robot.keyPress(KeyEvent.VK_NUMPAD3);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD3);
            }else if (Objects.equals(key, "41")) {
                robot.keyPress(KeyEvent.VK_NUMPAD4);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD4);
            }else if (Objects.equals(key, "42")) {
                robot.keyPress(KeyEvent.VK_NUMPAD5);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD5);
            }else if (Objects.equals(key, "43")) {
                robot.keyPress(KeyEvent.VK_NUMPAD6);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD6);
            }else if (Objects.equals(key, "44")) {
                robot.keyPress(KeyEvent.VK_NUMPAD7);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD7);
            }else if (Objects.equals(key, "45")) {
                robot.keyPress(KeyEvent.VK_NUMPAD8);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD8);
            }else if (Objects.equals(key, "46")) {
                robot.keyPress(KeyEvent.VK_NUMPAD9);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUMPAD9);
            }else if (Objects.equals(key, "47")) {
                robot.keyPress(KeyEvent.VK_UP);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_UP);
            }else if (Objects.equals(key, "48")) {
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }else if (Objects.equals(key, "49")) {
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_LEFT);
            }else if (Objects.equals(key, "50")) {
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_RIGHT);
            }else if (Objects.equals(key, "51")) {
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            }else if (Objects.equals(key, "52")) {
                robot.keyPress(KeyEvent.VK_PAUSE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_PAUSE);
            }else if (Objects.equals(key, "53")) {
                robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
            }else if (Objects.equals(key, "54")) {
                robot.keyPress(KeyEvent.VK_DELETE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_DELETE);
            }else if (Objects.equals(key, "55")) {
                robot.keyPress(KeyEvent.VK_END);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_END);
            }else if (Objects.equals(key, "56")) {
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }else if (Objects.equals(key, "57")) {
                robot.keyPress(KeyEvent.VK_ESCAPE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_ESCAPE);
            }else if (Objects.equals(key, "58")) {
                robot.keyPress(KeyEvent.VK_HOME);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_HOME);
            }else if (Objects.equals(key, "59")) {
                robot.keyPress(KeyEvent.VK_INSERT);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_INSERT);
            }else if (Objects.equals(key, "60")) {
                robot.keyPress(KeyEvent.VK_NUM_LOCK);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_NUM_LOCK);
            }else if (Objects.equals(key, "61")) {
                robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
            }else if (Objects.equals(key, "62")) {
                robot.keyPress(KeyEvent.VK_PAGE_UP);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_PAGE_UP);
            }else if (Objects.equals(key, "63")) {
                robot.keyPress(KeyEvent.VK_PRINTSCREEN);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
            }else if (Objects.equals(key, "64")) {
                robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_SCROLL_LOCK);
            }else if (Objects.equals(key, "65")) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_TAB);
            }else if (Objects.equals(key, "66")) {
                robot.keyPress(KeyEvent.VK_F1);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F1);
            }else if (Objects.equals(key, "67")) {
                robot.keyPress(KeyEvent.VK_F2);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F2);
            }else if (Objects.equals(key, "68")) {
                robot.keyPress(KeyEvent.VK_F3);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F3);
            }else if (Objects.equals(key, "69")) {
                robot.keyPress(KeyEvent.VK_F4);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F4);
            }else if (Objects.equals(key, "70")) {
                robot.keyPress(KeyEvent.VK_F5);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F5);
            }else if (Objects.equals(key, "71")) {
                robot.keyPress(KeyEvent.VK_F6);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F6);
            }else if (Objects.equals(key, "72")) {
                robot.keyPress(KeyEvent.VK_F7);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F7);
            }else if (Objects.equals(key, "73")) {
                robot.keyPress(KeyEvent.VK_F8);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F8);
            }else if (Objects.equals(key, "74")) {
                robot.keyPress(KeyEvent.VK_F9);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F9);
            }else if (Objects.equals(key, "75")) {
                robot.keyPress(KeyEvent.VK_F10);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F10);
            }else if (Objects.equals(key, "76")) {
                robot.keyPress(KeyEvent.VK_F11);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F11);
            }else if (Objects.equals(key, "77")) {
                robot.keyPress(KeyEvent.VK_F12);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F12);
            }else if (Objects.equals(key, "78")) {
                robot.keyPress(KeyEvent.VK_F13);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F13);
            }else if (Objects.equals(key, "79")) {
                robot.keyPress(KeyEvent.VK_F14);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F14);
            }else if (Objects.equals(key, "80")) {
                robot.keyPress(KeyEvent.VK_F15);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F15);
            }else if (Objects.equals(key, "81")) {
                robot.keyPress(KeyEvent.VK_F16);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_F16);
            }else if (Objects.equals(key, "82")) {
                robot.keyPress(KeyEvent.VK_ADD);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_ADD);
            }else if (Objects.equals(key, "83")) {
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
            }else if (Objects.equals(key, "84")) {
                robot.keyPress(KeyEvent.VK_MULTIPLY);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_MULTIPLY);
            }else if (Objects.equals(key, "85")) {
                robot.keyPress(KeyEvent.VK_DIVIDE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_DIVIDE);
            }else if (Objects.equals(key, "86")) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }else if (Objects.equals(key, "87")) {
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }else if (Objects.equals(key, "88")) {
                robot.keyPress(KeyEvent.VK_ALT);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_ALT);
             }else if (Objects.equals(key, "89")) {
                robot.keyPress(KeyEvent.VK_SLASH);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_SLASH);
            }else if (Objects.equals(key, "90")) {
                robot.keyPress(KeyEvent.VK_BACK_SLASH);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_BACK_SLASH);
            }else if (Objects.equals(key, "91")) {
                robot.keyPress(KeyEvent.VK_COMMA);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_COMMA);
            }else if (Objects.equals(key, "92")) {
                robot.keyPress(KeyEvent.VK_EQUALS);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_EQUALS);
            }else if (Objects.equals(key, "93")) {
                robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
            }else if (Objects.equals(key, "94")) {
                robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
            }else if (Objects.equals(key, "95")) {
                robot.keyPress(KeyEvent.VK_PERIOD);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_PERIOD);
            }else if (Objects.equals(key, "96")) {
                robot.keyPress(KeyEvent.VK_QUOTE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_QUOTE);
            }else if (Objects.equals(key, "97")) {
                robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
            }else if (Objects.equals(key, "98")) {
                robot.keyPress(KeyEvent.VK_SEMICOLON);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_SEMICOLON);
            }else if (Objects.equals(key, "99")) {
                robot.keyPress(KeyEvent.VK_DECIMAL);
                robot.delay(100);
                robot.keyRelease(KeyEvent.VK_DECIMAL);
            }
        } catch (AWTException e) {
            e.printStackTrace();
            System.out.println(" Error : " + e);
        }
    }
}