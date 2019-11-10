package LogicV2;

import java.io.File;
import java.util.LinkedList;

public class UserDataV2 {
    
    public void DATA_CONTROLLER(){
        CREATE_DATA_TXT_FILE_IF_DOESNT_EXIST();
    }

    private boolean DOES_DATA_TXT_FILE_EXIT() {
        File file = new File(Memory.DATA_PATH_V2);
        return file.exists();
    }

    private void CREATE_DATA_TXT_FILE_IF_DOESNT_EXIST() {
        if(DOES_DATA_TXT_FILE_EXIT()){
            System.out.println("Data file found.");
            LOAD_DATA();
            System.out.println("Data loaded.");
        }else{
            System.out.println("Data file does not exit.");
            CREATE_DATA_FILE();
            System.out.println("Data file created.");
        }
    }
    
    private void LOAD_DATA(){
        LinkedList<String> data_lines = Run.readLines(Memory.DATA_PATH_V2);
        
    }
    
    private void CREATE_DATA_FILE(){
        String path = Memory.DataFolderPath;
        String content = DATA_FILE_CONTENT();
        Memory.run.BuildTxtFile(path, "USER_DATA_V2", ".txt", content);
    }
    
    private String DATA_FILE_CONTENT(){
        String content = "seconds=0\r\n"
                + "minutes=2\r\n"
                + "save_type=CTRL+S\r\n"
                + "show_save_message=true\r\n"
                + "save_message_position=CORNER_UP_LEFT\r\n";
        return content;
    }

}
