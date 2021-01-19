package LogicV2;

import java.awt.Image;
import java.awt.Toolkit;

public class Memory {

    // <editor-fold desc="Data folder related">
    // Data file name
    public static String dataFileName = "USER_DATA_V2.txt";
    //Program title. Version.
    public static String title = "AutoSave", version = "1.3.1";
    //Folder where the data txt file will be saved.
    public static String folderForDataName = "AutoSave";
    //Global Just Vice's data folder name.
    public static String globalFolderForData = "Just Vice";
    //Path to data folder onto Appdata - Roaming + globalFolderForData + folderForDataName
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    //Global Just Vice's data folder path
    public static String globalFolderForDataPath = System.getenv("APPDATA") + "\\" + globalFolderForData;
    //Path to the .txt file that has the program user data stored.
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\" + dataFileName;
    // </editor-fold>

    //USER DATA VARIABLES
    public static String DATA_PATH_V2 = DataFolderPath + "\\" + dataFileName;
    public static UserDataV2 USER_DATA_V2 = new UserDataV2();
    public static int SECONDS = 0;
    public static int MINUTES = 2;
    //Variable TIME_DELAY_TO_SAVE is not saved inside the external data file.
    public static int TIME_DELAY_TO_SAVE = 10000; // Default value -> 10 seconds.
    public static String SAVE_OPTION_TYPE = "CTRL + S"; // Default save option -> CTRL + S.
    public static boolean SHOW_SAVE_MESSAGE = true; // By defatult, Save message is shown.
    public static String SAVE_MESSAGE_POSITION = "CORNER_UP_LEFT"; // By default, Saved message pop's up at the up left corner.

    //Sets the logo of the program.
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogov2_1.png"));
    }
}
