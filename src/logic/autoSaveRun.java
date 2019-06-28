package logic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class autoSaveRun implements Runnable {

    private boolean run = true;
    private int ID;

    public autoSaveRun() {
        this.ID = ((int)(Math.random()*100000));
        Thread t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        while (run) {
            switch (Static.save_type_action) {
                case 0:/*CTRL + S*/
                    CS();
                    break;
                case 1:/*CTRL + G*/
                    CG();
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("Thread "+ ID + " stopped");
    }

    private void CS() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_S);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Static.run.savedMe();
            System.out.println("Saved. CTRL + S. Thread ID: " + ID);
            Thread.sleep(Static.time_before_save);
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
            System.out.println("Saved. CTRL + G. Thread ID: " + ID);
            Thread.sleep(Static.time_before_save);
        } catch (InterruptedException ex) {
            Logger.getLogger(autoSaveRun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(autoSaveRun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean stillRunning) {
        this.run = stillRunning;
    }

}
