package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * Panel zum Anzeigen aller Bewertungen
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ShowReviews extends javax.swing.JPanel {

    private Database db;
    private MainFrame mF;
    private String coverUrl;
    private String titel;
    private String fsk;
    private String filmstart;
    private String inhalt;
    private String genre;
    private String laenge;
    private String jahr;
    private String land;
    private String darsteller;
    private String regisseur;
    private String film_id;
    private String kommentar;
    private String benutzername1;
    private String sterne1;
    private String kommentar1;
    private String benutzername2;
    private String sterne2;
    private String kommentar2;
    private String benutzername3;
    private String sterne3;
    private String kommentar3;

    // Default Konstruktor
    public ShowReviews() {
        initComponents();
    }

    // Angepasster Konstruktor
    public ShowReviews(MainFrame mF, Database db) throws SQLException {
        initComponents();
        this.mF = mF;
        this.db = db;
        setMovieDetailsEmpty();
        getMovieDetails();
        setMovieDetails();
        getReviewDetails();
        setReviewDetails1();
        setReviewDetails2();
        setReviewDetails3();

        //Windows GUI Anpassung
        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));
        jScrollPane1.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        jScrollPane2.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        jScrollPane3.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        jScrollPane4.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filmprogrammButton = new javax.swing.JButton();
        coverLabel = new javax.swing.JLabel();
        regisseurLabel = new javax.swing.JLabel();
        darstellerLabel = new javax.swing.JLabel();
        laengeLabel = new javax.swing.JLabel();
        landLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        fskAlterLabel = new javax.swing.JLabel();
        datumLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        trailerLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        benutzernameLabel = new javax.swing.JLabel();
        sterneLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kommentarLabel = new javax.swing.JTextArea();
        benutzernameLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kommentarLabel2 = new javax.swing.JTextArea();
        sterneLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        inhaltLabel = new javax.swing.JTextArea();
        filmtitelLabel = new javax.swing.JLabel();
        lineTitel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        kommentarLabel3 = new javax.swing.JTextArea();
        benutzernameLabel3 = new javax.swing.JLabel();
        sterneLabel3 = new javax.swing.JLabel();
        shadowLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        filmprogrammButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button.png"))); // NOI18N
        filmprogrammButton.setBorder(null);
        filmprogrammButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button_h.png"))); // NOI18N
        filmprogrammButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmprogrammButtonActionPerformed(evt);
            }
        });
        add(filmprogrammButton);
        filmprogrammButton.setBounds(600, 10, 150, 20);

        coverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty2.png"))); // NOI18N
        add(coverLabel);
        coverLabel.setBounds(0, 0, 180, 270);

        regisseurLabel.setFont(new java.awt.Font("Arial", 0, 13));
        regisseurLabel.setText("Name");
        add(regisseurLabel);
        regisseurLabel.setBounds(790, 200, 150, 22);

        darstellerLabel.setFont(new java.awt.Font("Arial", 0, 13));
        darstellerLabel.setText("Hauptdarsteller");
        add(darstellerLabel);
        darstellerLabel.setBounds(790, 160, 160, 22);

        laengeLabel.setFont(new java.awt.Font("Arial", 0, 13));
        laengeLabel.setText("Länge");
        add(laengeLabel);
        laengeLabel.setBounds(790, 120, 150, 22);

        landLabel.setFont(new java.awt.Font("Arial", 0, 13));
        landLabel.setText("Jahr Land");
        add(landLabel);
        landLabel.setBounds(790, 100, 140, 22);

        genreLabel.setFont(new java.awt.Font("Arial", 0, 13));
        genreLabel.setText("Genre");
        add(genreLabel);
        genreLabel.setBounds(790, 80, 140, 22);

        fskAlterLabel.setFont(new java.awt.Font("Arial", 0, 13));
        fskAlterLabel.setText("Alter");
        add(fskAlterLabel);
        fskAlterLabel.setBounds(790, 60, 140, 22);

        datumLabel.setFont(new java.awt.Font("Arial", 1, 14));
        datumLabel.setText("Datum");
        add(datumLabel);
        datumLabel.setBounds(790, 20, 150, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetail_blase.png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(720, -10, 260, 290);

        trailerLabel.setFont(new java.awt.Font("Futura", 0, 28));
        trailerLabel.setForeground(new java.awt.Color(238, 162, 35));
        trailerLabel.setText("KOMMENTARE ZUM FILM"); // NOI18N
        add(trailerLabel);
        trailerLabel.setBounds(0, 300, 430, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 340, 980, 5);

        benutzernameLabel.setFont(new java.awt.Font("Arial", 0, 14));
        benutzernameLabel.setText("Benutzername");
        add(benutzernameLabel);
        benutzernameLabel.setBounds(0, 360, 170, 17);

        sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sterne_blanko.png"))); // NOI18N
        add(sterneLabel);
        sterneLabel.setBounds(770, 360, 210, 50);

        kommentarLabel.setColumns(20);
        kommentarLabel.setEditable(false);
        kommentarLabel.setFont(new java.awt.Font("Arial", 0, 14));
        kommentarLabel.setLineWrap(true);
        kommentarLabel.setWrapStyleWord(true);
        kommentarLabel.setAutoscrolls(false);
        kommentarLabel.setBorder(null);
        jScrollPane1.setViewportView(kommentarLabel);

        add(jScrollPane1);
        jScrollPane1.setBounds(170, 360, 530, 60);

        benutzernameLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        benutzernameLabel2.setText("Benutzername");
        add(benutzernameLabel2);
        benutzernameLabel2.setBounds(0, 440, 170, 17);

        kommentarLabel2.setColumns(20);
        kommentarLabel2.setEditable(false);
        kommentarLabel2.setFont(new java.awt.Font("Arial", 0, 14));
        kommentarLabel2.setLineWrap(true);
        kommentarLabel2.setWrapStyleWord(true);
        kommentarLabel2.setAutoscrolls(false);
        kommentarLabel2.setBorder(null);
        jScrollPane2.setViewportView(kommentarLabel2);

        add(jScrollPane2);
        jScrollPane2.setBounds(170, 440, 530, 60);

        sterneLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sterne_blanko.png"))); // NOI18N
        add(sterneLabel2);
        sterneLabel2.setBounds(770, 440, 210, 50);

        inhaltLabel.setColumns(20);
        inhaltLabel.setLineWrap(true);
        inhaltLabel.setRows(5);
        inhaltLabel.setWrapStyleWord(true);
        inhaltLabel.setBorder(null);
        jScrollPane3.setViewportView(inhaltLabel);

        add(jScrollPane3);
        jScrollPane3.setBounds(190, 50, 540, 220);

        filmtitelLabel.setFont(new java.awt.Font("Futura", 0, 28));
        filmtitelLabel.setForeground(new java.awt.Color(238, 162, 35));
        filmtitelLabel.setText("FILMTITEL"); // NOI18N
        add(filmtitelLabel);
        filmtitelLabel.setBounds(190, -10, 430, 50);

        lineTitel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetailTopLine.png"))); // NOI18N
        add(lineTitel);
        lineTitel.setBounds(190, 30, 540, 20);

        kommentarLabel3.setColumns(20);
        kommentarLabel3.setEditable(false);
        kommentarLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        kommentarLabel3.setLineWrap(true);
        kommentarLabel3.setWrapStyleWord(true);
        kommentarLabel3.setAutoscrolls(false);
        kommentarLabel3.setBorder(null);
        jScrollPane4.setViewportView(kommentarLabel3);

        add(jScrollPane4);
        jScrollPane4.setBounds(170, 520, 530, 60);

        benutzernameLabel3.setFont(new java.awt.Font("Arial", 0, 14));
        benutzernameLabel3.setText("Benutzername");
        add(benutzernameLabel3);
        benutzernameLabel3.setBounds(0, 520, 170, 17);

        sterneLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sterne_blanko.png"))); // NOI18N
        add(sterneLabel3);
        sterneLabel3.setBounds(770, 520, 210, 50);

        shadowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel);
        shadowLabel.setBounds(0, 30, 190, 270);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte movieDetail laden
     */
    private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");

        setMovieDetailsEmpty();
    }//GEN-LAST:event_filmprogrammButtonActionPerformed

    /*
     * Inhalt beim Oeffnen des Panels anzeigen
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            film_id = mF.getAktFilmID();
            setMovieDetailsEmpty();
            getMovieDetails();
            setMovieDetails();
            getReviewDetails();
            setReviewDetails1();
            setReviewDetails2();
            setReviewDetails3();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Filminformationen aus DB laden
     */
    private void getMovieDetails() throws SQLException {
        ResultSet rs = db.showMovieByID(film_id);
        while (rs.next()) {
            coverUrl = rs.getString("cover_url");
            titel = rs.getString("titel");
            fsk = rs.getString("fsk");
            filmstart = rs.getString("kinostart");
            inhalt = rs.getString("inhalt");
            genre = rs.getString("genre");
            laenge = rs.getString("laenge");
            jahr = rs.getString("jahr");
            land = rs.getString("land");


        }
        ResultSet rs2 = db.showRegisseurByMovieID(film_id);
        while (rs2.next()) {
            regisseur = rs2.getString("name");
        }
        ResultSet rs3 = db.showDarstellerByMovieID(film_id);
        while (rs3.next()) {
            darsteller = rs3.getString("name");
        }

    }

    /*
     * Filminformationen in GUI anzeigen
     */
    private void setMovieDetails() {
        try {
            // Create a URL for the image's location
            URL url = new URL(coverUrl);
            // Get the image
            java.awt.Image image = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url);
            Image imageNewScale = image.getScaledInstance(178, 270, 270);
            ImageIcon cover = new ImageIcon(imageNewScale);
            coverLabel.setIcon(cover);
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        filmtitelLabel.setText(titel);
        datumLabel.setText("Filmstart: " + filmstart);
        inhaltLabel.setText(inhalt);
        fskAlterLabel.setText("Ab " + fsk + " Jahre");
        genreLabel.setText(genre);
        laengeLabel.setText("Laufzeit: " + laenge + " Min");
        landLabel.setText(land + " " + jahr);
        darstellerLabel.setText(darsteller);
        regisseurLabel.setText("Regie: " + regisseur);
        shadowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png")));

    }

    /*
     * Bewertungsinformationen aus DB laden
     */
    private void getReviewDetails() throws SQLException {
        try {
            ResultSet rs = db.showReviewsByFilmIDLetzter(film_id);
            while (rs.next()) {
                benutzername1 = rs.getString("benutzername");
                kommentar1 = rs.getString("kommentar");
                sterne1 = rs.getString("sterne");
            }
            ResultSet rs2 = db.showReviewsByFilmIDVorletzter(film_id);
            while (rs2.next()) {
                benutzername2 = rs2.getString("benutzername");
                kommentar2 = rs2.getString("kommentar");
                sterne2 = rs2.getString("sterne");
            }
            ResultSet rs3 = db.showReviewsByFilmIDVorvorletzter(film_id);
            while (rs3.next()) {
                benutzername3 = rs3.getString("benutzername");
                kommentar3 = rs3.getString("kommentar");
                sterne3 = rs3.getString("sterne");
            }
        } catch (Exception ex) {
            System.out.print("Noch keine Film-ID ausgewählt!\n");
        }
    }

    /*
     * Bewertungsinformationen in GUI anzeigen
     */
    private void setReviewDetails1() {

        try {
            benutzernameLabel.setText(benutzername1);
            kommentarLabel.setText(kommentar1);


            if (sterne1.equals("1")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/einstern.png")));
            }
            if (sterne1.equals("2")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/zweisterne.png")));
            }
            if (sterne1.equals("3")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/dreisterne.png")));
            }
            if (sterne1.equals("4")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/viersterne.png")));
            }
        } catch (Exception ex) {
            System.out.print("Noch keine Film-ID ausgewählt!\n");
        }
    }

    /*
     * Bewertungsinformationen in GUI anzeigen
     */
    private void setReviewDetails2() {
        try {
            benutzernameLabel2.setText(benutzername2);
            kommentarLabel2.setText(kommentar2);

            if (sterne2.equals("1")) {
                sterneLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/einstern.png")));
            }
            if (sterne2.equals("2")) {
                sterneLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/zweisterne.png")));
            }
            if (sterne2.equals("3")) {
                sterneLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/dreisterne.png")));
            }
            if (sterne2.equals("4")) {
                sterneLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/viersterne.png")));
            }

        } catch (Exception ex) {
            System.out.print("Noch keine Film-ID ausgewählt!\n");
        }
    }

    /*
     * Bewertungsinformationen in GUI anzeigen
     */
    private void setReviewDetails3() {
        try {
            benutzernameLabel3.setText(benutzername3);
            kommentarLabel3.setText(kommentar3);
            if (sterne3.equals("1")) {
                sterneLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/einstern.png")));
            }
            if (sterne3.equals("2")) {
                sterneLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/zweisterne.png")));
            }
            if (sterne3.equals("3")) {
                sterneLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/dreisterne.png")));
            }
            if (sterne3.equals("4")) {
                sterneLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/viersterne.png")));
            }
        } catch (Exception ex) {
            System.out.print("Noch keine Film-ID ausgewählt!\n");
        }
    }

    /*
     * Reset
     */
    private void setMovieDetailsEmpty() {
        filmtitelLabel.setText("");
        datumLabel.setText("");
        inhaltLabel.setText("");
        fskAlterLabel.setText("");
        genreLabel.setText("");
        laengeLabel.setText("");
        landLabel.setText("");
        darstellerLabel.setText("");
        regisseurLabel.setText("");
        coverLabel.setIcon(new ImageIcon(""));
        shadowLabel.setIcon(new ImageIcon(""));
        sterneLabel.setIcon(new ImageIcon(""));
        benutzernameLabel.setText("");
        benutzernameLabel2.setText("");
        benutzernameLabel3.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel benutzernameLabel;
    private javax.swing.JLabel benutzernameLabel2;
    private javax.swing.JLabel benutzernameLabel3;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JLabel darstellerLabel;
    private javax.swing.JLabel datumLabel;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel filmtitelLabel;
    private javax.swing.JLabel fskAlterLabel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextArea inhaltLabel;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea kommentarLabel;
    private javax.swing.JTextArea kommentarLabel2;
    private javax.swing.JTextArea kommentarLabel3;
    private javax.swing.JLabel laengeLabel;
    private javax.swing.JLabel landLabel;
    private javax.swing.JLabel lineTitel;
    private javax.swing.JLabel regisseurLabel;
    private javax.swing.JLabel shadowLabel;
    private javax.swing.JLabel sterneLabel;
    private javax.swing.JLabel sterneLabel2;
    private javax.swing.JLabel sterneLabel3;
    private javax.swing.JLabel trailerLabel;
    // End of variables declaration//GEN-END:variables
}
