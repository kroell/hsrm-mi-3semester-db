package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Panel zum Neu registrieren
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class NewRegister extends javax.swing.JPanel {

    private Database db;
    private MainFrame mF;
    private String kundenNr;

    // Default Konstruktor
    public NewRegister() {
        initComponents();
    }

    // Angepasster Konstruktor
    public NewRegister(MainFrame mF, Database db) {
        initComponents();
        this.mF = mF;
        this.db = db;
        //Windows GUI Anpassung
        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0, 0, 0, 0));

        resetButton.setOpaque(false);
        resetButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        resetButton.setContentAreaFilled(false);
        resetButton.setBackground(new Color(0, 0, 0, 0));

        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        strasseInput = new javax.swing.JTextField();
        vornameInput = new javax.swing.JTextField();
        benutzernameInput = new javax.swing.JTextField();
        passwortInput = new javax.swing.JPasswordField();
        emailInput = new javax.swing.JTextField();
        gebDatInput = new javax.swing.JTextField();
        ortInput = new javax.swing.JTextField();
        plzInput = new javax.swing.JTextField();
        hausnummerInput = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();
        bemerkungLabel = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        lineLabel = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        neuRegLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        strasseInput.setBorder(null);
        add(strasseInput);
        strasseInput.setBounds(20, 320, 230, 30);

        vornameInput.setBorder(null);
        add(vornameInput);
        vornameInput.setBounds(20, 230, 230, 30);

        benutzernameInput.setBorder(null);
        add(benutzernameInput);
        benutzernameInput.setBounds(710, 148, 240, 20);

        passwortInput.setBorder(null);
        add(passwortInput);
        passwortInput.setBounds(710, 230, 230, 30);

        emailInput.setBorder(null);
        add(emailInput);
        emailInput.setBounds(355, 407, 240, 20);

        gebDatInput.setBorder(null);
        add(gebDatInput);
        gebDatInput.setBounds(355, 322, 240, 20);

        ortInput.setBorder(null);
        add(ortInput);
        ortInput.setBounds(355, 234, 240, 20);

        plzInput.setBorder(null);
        add(plzInput);
        plzInput.setBounds(355, 148, 237, 20);

        hausnummerInput.setBorder(null);
        add(hausnummerInput);
        hausnummerInput.setBounds(20, 410, 230, 20);

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button.png"))); // NOI18N
        resetButton.setBorder(null);
        resetButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button_h.png"))); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        add(resetButton);
        resetButton.setBounds(740, 340, 190, 50);

        loginLabel.setFont(new java.awt.Font("Futura", 0, 28));
        loginLabel.setForeground(new java.awt.Color(238, 162, 35));
        loginLabel.setText("NEU REGISTRIEREN"); // NOI18N
        add(loginLabel);
        loginLabel.setBounds(0, 0, 430, 60);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(690, 470, 280, 20);

        nameInput.setBorder(null);
        add(nameInput);
        nameInput.setBounds(20, 150, 230, 20);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(740, 390, 190, 50);

        lineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(lineLabel);
        lineLabel.setBounds(0, 40, 980, 20);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(850, 20, 150, 28);

        neuRegLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/newRegister_felder.png"))); // NOI18N
        add(neuRegLabel);
        neuRegLabel.setBounds(-10, 50, 1000, 470);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte welcomePanel laden 
     */
private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
    CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
    cL.show(mF.getMainPanel(), "welcomePanel");
    resetButtonActionPerformed(evt);
}//GEN-LAST:event_overviewButtonActionPerformed

/*
 * Kunde in DB speichern
 */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        try {
            //Daten aus Eingabe auslesen
            String name = nameInput.getText();
            String vorname = vornameInput.getText();
            String strasse = strasseInput.getText();
            String hausnummer = hausnummerInput.getText();
            String plz = plzInput.getText();
            String ort = ortInput.getText();
            String gebDatum = gebDatInput.getText();
            String email = emailInput.getText();
            String benutzername = benutzernameInput.getText();
            String passwort = passwortInput.getText();
            boolean istMitarbeiter = false;
            boolean istGast = false;

            try {
                getKundenID();
                //Kunde in Datenbank anlegen
                db.addClientAndEmployee(name, vorname, strasse, hausnummer, plz, ort, gebDatum, email, benutzername, passwort, bemerkungLabel, istMitarbeiter, kundenNr, istGast);
            } catch (SQLException ex) {
                Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            mF.setLoggedInKundenID(kundenNr);
            resetButtonActionPerformed(evt);
            CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
            cL.show(mF.getMainPanel(), "loggedIn");
        } catch (Exception ex) {
            System.out.print("Speichern nicht möglich\n");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Reset des Panels
     */
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        nameInput.setText("");
        vornameInput.setText("");
        strasseInput.setText("");
        hausnummerInput.setText("");
        plzInput.setText("");
        ortInput.setText("");
        gebDatInput.setText("");
        emailInput.setText("");
        benutzernameInput.setText("");
        passwortInput.setText("");
        bemerkungLabel.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    /* 
     * Kunden ID ermitteln
     */
    private void getKundenID() throws SQLException {
        ResultSet rs = db.getKundenID();
        while (rs.next()) {
            kundenNr = rs.getString("nextval");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField benutzernameInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField gebDatInput;
    private javax.swing.JTextField hausnummerInput;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel neuRegLabel;
    private javax.swing.JTextField ortInput;
    private javax.swing.JButton overviewButton;
    private javax.swing.JPasswordField passwortInput;
    private javax.swing.JTextField plzInput;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField strasseInput;
    private javax.swing.JTextField vornameInput;
    // End of variables declaration//GEN-END:variables
}
