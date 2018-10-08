package logic;

public class Run {

    public Run() {
        Static.data.LoadData();
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    public int timeConverter(String secS, String minS) {
        int sec = Integer.parseInt(secS);
        int min = Integer.parseInt(minS);
        int totalTime = 0;
        if (sec != 0) {
            totalTime += (sec * 1000);
        }
        if (min != 0) {
            totalTime += (min * 60000);
        }
        return totalTime;
    }

    public void savedMe() {
        if (Static.showSavedMessage) {
            saveMessage a = new saveMessage();
        }
    }

}
