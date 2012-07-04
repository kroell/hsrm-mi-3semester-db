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
 * Panel zum Bearbeiten eines Films
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class UpdateMovie extends javax.swing.JPanel {

    private EmpFrame eF;
    private Database db;
    private String film_id = "";
    private String titel = "";
    private String fsk = "";
    private String genre = "";
    private String jahr = "";
    private String land = "";
    private String laenge = "";
    private String regisseurID = "";
    private String regisseur = "";
    private String darstellerID = "";
    private String darsteller = "";
    private String inhalt = "";
    private String cover_url = "";
    private String trailer_url = "";
    private String filmstart = "";
    private String dreiD;

    // Default Konstruktor
    public UpdateMovie() {
        initComponents();
    }

    // Angepasster Konstruktor
    public UpdateMovie(EmpFrame eF, Database db) throws SQLException {
        initComponents();
        this.db = db;
        this.eF = eF;
        jScrollPane1.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));

        // Windows GUI Anpassungen
        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0, 0, 0, 0));

        deleteMovieButton.setOpaque(false);
        deleteMovieButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        deleteMovieButton.setContentAreaFilled(false);
        deleteMovieButton.setBackground(new Color(0, 0, 0, 0));

        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0, 0, 0, 0));

        dreiDBox.setOpaque(false);
        dreiDBox.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        dreiDBox.setContentAreaFilled(false);
        dreiDBox.setBackground(new Color(0, 0, 0, 0));

        genreCombo.setBackground(Color.WHITE);
        fskCombo.setBackground(Color.WHITE);
        filmIDInput.setBackground(Color.WHITE);
        regIdInput.setBackground(Color.WHITE);
        darstellerIdInput.setBackground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bemerkungLabel = new javax.swing.JLabel();
        filmstartInput = new javax.swing.JTextField();
        filmIDInput = new javax.swing.JTextField();
        titelInput = new javax.swing.JTextField();
        jahrInput = new javax.swing.JTextField();
        landInput = new javax.swing.JTextField();
        laengeInput = new javax.swing.JTextField();
        regInput = new javax.swing.JTextField();
        darstellerInput = new javax.swing.JTextField();
        coverUrlInput = new javax.swing.JTextField();
        trailerUrlInput = new javax.swing.JTextField();
        dreiDBox = new javax.swing.JCheckBox();
        overviewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inhaltInput = new javax.swing.JTextArea();
        regIdInput = new javax.swing.JTextField();
        darstellerIdInput = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        deleteMovieButton = new javax.swing.JButton();
        weitereFilmRegLabel = new javax.swing.JLabel();
        weitereFilmeHauptdLabel = new javax.swing.JLabel();
        fskCombo = new javax.swing.JComboBox();
        genreCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        landInput1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        jLabel4.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel4.setForeground(new java.awt.Color(238, 162, 35));
        jLabel4.setText("FILM BEARBEITEN"); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(570, 580, 200, 20);

        filmstartInput.setBorder(null);
        add(filmstartInput);
        filmstartInput.setBounds(725, 450, 130, 20);

        filmIDInput.setEditable(false);
        filmIDInput.setBorder(null);
        add(filmIDInput);
        filmIDInput.setBounds(20, 110, 230, 16);

        titelInput.setBorder(null);
        add(titelInput);
        titelInput.setBounds(20, 190, 230, 20);

        jahrInput.setBorder(null);
        add(jahrInput);
        jahrInput.setBounds(20, 360, 230, 20);

        landInput.setBorder(null);
        add(landInput);
        landInput.setBounds(20, 450, 230, 16);

        laengeInput.setBorder(null);
        add(laengeInput);
        laengeInput.setBounds(20, 540, 230, 16);

        regInput.setBorder(null);
        add(regInput);
        regInput.setBounds(370, 192, 240, 20);

        darstellerInput.setBorder(null);
        add(darstellerInput);
        darstellerInput.setBounds(370, 450, 240, 16);

        coverUrlInput.setBorder(null);
        add(coverUrlInput);
        coverUrlInput.setBounds(725, 110, 240, 16);

        trailerUrlInput.setBorder(null);
        add(trailerUrlInput);
        trailerUrlInput.setBounds(725, 193, 240, 16);
        add(dreiDBox);
        dreiDBox.setBounds(955, 459, 30, 23);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(880, 20, 130, 28);

        inhaltInput.setColumns(20);
        inhaltInput.setLineWrap(true);
        inhaltInput.setRows(5);
        inhaltInput.setWrapStyleWord(true);
        jScrollPane1.setViewportView(inhaltInput);

        add(jScrollPane1);
        jScrollPane1.setBounds(720, 280, 244, 100);

        regIdInput.setEditable(false);
        regIdInput.setBorder(null);
        add(regIdInput);
        regIdInput.setBounds(370, 110, 240, 20);

        darstellerIdInput.setEditable(false);
        darstellerIdInput.setBorder(null);
        add(darstellerIdInput);
        darstellerIdInput.setBounds(370, 360, 240, 16);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(770, 560, 200, 50);

        deleteMovieButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button.png"))); // NOI18N
        deleteMovieButton.setBorder(null);
        deleteMovieButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button_h.png"))); // NOI18N
        deleteMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMovieButtonActionPerformed(evt);
            }
        });
        add(deleteMovieButton);
        deleteMovieButton.setBounds(770, 510, 200, 49);
        add(weitereFilmRegLabel);
        weitereFilmRegLabel.setBounds(370, 280, 230, 16);
        add(weitereFilmeHauptdLabel);
        weitereFilmeHauptdLabel.setBounds(375, 540, 240, 16);

        fskCombo.setFont(new java.awt.Font("Futura", 0, 13));
        fskCombo.setForeground(new java.awt.Color(238, 162, 35));
        fskCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FSK", "0", "6", "12", "16", "18" }));
        add(fskCombo);
        fskCombo.setBounds(0, 270, 80, 27);

        genreCombo.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        genreCombo.setForeground(new java.awt.Color(238, 162, 35));
        genreCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENRE", "Komödie", "Action", "Thriller", "Mystery", "Fantasy", "Drama", "Horror", "Science-Fiction" }));
        add(genreCombo);
        genreCombo.setBounds(90, 270, 180, 27);

        jLabel1.setFont(new java.awt.Font("Futura", 0, 13));
        jLabel1.setForeground(new java.awt.Color(238, 162, 35));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/addFilmBackground.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-10, 60, 1010, 540);

        landInput1.setText("Land");
        landInput1.setBorder(null);
        add(landInput1);
        landInput1.setBounds(10, 450, 240, 16);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte showMovie laden und Panel reseten
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showMovie");

        filmIDInput.setText("");
        titelInput.setText("");
        jahrInput.setText("");
        landInput.setText("");
        laengeInput.setText("");
        coverUrlInput.setText("");
        trailerUrlInput.setText("");
        filmstartInput.setText("");
        inhaltInput.setText("");
        regInput.setText("");
        regIdInput.setText("");
        darstellerInput.setText("");
        darstellerIdInput.setText("");
        dreiDBox.setSelected(false);
        bemerkungLabel.setText("Bemerkung");
        bemerkungLabel.setForeground(Color.white);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Film in DB aktualisieren
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String f = filmIDInput.getText();
        String t = titelInput.getText();
        String fs = (String) fskCombo.getSelectedItem();
        String g = (String) genreCombo.getSelectedItem();
        String j = jahrInput.getText();
        String l = landInput.getText();
        String la = laengeInput.getText();
        String c = coverUrlInput.getText();
        String tr = trailerUrlInput.getText();
        String start = filmstartInput.getText();
        String i = inhaltInput.getText();
        String r = regInput.getText();
        String darsteller = darstellerInput.getText();
        Boolean drei = dreiDBox.isSelected();
        bemerkungLabel.setText("Bemerkung");
        bemerkungLabel.setForeground(Color.white);
        try {
            db.updateMovie(t, g, fs, j, l, la, i, drei, start, c, tr, f, eF.getFilmID(), r, regisseurID, darsteller, darstellerID, bemerkungLabel);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMovie.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Film in DB loeschen
     */
    private void deleteMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMovieButtonActionPerformed

        try {
            db.deleteMovie(film_id, bemerkungLabel);
        } catch (SQLException ex) {
            Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
        }

        filmIDInput.setText("");
        titelInput.setText("");
        jahrInput.setText("");
        landInput.setText("");
        laengeInput.setText("");
        coverUrlInput.setText("");
        trailerUrlInput.setText("");
        filmstartInput.setText("");
        inhaltInput.setText("");
        regInput.setText("");
        regIdInput.setText("");
        darstellerInput.setText("");
        darstellerIdInput.setText("");
        dreiDBox.setSelected(false);


    }//GEN-LAST:event_deleteMovieButtonActionPerformed

    /*
     * Panel updaten
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            getMovieInformations();
            getRegisseurInformations();
            getHauptdarstellerInformations();
            fill();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Filminformationen aus DB laden
     */
    private void getMovieInformations() throws SQLException {

        ResultSet rs = db.showMovieByID(eF.getFilmID());

        while (rs.next()) {
            film_id = rs.getString("f_id");
            titel = rs.getString("titel");
            fsk = rs.getString("fsk");
            genre = rs.getString("genre");
            jahr = rs.getString("jahr");
            land = rs.getString("land");
            laenge = rs.getString("laenge");
            inhalt = rs.getString("inhalt");
            cover_url = rs.getString("cover_url");
            trailer_url = rs.getString("trailer_url");
            filmstart = rs.getString("kinostart");
            dreiD = rs.getString("dreid");
        }
    }

    /*
     * Regisseurinformationen aus DB laden
     */
    private void getRegisseurInformations() throws SQLException {
        ResultSet rs = db.showRegisseurByMovieID(eF.getFilmID());
        while (rs.next()) {
            regisseurID = rs.getString("m_id");
            regisseur = rs.getString("name");
        }
    }

    /*
     * Darstellerinformationen aus DB laden
     */
    private void getHauptdarstellerInformations() throws SQLException {
        ResultSet rs = db.showDarstellerByMovieID(eF.getFilmID());
        while (rs.next()) {
            darstellerID = rs.getString("m_id");
            darsteller = rs.getString("name");
        }
    }

    /*
     * Daten in GUI anzeigen
     */
    private void fill() {

        boolean dreid = false;
        filmIDInput.setText(film_id);
        titelInput.setText(titel);
        fskCombo.setSelectedItem(fsk);
        genreCombo.setSelectedItem(genre);
        jahrInput.setText(jahr);
        landInput.setText(land);
        laengeInput.setText(laenge);
        coverUrlInput.setText(cover_url);
        trailerUrlInput.setText(trailer_url);
        filmstartInput.setText(filmstart);
        inhaltInput.setText(inhalt);
        regInput.setText(regisseur);
        regIdInput.setText(regisseurID);
        darstellerInput.setText(darsteller);
        darstellerIdInput.setText(darstellerID);

        if (dreiD.equals("t")) {
            dreid = true;
        } else {
            dreid = false;
        }
        dreiDBox.setSelected(dreid);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField coverUrlInput;
    private javax.swing.JTextField darstellerIdInput;
    private javax.swing.JTextField darstellerInput;
    private javax.swing.JButton deleteMovieButton;
    private javax.swing.JCheckBox dreiDBox;
    private javax.swing.JTextField filmIDInput;
    private javax.swing.JTextField filmstartInput;
    private javax.swing.JComboBox fskCombo;
    private javax.swing.JComboBox genreCombo;
    private javax.swing.JTextArea inhaltInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jahrInput;
    private javax.swing.JTextField laengeInput;
    private javax.swing.JTextField landInput;
    private javax.swing.JTextField landInput1;
    private javax.swing.JButton overviewButton;
    private javax.swing.JTextField regIdInput;
    private javax.swing.JTextField regInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titelInput;
    private javax.swing.JTextField trailerUrlInput;
    private javax.swing.JLabel weitereFilmRegLabel;
    private javax.swing.JLabel weitereFilmeHauptdLabel;
    // End of variables declaration//GEN-END:variables
}
