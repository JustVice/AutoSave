package UI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import LogicV2.Memory;
import LogicV2.AutoSaveController;
import LogicV2.Tasks;

public class MainFrame extends javax.swing.JFrame implements Runnable {

    private AutoSaveController AUTO_SAVE_CONTROLLER;
    private final String START_BUTTON_TEXT = "Start";
    private final String STOP_BUTTON_TEXT = "Stop";
    private boolean IS_AUTO_SAVE_WORKING = false;

    public MainFrame() {
        setIconImage(Memory.getIconImage());
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
        setTitle(Memory.version);
    }

    private void UI_SETTINGS() {
        jComboBox_save_option.setSelectedItem(true);
        CHANGE_START_STOP_BUTTON_TEXT(START_BUTTON_TEXT);
    }

    // Seconds and minutes variables where set when data was loaded. This happened
    // at Tasks.java START_PROGRAM();
    private void UI_SETTINGS_USERDATA() {
        jTextField_seconds.setText(Memory.SECONDS + "");
        jTextField_minutes.setText(Memory.MINUTES + "");
        jComboBox_save_option.setSelectedItem(Memory.SAVE_OPTION_TYPE);
        jRadioButton_show_saved_alert.setSelected(Memory.SHOW_SAVE_MESSAGE);
        JCOMBOBOX_SAVE_IS_FIRST_OPTION_SELECTED_CONTROLLER();
    }

    private void CHANGE_START_STOP_BUTTON_TEXT(String text) {
        jButton_START_AUTO_SAVE.setText(text);
    }

    private void ENABLE_DISABLE_TEXT_FIELDS(boolean STATUS) {
        jTextField_minutes.setEnabled(STATUS);
        jTextField_seconds.setEnabled(STATUS);
    }

