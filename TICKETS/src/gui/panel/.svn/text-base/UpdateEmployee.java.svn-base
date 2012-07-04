package gui.panel;

import database.Database;
import gui.EmpFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Panel zum Bearbeiten eines Mitarbeiters
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class UpdateEmployee extends javax.swing.JPanel {

    private EmpFrame eF;
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
    public UpdateEmployee() {
        initComponents();
    }

    // Angepasster Konstruktor
    public UpdateEmployee(EmpFrame eF, Database db) {
        initComponents();
        this.eF = eF;
        this.db = db;

        // Windows GUI Anpassungen
        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0, 0, 0, 0));

        deleteClientButton.setOpaque(false);
        deleteClientButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        deleteClientButton.setContentAreaFilled(false);
        deleteClientButton.setBackground(new Color(0, 0, 0, 0));

        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0, 0, 0, 0));

        mitarbeiterCheck.setOpaque(false);
        mitarbeiterCheck.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        mitarbeiterCheck.setContentAreaFilled(false);
        mitarbeiterCheck.setBackground(new Color(0, 0, 0, 0));

        kundenIDInput.setBackground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        bemerkungLabel = new javax.swing.JLabel();
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
        mitarbeiterCheck = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        deleteClientButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Futura", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 162, 35));
        jLabel5.setText("MITARBEITER BEARBEITEN");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(890, 20, 110, 28);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(770, 550, 200, 20);

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
        add(mitarbeiterCheck);
        mitarbeiterCheck.setBounds(700, 390, 30, 23);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(770, 500, 230, 49);

        deleteClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button.png"))); // NOI18N
        deleteClientButton.setBorder(null);
        deleteClientButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button_h.png"))); // NOI18N
        deleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButtonActionPerformed(evt);
            }
        });
        add(deleteClientButton);
        deleteClientButton.setBounds(780, 450, 210, 49);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/updateClient.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(-10, 110, 990, 350);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/mitarbeiterText.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(730, 393, 80, 20);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Mitarbeiter in DB aktualisieren
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        /*
        String kid = kundenIDInput.getText();         String n = nameInput.getText();         String v = vornameInput.getText();         String s = strasseInput.getText();         String nummer = nrInput.getText();         String p = plzInput.getText();         String o = ortInput.getText();         String gd = gebDatumInput.getText();         String em = emailInput.getText();         String bn = benutzernameInput.getText();         String pw = passwortInput.getText();         Boolean iM = mitarbeiterCheck.isSelected();          db.updateClient(bemerkungLabel, n, v, s, nummer, p, o, gd, em, bn, pw, iM, eF.getKundenID());     }//GEN-LAST:event_saveButtonActionPerformed
         */
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
        Boolean iM = mitarbeiterCheck.isSelected();
        try {
            db.updateClient(bemerkungLabel, n, v, s, nummer, p, o, gd, em, bn, pw, iM, eF.getKundenID());
        } catch (SQLException ex) {
            Logger.getLogger(UpdateEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     * Mitarbeiter in DB loeschen
     */
    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed

         try {             db.deleteCostumer(kunden_id, bemerkungLabel);         } catch (SQLException ex) {             Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);         }         kundenIDInput.setText("");         nameInput.setText("");         vornameInput.setText("");         strasseInput.setText("");         nrInput.setText("");         plzInput.setText("");         ortInput.setText("");         gebDatumInput.setText("");         emailInput.setText("");         benutzernameInput.setText("");         passwortInput.setText("");         mitarbeiterCheck.setSelected(false);           // Aktualisierung fehlt noch!!!!!!}//GEN-LAST:event_deleteClientButtonActionPerformed
    }

    /*
     * Karte showEmployee laden und Panel reseten 
     */
        private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
            CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
            cL.show(eF.getMainPanel(), "showEmployee");

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
            mitarbeiterCheck.setSelected(false);
            bemerkungLabel.setText("Bemerkung");
            bemerkungLabel.setForeground(Color.white);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Update Panel
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
     * Mitarbeiterinformationen laden
     */
    private void getClientInformations() throws SQLException {

        ResultSet rs = db.showClientByID(eF.getKundenID());

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
        boolean mitarbeiter = false;
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

        if (istmitarbeiter.equals("t")) {
            mitarbeiter = true;
        } else {
            mitarbeiter = false;
        }
        mitarbeiterCheck.setSelected(mitarbeiter);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField benutzernameInput;
    private javax.swing.JButton deleteClientButton;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField gebDatumInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kundenIDInput;
    private javax.swing.JCheckBox mitarbeiterCheck;
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
