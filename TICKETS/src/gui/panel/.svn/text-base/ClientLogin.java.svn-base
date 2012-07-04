package gui.panel;

import database.Database;
import gui.EmpFrame;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Panel zum Einloggen eines Kunden
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ClientLogin extends javax.swing.JPanel {

    private Database db;
    private MainFrame mF;
    private String username;
    private String kunden_id;
    private String istmitarbeiter;
    private String istgast;
    private String passwort;
    private String email;
    private boolean gastGespeichert;

    // Default Konstruktor
    public ClientLogin() {
        initComponents();
    }

    // Angepasster Konstruktor
    public ClientLogin(MainFrame mF, Database db) {
        initComponents();
        this.mF = mF;
        this.db = db;
        // Windows GUI Anpassungen
        loginButton.setOpaque(false);
        loginButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        loginButton.setContentAreaFilled(false);
        loginButton.setBackground(new Color(0, 0, 0, 0));
        neuRegButton.setOpaque(false);
        neuRegButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        neuRegButton.setContentAreaFilled(false);
        neuRegButton.setBackground(new Color(0, 0, 0, 0));
        weiterButton.setOpaque(false);
        weiterButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        weiterButton.setContentAreaFilled(false);
        weiterButton.setBackground(new Color(0, 0, 0, 0));
        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bemerkungLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        vornameInput = new javax.swing.JTextField();
        benutzernameInput = new javax.swing.JTextField();
        passwortInput = new javax.swing.JPasswordField();
        bemerkungLabel2 = new javax.swing.JLabel();
        neuRegButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        weiterButton = new javax.swing.JButton();
        loginHeadlineLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        filmprogrammButton = new javax.swing.JButton();
        loginBackLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(980, 620));
        setSize(new java.awt.Dimension(980, 620));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                udpate(evt);
            }
        });
        setLayout(null);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 14));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(90, 440, 270, 17);

        emailInput.setBorder(null);
        add(emailInput);
        emailInput.setBounds(630, 370, 240, 30);

        nameInput.setBorder(null);
        add(nameInput);
        nameInput.setBounds(630, 200, 240, 20);

        vornameInput.setBorder(null);
        add(vornameInput);
        vornameInput.setBounds(630, 280, 240, 30);

        benutzernameInput.setBorder(null);
        add(benutzernameInput);
        benutzernameInput.setBounds(120, 200, 240, 20);

        passwortInput.setBorder(null);
        add(passwortInput);
        passwortInput.setBounds(120, 280, 230, 30);

        bemerkungLabel2.setFont(new java.awt.Font("Arial", 1, 14));
        bemerkungLabel2.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bemerkungLabel2.setText("Bemerkung");
        add(bemerkungLabel2);
        bemerkungLabel2.setBounds(360, 520, 310, 17);

        neuRegButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/neuReg_Button.png"))); // NOI18N
        neuRegButton.setBorder(null);
        neuRegButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/neuReg_Button_h.png"))); // NOI18N
        neuRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neuRegButtonActionPerformed(evt);
            }
        });
        add(neuRegButton);
        neuRegButton.setBounds(170, 390, 130, 23);

        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/login_nutton_h.png"))); // NOI18N
        loginButton.setBorder(null);
        loginButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/login_button_h.png"))); // NOI18N
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        add(loginButton);
        loginButton.setBounds(130, 340, 200, 50);

        weiterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/weiter_button.png"))); // NOI18N
        weiterButton.setBorder(null);
        weiterButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/weiter_button_h.png"))); // NOI18N
        weiterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weiterButtonActionPerformed(evt);
            }
        });
        add(weiterButton);
        weiterButton.setBounds(640, 420, 210, 60);

        loginHeadlineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/login_headline.png"))); // NOI18N
        loginHeadlineLabel.setText("jLabel3"); // NOI18N
        add(loginHeadlineLabel);
        loginHeadlineLabel.setBounds(90, 110, 600, 40);

        loginLabel.setFont(new java.awt.Font("Futura", 0, 28));
        loginLabel.setForeground(new java.awt.Color(238, 162, 35));
        loginLabel.setText("LOGIN"); // NOI18N
        add(loginLabel);
        loginLabel.setBounds(0, 0, 430, 60);

        lineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(lineLabel);
        lineLabel.setBounds(0, 40, 980, 20);

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

        loginBackLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/login_felder.png"))); // NOI18N
        add(loginBackLabel);
        loginBackLabel.setBounds(100, 100, 790, 400);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte welcomePanel laden
     */
    private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "welcomePanel");
        resetAll();
    }//GEN-LAST:event_filmprogrammButtonActionPerformed

    /*
     * Ueberpruefen der Login Daten und ggf. Mitarbeiter Frame laden oder bei
     * Kunden auf die Karte loggedIn wechseln
     */
