package LogicV2;

import UI.MainFrame;
import UI.saveMessage;
import java.awt.Desktop;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Run {

    public static void START_PROGRAM() {
        Memory.USER_DATA_V2.DATA_PROGRAM_LAUNCH_CONTROLLER();
        MainFrame frame = new MainFrame();
    }

    public static int MILLISECONDS_TIME_CONVERTER(String seconds_string, String minutes_string) {
        int seconds = Integer.parseInt(seconds_string);
        int minutes = Integer.parseInt(minutes_string);
        int milliseconds = 0;
        if (seconds != 0) {
            milliseconds += (seconds * 1000);
        }
        if (minutes != 0) {
            milliseconds += (minutes * 60000);
        }
        return milliseconds;
    }

    public static void MESSAGE_SAVED() {
        if (Memory.SHOW_SAVE_MESSAGE) {
            saveMessage a = new saveMessage();
        }
    }

    public static void open_link(String link) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (URISyntaxException | IOException ex) {
                Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     * Error Message Alert What
     *
     * @param type
     * @param message
     * @param messageType
     * @param title
     */
    public static void message(String message, String title, String messageType) {
        switch (messageType) {
            case "Error":/*Error*/
                JOptionPane.showMessageDialog(null, message, title, 0);
                break;
            case "Message":/*Message*/
                JOptionPane.showMessageDialog(null, message, title, 1);
                break;
            case "Alert":/*Alert*/
                JOptionPane.showMessageDialog(null, message, title, 2);
                break;
            case "What":/*What*/
                JOptionPane.showMessageDialog(null, message, title, 3);
                break;

            default:
                throw new AssertionError();
        }
    }

    public static void BuildTxtFile(String path, String txtFileName, String extension, String content) {
        /*"\r\n" to jump between lines*/
        System.out.print("writing...");
        File file;
        if (!path.equals("here")) {
            file = new File(path + "\\" + txtFileName + extension);
        } else {
            file = new File(System.getProperty("user.dir") + "\\" + txtFileName + extension);
        }
        try {
            String frase = content;
            if (frase.equals("")) {
                frase = "No content.";
            }
            FileWriter escritura = new FileWriter(file.getPath());
            for (int i = 0; i < frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }
            System.out.println("done");
            escritura.close();
        } catch (Exception ex) {
            System.out.println("Error\n" + ex);
        }
    }

    public static LinkedList<String> readLines(String pathName) {
        LinkedList<String> listLines = new LinkedList<String>();
        try {
            FileReader entrada = new FileReader(pathName + ".txt");
            BufferedReader buffer = new BufferedReader(entrada);
            String linea = "";
            while (linea != null) {
                linea = buffer.readLine();
                if (linea != null) {
//                    System.out.println(linea);
                    listLines.add(linea);
                }
            }
            entrada.close();
            buffer.close();
//            System.out.println("");
        } catch (IOException ex) {
            System.out.println("File does not exist.\n");
        }
        return listLines;
    }

}
