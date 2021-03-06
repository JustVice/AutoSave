package UI;

import LogicV2.Memory;
import LogicV2.Tasks;

public class Settings extends javax.swing.JFrame {

    private int test_room_counter = 0;

    public Settings() {
        setIconImage(Memory.getIconImage());
        initComponents();
        UI_SETTINGS();
        UI_USER_INFO_SETTINGS();
    }

    private void UI_SETTINGS() {
        //Sets the frame at the center.
        this.setLocationRelativeTo(null);
        //Makes the frame visible.
        this.setVisible(true);
        //Prevents user to resize the window.
        setResizable(false);
        //Sets status bar info.
        setTitle(Memory.title + " " + Memory.version);
    }

    private void UI_USER_INFO_SETTINGS() {
        jRadioButton_show_saved_alert.setSelected(Memory.SHOW_SAVE_MESSAGE);
        ENABLE_DISABLE_SAVE_MESSAGE_POSITION_CHECKBOXES(Memory.SHOW_SAVE_MESSAGE);
        switch (Memory.SAVE_MESSAGE_POSITION) {
            case "CORNER_UP_LEFT":
                jCheckBox_UP_LEFT.setSelected(true);
                break;
            case "CORNER_UP_RIGHT":
                jCheckBox_UP_RIGHT.setSelected(true);
                break;
            case "CORNER_DOWN_LEFT":
                jCheckBox_DOWN_LEFT.setSelected(true);
                break;
            case "CORNER_DOWN_RIGHT":
                jCheckBox_DOWN_RIGHT.setSelected(true);
                break;
            case "CENTER":
                jCheckBox_CENTER.setSelected(true);
                break;
            default:
                jCheckBox_UP_LEFT.setSelected(true);
                UPDATE_USER_DATA_INFO();
        }
    }

    private void ENABLE_DISABLE_SAVE_MESSAGE_POSITION_CHECKBOXES(boolean status) {
        jCheckBox_UP_LEFT.setEnabled(status);
        jCheckBox_UP_RIGHT.setEnabled(status);
        jCheckBox_DOWN_LEFT.setEnabled(status);
        jCheckBox_DOWN_RIGHT.setEnabled(status);
        jCheckBox_CENTER.setEnabled(status);
    }
    
    private void UPDATE_USER_DATA_INFO() {
        Memory.USER_DATA_V2.UPDATE_DATA(Memory.SECONDS + "",
                Memory.MINUTES + "",
                Memory.SAVE_OPTION_TYPE,
                this.jRadioButton_show_saved_alert.isSelected() + "",
                RETURN_SAVE_MESSAGE_POSITION());
    }

