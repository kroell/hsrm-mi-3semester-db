package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * Panel zur Bestaetigung der Buchung und Anzeige der Buchungsnummer
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class BookingDone extends javax.swing.JPanel {

    private MainFrame mF;
    private Database db;
    private String bookingNr;

    // Default Konstruktor
    public BookingDone() {
        initComponents();
    }

    // Angepasster Konstruktor
    public BookingDone(MainFrame mF, Database db) {
        this.mF = mF;
        this.db = db;
        initComponents();
        //Windows GUI Anpassung
        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        filmprogrammButton = new javax.swing.JButton();
        bookNrLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        loginLabel.setFont(new java.awt.Font("Futura", 0, 28));
        loginLabel.setForeground(new java.awt.Color(238, 162, 35));
        loginLabel.setText("RESERVIERUNGSBESTÄTIGUNG"); // NOI18N
        add(loginLabel);
        loginLabel.setBounds(0, 0, 430, 60);

        lineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(lineLabel);
        lineLabel.setBounds(0, 40, 980, 20);

        filmprogrammButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button.png"))); // NOI18N
        filmprogrammButton.setText("\n");
        filmprogrammButton.setBorder(null);
        filmprogrammButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button_h.png"))); // NOI18N
        filmprogrammButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmprogrammButtonActionPerformed(evt);
            }
        });
        add(filmprogrammButton);
        filmprogrammButton.setBounds(840, 20, 180, 28);

        bookNrLabel.setFont(new java.awt.Font("Arial", 1, 14));
        bookNrLabel.setText("Deine Reservierung war erfolgreich. Die Reservierungsnummer lautet:");
        add(bookNrLabel);
        bookNrLabel.setBounds(0, 70, 670, 20);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte welcomePanel laden
     */
    private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "welcomePanel");
    }//GEN-LAST:event_filmprogrammButtonActionPerformed

    /*
     * Wird beim Laden des Panels ausgefuehrt
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            setInformations();
        } catch (Exception ex) {
            System.out.print("Keine Buchungsnummer vorhanden!\n");
        }
    }//GEN-LAST:event_update

    /*
     * Buchungsinformationen ins JLabel schreiben
     */
    private void setInformations() {
        bookNrLabel.setText("Deine Reservierung war erfolgreich. Die Reservierungsnummer lautet: " + mF.getBuchungsID());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookNrLabel;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel loginLabel;
    // End of variables declaration//GEN-END:variables
}
