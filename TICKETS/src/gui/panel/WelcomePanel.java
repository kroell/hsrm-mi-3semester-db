package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * Panel zum Anzeigen des HomeScreens
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class WelcomePanel extends javax.swing.JPanel {

    private MainFrame mF;
    private Database db;
    private String ersterFilmID;
    private String coverUrl;
    private String titel;
    private String fsk;
    private String filmstart;
    private String zweiterFilmID;
    private String coverUrl2;
    private String titel2;
    private String fsk2;
    private String filmstart2;
    private String dritterFilmID;
    private String coverUrl3;
    private String titel3;
    private String fsk3;
    private String filmstart3;
    private String vierterFilmID;
    private String coverUrl4;
    private String titel4;
    private String fsk4;
    private String filmstart4;
    private String fuenfterFilmID;
    private String coverUrl5;
    private String titel5;
    private String fsk5;
    private String filmstart5;
    private int filmButton;
    private String emptyImage = "src/data/pics/empty.png";

    // Default Konstruktor
    public WelcomePanel(MainFrame mF, Database db) throws SQLException, MalformedURLException {
        this.mF = mF;
        this.db = db;
        initComponents();
        getMovieID();
        getWelcomePanel();
        setWelcomePanel();
    }

    public WelcomePanel() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        coverEinsButton = new javax.swing.JButton();
        coverZweiButton = new javax.swing.JButton();
        coverDreiButton = new javax.swing.JButton();
        coverVierButton = new javax.swing.JButton();
        filmstartEinsLabel = new javax.swing.JLabel();
        titelEinsLabel = new javax.swing.JLabel();
        fskEinsLabel = new javax.swing.JLabel();
        coverFuenfButton = new javax.swing.JButton();
        titelZweiLabel = new javax.swing.JLabel();
        fskZweiLabel = new javax.swing.JLabel();
        filmstartZweiLabel = new javax.swing.JLabel();
        titelDreiLabel = new javax.swing.JLabel();
        fskDreiLabel = new javax.swing.JLabel();
        filmstartDreiLabel = new javax.swing.JLabel();
        titelVierLabel = new javax.swing.JLabel();
        fskVierLabel = new javax.swing.JLabel();
        filmstartVierLabel = new javax.swing.JLabel();
        titelFuenfLabel = new javax.swing.JLabel();
        fskFuenfLabel = new javax.swing.JLabel();
        filmstartFuenfLabel = new javax.swing.JLabel();
        shadowLabel = new javax.swing.JLabel();
        shadowLabel1 = new javax.swing.JLabel();
        shadowLabel2 = new javax.swing.JLabel();
        shadowLabel3 = new javax.swing.JLabel();
        shadowLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(980, 620));
        setSize(new java.awt.Dimension(980, 620));
        setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        jLabel3.setFont(new java.awt.Font("Frutiger", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 162, 35));
        jLabel3.setText("AKTUELLES FILMPROGRAMM"); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 430, 60);

        coverEinsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty.png"))); // NOI18N
        coverEinsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverEinsButtonActionPerformed(evt);
            }
        });
        add(coverEinsButton);
        coverEinsButton.setBounds(0, 100, 150, 220);

        coverZweiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty.png"))); // NOI18N
        coverZweiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverZweiButtonActionPerformed(evt);
            }
        });
        add(coverZweiButton);
        coverZweiButton.setBounds(200, 100, 150, 220);

        coverDreiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty.png"))); // NOI18N
        coverDreiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverDreiButtonActionPerformed(evt);
            }
        });
        add(coverDreiButton);
        coverDreiButton.setBounds(410, 100, 150, 220);

        coverVierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty.png"))); // NOI18N
        coverVierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverVierButtonActionPerformed(evt);
            }
        });
        add(coverVierButton);
        coverVierButton.setBounds(620, 100, 150, 220);

        filmstartEinsLabel.setFont(new java.awt.Font("Arial", 0, 14));
        filmstartEinsLabel.setText("FILMSTART"); // NOI18N
        add(filmstartEinsLabel);
        filmstartEinsLabel.setBounds(0, 380, 150, 16);

        titelEinsLabel.setFont(new java.awt.Font("Arial", 1, 14));
        titelEinsLabel.setText("TITEL"); // NOI18N
        add(titelEinsLabel);
        titelEinsLabel.setBounds(0, 330, 150, 16);

        fskEinsLabel.setFont(new java.awt.Font("Arial", 0, 14));
        fskEinsLabel.setText("FSK"); // NOI18N
        add(fskEinsLabel);
        fskEinsLabel.setBounds(0, 360, 150, 16);

        coverFuenfButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty.png"))); // NOI18N
        coverFuenfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverFuenfButtonActionPerformed(evt);
            }
        });
        add(coverFuenfButton);
        coverFuenfButton.setBounds(820, 100, 150, 220);

        titelZweiLabel.setFont(new java.awt.Font("Arial", 1, 14));
        titelZweiLabel.setText("TITEL"); // NOI18N
        add(titelZweiLabel);
        titelZweiLabel.setBounds(200, 330, 150, 16);

        fskZweiLabel.setFont(new java.awt.Font("Arial", 0, 14));
        fskZweiLabel.setText("FSK"); // NOI18N
        add(fskZweiLabel);
        fskZweiLabel.setBounds(200, 360, 150, 16);

        filmstartZweiLabel.setFont(new java.awt.Font("Arial", 0, 14));
        filmstartZweiLabel.setText("FILMSTART"); // NOI18N
        add(filmstartZweiLabel);
        filmstartZweiLabel.setBounds(200, 380, 150, 16);

        titelDreiLabel.setFont(new java.awt.Font("Arial", 1, 14));
        titelDreiLabel.setText("TITEL"); // NOI18N
        add(titelDreiLabel);
        titelDreiLabel.setBounds(410, 330, 150, 16);

        fskDreiLabel.setFont(new java.awt.Font("Arial", 0, 14));
        fskDreiLabel.setText("FSK"); // NOI18N
        add(fskDreiLabel);
        fskDreiLabel.setBounds(410, 360, 150, 16);

        filmstartDreiLabel.setFont(new java.awt.Font("Arial", 0, 14));
        filmstartDreiLabel.setText("FILMSTART"); // NOI18N
        add(filmstartDreiLabel);
        filmstartDreiLabel.setBounds(410, 380, 150, 16);

        titelVierLabel.setFont(new java.awt.Font("Arial", 1, 14));
        titelVierLabel.setText("TITEL"); // NOI18N
        add(titelVierLabel);
        titelVierLabel.setBounds(620, 330, 150, 16);

        fskVierLabel.setFont(new java.awt.Font("Arial", 0, 14));
        fskVierLabel.setText("FSK"); // NOI18N
        add(fskVierLabel);
        fskVierLabel.setBounds(620, 360, 150, 16);

        filmstartVierLabel.setFont(new java.awt.Font("Arial", 0, 14));
        filmstartVierLabel.setText("FILMSTART"); // NOI18N
        add(filmstartVierLabel);
        filmstartVierLabel.setBounds(620, 380, 150, 16);

        titelFuenfLabel.setFont(new java.awt.Font("Arial", 1, 14));
        titelFuenfLabel.setText("TITEL"); // NOI18N
        add(titelFuenfLabel);
        titelFuenfLabel.setBounds(820, 330, 150, 16);

        fskFuenfLabel.setFont(new java.awt.Font("Arial", 0, 14));
        fskFuenfLabel.setText("FSK"); // NOI18N
        add(fskFuenfLabel);
        fskFuenfLabel.setBounds(820, 360, 150, 16);

        filmstartFuenfLabel.setFont(new java.awt.Font("Arial", 0, 14));
        filmstartFuenfLabel.setText("FILMSTART"); // NOI18N
        add(filmstartFuenfLabel);
        filmstartFuenfLabel.setBounds(820, 380, 150, 16);

        shadowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel);
        shadowLabel.setBounds(810, 80, 190, 280);

        shadowLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel1);
        shadowLabel1.setBounds(400, 80, 190, 280);

        shadowLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel2);
        shadowLabel2.setBounds(190, 80, 190, 280);

        shadowLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel3);
        shadowLabel3.setBounds(-10, 80, 190, 280);

        shadowLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel4);
        shadowLabel4.setBounds(610, 80, 190, 280);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte movieDetail laden
     */
    private void coverEinsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverEinsButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");
        mF.setAktFilmID(ersterFilmID);

    }//GEN-LAST:event_coverEinsButtonActionPerformed

    /*
     * Karte movieDetail laden
     */
    private void coverZweiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverZweiButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");
        mF.setAktFilmID(zweiterFilmID);

    }//GEN-LAST:event_coverZweiButtonActionPerformed

    /*
     * Karte movieDetail laden
     */
    private void coverDreiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverDreiButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");
        mF.setAktFilmID(dritterFilmID);

    }//GEN-LAST:event_coverDreiButtonActionPerformed

    /*
     * Karte movieDetail laden
     */
    private void coverVierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverVierButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");
        mF.setAktFilmID(vierterFilmID);
    }//GEN-LAST:event_coverVierButtonActionPerformed

    /*
     * Karte movieDetail laden
     */
    private void coverFuenfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverFuenfButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");
        mF.setAktFilmID(fuenfterFilmID);
    }//GEN-LAST:event_coverFuenfButtonActionPerformed

    /*
     * Film_ID der fuenf neuesten Filme auslesen
     */
    private void getMovieID() throws SQLException {
        ResultSet ersterFilm = db.getMovieDetailsLetzter();
        while (ersterFilm.next()) {
            ersterFilmID = ersterFilm.getString("f_id");
        }

        ResultSet zweiterFilm = db.getMovieDetailsVorletzter();
        while (zweiterFilm.next()) {
            zweiterFilmID = zweiterFilm.getString("f_id");
        }

        ResultSet dritterFilm = db.getMovieDetailsVorvorletzter();
        while (dritterFilm.next()) {
            dritterFilmID = dritterFilm.getString("f_id");
        }

        ResultSet vierterFilm = db.getMovieDetailsVorvorvorletzter();
        while (vierterFilm.next()) {
            vierterFilmID = vierterFilm.getString("f_id");
        }

        ResultSet fuenfterFilm = db.getMovieDetailsVorvorvorvorletzter();
        while (fuenfterFilm.next()) {
            fuenfterFilmID = fuenfterFilm.getString("f_id");
        }
    }

    /*
     * Informationen aus DB auslesen
     */
    private void getWelcomePanel() throws SQLException {
        ResultSet rs = db.showMovieByID(ersterFilmID);
        while (rs.next()) {
            coverUrl = rs.getString("cover_url");
            titel = rs.getString("titel");
            fsk = rs.getString("fsk");
            filmstart = rs.getString("kinostart");
        }

        ResultSet rs2 = db.showMovieByID(zweiterFilmID);
        while (rs2.next()) {
            coverUrl2 = rs2.getString("cover_url");
            titel2 = rs2.getString("titel");
            fsk2 = rs2.getString("fsk");
            filmstart2 = rs2.getString("kinostart");
        }

        ResultSet rs3 = db.showMovieByID(dritterFilmID);
        while (rs3.next()) {
            coverUrl3 = rs3.getString("cover_url");
            titel3 = rs3.getString("titel");
            fsk3 = rs3.getString("fsk");
            filmstart3 = rs3.getString("kinostart");
        }
        ResultSet rs4 = db.showMovieByID(vierterFilmID);
        while (rs4.next()) {
            coverUrl4 = rs4.getString("cover_url");
            titel4 = rs4.getString("titel");
            fsk4 = rs4.getString("fsk");
            filmstart4 = rs4.getString("kinostart");
        }
        ResultSet rs5 = db.showMovieByID(fuenfterFilmID);
        while (rs5.next()) {
            coverUrl5 = rs5.getString("cover_url");
            titel5 = rs5.getString("titel");
            fsk5 = rs5.getString("fsk");
            filmstart5 = rs5.getString("kinostart");
        }
    }

    /*
     * Daten in GUI anzeigen
     */
    private void setWelcomePanel() throws MalformedURLException {

        try {
            // Create a URL for the image's location
            URL url = new URL(coverUrl);
            URL url2 = new URL(coverUrl2);
            URL url3 = new URL(coverUrl3);
            URL url4 = new URL(coverUrl4);
            URL url5 = new URL(coverUrl5);

            // Get the image
            java.awt.Image image = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url);
            java.awt.Image image2 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url2);
            java.awt.Image image3 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url3);
            java.awt.Image image4 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url4);
            java.awt.Image image5 = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url5);

            Image imageNewScale = image.getScaledInstance(148, 220, 220);
            Image imageNewScale2 = image2.getScaledInstance(148, 220, 220);
            Image imageNewScale3 = image3.getScaledInstance(148, 220, 220);
            Image imageNewScale4 = image4.getScaledInstance(148, 220, 220);
            Image imageNewScale5 = image5.getScaledInstance(148, 220, 220);

            ImageIcon cover = new ImageIcon(imageNewScale);
            ImageIcon cover2 = new ImageIcon(imageNewScale2);
            ImageIcon cover3 = new ImageIcon(imageNewScale3);
            ImageIcon cover4 = new ImageIcon(imageNewScale4);
            ImageIcon cover5 = new ImageIcon(imageNewScale5);

            coverEinsButton.setIcon(cover);
            coverZweiButton.setIcon(cover2);
            coverDreiButton.setIcon(cover3);
            coverVierButton.setIcon(cover4);
            coverFuenfButton.setIcon(cover5);

        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }

        titelEinsLabel.setText(titel);
        titelZweiLabel.setText(titel2);
        titelDreiLabel.setText(titel3);
        titelVierLabel.setText(titel4);
        titelFuenfLabel.setText(titel5);
        fskEinsLabel.setText("FSK: " + fsk);
        fskZweiLabel.setText("FSK: " + fsk2);
        fskDreiLabel.setText("FSK: " + fsk3);
        fskVierLabel.setText("FSK: " + fsk4);
        fskFuenfLabel.setText("FSK: " + fsk5);
        filmstartEinsLabel.setText("Start: " + filmstart);
        filmstartZweiLabel.setText("Start: " + filmstart2);
        filmstartDreiLabel.setText("Start: " + filmstart3);
        filmstartVierLabel.setText("Start: " + filmstart4);
        filmstartFuenfLabel.setText("Start: " + filmstart5);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coverDreiButton;
    private javax.swing.JButton coverEinsButton;
    private javax.swing.JButton coverFuenfButton;
    private javax.swing.JButton coverVierButton;
    private javax.swing.JButton coverZweiButton;
    private javax.swing.JLabel filmstartDreiLabel;
    private javax.swing.JLabel filmstartEinsLabel;
    private javax.swing.JLabel filmstartFuenfLabel;
    private javax.swing.JLabel filmstartVierLabel;
    private javax.swing.JLabel filmstartZweiLabel;
    private javax.swing.JLabel fskDreiLabel;
    private javax.swing.JLabel fskEinsLabel;
    private javax.swing.JLabel fskFuenfLabel;
    private javax.swing.JLabel fskVierLabel;
    private javax.swing.JLabel fskZweiLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel shadowLabel;
    private javax.swing.JLabel shadowLabel1;
    private javax.swing.JLabel shadowLabel2;
    private javax.swing.JLabel shadowLabel3;
    private javax.swing.JLabel shadowLabel4;
    private javax.swing.JLabel titelDreiLabel;
    private javax.swing.JLabel titelEinsLabel;
    private javax.swing.JLabel titelFuenfLabel;
    private javax.swing.JLabel titelVierLabel;
    private javax.swing.JLabel titelZweiLabel;
    // End of variables declaration//GEN-END:variables

    public String getErsterFilmID() {
        return ersterFilmID;
    }
}
