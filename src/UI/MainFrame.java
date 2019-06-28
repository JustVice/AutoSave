package UI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import logic.Static;
import logic.autoSaveRun;

public class MainFrame extends javax.swing.JFrame {

    private autoSaveRun auto_save_run;

    public MainFrame() {
        initComponents();
        //User interfase initialization.
        UIDisplay();
        //Sets local settings.
        settings();
        //Sets user data settings;
        userSettingsIO();
    }

    private void UIDisplay() {
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
        //Model that sets the settings of the jSpinners
        SpinnerNumberModel spinner_model_minutes = new SpinnerNumberModel();
        SpinnerNumberModel spinner_model_seconds = new SpinnerNumberModel();
        //Sets the minimum value for the spinners
        spinner_model_minutes.setMinimum(0);
        spinner_model_seconds.setMinimum(0);
        //Sets the maximum value for the spinners
        spinner_model_minutes.setMaximum(60);
        spinner_model_seconds.setMaximum(60);
        //Sets the settings to minutes and seconds spinner
        this.jSpinner_minutes.setModel(spinner_model_minutes);
        this.jSpinner_seconds.setModel(spinner_model_seconds);
    }

    private void settings() {
        //Sets combo CTRL + S enabled.
        jRadioButton_CTRL_and_S.setSelected(true);
        //Sets jspinner of minutes to 0.
        jSpinner_minutes.setValue(0);
        //Sets jspinner of seconds to 0.
        jSpinner_seconds.setValue(0);
        //Makes the "Stop" jbutton not able to be pressed.
        jButton_stop.setEnabled(false);
    }

    private void userSettingsIO() {
        //If show_saved_message is true, the show saved alert will be selected
        //or not.
        if (Static.show_saved_message) {
            jRadioButton_show_saved_alert.setSelected(true);
        } else {
            jRadioButton_show_saved_alert.setSelected(false);
        }
        //If "savePrefix" is "S" the CTRL + S combobox will be selected.
        //If "savePrefix" is "G" the CTRL + G combobox will be selected.
        switch (Static.data.getUserData().getSavePrefix()) {
            case "S":
                jRadioButton_CTRL_and_S.setSelected(true);
                break;
            case "G":
                jRadioButton_CTRL_and_G.setSelected(true);
                break;
            default:
                Static.run.message("INTERTAL ERROR. ERROR CODE: 000./n", "ERROR 000", 0);
                jRadioButton_CTRL_and_S.setSelected(true);
                throw new AssertionError();
        }
        //If show show_saved_message on User Data is true the combobox of
        //show saved message will be selected. Also, the show_saved_message
        //on Static class will be set as the same value as the User Data one.
        if (Static.data.getUserData().isShowSavedMessage()) {
            jRadioButton_show_saved_alert.setSelected(true);
            Static.show_saved_message = true;
        } else {
            jRadioButton_show_saved_alert.setSelected(false);
            Static.show_saved_message = false;
        }
        //Sets the same sec or min at the spinners which is saved inside 
        //the User Data parameters.
        jSpinner_seconds.setValue(Integer.parseInt(Static.data.getUserData().getSec()));
        jSpinner_minutes.setValue(Integer.parseInt(Static.data.getUserData().getMin()));
    }

