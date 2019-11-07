package UI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import logic.Static;
import logic.AutoSaveController;

public class MainFrame extends javax.swing.JFrame implements Runnable {

    private AutoSaveController AUTO_SAVE_CONTROLLER;
    private final String START_BUTTON_TEXT = "Start";
    private final String STOP_BUTTON_TEXT = "Stop";
    private boolean IS_AUTO_SAVE_WORKING = false;

    //THREAD CONTROLLER - DIFFERENT THREAD ACTIONS TO PERFORM.
    private String THREAD_ACTION = "";
    private String SECONDS_CONTROLLER = "SECONDS_CONTROLLER";
    private String MINUTES_CONTROLLER = "MINUTES_CONTROLLER";

    public MainFrame() {
        initComponents();
        FRAME_SETTINGS();
        UI_SETTINGS();
        UI_SETTINGS_USERDATA();
    }

    private void FRAME_SETTINGS() {
        //Sets the frame at the center.
        this.setLocationRelativeTo(null);
        //Makes the frame visible.
        this.setVisible(true);
        //Prevents user to resize the window.
        setResizable(false);
        //Sets status bar info.
        setTitle(Static.title + " " + Static.version);
        //Sets the icon image.
        setIconImage(Static.getIconImage());
    }

    private void UI_SETTINGS() {
        CHANGE_START_STOP_BUTTON_TEXT(START_BUTTON_TEXT);
    }

    private void UI_SETTINGS_USERDATA() {
        //If show_saved_message is true, the show saved alert will be selected
        //or not.
        if (Static.SHOW_SAVE_MESSAGE_ON_DISPLAY) {
            jRadioButton_show_saved_alert.setSelected(true);
        } else {
            jRadioButton_show_saved_alert.setSelected(false);
        }

        //Display saved message switch
        if (Static.data.getUserData().isShowSavedMessage()) {
            jRadioButton_show_saved_alert.setSelected(true);
            Static.SHOW_SAVE_MESSAGE_ON_DISPLAY = true;
        } else {
            jRadioButton_show_saved_alert.setSelected(false);
            Static.SHOW_SAVE_MESSAGE_ON_DISPLAY = false;
        }
    }

    //Updates the values inside the User Data and writes it inside the .txt 
    //user data file.
    private void SAVE_USER_DATA() {
        //If CTRL + S is selected, "S" will be saved inside the savePrefix
        //value.
//        if (jRadioButton_CTRL_and_S.isSelected()) {
//            Static.data.getUserData().setSavePrefix("S");
//        } else {
//            //If CTRL + G is selected, "G" will be saved inside the savePrefix
//            //value.
//            Static.data.getUserData().setSavePrefix("G");
//        }
        //If combobox show saved alert is selected showSavedMessage on User Data
        //will be updated.
        if (jRadioButton_show_saved_alert.isSelected()) {
            Static.data.getUserData().setShowSavedMessage(true);
        } else {
            Static.data.getUserData().setShowSavedMessage(false);
        }
        //Updates the info of the .txt file.
        Static.data.updateInfo();
    }

    private void CHANGE_START_STOP_BUTTON_TEXT(String STATUS) {
        this.jButton_START_AUTO_SAVE.setText(STATUS);
    }

