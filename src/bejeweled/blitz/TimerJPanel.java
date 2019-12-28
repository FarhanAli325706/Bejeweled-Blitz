/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejeweled.blitz;

/**
 *
 * @author Farhan
 */
public class TimerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TimerJPanel
     */
    public TimerJPanel() {
        initComponents();
    }
    public void setSecLabel(int sec)
    {
        this.secLabel.setText(""+sec);
    }
    public void setMinLabel(int min)
    {
        this.minLabel.setText(""+min);
    }
    public void setCurrenntScoreLabel(int score)
    {
        this.currentScoreLabel.setText(""+score);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timerLabel = new javax.swing.JLabel();
        minLabel = new javax.swing.JLabel();
        secLabel = new javax.swing.JLabel();
        symbolLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        currentScoreLabel = new javax.swing.JLabel();
        goalLabel = new javax.swing.JLabel();
        targetLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 0, 0));

        timerLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("Time :");

        minLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minLabel.setForeground(new java.awt.Color(255, 255, 255));
        minLabel.setText("00");

        secLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        secLabel.setForeground(new java.awt.Color(255, 255, 255));
        secLabel.setText("59");

        symbolLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        symbolLabel.setForeground(new java.awt.Color(255, 255, 255));
        symbolLabel.setText(":");

        scoreLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("Score :");

        currentScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        currentScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentScoreLabel.setText("0");

        goalLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        goalLabel.setForeground(new java.awt.Color(255, 255, 255));
        goalLabel.setText("Goal :");

        targetLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        targetLabel.setForeground(new java.awt.Color(255, 255, 255));
        targetLabel.setText("100");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(timerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goalLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(targetLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scoreLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(currentScoreLabel)
                            .addComponent(minLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(symbolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(secLabel)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(timerLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minLabel)
                    .addComponent(secLabel)
                    .addComponent(symbolLabel))
                .addGap(31, 31, 31)
                .addComponent(scoreLabel)
                .addGap(30, 30, 30)
                .addComponent(currentScoreLabel)
                .addGap(25, 25, 25)
                .addComponent(goalLabel)
                .addGap(30, 30, 30)
                .addComponent(targetLabel)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentScoreLabel;
    private javax.swing.JLabel goalLabel;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel secLabel;
    private javax.swing.JLabel symbolLabel;
    private javax.swing.JLabel targetLabel;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}