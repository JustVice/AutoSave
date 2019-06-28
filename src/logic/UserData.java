package logic;

import java.io.Serializable;

public class UserData implements Serializable {

    private static final long serialVersionUID = 8823784723847276147L;

    //savePrefix: If S, the combo box of CTRL + S will be selected when the
    //program starts. If G, the the combo box of CTRL + S will be selected when
    //the program starts.
    private String savePrefix = "S";
    //The main ui will be displayed with the seconds stored at the sec variable.
    private String sec = "0";
    //The main ui will be displayed with the minutes stored at the sec variable.
    private String min = "2";
    //If true, the combobox "show saved alert will be selected.
    private boolean showSavedMessage = true;

    public UserData() {
    }

    public String getSavePrefix() {
        return savePrefix;
    }

    public void setSavePrefix(String savePrefix) {
        this.savePrefix = savePrefix;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public boolean isShowSavedMessage() {
        return showSavedMessage;
    }

    public void setShowSavedMessage(boolean showSavedMessage) {
        this.showSavedMessage = showSavedMessage;
    }

}
