package UI;

import logic.Static;

public class OtherSaveOptions extends javax.swing.JFrame {

    public OtherSaveOptions() {
        initComponents();
        settings();
    }

    private void settings() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        UI_SETTINGS();
    }

    private void UI_SETTINGS() {
        setTitle(Static.title + " " + Static.version);
        setIconImage(Static.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