    private void ABLE_DISABLE_TEXT_FIELDS(boolean STATUS) {
        this.jTextField_minutes.setEnabled(STATUS);
        this.jTextField_seconds.setEnabled(STATUS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton_START_AUTO_SAVE = new javax.swing.JButton();
        jRadioButton_show_saved_alert = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_save_option = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTextField_minutes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        jTextField_seconds = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        Github = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alllinks = new javax.swing.JLabel();
        jlabe_webpage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_START_AUTO_SAVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_START_AUTO_SAVE.setText("START/STOP");
        jButton_START_AUTO_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_START_AUTO_SAVEActionPerformed(evt);
            }
        });

        jRadioButton_show_saved_alert.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton_show_saved_alert.setText("Display saved message");
        jRadioButton_show_saved_alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_show_saved_alertActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Save option");

        jComboBox_save_option.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_save_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CTRL + S", "CTRL + G", "CTRL + A", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));

        jTextField_minutes.setText("0");
        jTextField_minutes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_minutesKeyTyped(evt);
            }
        });

        jLabel2.setText("MINUTES");

        sec.setText("SECONDS");

        jTextField_seconds.setText("0");
        jTextField_seconds.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_secondsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(sec))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_seconds, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jTextField_minutes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_START_AUTO_SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_show_saved_alert)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox_save_option, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox_save_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_show_saved_alert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_START_AUTO_SAVE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv_about_img.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv name.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Made by:");

        twitter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        twitter.setText("<html><a href=\"http://www.google.com\">Twitter</a></html>");
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });

        Github.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Github.setText("<html><a href=\"http://www.google.com\">Github</a></html>");
        Github.setToolTipText("<html><a href=\"http://www.google.com\">Github</a>\n</html>");
        Github.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GithubMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Links:");

        alllinks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        alllinks.setText("<html><a href=\"http://www.google.com\">All links</a></html>");
        alllinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alllinksMouseClicked(evt);
            }
        });

        jlabe_webpage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlabe_webpage.setText("<html><a href=\"http://www.google.com\">Web page</a></html>");
        jlabe_webpage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabe_webpageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlabe_webpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlabe_webpage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AUTO_SAVE_CONTROLLER() {
        if (!IS_AUTO_SAVE_WORKING) {
            if (IS_DELAY_OVER_10SECONDS()) {
                START_AUTO_SAVE();
            } else {
                if (CONTINUE_WITH_DELAY_UNDER_10SECONDS()) {
                    START_AUTO_SAVE();
                }
            }
        } else {
            STOP_AUTO_SAVE();
        }
    }

    private void START_AUTO_SAVE() {
        this.AUTO_SAVE_CONTROLLER = new AutoSaveController();
        this.AUTO_SAVE_CONTROLLER.startWorking();
        this.IS_AUTO_SAVE_WORKING = true;
        CHANGE_START_STOP_BUTTON_TEXT(STOP_BUTTON_TEXT);
        System.out.println("Auto save working.");
    }

    private void STOP_AUTO_SAVE() {
        this.AUTO_SAVE_CONTROLLER.setThreadActivated(false);
        this.IS_AUTO_SAVE_WORKING = false;
        CHANGE_START_STOP_BUTTON_TEXT(START_BUTTON_TEXT);
        System.out.println("Auto save stopped.");
    }

    private boolean IS_DELAY_OVER_10SECONDS() {
        int DELAY_BEFORE_SAVE = Static.run.MILLISECONDS_TIME_CONVERTER(jTextField_seconds.getText(),
                jTextField_minutes.getText());
        if (DELAY_BEFORE_SAVE > 10000) {
            return true;
        } else {
            return false;
        }
    }

    private boolean CONTINUE_WITH_DELAY_UNDER_10SECONDS() {
        String message = "\"You are setting an under/equals 10 seconds timelapse to perform a CTRL + S/G\"\n"
                + "+ \"\\nThere will be a continuos spam of CTRL + S/G. It is recomended to set 2 minutes.\\n\"\n"
                + "+ \"Do you want to continue?\"";
        int option = JOptionPane.showConfirmDialog(null, message);
        if (option == 0) {
            System.out.println("Auto save confirmed to work with under 10 seconds delay.");
            return true;
        } else {
            System.out.println("Auto save cancelled due short delay time by user.");
            return false;
        }
    }

    private void jButton_START_AUTO_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_START_AUTO_SAVEActionPerformed
        AUTO_SAVE_CONTROLLER();
    }//GEN-LAST:event_jButton_START_AUTO_SAVEActionPerformed

    private void jRadioButton_show_saved_alertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_show_saved_alertActionPerformed
        if (jRadioButton_show_saved_alert.isSelected()) {
            Static.SHOW_SAVE_MESSAGE_ON_DISPLAY = true;
            SAVE_USER_DATA();
        } else {
            Static.SHOW_SAVE_MESSAGE_ON_DISPLAY = false;
            SAVE_USER_DATA();
        }
    }//GEN-LAST:event_jRadioButton_show_saved_alertActionPerformed

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        Static.run.open_link("https://justvice.github.io/s/twitter");
    }//GEN-LAST:event_twitterMouseClicked

    private void GithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubMouseClicked
        Static.run.open_link("https://justvice.github.io/s/github-repos");
    }//GEN-LAST:event_GithubMouseClicked

    private void alllinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alllinksMouseClicked
        Static.run.open_link("https://justvice.github.io/s/links");
    }//GEN-LAST:event_alllinksMouseClicked

    private void jlabe_webpageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabe_webpageMouseClicked
        Static.run.open_link("https://justvice.github.io");
    }//GEN-LAST:event_jlabe_webpageMouseClicked

    private void jTextField_secondsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_secondsKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || jTextField_seconds.getText().length() == 2) {
            evt.consume();
        }

        if (jTextField_seconds.getText().equals("")) {
            jTextField_seconds.setText("0");
        } else {
            if (jTextField_seconds.getText().equals("0")) {
                evt.consume();
                jTextField_seconds.setText(c + "");
            }
        }

        //Controls if the seconds text field has a number over 60.
        Thread thread = new Thread(this);
        this.THREAD_ACTION = this.SECONDS_CONTROLLER;
        thread.start();

        //PLACES NUMBER TYPED.
    }//GEN-LAST:event_jTextField_secondsKeyTyped

    private void jTextField_minutesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_minutesKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || jTextField_minutes.getText().length() == 2) {
            evt.consume();
        }

        if (jTextField_minutes.getText().equals("")) {
            jTextField_minutes.setText("0");
        } else {
            if (jTextField_minutes.getText().equals("0")) {
                evt.consume();
                jTextField_minutes.setText(c + "");
            }
        }

        //Controls if the seconds text field has a number over 60.
        Thread thread = new Thread(this);
        this.THREAD_ACTION = this.SECONDS_CONTROLLER;
        thread.start();

        //PLACES NUMBER TYPED.
    }//GEN-LAST:event_jTextField_minutesKeyTyped

    @Override
    public void run() {
        switch (this.THREAD_ACTION) {
            case "SECONDS_CONTROLLER":
                try {
                    Thread.sleep(50);
                    if (Integer.parseInt(jTextField_seconds.getText()) > 60) {
                        //SETS TEXT TO 60. MOVES CURSOR TO THE END OF THE JTEXTFIELD.
                        this.jTextField_seconds.setText("60");
                        jTextField_seconds.setCaretPosition(jTextField_seconds.getDocument().getLength());
                    }
                } catch (Exception e) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Github;
    private javax.swing.JLabel alllinks;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_START_AUTO_SAVE;
    private javax.swing.JComboBox<String> jComboBox_save_option;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_show_saved_alert;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_minutes;
    private javax.swing.JTextField jTextField_seconds;
    private javax.swing.JLabel jlabe_webpage;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables

}