    //Updates the values inside the User Data and writes it inside the .txt 
    //user data file.
    private void save_user_settings() {
        //If CTRL + S is selected, "S" will be saved inside the savePrefix
        //value.
        if (jRadioButton_CTRL_and_S.isSelected()) {
            Static.data.getUserData().setSavePrefix("S");
        } else {
            //If CTRL + G is selected, "G" will be saved inside the savePrefix
            //value.
            Static.data.getUserData().setSavePrefix("G");
        }
        //If combobox show saved alert is selected showSavedMessage on User Data
        //will be updated.
        if (jRadioButton_show_saved_alert.isSelected()) {
            Static.data.getUserData().setShowSavedMessage(true);
        } else {
            Static.data.getUserData().setShowSavedMessage(false);
        }
        //Saves the values from the spinners of sec and mins into the corresp-
        //onding values on user data.
        Static.data.getUserData().setSec("" + jSpinner_seconds.getValue());
        Static.data.getUserData().setMin("" + jSpinner_minutes.getValue());
        //Updates the info of the .txt file.
        Static.data.updateInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton_stop = new javax.swing.JButton();
        jButton_start = new javax.swing.JButton();
        jRadioButton_show_saved_alert = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        jRadioButton_CTRL_and_G = new javax.swing.JRadioButton();
        jRadioButton_CTRL_and_S = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinner_minutes = new javax.swing.JSpinner();
        jSpinner_seconds = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        Github = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alllinks = new javax.swing.JLabel();
        twitter1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_stop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_stop.setText("Stop");
        jButton_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stopActionPerformed(evt);
            }
        });

        jButton_start.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_start.setText("Start");
        jButton_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_startActionPerformed(evt);
            }
        });

        jRadioButton_show_saved_alert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_show_saved_alert.setText("Show \"saved\" alert");
        jRadioButton_show_saved_alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_show_saved_alertActionPerformed(evt);
            }
        });

        jLabel2.setText("MINUTES");

        sec.setText("SECONDS");

        buttonGroup1.add(jRadioButton_CTRL_and_G);
        jRadioButton_CTRL_and_G.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_CTRL_and_G.setText("CTRL + G");
        jRadioButton_CTRL_and_G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CTRL_and_GActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_CTRL_and_S);
        jRadioButton_CTRL_and_S.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_CTRL_and_S.setText("CTRL + S");
        jRadioButton_CTRL_and_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_CTRL_and_SActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ACTION");

        jSpinner_minutes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jSpinner_seconds.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_start, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_stop, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel2))
                                    .addComponent(jRadioButton_show_saved_alert)
                                    .addComponent(jSpinner_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(sec))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton_CTRL_and_S)
                                        .addComponent(jRadioButton_CTRL_and_G))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSpinner_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_CTRL_and_S)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_CTRL_and_G)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sec)
                .addGap(7, 7, 7)
                .addComponent(jSpinner_seconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSpinner_minutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton_show_saved_alert)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_start)
                    .addComponent(jButton_stop))
                .addContainerGap(93, Short.MAX_VALUE))
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

        twitter1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        twitter1.setText("<html><a href=\"http://www.google.com\">Web page</a></html>");
        twitter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitter1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(twitter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(twitter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alllinks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Github, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twitter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
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

    private void jButton_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_startActionPerformed
        //Start the threads
        startWorking();
    }//GEN-LAST:event_jButton_startActionPerformed

    private void startWorking() {
        try {
            int undertime = 0;
            
            Static.time_before_save = Static.run.timeConverter(jTextField_seconds.getText(), jTextField_minutes.getText());
            if (Static.time_before_save <= 10000) {
                undertime = JOptionPane.showConfirmDialog(null, "You are setting an under/equals 10 seconds timelapse to perform a CTRL + S/G"
                        + "\nThere will be a continuos spam of CTRL + S/G. It is recomended to set 2 minutes.\n"
                        + "Do you want to continue?");
            }
            if (undertime == 0) {
                byte option = 0;
                if (jRadioButton_CTRL_and_G.isSelected()) {
                    option = (byte) 1;
                }
                jButton_stop.setEnabled(true);
                jButton_start.setEnabled(false);
                save_user_settings();
            }
        } catch (Exception e) {
        }
    }

    private void timeChanged() {
        try {
            if (Integer.parseInt(jTextField_seconds.getText()) < 2 && jTextField_minutes.getText().equals("0")) {
                jTextField_seconds.setText("10");
            }
            Static.time_before_save = Static.run.timeConverter(jTextField_seconds.getText(), jTextField_minutes.getText());
        } catch (Exception e) {
            System.out.println("Error en timeChanged");
        }

    }

    private void errorMessage(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, 0);
    }

    private void jButton_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stopActionPerformed
        for (autoSaveRun a : listaHilos) {
            a.setRun(false);
        }
        jButton_stop.setEnabled(false);
        jButton_start.setEnabled(true);
    }//GEN-LAST:event_jButton_stopActionPerformed

    private void jRadioButton_CTRL_and_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CTRL_and_SActionPerformed
        Static.save_type_action = 0;
        save_user_settings();
    }//GEN-LAST:event_jRadioButton_CTRL_and_SActionPerformed

    private void jRadioButton_show_saved_alertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_show_saved_alertActionPerformed
        if (jRadioButton_show_saved_alert.isSelected()) {
            Static.show_saved_message = true;
            save_user_settings();
        } else {
            Static.show_saved_message = false;
            save_user_settings();
        }
    }//GEN-LAST:event_jRadioButton_show_saved_alertActionPerformed

    private void jRadioButton_CTRL_and_GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_CTRL_and_GActionPerformed
        Static.save_type_action = 1;
        save_user_settings();
    }//GEN-LAST:event_jRadioButton_CTRL_and_GActionPerformed

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        Static.run.open_link("https://twitter.com/JustVice1");
    }//GEN-LAST:event_twitterMouseClicked

    private void GithubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubMouseClicked
        Static.run.open_link("https://github.com/JustVice?tab=repositories");
    }//GEN-LAST:event_GithubMouseClicked

    private void alllinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alllinksMouseClicked
        Static.run.open_link("https://justvice.wixsite.com/info");
    }//GEN-LAST:event_alllinksMouseClicked

    private void twitter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitter1MouseClicked
        Static.run.open_link("https://justvice.github.io");
    }//GEN-LAST:event_twitter1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Github;
    private javax.swing.JLabel alllinks;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_start;
    private javax.swing.JButton jButton_stop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton_CTRL_and_G;
    private javax.swing.JRadioButton jRadioButton_CTRL_and_S;
    private javax.swing.JRadioButton jRadioButton_show_saved_alert;
    private javax.swing.JSpinner jSpinner_minutes;
    private javax.swing.JSpinner jSpinner_seconds;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel sec;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel twitter1;
    // End of variables declaration//GEN-END:variables

}
