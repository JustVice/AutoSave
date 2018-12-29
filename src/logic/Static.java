package logic;

import java.awt.Image;
import java.awt.Toolkit;

public class Static {

    
    public static String title = "AutoSave", version = "1.1";
    public static Run run;
    public static String folderForDataName = "Just Vice AutoSave";
    public static String DataPath = System.getenv("APPDATA") + "\\" + folderForDataName + "\\UserData.txt";
    public static String DataFolderPath = System.getenv("APPDATA") + "\\" + folderForDataName;
    public static Data data = new Data();
    public static boolean showSavedMessage = true;
    public static int timeShowMessage = 1500;
    
    public static int timeStatic = 0;
    public static byte parameterStatic = 0;
    
    public static Image getIconImage() {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMG/iconLogo.png"));
    }
}
