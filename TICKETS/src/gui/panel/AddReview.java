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
 * Panel zum Hinzufuegen eines einer Bewertung
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class AddReview extends javax.swing.JPanel {

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

    // Default Konstruktor
    public AddReview() {
        initComponents();
    }

    // Angepasster Konstruktor
    public AddReview(MainFrame mF, Database db) throws SQLException {
        initComponents();
        this.mF = mF;
        this.db = db;

        jScrollPane1.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        jScrollPane2.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        // Windows GUI Anpassungen
        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0, 0, 0, 0));
        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filmprogrammButton = new javax.swing.JButton();
        coverLabel = new javax.swing.JLabel();
        lineTitel = new javax.swing.JLabel();
        filmtitelLabel = new javax.swing.JLabel();
        regisseurLabel = new javax.swing.JLabel();
        darstellerLabel = new javax.swing.JLabel();
        laengeLabel = new javax.swing.JLabel();
        landLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        fskAlterLabel = new javax.swing.JLabel();
        datumLabel = new javax.swing.JLabel();
        kommentarLabel = new javax.swing.JLabel();
        lineKommentar = new javax.swing.JLabel();
        lineSterne = new javax.swing.JLabel();
        sterneHeadLabel = new javax.swing.JLabel();
        sterneLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewField = new javax.swing.JTextArea();
        sterneDropdown = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        inhaltLabel = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        gelbeBlase = new javax.swing.JLabel();
        bemerkungLabel = new javax.swing.JLabel();
        shadowLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(980, 620));
        setSize(new java.awt.Dimension(980, 620));
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

        lineTitel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetailTopLine.png"))); // NOI18N
        add(lineTitel);
        lineTitel.setBounds(190, 30, 540, 20);

        filmtitelLabel.setFont(new java.awt.Font("Futura", 0, 28));
        filmtitelLabel.setForeground(new java.awt.Color(238, 162, 35));
        filmtitelLabel.setText("FILMTITEL"); // NOI18N
        add(filmtitelLabel);
        filmtitelLabel.setBounds(190, -10, 430, 50);

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

        kommentarLabel.setFont(new java.awt.Font("Futura", 0, 28));
        kommentarLabel.setForeground(new java.awt.Color(238, 162, 35));
        kommentarLabel.setText("DEIN KOMMENTAR"); // NOI18N
        add(kommentarLabel);
        kommentarLabel.setBounds(0, 300, 430, 40);

        lineKommentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(lineKommentar);
        lineKommentar.setBounds(0, 340, 480, 6);

        lineSterne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(lineSterne);
        lineSterne.setBounds(520, 340, 480, 6);

        sterneHeadLabel.setFont(new java.awt.Font("Futura", 0, 28));
        sterneHeadLabel.setForeground(new java.awt.Color(238, 162, 35));
        sterneHeadLabel.setText("DEINE STERNE"); // NOI18N
        add(sterneHeadLabel);
        sterneHeadLabel.setBounds(520, 300, 430, 40);

        sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sterne_blanko.png"))); // NOI18N
        add(sterneLabel);
        sterneLabel.setBounds(770, 360, 210, 50);

        reviewField.setColumns(20);
        reviewField.setLineWrap(true);
        reviewField.setWrapStyleWord(true);
        jScrollPane1.setViewportView(reviewField);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 360, 460, 230);

        sterneDropdown.setFont(new java.awt.Font("Futura", 0, 12));
        sterneDropdown.setForeground(new java.awt.Color(238, 162, 35));
        sterneDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "STERNE", "1", "2", "3", "4" }));
        sterneDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sterneDropdownActionPerformed(evt);
            }
        });
        add(sterneDropdown);
        sterneDropdown.setBounds(520, 360, 140, 27);

        inhaltLabel.setColumns(20);
        inhaltLabel.setLineWrap(true);
        inhaltLabel.setRows(5);
        inhaltLabel.setWrapStyleWord(true);
        inhaltLabel.setBorder(null);
        jScrollPane2.setViewportView(inhaltLabel);

        add(jScrollPane2);
        jScrollPane2.setBounds(190, 50, 540, 220);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(780, 550, 190, 49);

        gelbeBlase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetail_blase.png"))); // NOI18N
        add(gelbeBlase);
        gelbeBlase.setBounds(720, -10, 260, 290);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(740, 510, 220, 20);

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
        reviewField.setText("");
        sterneDropdown.setSelectedIndex(0);
        setMovieDetailsEmpty();

        //CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();         //cL.show(mF.getMainPanel(),"showEmployee");}//GEN-LAST:event_filmprogrammButtonActionPerformed
    }

    /*
     * Bei Auswahl der Sternanzahl entsprechende Grafik anzeigen
     */
        private void sterneDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sterneDropdownActionPerformed

            if (sterneDropdown.getSelectedItem().equals("STERNE")) {
                sterneLabel.setIcon(new ImageIcon("src/data/pics/kunde/sterne_blanko.png"));
            }
            if (sterneDropdown.getSelectedItem().equals("1")) {
                sterneLabel.setIcon(new ImageIcon("src/data/pics/kunde/einstern.png"));
            }
            if (sterneDropdown.getSelectedItem().equals("2")) {
                sterneLabel.setIcon(new ImageIcon("src/data/pics/kunde/zweisterne.png"));
            }
            if (sterneDropdown.getSelectedItem().equals("3")) {
                sterneLabel.setIcon(new ImageIcon("src/data/pics/kunde/dreisterne.png"));
            }
            if (sterneDropdown.getSelectedItem().equals("4")) {
                sterneLabel.setIcon(new ImageIcon("src/data/pics/kunde/viersterne.png"));
            }
        // TODO add your handling code here:}//GEN-LAST:event_sterneDropdownActionPerformed
    }

    /*
     * Bewertung in der Datenbank speichern
     */
        private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

            kommentar = reviewField.getText();
            String sterne = (String) sterneDropdown.getSelectedItem();

            try {
                db.addReview(film_id, mF.getLoggedInKundenID(), sterne, kommentar, bemerkungLabel);
            } catch (SQLException ex) {
                Logger.getLogger(AddReview.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Wird beim Laden des Panels ausgefuehrt
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            film_id = mF.getAktFilmID();
            setMovieDetailsEmpty();
            getMovieDetails();
            setMovieDetails();
        } catch (SQLException ex) {
            Logger.getLogger(AddReview.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Filminformationen aus der Datenbank laden
     */
    public void getMovieDetails() throws SQLException {
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
     * Alle Filminformationen in der GUI setzen
     */
    public void setMovieDetails() {
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
        shadowLabel.setIcon(new ImageIcon("src/data/pics/cover_shadow3.png"));

    }

    /*
     * Reset des Panels
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
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JLabel darstellerLabel;
    private javax.swing.JLabel datumLabel;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel filmtitelLabel;
    private javax.swing.JLabel fskAlterLabel;
    private javax.swing.JLabel gelbeBlase;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextArea inhaltLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kommentarLabel;
    private javax.swing.JLabel laengeLabel;
    private javax.swing.JLabel landLabel;
    private javax.swing.JLabel lineKommentar;
    private javax.swing.JLabel lineSterne;
    private javax.swing.JLabel lineTitel;
    private javax.swing.JLabel regisseurLabel;
    private javax.swing.JTextArea reviewField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel shadowLabel;
    private javax.swing.JComboBox sterneDropdown;
    private javax.swing.JLabel sterneHeadLabel;
    private javax.swing.JLabel sterneLabel;
    // End of variables declaration//GEN-END:variables
}