    private String RETURN_SAVE_MESSAGE_POSITION() {
        if (jCheckBox_CENTER.isSelected()) {
            return "CENTER";
        } else if (jCheckBox_DOWN_LEFT.isSelected()) {
            return "CORNER_DOWN_LEFT";
        } else if (jCheckBox_DOWN_RIGHT.isSelected()) {
            return "CORNER_DOWN_RIGHT";
        } else if (jCheckBox_UP_LEFT.isSelected()) {
            return "CORNER_UP_LEFT";
        } else if (jCheckBox_UP_RIGHT.isSelected()) {
            return "CORNER_UP_RIGHT";
        } else {
            return "CORNER_DOWN_LEFT";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_save_position = new javax.swing.ButtonGroup();
        jButton_back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox_CENTER = new javax.swing.JCheckBox();
        jCheckBox_UP_LEFT = new javax.swing.JCheckBox();
        jCheckBox_DOWN_LEFT = new javax.swing.JCheckBox();
        jCheckBox_DOWN_RIGHT = new javax.swing.JCheckBox();
        jCheckBox_UP_RIGHT = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton_show_saved_alert = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Settings");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("Saved");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Saved");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setText("Saved");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Saved");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setText("Saved");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        buttonGroup_save_position.add(jCheckBox_CENTER);
        jCheckBox_CENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CENTERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBox_CENTER))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_CENTER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        buttonGroup_save_position.add(jCheckBox_UP_LEFT);
        jCheckBox_UP_LEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_UP_LEFTActionPerformed(evt);
            }
        });

        buttonGroup_save_position.add(jCheckBox_DOWN_LEFT);
        jCheckBox_DOWN_LEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DOWN_LEFTActionPerformed(evt);
            }
        });

        buttonGroup_save_position.add(jCheckBox_DOWN_RIGHT);
        jCheckBox_DOWN_RIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DOWN_RIGHTActionPerformed(evt);
            }
        });

        buttonGroup_save_position.add(jCheckBox_UP_RIGHT);
        jCheckBox_UP_RIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_UP_RIGHTActionPerformed(evt);
            }
        });

        jLabel1.setText("Location to display \"saved\" message");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox_UP_LEFT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox_UP_RIGHT)
                        .addGap(8, 8, 8))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_DOWN_LEFT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox_DOWN_RIGHT)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox_UP_LEFT)
                    .addComponent(jCheckBox_UP_RIGHT)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_DOWN_LEFT))
                    .addComponent(jCheckBox_DOWN_RIGHT, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jRadioButton_show_saved_alert.setText("Diplay \"saved\" message on screen");
        jRadioButton_show_saved_alert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_show_saved_alertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton_show_saved_alert)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jRadioButton_show_saved_alert)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Saved message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_back)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        System.out.println("Main window opened.");
        MainFrame mainFrame = new MainFrame();
        this.dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jRadioButton_show_saved_alertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_show_saved_alertActionPerformed
        if (jRadioButton_show_saved_alert.isSelected()) {
            Memory.SHOW_SAVE_MESSAGE = true;
            ENABLE_DISABLE_SAVE_MESSAGE_POSITION_CHECKBOXES(true);
            UPDATE_USER_DATA_INFO();
        } else {
            Memory.SHOW_SAVE_MESSAGE = false;
            ENABLE_DISABLE_SAVE_MESSAGE_POSITION_CHECKBOXES(false);
            UPDATE_USER_DATA_INFO();
        }
    }//GEN-LAST:event_jRadioButton_show_saved_alertActionPerformed

    private void jCheckBox_UP_LEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_UP_LEFTActionPerformed
        Memory.SAVE_MESSAGE_POSITION = "CORNER_UP_LEFT";
        Tasks.MESSAGE_SAVED();
        UPDATE_USER_DATA_INFO();
    }//GEN-LAST:event_jCheckBox_UP_LEFTActionPerformed

    private void jCheckBox_CENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CENTERActionPerformed
        Memory.SAVE_MESSAGE_POSITION = "CENTER";
        Tasks.MESSAGE_SAVED();
        UPDATE_USER_DATA_INFO();
    }//GEN-LAST:event_jCheckBox_CENTERActionPerformed

    private void jCheckBox_UP_RIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_UP_RIGHTActionPerformed
        Memory.SAVE_MESSAGE_POSITION = "CORNER_UP_RIGHT";
        Tasks.MESSAGE_SAVED();
        UPDATE_USER_DATA_INFO();
    }//GEN-LAST:event_jCheckBox_UP_RIGHTActionPerformed

    private void jCheckBox_DOWN_RIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DOWN_RIGHTActionPerformed
        Memory.SAVE_MESSAGE_POSITION = "CORNER_DOWN_RIGHT";
        Tasks.MESSAGE_SAVED();
        UPDATE_USER_DATA_INFO();
    }//GEN-LAST:event_jCheckBox_DOWN_RIGHTActionPerformed

    private void jCheckBox_DOWN_LEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DOWN_LEFTActionPerformed
        Memory.SAVE_MESSAGE_POSITION = "CORNER_DOWN_LEFT";
        Tasks.MESSAGE_SAVED();
        UPDATE_USER_DATA_INFO();
    }//GEN-LAST:event_jCheckBox_DOWN_LEFTActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.test_room_counter++;
        if (this.test_room_counter == 8) {
            TestRoom testRoom = new TestRoom();
            dispose();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_save_position;
    private javax.swing.JButton jButton_back;
    private javax.swing.JCheckBox jCheckBox_CENTER;
    private javax.swing.JCheckBox jCheckBox_DOWN_LEFT;
    private javax.swing.JCheckBox jCheckBox_DOWN_RIGHT;
    private javax.swing.JCheckBox jCheckBox_UP_LEFT;
    private javax.swing.JCheckBox jCheckBox_UP_RIGHT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton_show_saved_alert;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