    // Updates user data when changes are done.
    private void UPDATE_USER_DATA_INFO() {
        Memory.MINUTES = Integer.parseInt(this.jTextField_minutes.getText());
        Memory.SECONDS = Integer.parseInt(this.jTextField_seconds.getText());
        Memory.USER_DATA_V2.UPDATE_DATA(this.jTextField_seconds.getText(),
                jTextField_minutes.getText(),
                jComboBox_save_option.getSelectedItem().toString(),
                jRadioButton_show_saved_alert.isSelected() + "",
                Memory.SAVE_MESSAGE_POSITION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton_START_AUTO_SAVE = new javax.swing.JButton();
        jRadioButton_show_saved_alert = new javax.swing.JRadioButton();
        jLabel1_save_option = new javax.swing.JLabel();
        jComboBox_save_option = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTextField_minutes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        jTextField_seconds = new javax.swing.JTextField();
        jLabel_title = new javax.swing.JLabel();
        jButton_open_settings = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_vice_page = new javax.swing.JLabel();
        Github = new javax.swing.JLabel();
        jlabe_autosave_page = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jButton_START_AUTO_SAVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_START_AUTO_SAVE.setText("START/STOP");
        jButton_START_AUTO_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_START_AUTO_SAVEActionPerformed(evt);
            }
        });

        jRadioButton_show_saved_alert.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton_show_saved_alert.setText("Display \"saved\" message");
        jRadioButton_show_saved_alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_show_saved_alertActionPerformed(evt);
            }
        });

        jLabel1_save_option.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1_save_option.setText("Save option");

        jComboBox_save_option.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox_save_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CTRL + S", "CTRL + G", "CTRL + A", "CTRL + Shift + S", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12" }));
        jComboBox_save_option.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_save_optionItemStateChanged(evt);
            }
        });

        jTextField_minutes.setText("0");
        jTextField_minutes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_minutesKeyTyped(evt);
            }
        });

        jLabel2.setText("Minutes");

        sec.setText("Seconds");

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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(sec)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField_seconds))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_title.setText("Auto Save");

        jButton_open_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_settings_50px_1.png"))); // NOI18N
        jButton_open_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_open_settingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_save_option)
                    .addComponent(jComboBox_save_option, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_show_saved_alert)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_START_AUTO_SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_title)
                .addGap(18, 18, 18)
                .addComponent(jButton_open_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_open_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_title))
                .addGap(10, 10, 10)
                .addComponent(jLabel1_save_option)
                .addGap(9, 9, 9)
                .addComponent(jComboBox_save_option, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_show_saved_alert)
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_START_AUTO_SAVE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Main", jPanel1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv_about_img.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jv name.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Made by:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Links:");

        twitter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        twitter.setText("<html><a href=\"http://www.google.com\">Twitter</a></html>");
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("click any");

        jLabel_vice_page.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_vice_page.setText("<html><a href=\"http://www.google.com\">Vice's page</a></html>");
        jLabel_vice_page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_vice_pageMouseClicked(evt);
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

        jlabe_autosave_page.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlabe_autosave_page.setText("<html><a href=\"http://www.google.com\">AutoSave Page</a></html>");
        jlabe_autosave_page.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabe_autosave_pageMouseClicked(evt);
            }
        });

        jLabel1.setText("©MIT License - JUSTVICE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabe_autosave_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_vice_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_vice_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabe_autosave_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_START_AUTO_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_START_AUTO_SAVEActionPerformed
        AUTO_SAVE_CONTROLLER();
    }//GEN-LAST:event_jButton_START_AUTO_SAVEActionPerformed

    private void AUTO_SAVE_CONTROLLER() {
        SET_DELAY_TIME_TO_SAVE();
        if (!IS_AUTO_SAVE_WORKING) {
            if (SECURITY_NO_LESS_THAN_1_SECOND_DELAY()) {
                if (IS_DELAY_OVER_10SECONDS()) {
                    START_AUTO_SAVE();
                } else {
                    if (CONTINUE_WITH_DELAY_UNDER_10SECONDS()) {
                        START_AUTO_SAVE();
                    }
                }
            }
        } else {
            STOP_AUTO_SAVE();
        }
    }

    private void SET_DELAY_TIME_TO_SAVE() {
        String seconds = this.jTextField_seconds.getText();
        String minutes = this.jTextField_minutes.getText();
        Memory.TIME_DELAY_TO_SAVE = Tasks.MILLISECONDS_TIME_CONVERTER(seconds, minutes);
    }

    private boolean SECURITY_NO_LESS_THAN_1_SECOND_DELAY() {
        if (Memory.TIME_DELAY_TO_SAVE > 1000) {
            return true;
        } else {
            System.out.println("AutoSave stopped due security 1 second protocole.");
            String message = "For security reasons, you can't set a save delay of 1 second or less.";
            Tasks.message(message, "No less than 1 second", "Alert");
            return false;
        }
    }

    private boolean IS_DELAY_OVER_10SECONDS() {
        int DELAY_BEFORE_SAVE = Tasks.MILLISECONDS_TIME_CONVERTER(jTextField_seconds.getText(),
                jTextField_minutes.getText());
        return DELAY_BEFORE_SAVE > 10000;
    }

    private void START_AUTO_SAVE() {
        JCOMBOBOX_SAVE_DATA();
        ENABLE_DISABLE_TEXT_FIELDS(false);
        jButton_open_settings.setEnabled(false);
        AUTO_SAVE_CONTROLLER = new AutoSaveController();
        AUTO_SAVE_CONTROLLER.startThread();
        IS_AUTO_SAVE_WORKING = true;
        CHANGE_START_STOP_BUTTON_TEXT(STOP_BUTTON_TEXT);
        System.out.println("Auto save working.");
    }

    private boolean CONTINUE_WITH_DELAY_UNDER_10SECONDS() {
        String message = "You are setting an under/equals 10 seconds timelapse to perform a save action.\n"
                + "There will be a continuos spam of CTRL + x/Fx. It is recomended to set 2 minutes.\n"
                + "Do you want to continue?";
        int option = JOptionPane.showConfirmDialog(null, message, "Less than 10 seconds?", 0);
        if (option == 0) {
            System.out.println("Auto save confirmed to work with under 10 seconds delay.");
            return true;
        } else {
            System.out.println("Auto save cancelled due short delay time by user.");
            return false;
        }
    }

    private void STOP_AUTO_SAVE() {
        ENABLE_DISABLE_TEXT_FIELDS(true);
        jButton_open_settings.setEnabled(true);
        AUTO_SAVE_CONTROLLER.setThreadActivated(false);
        IS_AUTO_SAVE_WORKING = false;
        CHANGE_START_STOP_BUTTON_TEXT(START_BUTTON_TEXT);
        System.out.println("Auto save stopped.");
    }

    private void jRadioButton_show_saved_alertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_show_saved_alertActionPerformed
        // Updates user data when pressed.
        if (jRadioButton_show_saved_alert.isSelected()) {
            Memory.SHOW_SAVE_MESSAGE = true;
            UPDATE_USER_DATA_INFO();
        } else {
            Memory.SHOW_SAVE_MESSAGE = false;
            UPDATE_USER_DATA_INFO();
        }
    }//GEN-LAST:event_jRadioButton_show_saved_alertActionPerformed

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        Tasks.open_link("https://justvice.github.io/s/twitter");
    }//GEN-LAST:event_twitterMouseClicked

    private void GithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubMouseClicked
        Tasks.open_link("https://github.com/justvice/autosave");
    }//GEN-LAST:event_GithubMouseClicked

    private void jLabel_vice_pageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_vice_pageMouseClicked
        Tasks.open_link("https://justvice.github.io/");
    }//GEN-LAST:event_jLabel_vice_pageMouseClicked

    private void jlabe_autosave_pageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabe_autosave_pageMouseClicked
        Tasks.open_link("https://justvice.github.io/technology/java/auto-save/");
    }//GEN-LAST:event_jlabe_autosave_pageMouseClicked

    private void jTextField_secondsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_secondsKeyTyped
        char c = evt.getKeyChar();
        
        // Deletes inserted character if it's not a number, it's space, textfield length is 2
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || jTextField_seconds.getText().length() == 2) {
            evt.consume();
        }

        // Sets 0 to textfield if equels to ""
        if (jTextField_seconds.getText().equals("")) {
            jTextField_seconds.setText("0");
        } else {
            if (jTextField_seconds.getText().equals("0")) {
                evt.consume();
                jTextField_seconds.setText(c + "");
            }
        }

        //Controls if the seconds text field has a number over 60 then puts cursor to end of string.
        // Saves user data at the end.
        Thread thread = new Thread(this);
        THREAD_ACTION = SECONDS_CONTROLLER;
        thread.start();
    }//GEN-LAST:event_jTextField_secondsKeyTyped

    private void jTextField_minutesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_minutesKeyTyped
        char c = evt.getKeyChar();
        
        // Deletes inserted character if it's not a number, it's space, textfield length is 4
        if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || jTextField_minutes.getText().length() == 4) {
            evt.consume();
        }

        // Sets 0 to textfield if equels to ""
        if (jTextField_minutes.getText().equals("")) {
            jTextField_minutes.setText("0");
        } else {
            if (jTextField_minutes.getText().equals("0")) {
                evt.consume();
                jTextField_minutes.setText(c + "");
            }
        }

        //Controls if the minutes text field has a number over 5760 then puts cursor to end of string.
        // Saves user data at the end.
        Thread thread = new Thread(this);
        this.THREAD_ACTION = this.MINUTES_CONTROLLER;
        thread.start();
    }//GEN-LAST:event_jTextField_minutesKeyTyped

    private void jComboBox_save_optionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_save_optionItemStateChanged
        JCOMBOBOX_SAVE_DATA_CONTROLLER();
    }//GEN-LAST:event_jComboBox_save_optionItemStateChanged
    private int cont = 0;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.cont++;
        if (cont >= 2) {
            Tasks.open_link("https://dl.dropboxusercontent.com/s/utdn6wsv5m9925x/room.png?dl=0");
            this.cont = 0;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton_open_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_open_settingsActionPerformed
        if (!this.IS_AUTO_SAVE_WORKING) {
            System.out.println("Settings window opened.");
            Settings settings = new Settings();
            this.dispose();
        }
    }//GEN-LAST:event_jButton_open_settingsActionPerformed

    // <editor-fold desc="JCombobox_save_type info">
    //JComboBox_save_option has a chaotic behavior. To fix this, there are some
    //variables to handle this.
    //
    //Please read this guide to understand how this behaviour is controlled.
    //
    //JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_COUNTER_CONTROLLER info:
    //When the program is launched, if there is a different option selected rather
    //than the first one, the optionItemStateChanged event will be triggered 2 times.
    //to control this, the stated above variable will count when those two actions
    //are performed and restricts the application to save.
    //
    //JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER info:
    //When the counter equals 2, this boolean variable will be true. When the variable
    //is true, the optionItemStateChanged event will be able to save info because
    //the undesirable save actions was already restricted. So, you are now able to
    //save normally.
    //
    //JCOMBOBOX_RESTRICT_SAVING_TWO_TIMES_WHEN_HANDLING_COMBOBOX_COUNTER info:
    //As stated above, the optionItemStateChanged event is always triggered two times
    //resulting in saving info two times. This should not happen. To handle this,
    //the variable will restric to save to times if its value is not 2. When the
    //optionItemStateChanged event is triggered, the variable is 0, then is equals to 1.
    //Because it is not 2, the save method will not be called. The second time the 
    //optionItemStateChanged event is triggered, the variable will be setled as 2. Because
    //it is now 2, the save method will be called. Then the value will be 0 again.
    //
    //Method JCOMBOBOX_SAVE_IS_FIRST_OPTION_SELECTED_CONTROLLER info:
    //If the first option of the combobox is selected, the optionItemStateChanged event
    //will not be triggered when the program starts. Therefore, the 
    //JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_COUNTER_CONTROLLER and
    //JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER become
    //useless. Therefore, the method will set
    //JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER as true
    //to leave the program to save normally when the user changes the option
    // </editor-fold>
    private int JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_COUNTER_CONTROLLER = 0;
    private boolean JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER = false;
    private int JCOMBOBOX_RESTRICT_SAVING_TWO_TIMES_WHEN_HANDLING_COMBOBOX_COUNTER = 0;

    private void JCOMBOBOX_SAVE_IS_FIRST_OPTION_SELECTED_CONTROLLER() {
        if (this.jComboBox_save_option.getSelectedItem().equals("CTRL + S")) {
            this.JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER = true;
        }
    }
    
    private void JCOMBOBOX_SAVE_DATA_CONTROLLER() {
        JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_COUNTER_CONTROLLER++;
        if (this.JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER) {
            JCOMBOBOX_RESTRICT_SAVING_TWO_TIMES_WHEN_HANDLING_COMBOBOX_COUNTER++;
            if (JCOMBOBOX_RESTRICT_SAVING_TWO_TIMES_WHEN_HANDLING_COMBOBOX_COUNTER == 2) {
                JCOMBOBOX_SAVE_DATA();
                JCOMBOBOX_RESTRICT_SAVING_TWO_TIMES_WHEN_HANDLING_COMBOBOX_COUNTER = 0;
            }
        }
        if (JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_COUNTER_CONTROLLER == 2) {
            this.JCOMBOBOX_RESTRICT_SAVE_INFO_WHEN_PROGRAM_IS_LAUNCHED_BOOLEAN_CONTROLLER = true;
        }
    }

    private void JCOMBOBOX_SAVE_DATA() {
        System.out.println("Save type setled to: " + this.jComboBox_save_option.getSelectedItem().toString());
        Memory.SAVE_OPTION_TYPE = this.jComboBox_save_option.getSelectedItem().toString();
        UPDATE_USER_DATA_INFO();
    }

    //THREAD CONTROLLER - DIFFERENT THREAD ACTIONS TO PERFORM depending of what we pass to the
    // THREAD_ACTION variable.
    private String THREAD_ACTION = "";
    private final String SECONDS_CONTROLLER = "SECONDS_CONTROLLER";
    private final String MINUTES_CONTROLLER = "MINUTES_CONTROLLER";

    @Override
    public void run() {
        switch (THREAD_ACTION) {
            //SETS TEXT TO 60 if higher. MOVES CURSOR TO THE END OF THE JTEXTFIELD. Saves user data.
            case "SECONDS_CONTROLLER":
                try {
                Thread.sleep(70);
                if (Integer.parseInt(jTextField_seconds.getText()) > 60) {
                    this.jTextField_seconds.setText("60");
                    jTextField_seconds.setCaretPosition(jTextField_seconds.getDocument().getLength());
                    Memory.SECONDS = 60;
                }
                Thread.sleep(100);
                UPDATE_USER_DATA_INFO();
            } catch (InterruptedException | NumberFormatException e) {
                System.out.println("Error, letter is inside jTextField seconds. Setled to 0.");
                this.jTextField_seconds.setText("0");
            }
            break;
            //SETS TEXT TO 5760 if higher. MOVES CURSOR TO THE END OF THE JTEXTFIELD. Saves user data.
            case "MINUTES_CONTROLLER":
                try {
                Thread.sleep(70);
                if (Integer.parseInt(jTextField_minutes.getText()) > 5760) {
                    this.jTextField_minutes.setText("5760");
                    jTextField_minutes.setCaretPosition(jTextField_minutes.getDocument().getLength());
                    Memory.MINUTES = 5760;
                }
                if (Integer.parseInt(jTextField_minutes.getText()) == 4654) {
                    jLabel1_save_option.setText("Inki wasnt here...?");
                }
                Thread.sleep(100);
                UPDATE_USER_DATA_INFO();
            } catch (InterruptedException | NumberFormatException e) {
                System.out.println("Error, letter is inside jTextField minutes. Setled to 2.");
                this.jTextField_minutes.setText("2");
            }
            break;
            default:
                throw new AssertionError();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Github;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_START_AUTO_SAVE;
    private javax.swing.JButton jButton_open_settings;
    private javax.swing.JComboBox<String> jComboBox_save_option;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_save_option;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_vice_page;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton_show_saved_alert;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_minutes;
    private javax.swing.JTextField jTextField_seconds;
    private javax.swing.JLabel jlabe_autosave_page;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables

}
