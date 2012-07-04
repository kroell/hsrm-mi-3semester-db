package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;

/**
 *
 * Panel zur Loeschbestaetigung
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ClientDeleted extends javax.swing.JPanel {
    private MainFrame mF;
    private Database db;
    
    // Default Konstruktor
    public ClientDeleted() {
        initComponents();
    }
    
    // Angepasster Konstruktor
    public ClientDeleted(MainFrame mF, Database db) {
        this.mF = mF;
        this.db = db;
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        filmprogrammButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel4.setForeground(new java.awt.Color(238, 162, 35));
        jLabel4.setText("ERFOLGREICH GELÖSCHT"); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel1.setText("Du hast deinen Account erfolgreich gelöscht.");
        add(jLabel1);
        jLabel1.setBounds(0, 70, 520, 20);

        filmprogrammButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button.png"))); // NOI18N
        filmprogrammButton.setBorder(null);
        filmprogrammButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button_h.png"))); // NOI18N
        filmprogrammButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmprogrammButtonActionPerformed(evt);
            }
        });
        add(filmprogrammButton);
        filmprogrammButton.setBounds(850, 20, 150, 28);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte welcomePanel laden
     */
    private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "welcomePanel");
    }//GEN-LAST:event_filmprogrammButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
