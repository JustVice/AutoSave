package LogicV2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class AutoSaveController implements Runnable {

    private boolean THREAD_ACTIVATED = true;
    private int THREAD_ID;

    public AutoSaveController() {
    }

    public void startThread() {
        this.THREAD_ID = ((int) (Math.random() * 100000));
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            while (THREAD_ACTIVATED) {
                Thread.sleep(Memory.TIME_DELAY_TO_SAVE);
                if (THREAD_ACTIVATED) {
                    SAVE_OPTION_SELECTION();
                    Tasks.MESSAGE_SAVED();
                }
            }
            System.out.println("Thread " + THREAD_ID + " stopped");
        } catch (InterruptedException e) {
        }
    }

    private void SAVE_OPTION_SELECTION() {
        switch (Memory.SAVE_OPTION_TYPE) {
            case "CTRL + S":
                CTRL_PLUS_S();
                break;
            case "CTRL + G":
                CTRL_PLUS_G();
                break;
            case "CTRL + A":
                CTRL_PLUS_A();
                break;
            case "CTRL + Shift + S":
                CTRL_SHIFT_S();
                break;
            case "F1":
                F1();
                break;
            case "F2":
                F2();
                break;
            case "F3":
                F3();
                break;
            case "F4":
                F4();
                break;
            case "F5":
                F5();
                break;
            case "F6":
                F6();
                break;
            case "F7":
                F7();
                break;
            case "F8":
                F8();
                break;
            case "F9":
                F9();
                break;
            case "F10":
                F10();
                break;
            case "F11":
                F11();
                break;
            case "F12":
                F12();
                break;
            default:
                throw new AssertionError();
        }
    }

    // <editor-fold desc="Save option methods">
    private void CTRL_PLUS_S() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            System.out.println("Saved. CTRL + S. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {

        }
    }

    private void CTRL_PLUS_G() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            System.out.println("Saved. CTRL + G. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {

        }
    }

    private void CTRL_PLUS_A() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_A);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            System.out.println("Saved. CTRL + A. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {

        }
    }

    private void CTRL_SHIFT_S() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_S);
            System.out.println("Saved. CTRL + SHIFT + S. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {

        }
    }

    private void F1() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F1);
            robot.keyRelease(KeyEvent.VK_F1);
            System.out.println("Saved. F1. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F2() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F2);
            robot.keyRelease(KeyEvent.VK_F2);
            System.out.println("Saved. F2. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F3() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F3);
            robot.keyRelease(KeyEvent.VK_F3);
            System.out.println("Saved. F3. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F4() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F4);
            robot.keyRelease(KeyEvent.VK_F4);
            System.out.println("Saved. F4. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F5() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F5);
            robot.keyRelease(KeyEvent.VK_F5);
            System.out.println("Saved. F5. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F6() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F6);
            robot.keyRelease(KeyEvent.VK_F6);
            System.out.println("Saved. F6. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F7() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F7);
            robot.keyRelease(KeyEvent.VK_F7);
            System.out.println("Saved. F7. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F8() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F8);
            robot.keyRelease(KeyEvent.VK_F8);
            System.out.println("Saved. F8. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F9() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F9);
            robot.keyRelease(KeyEvent.VK_F9);
            System.out.println("Saved. F9. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F10() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F10);
            robot.keyRelease(KeyEvent.VK_F10);
            System.out.println("Saved. F10. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F11() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F11);
            robot.keyRelease(KeyEvent.VK_F11);
            System.out.println("Saved. F11. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    private void F12() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_F12);
            robot.keyRelease(KeyEvent.VK_F12);
            System.out.println("Saved. F12. Thread ID: " + THREAD_ID);
        } catch (AWTException ex) {
        }
    }

    // </editor-fold>
    public boolean isThreadActivated() {
        return THREAD_ACTIVATED;
    }

    public void setThreadActivated(boolean stillRunning) {
        this.THREAD_ACTIVATED = stillRunning;
    }

}
