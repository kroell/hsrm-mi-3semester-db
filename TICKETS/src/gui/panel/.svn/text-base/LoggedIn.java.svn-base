package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * Panel zur Login Bestätigung
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class LoggedIn extends javax.swing.JPanel {

    private Database db;
    private MainFrame mF;
    private String benutzername;
    private String istgast;

    // Default Konstruktor
    public LoggedIn() {
        initComponents();
    }

    // Angepasster Konstruktor
    public LoggedIn(MainFrame mF, Database db) {
        initComponents();
        this.mF = mF;
        this.db = db;
        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        loginLabel.setFont(new java.awt.Font("Futura", 0, 28));
        loginLabel.setForeground(new java.awt.Color(238, 162, 35));
        loginLabel.setText("LOGIN ERFOLGREICH"); // NOI18N
        add(loginLabel);
        loginLabel.setBounds(0, 0, 430, 60);

        lineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(lineLabel);
        lineLabel.setBounds(0, 40, 980, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel1.setText("Du bist erfolgreich eingeloggt. Viel Spaß bei TICKETS!");
        add(jLabel1);
        jLabel1.setBounds(0, 70, 520, 20);

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
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte welcomePanel laden
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "welcomePanel");
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Wird beim Laden des Panel ausgefuehrt
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update

        try {
            getIstGastByKundenID();
            JButton login = mF.getLoginButton();
            login.setVisible(false);

            if (istgast.equals("f")) {

                getUsernameByKundenID();

                JLabel loggedIn = mF.getLoggedInLabel();
                loggedIn.setText("Du bist eingeloggt als " + benutzername + "");
                loggedIn.setForeground(Color.white);
                JButton profil = mF.getProfilButton();
                profil.setVisible(true);
            } else {
                mF.setIstGast(true);
                JLabel loggedIn = mF.getLoggedInLabel();
                loggedIn.setText("Du bist eingeloggt als Gast");
                loggedIn.setForeground(Color.white);
                JButton profil = mF.getProfilButton();
                profil.setVisible(false);
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_update

    /*
     * Benutzernamen anhand der eingeloggten Kunden ID ermitteln
     */
    private void getUsernameByKundenID() throws SQLException {
        ResultSet rs = db.getUsernameByKundenID(mF.getLoggedInKundenID());
        while (rs.next()) {
            benutzername = rs.getString("benutzername");
        }
    }

    /* 
     * Ermitteln ob Kunden ID ein Gast ist
     */
    private void getIstGastByKundenID() throws SQLException {
        ResultSet rs = db.getIstGastByKundenID(mF.getLoggedInKundenID());
        while (rs.next()) {
            istgast = rs.getString("istgast");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JButton overviewButton;
    // End of variables declaration//GEN-END:variables
}
