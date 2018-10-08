
package logic;

import java.io.Serializable;

public class UserData implements Serializable {

    private static final long serialVersionUID = 8823784723847276147L;
    
    private String savePrefix = "S",sec = "0",min = "2";
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
