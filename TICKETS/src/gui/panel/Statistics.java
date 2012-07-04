package gui.panel;

import database.Database;
import gui.charts.ChartSeats;
import gui.charts.ChartStars;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * Panel zum Anzeigen von Statistiken
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class Statistics extends javax.swing.JPanel {

    private MainFrame mF;
    private Database db;
    private String filmtitel;
    private String v_id;
    private String filmTitel;
    private String datum;
    private String uhrzeit;
    private String saalnummer;

    // Default Konstruktor
    public Statistics() {
        initComponents();
    }

    // Angepasster Konstruktor
    public Statistics(MainFrame mF, Database db) {
        this.mF = mF;
        this.db = db;
        initComponents();

        statistikFilmButton.setOpaque(false);
        statistikFilmButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        statistikFilmButton.setContentAreaFilled(false);
        statistikFilmButton.setBackground(new Color(0, 0, 0, 0));

        statistikPlatzButton.setOpaque(false);
        statistikPlatzButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        statistikPlatzButton.setContentAreaFilled(false);
        statistikPlatzButton.setBackground(new Color(0, 0, 0, 0));

        jButton1.setOpaque(false);
        jButton1.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        jButton1.setContentAreaFilled(false);
        jButton1.setBackground(new Color(0, 0, 0, 0));

        filmAuswahl.setBackground(Color.WHITE);
        vorstellungAuswahl.setBackground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        statistikPlatzButton = new javax.swing.JButton();
        vorstellungAuswahl = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        statistikFilmButton = new javax.swing.JButton();
        filmAuswahl = new javax.swing.JComboBox();
        statLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel4.setForeground(new java.awt.Color(238, 162, 35));
        jLabel4.setText("STATISTIKEN"); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/meinProfil_Button.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/meinProfil_button_h.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(870, 20, 140, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        statistikPlatzButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_ansehen.png"))); // NOI18N
        statistikPlatzButton.setBorder(null);
        statistikPlatzButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_ansehen_h.png"))); // NOI18N
        statistikPlatzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikPlatzButtonActionPerformed(evt);
            }
        });
        add(statistikPlatzButton);
        statistikPlatzButton.setBounds(640, 240, 120, 30);

        vorstellungAuswahl.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        vorstellungAuswahl.setForeground(new java.awt.Color(208, 134, 9));
        add(vorstellungAuswahl);
        vorstellungAuswahl.setBounds(60, 190, 340, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik1.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-20, 70, 1000, 120);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_3.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 230, 70, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_1.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 180, 70, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_3.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(570, 230, 70, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_1.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(570, 180, 70, 50);

        statistikFilmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_ansehen.png"))); // NOI18N
        statistikFilmButton.setBorder(null);
        statistikFilmButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_ansehen_h.png"))); // NOI18N
        statistikFilmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikFilmButtonActionPerformed(evt);
            }
        });
        add(statistikFilmButton);
        statistikFilmButton.setBounds(60, 240, 120, 30);

        filmAuswahl.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        filmAuswahl.setForeground(new java.awt.Color(208, 134, 9));
        filmAuswahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmAuswahlActionPerformed(evt);
            }
        });
        add(filmAuswahl);
        filmAuswahl.setBounds(640, 190, 340, 27);

        statLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(statLabel);
        statLabel.setBounds(0, 290, 980, 330);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Anteile der Sterne von der DB berechnen lassen und Werte an Chartgrafik
     * uebergeben
     */
    private void statistikPlatzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikPlatzButtonActionPerformed
        try {
            int wert = 0;
            int wert2 = 0;
            int wert3 = 0;
            int wert4 = 0;
            String f_id = "";
            String titel = (String) filmAuswahl.getSelectedItem();
            if (!(titel.equals("FILM AUSWÄHLEN"))) {
                ResultSet rs5 = db.getFilmIDByMovie(titel);
                while (rs5.next()) {
                    f_id = rs5.getString("f_id");
                }

                ResultSet rs = db.getStarStatisic(f_id, "1");
                while (rs.next()) {
                    wert = rs.getInt("value_star");
                }

                ResultSet rs2 = db.getStarStatisic(f_id, "2");
                while (rs2.next()) {
                    wert2 = rs2.getInt("value_star");
                }

                ResultSet rs3 = db.getStarStatisic(f_id, "3");
                while (rs3.next()) {
                    wert3 = rs3.getInt("value_star");
                }

                ResultSet rs4 = db.getStarStatisic(f_id, "4");
                while (rs4.next()) {
                    wert4 = rs4.getInt("value_star");
                }

                ChartStars cS = new ChartStars(titel, "1 Stern", "2 Sterne", "3 Sterne", "4 Sterne", wert, wert2, wert3, wert4);

                // Speichern als Image
                BufferedImage bImg = cS.makeChart();
                ImageIcon icon = new ImageIcon(bImg);
                statLabel.setIcon(icon);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_statistikPlatzButtonActionPerformed

    /*
     * Reset beim Laden des Panels
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            vorstellungAuswahl.removeAllItems();
            vorstellungAuswahl.addItem("VORSTELLUNG AUSWÄHLEN");

            ResultSet rs2 = db.getAllVorstellungen();
            while (rs2.next()) {
                v_id = rs2.getString("v_id");
                filmTitel = rs2.getString("titel");
                datum = rs2.getString("datum");
                uhrzeit = rs2.getString("uhrzeit");
                saalnummer = rs2.getString("saalnummer");

                vorstellungAuswahl.addItem(filmTitel + ", " + datum + ", " + uhrzeit + ", " + saalnummer);
            }
            filmAuswahl.removeAllItems();
            filmAuswahl.addItem("FILM AUSWÄHLEN");

            ResultSet rs = db.getAllMovie();
            while (rs.next()) {
                filmtitel = rs.getString("titel");
                filmAuswahl.addItem(filmtitel);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Anteile freie und belegte Plaetze von DB berechnen lassen und Weiteragbe
     * an Chartgrafik zum Anzeigen in GUI
     */
    private void statistikFilmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikFilmButtonActionPerformed
        try {

            String auswahl = (String) vorstellungAuswahl.getSelectedItem();

            String[] splittArray = auswahl.split("\\, ");

            String filmtitel = splittArray[0];
            String datum = splittArray[1];
            String uhrzeit = splittArray[2];
            String saalnummer = splittArray[3];
            String f_id = "";
            String v_id = "";
            int blockedSeats = 0;
            int freeSeats = 0;

            ResultSet rs = db.getFilmIDByMovie(filmtitel);
            while (rs.next()) {
                f_id = rs.getString("f_id");
            }

            ResultSet rs2 = db.getVIDByMisc(datum, uhrzeit, saalnummer, f_id);
            while (rs2.next()) {
                v_id = rs2.getString("v_id");
            }

            ResultSet rs3 = db.getBlockedSeats(saalnummer, v_id);
            while (rs3.next()) {
                blockedSeats = rs3.getInt("count");
            }

            ResultSet rs4 = db.getFreeSeats(saalnummer, v_id);
            while (rs4.next()) {
                freeSeats = rs4.getInt("count");
            }

            ChartSeats cSe = new ChartSeats(saalnummer, "Freie Plätze", "Belegte Plätze", freeSeats, blockedSeats);
            // Speichern als Image
            BufferedImage bImg = cSe.makeChart();
            ImageIcon icon = new ImageIcon(bImg);
            statLabel.setIcon(icon);

        } catch (SQLException ex) {
            Logger.getLogger(Statistics.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_statistikFilmButtonActionPerformed

    private void filmAuswahlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmAuswahlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filmAuswahlActionPerformed

    /*
     * Karte clientProfil laden
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "clientProfil");
        statLabel.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox filmAuswahl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel statLabel;
    private javax.swing.JButton statistikFilmButton;
    private javax.swing.JButton statistikPlatzButton;
    private javax.swing.JComboBox vorstellungAuswahl;
    // End of variables declaration//GEN-END:variables
}
