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
public class TimerPanel extends javax.swing.JPanel {

    /**
     * Creates new form TimerPanel
     */
    public TimerPanel() {
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
        symbolLabel = new javax.swing.JLabel();
        secLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        currentScoreLabel = new javax.swing.JLabel();
        goalLabel = new javax.swing.JLabel();
        targetLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        timerLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 255));
        timerLabel.setText("Time :");
        add(timerLabel);
        timerLabel.setBounds(30, 110, 112, 44);

        minLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        minLabel.setForeground(new java.awt.Color(255, 255, 255));
        minLabel.setText("00");
        add(minLabel);
        minLabel.setBounds(110, 180, 46, 44);

        symbolLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        symbolLabel.setForeground(new java.awt.Color(255, 255, 255));
        symbolLabel.setText(":");
        add(symbolLabel);
        symbolLabel.setBounds(170, 180, 13, 44);

        secLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        secLabel.setForeground(new java.awt.Color(255, 255, 255));
        secLabel.setText("59");
        add(secLabel);
        secLabel.setBounds(200, 180, 46, 44);

        scoreLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("Score :");
        add(scoreLabel);
        scoreLabel.setBounds(30, 250, 125, 44);

        currentScoreLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        currentScoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        currentScoreLabel.setText("00");
        add(currentScoreLabel);
        currentScoreLabel.setBounds(150, 310, 60, 44);

        goalLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        goalLabel.setForeground(new java.awt.Color(255, 255, 255));
        goalLabel.setText("Goal :");
        add(goalLabel);
        goalLabel.setBounds(30, 370, 106, 44);

        targetLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        targetLabel.setForeground(new java.awt.Color(255, 255, 255));
        targetLabel.setText("100");
        add(targetLabel);
        targetLabel.setBounds(130, 430, 69, 44);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\FAST\\Semester 5\\Object Oriented Analysis and Design\\Project\\Bonus Part\\background images\\gameframe.jpg")); // NOI18N
        jLabel1.setText("background");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 398, 720);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentScoreLabel;
    private javax.swing.JLabel goalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minLabel;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel secLabel;
    private javax.swing.JLabel symbolLabel;
    private javax.swing.JLabel targetLabel;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables
}
