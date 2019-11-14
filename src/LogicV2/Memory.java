package LogicV2;

import LogicV1.Data;
import java.awt.Image;
import java.awt.Toolkit;

public class Memory {

    // <editor-fold desc="Data folder">
    //Program title. Version.
    public static String title = "AutoSave", version = "1.2";
    //Static Run object.
//    public static Run run;
    //Folder where the data will be saved.
    public static String folderForDataName = "AutoSave";
    //Global data folder name.
    public static String globalFolderForData = "Just Vice";
    //Path to data folder.
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName;
    //Global folder path
    public static String globalFolderForDataPath = System.getenv("APPDATA") + "\\" + globalFolderForData;
    //Path to the .txt file that has the program user data stored.
    public static String DataPath = System.getenv("APPDATA") + "\\" + globalFolderForData + "\\" + folderForDataName + "\\USER_DATA_V2.txt";
    //Static Data object.
    public static Data data = new Data();
    // </editor-fold>

    //USER DATA VARIABLES
    public static String DATA_PATH_V2 = DataFolderPath + "\\USER_DATA_V2.txt";
    public static UserDataV2 USER_DATA_V2 = new UserDataV2();
    public static int SECONDS = 0;
    public static int MINUTES = 2;
    public static int TIME_DELAY_TO_SAVE = 10000;
    public static String SAVE_OPTION_TYPE = "CTRL + S";
    public static boolean SHOW_SAVE_MESSAGE = true;
    public static String SAVE_MESSAGE_POSITION = "CORNER_UP_LEFT";

    //Sets the logo of the program.
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogov2.png"));
    }
}