private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    try {
        username = benutzernameInput.getText();
        passwort = passwortInput.getText();

        EmpFrame eF = new EmpFrame(db);

        boolean loginCorrect = db.customerLoginCheck(username, passwort);
        //boolean istMitarbeiter = db.getIstMitarbeiterCheck();
        getIstMitarbeiterByUsername();

        // Check ob Mitarbeiter, wenn true Mitarbeiterbereich anzeigen
        if (loginCorrect == true) {
            if (istmitarbeiter.equals("t")) {
                // EmployeeFrame oeffnen
                eF.setVisible(true);
                // MainFrame schliessen
                mF.setVisible(false);
            } else {
                // Aktuell eingeloggte Kunden_ID im MainFrame setzen
                setKundenIDByUsername();

                // Logged In Screen aufrufen
                CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
                cL.show(mF.getMainPanel(), "loggedIn");

                benutzernameInput.setText("");
                passwortInput.setText("");
            }
        } else {
            bemerkungLabel2.setText("Falsche Login-Daten");
            bemerkungLabel2.setForeground(Color.red);
        }
    } catch (SQLException ex) {
        Logger.getLogger(ClientLogin.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_loginButtonActionPerformed

    /*
     * KundenID anhand des Benutzernamen ermitteln
     */
    private void setKundenIDByUsername() throws SQLException {
        ResultSet rs = db.getKundenIDByUsername(username);
        while (rs.next()) {
            kunden_id = rs.getString("kunden_id");
        }
        mF.setLoggedInKundenID(kunden_id);

    }

    /*
     * Anhand des Benutzernamen ermitteln ob ein Mitarbeiter sich anmeldet
     */
    private void getIstMitarbeiterByUsername() throws SQLException {
        ResultSet rs = db.getIstMitarbeiterByUsername(username);
        while (rs.next()) {
            istmitarbeiter = rs.getString("istmitarbeiter");
        }
    }

    private void neuRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neuRegButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "newRegister");
    }//GEN-LAST:event_neuRegButtonActionPerformed

    /*
     * Anmelden als Gast
     */
    private void weiterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weiterButtonActionPerformed
        try {
            saveGast();
            getIstGastUndKundenIDByEmail();
            //nur wenn save geklappt hat
            if (gastGespeichert == true) {
                CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
                cL.show(mF.getMainPanel(), "loggedIn");
                resetAll();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_weiterButtonActionPerformed

    /*
     * Reset des Panels
     */
    private void udpate(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_udpate
        resetAll();
    }//GEN-LAST:event_udpate

    /*
     * Gastdaten in DB speichern
     */
    private void saveGast() throws SQLException {
        //Daten aus Eingabe auslesen
        String name = nameInput.getText();
        String vorname = vornameInput.getText();
        email = emailInput.getText();
        boolean istMitarbeiter = false;
        boolean istGast = true;

        gastGespeichert = db.addGast(kunden_id, name, vorname, email, istMitarbeiter, istGast, bemerkungLabel2);
    }

    /*
     * Anhand der Email Kunden ID ermitteln
     */
    private void getIstGastUndKundenIDByEmail() throws SQLException {
        ResultSet rs = db.getKundenIDByEmail(email);
        while (rs.next()) {
            kunden_id = rs.getString("kunden_id");
        }
        mF.setLoggedInKundenID(kunden_id);
    }

    /*
     * Reset des Panels
     */
    private void resetAll() {
        benutzernameInput.setText("");
        passwortInput.setText("");
        nameInput.setText("");
        vornameInput.setText("");
        emailInput.setText("");
        bemerkungLabel.setText("");
        bemerkungLabel2.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JLabel bemerkungLabel2;
    private javax.swing.JTextField benutzernameInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel loginBackLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginHeadlineLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField nameInput;
    private javax.swing.JButton neuRegButton;
    private javax.swing.JPasswordField passwortInput;
    private javax.swing.JTextField vornameInput;
    private javax.swing.JButton weiterButton;
    // End of variables declaration//GEN-END:variables
}
