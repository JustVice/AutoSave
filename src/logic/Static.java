package logic;

import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    //Program title. Version.
    public static String title = "AutoSave", version = "1.2";
    //Static Run object.
    public static Run run;
    //Folder where the data will be saved.
    public static String folderForDataName = "AutoSave";
    //Global data folder name.
    public static String globalFolderForData = "Just Vice";
    //Path to the .txt file that has the program user data stored.
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\UserData.txt";
    //Path to data folder.
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    //Static Data object.
    public static Data data = new Data();
    //Static boolean. If true the saved frame will be displayed. It needs to be
    //static to be used inside a thread and change the state as the thread is
    //running.
    public static boolean SHOW_SAVE_MESSAGE_ON_DISPLAY = true;
    //Saves the milliseconds  that need to be passed before the save action is
    //performed.
    public static int TIME_DELAY_TO_SAVE = 2000;
    //If 0 the program will perform CTRL + S.
    //If 1 the program will perform CTRL + G.
    public static String SAVE_OPTION_TYPE = "CTRL + S";

    //Sets the logo of the program.
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogov2.png"));
    }
}
