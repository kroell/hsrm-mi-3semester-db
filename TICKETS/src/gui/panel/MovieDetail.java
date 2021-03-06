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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import tablemodel.SpielzeitTabelle;

/**
 *
 * Panel zum Anzeigen der Filmdetails
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class MovieDetail extends javax.swing.JPanel {

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
    private String avgStar;
    private String film_id;
    private JPanel welcomePanel;
    private String datumSelect;
    private String uhrzeitSelect;
    private String saalSelect;
    private DefaultTableModel myModel = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private SpielzeitTabelle sT;

    // Default Konstruktor
    public MovieDetail() {
        initComponents();
    }

    // Angepasster Konstruktor
    public MovieDetail(MainFrame mF, Database db) throws SQLException {
        initComponents();
        this.mF = mF;
        this.db = db;
        setMovieDetailsEmpty();
        showTableContent();
        // Windows GUI Anpassung
        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));
        filmBewertenButton.setOpaque(false);
        filmBewertenButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmBewertenButton.setContentAreaFilled(false);
        filmBewertenButton.setBackground(new Color(0, 0, 0, 0));
        bewAnsButton.setOpaque(false);
        bewAnsButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        bewAnsButton.setContentAreaFilled(false);
        bewAnsButton.setBackground(new Color(0, 0, 0, 0));
        jScrollPane2.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        filmprogrammButton = new javax.swing.JButton();
        coverLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        trailerLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sterneLabel = new javax.swing.JLabel();
        filmTitelLabel = new javax.swing.JLabel();
        bewertungLabel = new javax.swing.JLabel();
        regisseurLabel = new javax.swing.JLabel();
        laengeLabel = new javax.swing.JLabel();
        darstellerLabel = new javax.swing.JLabel();
        landLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        fskAlterLabel = new javax.swing.JLabel();
        datumLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        spielzeitTable = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jLabel8 = new javax.swing.JLabel();
        spielzeitLabel = new javax.swing.JLabel();
        bewAnsButton = new javax.swing.JButton();
        shadowLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inhaltLabel = new javax.swing.JTextArea();
        filmBewertenButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(520, 550, 480, 6);

        trailerLabel.setFont(new java.awt.Font("Futura", 0, 28));
        trailerLabel.setForeground(new java.awt.Color(238, 162, 35));
        trailerLabel.setText("TRAILER"); // NOI18N
        add(trailerLabel);
        trailerLabel.setBounds(0, 300, 430, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetailTopLine.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(190, 30, 540, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 340, 480, 6);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(520, 340, 480, 6);

        sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sterne_blanko.png"))); // NOI18N
        add(sterneLabel);
        sterneLabel.setBounds(520, 570, 210, 50);

        filmTitelLabel.setFont(new java.awt.Font("Futura", 0, 28));
        filmTitelLabel.setForeground(new java.awt.Color(238, 162, 35));
        filmTitelLabel.setText("FILMTITEL"); // NOI18N
        add(filmTitelLabel);
        filmTitelLabel.setBounds(190, -10, 430, 50);

        bewertungLabel.setFont(new java.awt.Font("Futura", 0, 28));
        bewertungLabel.setForeground(new java.awt.Color(238, 162, 35));
        bewertungLabel.setText("BEWERTUNG"); // NOI18N
        add(bewertungLabel);
        bewertungLabel.setBounds(520, 510, 430, 40);

        regisseurLabel.setFont(new java.awt.Font("Arial", 0, 13));
        regisseurLabel.setText("Name");
        add(regisseurLabel);
        regisseurLabel.setBounds(790, 200, 150, 22);

        laengeLabel.setFont(new java.awt.Font("Arial", 0, 13));
        laengeLabel.setText("Länge");
        add(laengeLabel);
        laengeLabel.setBounds(790, 120, 150, 22);

        darstellerLabel.setFont(new java.awt.Font("Arial", 0, 13));
        darstellerLabel.setText("Hauptdarsteller");
        add(darstellerLabel);
        darstellerLabel.setBounds(790, 160, 160, 22);

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

        spielzeitTable.setModel(myModel);
        spielzeitTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spielzeitTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(spielzeitTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(520, 360, 460, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetail_blase.png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(720, -10, 260, 290);

        spielzeitLabel.setFont(new java.awt.Font("Futura", 0, 28));
        spielzeitLabel.setForeground(new java.awt.Color(238, 162, 35));
        spielzeitLabel.setText("SPIELZEIT"); // NOI18N
        add(spielzeitLabel);
        spielzeitLabel.setBounds(520, 300, 430, 40);

        bewAnsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/bewAnsehen_button.png"))); // NOI18N
        bewAnsButton.setBorder(null);
        bewAnsButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/bewAnsehen_button_h.png"))); // NOI18N
        bewAnsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bewAnsButtonActionPerformed(evt);
            }
        });
        add(bewAnsButton);
        bewAnsButton.setBounds(840, 569, 140, 40);

        shadowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel);
        shadowLabel.setBounds(0, 30, 190, 270);

        inhaltLabel.setColumns(20);
        inhaltLabel.setEditable(false);
        inhaltLabel.setLineWrap(true);
        inhaltLabel.setRows(5);
        inhaltLabel.setWrapStyleWord(true);
        inhaltLabel.setBorder(null);
        jScrollPane2.setViewportView(inhaltLabel);

        add(jScrollPane2);
        jScrollPane2.setBounds(190, 50, 540, 220);

        filmBewertenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmBewerten_Button.png"))); // NOI18N
        filmBewertenButton.setBorder(null);
        filmBewertenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmBewerten_Button_h.png"))); // NOI18N
        filmBewertenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmBewertenButtonActionPerformed(evt);
            }
        });
        add(filmBewertenButton);
        filmBewertenButton.setBounds(737, 570, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/youtube_dummy.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 350, 460, 270);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte welcomePanel laden
     */
    private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "welcomePanel");

        setMovieDetailsEmpty();
        //CardLayout cL = (CardLayout) mainPanel.getLayout();         //cL.show(mainPanel,"welcomePanel");}//GEN-LAST:event_filmprogrammButtonActionPerformed
    }

    /*
     * Wenn eingeloggt und kein Gast karte addReview laden
     */
        private void filmBewertenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmBewertenButtonActionPerformed
            // check ob eingeloggt
            if (!mF.getIstGast()) {
                if (mF.getLoggedInKundenID().equals("")) {
                    JOptionPane.showMessageDialog(null, "Bitte zuerst einloggen!", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                } else {
                    CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
                    cL.show(mF.getMainPanel(), "addReview");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Als Gast kannst du keine Filme bewerten!", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
            }
            
    }//GEN-LAST:event_filmBewertenButtonActionPerformed

    /*
     * Karte showReview laden
     */
    private void bewAnsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bewAnsButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "showReview");
    }//GEN-LAST:event_bewAnsButtonActionPerformed

    /*
     * Wird beim Laden des Panels ausgefuehrt
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            film_id = mF.getAktFilmID();
            setMovieDetailsEmpty();
            getMovieDetails();
            setMovieDetails();
            getAvgStars();
            setAvgStars();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateContent();
    }//GEN-LAST:event_update

    /*
     * Einfacher Klick: Vorstellungsinformationen aus der Tabelle in Variablen schreiben
     * Doppelklick: Karte bookingSummary laden
     */
    private void spielzeitTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spielzeitTableMouseClicked

        if (evt.getClickCount() == 1) {
            int row = spielzeitTable.getSelectedRow();
            datumSelect = (String) spielzeitTable.getValueAt(row, 1);
            uhrzeitSelect = (String) spielzeitTable.getValueAt(row, 2);
            saalSelect = (String) spielzeitTable.getValueAt(row, 3);
            mF.setDatumSelect(datumSelect);
            mF.setUhrzeitSelect(uhrzeitSelect);
            mF.setSaalSelect(saalSelect);
        }
        if (evt.getClickCount() == 2) {
            if (!mF.getLoggedInKundenID().equals("")) {
                CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
                cL.show(mF.getMainPanel(), "bookingSummary");
            } else {
                JOptionPane.showMessageDialog(null, "Bitte zuerst einloggen!", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_spielzeitTableMouseClicked

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
     * Filminformationen in die GUI Labels schreiben
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
        filmTitelLabel.setText(titel);
        datumLabel.setText("Filmstart: " + filmstart);
        inhaltLabel.setText(inhalt);
        fskAlterLabel.setText("Ab " + fsk + " Jahre");
        genreLabel.setText(genre);
        laengeLabel.setText("Laufzeit: " + laenge + " Min");
        landLabel.setText(land + " " + jahr);
        darstellerLabel.setText(darsteller);
        if (regisseur != null) {
            regisseurLabel.setText("Regie: " + regisseur);
        } else {
            regisseurLabel.setText("Regie: ");
        }

        shadowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png")));
    }

    /*
     * Reset Panel
     */
    private void setMovieDetailsEmpty() {
        filmTitelLabel.setText("");
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

    /*
     * Durchschnittswert der Sterne ermitteln
     */
    private void getAvgStars() throws SQLException {
        if (film_id != null) {
            ResultSet rs = db.showAvgStars(film_id);
            while (rs.next()) {
                avgStar = rs.getString("round");
            }
        }
    }

    /*
     * Grafiken in GUI anzeigen
     */
    private void setAvgStars() {
        if (avgStar != null) {
            if (avgStar.equals("1")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/einstern.png")));
            }
            if (avgStar.equals("2")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/zweisterne.png")));
            }
            if (avgStar.equals("3")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/dreisterne.png")));
            }
            if (avgStar.equals("4")) {
                sterneLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/viersterne.png")));
            }
        }
    }

    /*
     * Tabelleinhat der Spielzeiten anzeigen
     */
    private void showTableContent() throws SQLException {
        
        sT = new SpielzeitTabelle(myModel, spielzeitTable, rowData, columnNames, db, mF);

    }

    /*
     * Tabelleninhalt aktualisieren
     */
    private void updateContent() {
        while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            sT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bewAnsButton;
    private javax.swing.JLabel bewertungLabel;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JLabel darstellerLabel;
    private javax.swing.JLabel datumLabel;
    private javax.swing.JButton filmBewertenButton;
    private javax.swing.JLabel filmTitelLabel;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel fskAlterLabel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JTextArea inhaltLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel laengeLabel;
    private javax.swing.JLabel landLabel;
    private javax.swing.JLabel regisseurLabel;
    private javax.swing.JLabel shadowLabel;
    private javax.swing.JLabel spielzeitLabel;
    private javax.swing.JTable spielzeitTable;
    private javax.swing.JLabel sterneLabel;
    private javax.swing.JLabel trailerLabel;
    // End of variables declaration//GEN-END:variables
}
