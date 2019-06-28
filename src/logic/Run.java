package logic;

import UI.saveMessage;
import UI.MainFrame;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Run {

    public Run() {
        Static.data.LoadData();
        MainFrame frame = new MainFrame();
    }

    public int timeConverter(String secS, String minS) {
        int sec = Integer.parseInt(secS);
        int min = Integer.parseInt(minS);
        int totalTime = 0;
        if (sec != 0) {
            totalTime += (sec * 1000);
        }
        if (min != 0) {
            totalTime += (min * 60000);
        }
        return totalTime;
    }

    public void savedMe() {
        if (Static.show_saved_message) {
            saveMessage a = new saveMessage();
        }
    }

    public void open_link(String link) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * 0=Error 1=Message 2=Alert 3=What
     *
     * @param type
     * @param message
     * @param title
     */
    public void message(String message, String title, int type) {
        switch (type) {
            case 0:/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case 1:/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case 2:/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case 3:/*What*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

}
