package gui.panel;

import database.Database;
import gui.EmpFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tablemodel.FilmeTabelle;

/**
 *
 * Panel zum Hinzufuegen eines Films
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class AddMovie extends javax.swing.JPanel { 

    private Database db;
    private DefaultTableModel myModel = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private FilmeTabelle fT;
    private EmpFrame eF;
    private String filmNr;
    private String actorNr;
    private String regisseurNr;
    
    // Default Konstruktor
    public AddMovie(){
        initComponents();
        jScrollPane1.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
    }
    
    // Angepasster Konstruktor
    public AddMovie(EmpFrame eF, Database db){
        initComponents();
        this.db = db;
        this.eF= eF;
        jScrollPane1.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        //Windows GUI Anpassung
        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0,0,0,0)); 
        loeschenButton.setOpaque(false);
        loeschenButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        loeschenButton.setContentAreaFilled(false);
        loeschenButton.setBackground(new Color(0,0,0,0)); 
        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0,0,0,0));
        dreiDCheckBox.setOpaque(false);
        dreiDCheckBox.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        dreiDCheckBox.setContentAreaFilled(false);
        dreiDCheckBox.setBackground(new Color(0,0,0,0));
        genreCombo.setBackground(Color.WHITE);
        fskCombo.setBackground(Color.WHITE);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        overviewButton = new javax.swing.JButton();
        coverUrlInput = new javax.swing.JTextField();
        filmstartInput = new javax.swing.JTextField();
        hauptdarstellerInput = new javax.swing.JTextField();
        regisseurInput = new javax.swing.JTextField();
        laengeInput = new javax.swing.JTextField();
        landInput = new javax.swing.JTextField();
        jahrInput = new javax.swing.JTextField();
        titelInput = new javax.swing.JTextField();
        genreCombo = new javax.swing.JComboBox();
        dreiDCheckBox = new javax.swing.JCheckBox();
        fskCombo = new javax.swing.JComboBox();
        bemerkungLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inhaltInput = new javax.swing.JTextArea();
        loeschenButton = new javax.swing.JButton();
        filmIDInput = new javax.swing.JTextField();
        regIDInput = new javax.swing.JTextField();
        darstellerIDInput = new javax.swing.JTextField();
        trailerURLTextfield = new javax.swing.JTextField();
        wfReg = new javax.swing.JTextField();
        wfDarsteller = new javax.swing.JTextField();
        LabelMovie = new javax.swing.JLabel();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/fimhinzufuegen.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/fimhinzufuegen_h.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(980, 620));
        setSize(new java.awt.Dimension(980, 620));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        jLabel5.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel5.setForeground(new java.awt.Color(238, 162, 35));
        jLabel5.setText("FILM HINZUFÜGEN"); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 60);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(790, 570, 190, 50);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(890, 20, 110, 29);

        coverUrlInput.setBorder(null);
        add(coverUrlInput);
        coverUrlInput.setBounds(720, 114, 240, 20);

        filmstartInput.setBorder(null);
        add(filmstartInput);
        filmstartInput.setBounds(720, 455, 130, 20);

        hauptdarstellerInput.setBorder(null);
        add(hauptdarstellerInput);
        hauptdarstellerInput.setBounds(365, 456, 240, 20);

        regisseurInput.setBorder(null);
        add(regisseurInput);
        regisseurInput.setBounds(365, 197, 240, 20);

        laengeInput.setBorder(null);
        add(laengeInput);
        laengeInput.setBounds(10, 543, 240, 20);

        landInput.setBorder(null);
        add(landInput);
        landInput.setBounds(10, 457, 240, 16);

        jahrInput.setBorder(null);
        add(jahrInput);
        jahrInput.setBounds(10, 364, 240, 20);

        titelInput.setBorder(null);
        add(titelInput);
        titelInput.setBounds(10, 197, 240, 20);

        genreCombo.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        genreCombo.setForeground(new java.awt.Color(238, 162, 35));
        genreCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENRE", "Komödie", "Action", "Thriller", "Mystery", "Fantasy", "Drama", "Horror", "Animation" }));
        add(genreCombo);
        genreCombo.setBounds(130, 280, 140, 27);
        add(dreiDCheckBox);
        dreiDCheckBox.setBounds(950, 465, 30, 23);

        fskCombo.setFont(new java.awt.Font("Futura", 0, 12));
        fskCombo.setForeground(new java.awt.Color(238, 162, 35));
        fskCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FSK", "0", "6", "12", "16", "18" }));
        add(fskCombo);
        fskCombo.setBounds(0, 280, 100, 27);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(490, 590, 300, 20);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        inhaltInput.setColumns(20);
        inhaltInput.setFont(new java.awt.Font("Arial", 0, 12));
        inhaltInput.setLineWrap(true);
        inhaltInput.setRows(5);
        inhaltInput.setAlignmentX(0.0F);
        inhaltInput.setAlignmentY(0.0F);
        inhaltInput.setBorder(null);
        inhaltInput.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(inhaltInput);

        add(jScrollPane1);
        jScrollPane1.setBounds(720, 280, 240, 100);

        loeschenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button.png"))); // NOI18N
        loeschenButton.setBorder(null);
        loeschenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button_h.png"))); // NOI18N
        loeschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschenButtonActionPerformed(evt);
            }
        });
        add(loeschenButton);
        loeschenButton.setBounds(790, 520, 190, 49);

        filmIDInput.setEditable(false);
        filmIDInput.setBorder(null);
        add(filmIDInput);
        filmIDInput.setBounds(10, 116, 240, 16);

        regIDInput.setEditable(false);
        regIDInput.setBorder(null);
        add(regIDInput);
        regIDInput.setBounds(365, 116, 240, 16);

        darstellerIDInput.setEditable(false);
        darstellerIDInput.setBorder(null);
        add(darstellerIDInput);
        darstellerIDInput.setBounds(365, 366, 240, 16);

        trailerURLTextfield.setBorder(null);
        add(trailerURLTextfield);
        trailerURLTextfield.setBounds(720, 199, 240, 16);

        wfReg.setBorder(null);
        add(wfReg);
        wfReg.setBounds(365, 281, 240, 16);

        wfDarsteller.setBorder(null);
        add(wfDarsteller);
        wfDarsteller.setBounds(375, 543, 240, 16);

        LabelMovie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/addFilmBackground.png"))); // NOI18N
        add(LabelMovie);
        LabelMovie.setBounds(-12, 80, 1003, 510);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte showMovie oeffnen
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(),"showMovie");
        loeschenButtonActionPerformed(evt);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Reset des Panels
     */
    private void loeschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loeschenButtonActionPerformed
        titelInput.setText("");
        jahrInput.setText("");
        landInput.setText("");
        laengeInput.setText("");
        regisseurInput.setText("");
        hauptdarstellerInput.setText("");
        inhaltInput.setText("");
        filmstartInput.setText("");
        coverUrlInput.setText("");
        dreiDCheckBox.setSelected(false);
        fskCombo.setSelectedIndex(0);
        genreCombo.setSelectedIndex(0);
    }//GEN-LAST:event_loeschenButtonActionPerformed

    /*
     * Hinzufuegen des Films in die Datenbank
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
       String titel = titelInput.getText();
       String jahr = jahrInput.getText();
       String land = landInput.getText();
       String laenge = laengeInput.getText();
       String regisseur = regisseurInput.getText();
       String hauptdarsteller = hauptdarstellerInput.getText();
       String inhalt = inhaltInput.getText();
       String filmstart = filmstartInput.getText();
       String coverUrl = coverUrlInput.getText();
       String fsk = (String) fskCombo.getSelectedItem();
       String genre = (String) genreCombo.getSelectedItem();
       String trailerUrl = "";
       boolean dreiD = dreiDCheckBox.isSelected();
       
       //String filmID = filmIDInput.getText();
       String regID = regIDInput.getText();
       String darstellerID = darstellerIDInput.getText();
       
       String wfRegisseur = wfReg.getText();
       String wfDarst = wfDarsteller.getText();
         
        try { 
            getMovieID();
            getRegisseurID();
            getActorID();
            
            db.addMovie(titel, genre, fsk, jahr, land, laenge, inhalt, dreiD, regisseur, hauptdarsteller, filmstart, coverUrl, trailerUrl,bemerkungLabel, filmNr, regisseurNr, actorNr, wfRegisseur, wfDarst);
        } catch (SQLException ex) {
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Reset beim Laden des Panels
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        titelInput.setText("");
        jahrInput.setText("");
        landInput.setText("");
        laengeInput.setText("");
        regisseurInput.setText("");
        hauptdarstellerInput.setText("");
        inhaltInput.setText("");
        filmstartInput.setText("");
        coverUrlInput.setText("");
        dreiDCheckBox.setSelected(false);
        fskCombo.setSelectedIndex(0);
        genreCombo.setSelectedIndex(0);
    }//GEN-LAST:event_update

    /*
     * Film ID ermitteln
     */
    private void getMovieID() throws SQLException {
        ResultSet rs = db.getMovieID();
        while (rs.next()) {
            filmNr = rs.getString("nextval");
        }
    }
    
    /*
     * Darsteller ID ermitteln
     */
    private void getActorID() throws SQLException {
        ResultSet rs = db.getActorID();
        while (rs.next()) {
            actorNr = rs.getString("nextval");
        }
    }
    
    /*
     * Regisseur ID ermitteln
     */
    private void getRegisseurID() throws SQLException {
        ResultSet rs = db.getActorID();
        while (rs.next()) {
            regisseurNr = rs.getString("nextval");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelMovie;
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField coverUrlInput;
    private javax.swing.JTextField darstellerIDInput;
    private javax.swing.JCheckBox dreiDCheckBox;
    private javax.swing.JTextField filmIDInput;
    private javax.swing.JTextField filmstartInput;
    private javax.swing.JComboBox fskCombo;
    private javax.swing.JComboBox genreCombo;
    private javax.swing.JTextField hauptdarstellerInput;
    private javax.swing.JTextArea inhaltInput;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jahrInput;
    private javax.swing.JTextField laengeInput;
    private javax.swing.JTextField landInput;
    private javax.swing.JButton loeschenButton;
    private javax.swing.JButton overviewButton;
    private javax.swing.JTextField regIDInput;
    private javax.swing.JTextField regisseurInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField titelInput;
    private javax.swing.JTextField trailerURLTextfield;
    private javax.swing.JTextField wfDarsteller;
    private javax.swing.JTextField wfReg;
    // End of variables declaration//GEN-END:variables
}
