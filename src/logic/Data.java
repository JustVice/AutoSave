package logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Data {

    private UserData userData = new UserData();

    /**
     * Fills the list_dir with the current data storaged on hard drive, also the
     * data will be saved and loaded from a folder.
     */
    public void LoadData() {
        dirFiles(Static.folderForDataName);
        File path = new File(Static.DataPath);
        if (!path.exists()) {
            try {
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Static.DataPath));
                writeFile.writeObject(userData);
                writeFile.close();
            } catch (IOException e) {
                System.out.println("Error creating data file.");
                e.printStackTrace();
            }
        } else {
            try {
                System.out.print("loading data... ");
                ObjectInputStream getFile = new ObjectInputStream(new FileInputStream(Static.DataPath));
                userData = (UserData) getFile.readObject();
                System.out.println("success");
            } catch (IOException localIOException1) {
            } catch (ClassNotFoundException e) {
                System.out.println("Error loading data.");
                e.printStackTrace();
            }
        }
    }

    /**
     * Updates the data file with the new info that user provided and stored on
     * the LinkedList.
     */
    public void updateInfo() {
        File path = new File(Static.DataPath);
        if (path.exists()) {
            try {
                System.out.print("saving data... ");
                ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(Static.DataPath));
                writeFile.writeObject(userData);
                writeFile.close();
                System.out.println("success");
            } catch (IOException e) {
                System.out.println("Error updating data");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "DATA DIRECTORY DELETED. THE PROGRAM WILL CLOSE");
            System.exit(0);
        }
    }

    public UserData getUserData() {
        return userData;
    }

    public void DeleteData() {
        userData = new UserData();
        updateInfo();
    }

    private void dirFiles(String folderName) {
        String path = System.getenv("APPDATA") + "\\" + folderName;
        File file = new File(path);
        System.out.println(path);
        if (!file.exists()) {
            boolean created = file.mkdir();
            if (created) {
                System.out.println("Folder on AppData created...");
            } else {
                programNotCompatible();
            }
        } else {
            System.out.println("Folder on AppData found...");
        }
    }

    private void programNotCompatible() {
        String message = "The program is not currently compatible with your system.\nSupported systems: Windows 7\\8\\8.1\\10.";
        JOptionPane.showMessageDialog(null, message, "NOT COMPATIBLE", 0);
        System.exit(0);
    }

}
