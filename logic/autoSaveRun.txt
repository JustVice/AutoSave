package logic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class autoSaveRun extends Thread {

    private boolean stillRunning = true;

    public autoSaveRun() {
        Thread f = new Thread(this);
        f.start();
    }

    @Override
    public void run() {
        while (stillRunning) {
            switch (Static.parameterStatic) {
                case 0:/*CTRL + S*/
                    System.out.println("CTRL + S");
                    CS();
                    break;
                case 1:/*CTRL + G*/
                    System.out.println("CTRL + G");
                    CG();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Thread stopped");
    }

    private void CS() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Static.run.savedMe();
            System.out.println("Saved. CTRL + S");
            Thread.sleep(Static.timeStatic);
        } catch (InterruptedException ex) {
            Logger.getLogger(autoSaveRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(autoSaveRun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CG() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Static.run.savedMe();
            System.out.println("Saved. CTRL + G");
            Thread.sleep(Static.timeStatic);
        } catch (InterruptedException ex) {
            Logger.getLogger(autoSaveRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(autoSaveRun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isStillRunning() {
        return stillRunning;
    }

    public void setStillRunning(boolean stillRunning) {
        this.stillRunning = stillRunning;
    }

}
