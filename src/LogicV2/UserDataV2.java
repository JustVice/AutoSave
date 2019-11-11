package LogicV2;

import java.io.File;
import java.util.LinkedList;

public class UserDataV2 {

    private String seconds;
    private String minutes;
    private String save_type;
    private String show_save_message;
    private String save_message_position;

    public void DATA_PROGRAM_LAUNCH_CONTROLLER() {
        CHECK_GLOBAL_FOLDER();
        CHECK_PROGRAM_DATA_FOLDER();
        CHECK_DATA_TXT_FILE();
        LOAD_DATA();
        LOAD_DATA_IN_MEMORY();
    }

    public void UPDATE_DATA(String seconds,
            String minutes,
            String save_type,
            String show_save_message,
            String save_message_position) {
        DATA_FILE_CONTENT_UPDATE(seconds, minutes, save_type, show_save_message, save_message_position);
        System.out.println("User Data updated.");
    }

    private void LOAD_DATA() {
        LinkedList<String> data_lines = Run.readLines(Memory.DataFolderPath + "\\USER_DATA_V2");
        this.seconds = GET_VARIABLE_VALUE(data_lines.get(0));
        this.minutes = GET_VARIABLE_VALUE(data_lines.get(1));
        this.save_type = GET_VARIABLE_VALUE(data_lines.get(2));
        this.show_save_message = GET_VARIABLE_VALUE(data_lines.get(3));
        this.save_message_position = GET_VARIABLE_VALUE(data_lines.get(4));
    }

    private void LOAD_DATA_IN_MEMORY() {
        Memory.SAVE_OPTION_TYPE = this.save_type;
        Memory.SHOW_SAVE_MESSAGE = this.show_save_message.equals("true");
        Memory.SAVE_MESSAGE_POSITION = this.save_message_position;
    }

    private void CHECK_DATA_TXT_FILE() {
        String data_path = Memory.DATA_PATH_V2;
        File file = new File(data_path);
        if (!file.exists()) {
            String content = DATA_FILE_CONTENT();
            String data_path_to_create = Memory.DataFolderPath;
            Run.BuildTxtFile(data_path_to_create, "USER_DATA_V2", ".txt", content);
            System.out.println("Data txt file created");
        } else {
            System.out.println("Data txt file found.");
        }
    }

    private String DATA_FILE_CONTENT() {
        String content = "seconds=0\r\n"
                + "minutes=2\r\n"
                + "save_type=CTRL + S\r\n"
                + "show_save_message=true\r\n"
                + "save_message_position=CORNER_UP_LEFT\r\n";
        return content;
    }

    private void DATA_FILE_CONTENT_UPDATE(String seconds,
            String minutes,
            String save_type,
            String show_save_message,
            String save_message_position) {
        String content = "seconds=" + seconds + "\r\n"
                + "minutes=" + minutes + "\r\n"
                + "save_type=" + save_type + "\r\n"
                + "show_save_message=" + show_save_message + "\r\n"
                + "save_message_position=" + save_message_position + "\r\n";
        String data_path_to_update = Memory.DataFolderPath;
        Run.BuildTxtFile(data_path_to_update, "USER_DATA_V2", ".txt", content);
    }

    private void CHECK_GLOBAL_FOLDER() {
        String path = Memory.globalFolderForDataPath;
        File file = new File(path);
        if (!file.exists()) {
            file = new File(path);
            file.mkdir();
            System.out.println("Global folder created.");
        } else {
            System.out.println("Global folder found.");
        }
    }

    private void CHECK_PROGRAM_DATA_FOLDER() {
        String path = Memory.DataFolderPath;
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("Data folder created.");
            file = new File(path);
            file.mkdir();
        } else {
            System.out.println("Data folder found.");
        }
    }

    private String GET_VARIABLE_VALUE(String line) {
        StringBuilder sb = new StringBuilder(line);
        while (true) {
            if (sb.charAt(0) != '=') {
                sb.deleteCharAt(0);
            } else {
                sb.deleteCharAt(0);
                break;
            }
        }
        return sb.toString();
    }

    // <editor-fold desc="Get and set">
    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getSave_type() {
        return save_type;
    }

    public void setSave_type(String save_type) {
        this.save_type = save_type;
    }

    public String getShow_save_message() {
        return show_save_message;
    }

    public void setShow_save_message(String show_save_message) {
        this.show_save_message = show_save_message;
    }

    public String getSave_message_position() {
        return save_message_position;
    }

    public void setSave_message_position(String save_message_position) {
        this.save_message_position = save_message_position;
    }

    // </editor-fold>
}
