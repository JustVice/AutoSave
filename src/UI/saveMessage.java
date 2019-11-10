package UI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import LogicV2.Memory;

public class saveMessage extends javax.swing.JFrame implements Runnable {

    private final int time;

    public saveMessage() {
        SET_FRAME_POSITION();
        this.time = 1500;
        setUndecorated(true);
        initComponents();
        startT();
    }

    private void startT() {
        Thread t = new Thread(this);
        t.start();
    }

    private void SET_FRAME_POSITION() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double double_width = screenSize.getWidth();
        double double_height = screenSize.getHeight();
        int width = (int)double_width;
        int height = (int)double_height;
//        System.out.println("Width: " + width);
//        System.out.println("Height: " + height);
        
        switch (Memory.SAVE_MESSAGE_POSITION) {
            case "CORNER_UP_LEFT":
                break;
            case "CORNER_UP_RIGHT":
                this.setLocation(width-90, 0);
                break;
            case "CORNER_DOWN_LEFT":
                this.setLocation(0, height-50);
                break;
            case "CORNER_DOWN_RIGHT":
                this.setLocation(width-90, height-50);
                break;
            case "CENTER":
                this.setLocationRelativeTo(null);
                break;
            default:
                throw new AssertionError();
        }
    }

    @Override
    public void run() {
        try {
            this.setVisible(true);
            Thread.sleep(time);
            this.dispose();
        } catch (InterruptedException ex) {
            Logger.getLogger(saveMessage.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Saved");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
