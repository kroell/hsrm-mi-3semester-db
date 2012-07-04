package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * Panel zum Bearbeiten eines Kunden
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class UpdateClientProfil extends javax.swing.JPanel {

    private MainFrame mF;
    private Database db;
    private String kunden_id = "";
    private String name = "";
    private String vorname = "";
    private String str = "";
    private String nr = "";
    private String plz = "";
    private String ort = "";
    private String gebDat = "";
    private String email = "";
    private String benutzername = "";
    private String passwort = "";
    private String istmitarbeiter = "";

    // Default Konstruktor
    public UpdateClientProfil() {
        initComponents();
    }

    // Angepasster Konstruktor
    public UpdateClientProfil(MainFrame mF, Database db) throws SQLException {
        initComponents();
        this.mF = mF;
        this.db = db;

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bemerkungLabel = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        passwortInput = new javax.swing.JTextField();
        kundenIDInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        vornameInput = new javax.swing.JTextField();
        strasseInput = new javax.swing.JTextField();
        nrInput = new javax.swing.JTextField();
        plzInput = new javax.swing.JTextField();
        ortInput = new javax.swing.JTextField();
        gebDatumInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        benutzernameInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        deleteClientButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel5.setForeground(new java.awt.Color(238, 162, 35));
        jLabel5.setText("KUNDE BEARBEITEN");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(770, 550, 200, 20);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setAutoscrolls(true);
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(890, 20, 110, 29);

        passwortInput.setBorder(null);
        add(passwortInput);
        passwortInput.setBounds(720, 320, 240, 16);

        kundenIDInput.setEditable(false);
        kundenIDInput.setBorder(null);
        add(kundenIDInput);
        kundenIDInput.setBounds(20, 150, 240, 16);

        nameInput.setBorder(null);
        add(nameInput);
        nameInput.setBounds(20, 235, 240, 16);

        vornameInput.setBorder(null);
        add(vornameInput);
        vornameInput.setBounds(20, 320, 240, 16);

        strasseInput.setBorder(null);
        add(strasseInput);
        strasseInput.setBounds(20, 410, 240, 16);

        nrInput.setBorder(null);
        add(nrInput);
        nrInput.setBounds(370, 150, 240, 16);

        plzInput.setBorder(null);
        add(plzInput);
        plzInput.setBounds(370, 237, 240, 16);

        ortInput.setBorder(null);
        add(ortInput);
        ortInput.setBounds(370, 320, 240, 16);

        gebDatumInput.setBorder(null);
        add(gebDatumInput);
        gebDatumInput.setBounds(370, 410, 240, 16);

        emailInput.setBorder(null);
        add(emailInput);
        emailInput.setBounds(720, 150, 240, 16);

        benutzernameInput.setBorder(null);
        add(benutzernameInput);
        benutzernameInput.setBounds(720, 237, 240, 16);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(780, 490, 210, 49);

        deleteClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button.png"))); // NOI18N
        deleteClientButton.setBorder(null);
        deleteClientButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button_h.png"))); // NOI18N
        deleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButtonActionPerformed(evt);
            }
        });
        add(deleteClientButton);
        deleteClientButton.setBounds(790, 440, 190, 49);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/updateClientProfil.png"))); // NOI18N
        add(Background);
        Background.setBounds(-10, 120, 997, 330);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte clientProfil laden
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "clientProfil");

        kundenIDInput.setText("");
        nameInput.setText("");
        vornameInput.setText("");
        strasseInput.setText("");
        nrInput.setText("");
        plzInput.setText("");
        ortInput.setText("");
        gebDatumInput.setText("");
        emailInput.setText("");
        benutzernameInput.setText("");
        passwortInput.setText("");

        bemerkungLabel.setText("Bemerkung");
        bemerkungLabel.setForeground(Color.white);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Kunde in DB aktualisieren
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String kid = kundenIDInput.getText();
        String n = nameInput.getText();
        String v = vornameInput.getText();
        String s = strasseInput.getText();
        String nummer = nrInput.getText();
        String p = plzInput.getText();
        String o = ortInput.getText();
        String gd = gebDatumInput.getText();
        String em = emailInput.getText();
        String bn = benutzernameInput.getText();
        String pw = passwortInput.getText();
        try {
            db.updateClient(bemerkungLabel, n, v, s, nummer, p, o, gd, em, bn, pw, false, mF.getLoggedInKundenID());
        } catch (SQLException ex) {
            Logger.getLogger(UpdateClientProfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Kunde in DB loeschen
     */
    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Sind Sie sicher?", "Sicher?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                db.deleteCostumer(kunden_id, bemerkungLabel);
            } catch (SQLException ex) {
                Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            kundenIDInput.setText("");
            nameInput.setText("");
            vornameInput.setText("");
            strasseInput.setText("");
            nrInput.setText("");
            plzInput.setText("");
            ortInput.setText("");
            gebDatumInput.setText("");
            emailInput.setText("");
            benutzernameInput.setText("");
            passwortInput.setText("");

            mF.getLoginButton().setVisible(true);
            mF.setLoggedInKundenID("");
            mF.getLoggedInLabel().setText("");

            CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
            cL.show(mF.getMainPanel(), "clientDeleted");
        }
    }//GEN-LAST:event_deleteClientButtonActionPerformed

    /*
     * Update des Panels
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            getClientInformations();
            fill();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Kundeninformationen aus DB laden
     */
    private void getClientInformations() throws SQLException {

        ResultSet rs = db.showClientByID(mF.getLoggedInKundenID());

        while (rs.next()) {
            kunden_id = rs.getString("kunden_id");
            name = rs.getString("name");
            vorname = rs.getString("vorname");
            str = rs.getString("strasse");
            nr = rs.getString("hausnr");
            plz = rs.getString("plz");
            ort = rs.getString("ort");
            gebDat = rs.getString("geb_datum");
            email = rs.getString("email");
            benutzername = rs.getString("benutzername");
            passwort = rs.getString("passwort");
            istmitarbeiter = rs.getString("istmitarbeiter");
        }
    }

    /*
     * Daten in GUI anzeigen
     */
    private void fill() {

        kundenIDInput.setText(kunden_id);
        nameInput.setText(name);
        vornameInput.setText(vorname);
        strasseInput.setText(str);
        nrInput.setText(nr);
        plzInput.setText(plz);
        ortInput.setText(ort);
        gebDatumInput.setText(gebDat);
        emailInput.setText(email);
        benutzernameInput.setText(benutzername);
        passwortInput.setText(passwort);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField benutzernameInput;
    private javax.swing.JButton deleteClientButton;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField gebDatumInput;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kundenIDInput;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField nrInput;
    private javax.swing.JTextField ortInput;
    private javax.swing.JButton overviewButton;
    private javax.swing.JTextField passwortInput;
    private javax.swing.JTextField plzInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField strasseInput;
    private javax.swing.JTextField vornameInput;
    // End of variables declaration//GEN-END:variables
}
