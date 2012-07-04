package gui.panel;

import database.Database;
import gui.EmpFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablemodel.FilmeTabelleV;
import tablemodel.VorstellungenTabelle;

/**
 *
 * Panel zum Hinzufuegen einer Vorstellung
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class AddViews extends javax.swing.JPanel {

    private Database db;
    private EmpFrame eF;
    private DefaultTableModel myModel = new DefaultTableModel();
    private DefaultTableModel myModel2 = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private FilmeTabelleV fTV;
    private String film_id;
    private VorstellungenTabelle vT;
    private String v_id;
    private String datum;
    private String wochentag;
    private Date currentDate;
    private String vorstellungNr;

    // Default Konstruktor
    public AddViews() {
        initComponents();
    }

    // Angepasster Konstruktor
    public AddViews(EmpFrame eF, Database db) throws SQLException {
        initComponents();
        this.db = db;
        this.eF = eF;
        showTableContent();
        //Windows GUI Anpassung
        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0, 0, 0, 0));

        resetButton.setOpaque(false);
        resetButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        resetButton.setContentAreaFilled(false);
        resetButton.setBackground(new Color(0, 0, 0, 0));

        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0, 0, 0, 0));

        wochentagInput.setBackground(Color.WHITE);
        datumInput.setBackground(Color.WHITE);
        saalCombo.setBackground(Color.WHITE);
        uhrzeitCombo.setBackground(Color.WHITE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        wochentagInput = new javax.swing.JTextField();
        datumInput = new javax.swing.JTextField();
        LabelUser1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        uhrzeitCombo = new javax.swing.JComboBox();
        saalCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmeTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        bemerkungLabel = new javax.swing.JLabel();
        vIDInput = new javax.swing.JTextField();
        textLabelUser2 = new javax.swing.JLabel();
        LabelUser2 = new javax.swing.JLabel();
        vIDLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        vorstellungenTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filmTitelLabel = new javax.swing.JLabel();
        filmTitelLabel1 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        calender = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        textLabelUser3 = new javax.swing.JLabel();
        LabelUser3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        headLabel.setFont(new java.awt.Font("Futura", 0, 28));
        headLabel.setForeground(new java.awt.Color(238, 162, 35));
        headLabel.setText("VORSTELLUNG HINZUFÜGEN");
        add(headLabel);
        headLabel.setBounds(0, 0, 430, 60);

        lineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(lineLabel);
        lineLabel.setBounds(0, 40, 980, 20);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(887, 20, 110, 29);

        wochentagInput.setEditable(false);
        wochentagInput.setBorder(null);
        add(wochentagInput);
        wochentagInput.setBounds(10, 220, 240, 20);

        datumInput.setEditable(false);
        datumInput.setBorder(null);
        datumInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datumInputMouseClicked(evt);
            }
        });
        add(datumInput);
        datumInput.setBounds(10, 160, 240, 20);

        LabelUser1.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser1.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser1.setText("VORSTELLUNGS ID");
        add(LabelUser1);
        LabelUser1.setBounds(0, 80, 170, 10);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(780, 140, 190, 49);

        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button.png"))); // NOI18N
        resetButton.setBorder(null);
        resetButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button_h.png"))); // NOI18N
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        add(resetButton);
        resetButton.setBounds(780, 90, 190, 49);

        uhrzeitCombo.setFont(new java.awt.Font("Futura", 0, 12));
        uhrzeitCombo.setForeground(new java.awt.Color(238, 162, 35));
        uhrzeitCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UHRZEIT", "15:00", "18:00", "20:30", "22:00" }));
        add(uhrzeitCombo);
        uhrzeitCombo.setBounds(140, 270, 120, 27);

        saalCombo.setFont(new java.awt.Font("Futura", 0, 12));
        saalCombo.setForeground(new java.awt.Color(238, 162, 35));
        saalCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SAAL" }));
        add(saalCombo);
        saalCombo.setBounds(0, 270, 120, 27);

        filmeTabelle.setModel(myModel);
        filmeTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmeTabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filmeTabelle);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 400, 400, 210);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(770, 200, 200, 20);

        vIDInput.setEditable(false);
        vIDInput.setBorder(null);
        add(vIDInput);
        vIDInput.setBounds(10, 100, 230, 20);

        textLabelUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(textLabelUser2);
        textLabelUser2.setBounds(-10, 150, 290, 53);

        LabelUser2.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser2.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser2.setText("DATUM");
        add(LabelUser2);
        LabelUser2.setBounds(0, 140, 170, 10);

        vIDLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(vIDLabel);
        vIDLabel.setBounds(-10, 90, 290, 53);

        vorstellungenTabelle.setModel(myModel2);
        /*
        */
        vorstellungenTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vorstellungenTabelleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(vorstellungenTabelle);

        add(jScrollPane2);
        jScrollPane2.setBounds(440, 400, 540, 210);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 370, 400, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetailTopLine.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(440, 370, 540, 20);

        filmTitelLabel.setFont(new java.awt.Font("Futura", 0, 28));
        filmTitelLabel.setForeground(new java.awt.Color(238, 162, 35));
        filmTitelLabel.setText("HIER FILM AUSWÄHLEN"); // NOI18N
        add(filmTitelLabel);
        filmTitelLabel.setBounds(0, 330, 430, 50);

        filmTitelLabel1.setFont(new java.awt.Font("Futura", 0, 28));
        filmTitelLabel1.setForeground(new java.awt.Color(238, 162, 35));
        filmTitelLabel1.setText("VORSTELLUNGEN (ZUR INFO)"); // NOI18N
        add(filmTitelLabel1);
        filmTitelLabel1.setBounds(440, 330, 430, 50);

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/refresh.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/refresh_h.png"))); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton);
        refreshButton.setBounds(930, 400, 50, 50);

        calender.setFont(new java.awt.Font("Lucida Grande", 0, 9));
        calender.setWeekOfYearVisible(false);
        calender.setWeekdayForeground(new java.awt.Color(0, 0, 0));
        calender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calenderMouseClicked(evt);
            }
        });
        add(calender);
        calender.setBounds(330, 100, 400, 190);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/rahmen_cal2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(300, 80, 450, 240);

        textLabelUser3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(textLabelUser3);
        textLabelUser3.setBounds(-10, 210, 290, 53);

        LabelUser3.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser3.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser3.setText("WOCHENTAG");
        add(LabelUser3);
        LabelUser3.setBounds(0, 200, 170, 10);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte showViews laden
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showViews");
        resetButtonActionPerformed(evt);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Vorstellung zur Datenbank hinzufuegen
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String saalnr = (String) saalCombo.getSelectedItem();
        String uhrzeit = (String) uhrzeitCombo.getSelectedItem();

        Date date = calender.getDate();
        SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
        String datumcal = sd.format(date).toString();
  
        try {
            getVorstellungID();
            getAktDate();

            if (date.getTime() > currentDate.getTime()) {
                db.addView(vorstellungNr, film_id, datumcal, uhrzeit, saalnr, bemerkungLabel, wochentag);
            } else {
                JOptionPane.showMessageDialog(null, "Veranstaltung liegt in der Vergangenheit", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
            }
            refreshButtonActionPerformed(evt);

        } catch (SQLException ex) {
            Logger.getLogger(AddViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Selektierte Film ID in Variable speichern
     */
    private void filmeTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmeTabelleMouseClicked
        if (evt.getClickCount() == 1) {
            int row = filmeTabelle.getSelectedRow();
            film_id = (String) filmeTabelle.getValueAt(row, 0);
        }
    }//GEN-LAST:event_filmeTabelleMouseClicked

    /*
     * Selektierte Vorstellung ID in Variable speichern
     */
    private void vorstellungenTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vorstellungenTabelleMouseClicked

        if (evt.getClickCount() == 1) {             int row = vorstellungenTabelle.getSelectedRow();             v_id = (String) vorstellungenTabelle.getValueAt(row, 0);         }     }//GEN-LAST:event_vorstellungenTabelleMouseClicked

    /*
     * Tabellen neu befuellen wenn RefreshButton gedrueckt wird
     */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        while (!myModel2.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel2.getRowCount(); i++) {
                myModel2.removeRow(i);
            }
        }
        try {
            vT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    /*
     * Reset des Panels
     */
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        vIDInput.setText("");
        datumInput.setText("");
        saalCombo.setSelectedIndex(0);
        uhrzeitCombo.setSelectedIndex(0);
        try {
            getAktDate();
        } catch (SQLException ex) {
            Logger.getLogger(AddViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    /*
     * Befuellen des Datum- und Wochentagfeld wenn im Kalender 1mal geklickt wird
     */
    private void calenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calenderMouseClicked
        if (evt.getClickCount() == 1) {
            try {
                Date date = calender.getDate();
                SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
                datum = sd.format(date).toString();
                datumInput.setText(datum);
                getWochentag();
                wochentagInput.setText(wochentag);
            } catch (SQLException ex) {
                Logger.getLogger(AddViews.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_calenderMouseClicked

    /*
     * Wird beim Laden des Panels aktualisiert
     */
private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
    try {
        getAllSaalNo();
        updateTableContent();
    } catch (SQLException ex) {
        Logger.getLogger(AddViews.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_update

    /*
     * Warhinweis, wenn versucht wird das Datum in das Feld einzutragen
     */
    private void datumInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datumInputMouseClicked
        if (evt.getClickCount() == 1) {
            JOptionPane.showMessageDialog(null, "Datum mittels Kalender auswählen", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_datumInputMouseClicked

    /*
     * Tabellen befuellen
     */
    private void showTableContent() throws SQLException {
        fTV = new FilmeTabelleV(myModel, filmeTabelle, rowData, columnNames, db);
        vT = new VorstellungenTabelle(myModel2, vorstellungenTabelle, rowData, columnNames, db);
    }

    /*
     * Alle Saalnummern aus der Datenbank laden
     */
    private void getAllSaalNo() throws SQLException {
        try {
            ResultSet rs = db.getAllSaalNr();
            while (rs.next()) {
                String saalnr = rs.getString("saalnummer");
                saalCombo.addItem(saalnr);
            }
        } catch (Exception ex) {
            System.out.print("Fehler beim Laden der Saalnummern!\n");
        }
    }

    /* 
     * Wochentag mittels des eingegebenen Datums ermitteln
     */
    private void getWochentag() throws SQLException {
        ResultSet rs = db.getWochentag(datum);
        while (rs.next()) {
            wochentag = rs.getString("wochentag");
        }
    }

    /*
     * CURRENT_DATE aus der Datenbank ermitteln 
     */
    private void getAktDate() throws SQLException {
        ResultSet rs = db.getAktDate();
        while (rs.next()) {
            currentDate = rs.getDate("date");
        }
    }

    /*
     * Tabelleninhalt aktualisieren
     */
    private void updateTableContent() {
        while (!myModel2.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel2.getRowCount(); i++) {
                myModel2.removeRow(i);
            }
        }
        try {
            vT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowViews.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /*
     * Generieren einer Vrostellung ID
     */
    private void getVorstellungID() throws SQLException {

        ResultSet rs = db.getVorstellungID();
        while (rs.next()) {
            vorstellungNr = rs.getString("nextval");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelUser1;
    private javax.swing.JLabel LabelUser2;
    private javax.swing.JLabel LabelUser3;
    private javax.swing.JLabel bemerkungLabel;
    private com.toedter.calendar.JCalendar calender;
    private javax.swing.JTextField datumInput;
    private javax.swing.JLabel filmTitelLabel;
    private javax.swing.JLabel filmTitelLabel1;
    private javax.swing.JTable filmeTabelle;
    private javax.swing.JLabel headLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JButton overviewButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox saalCombo;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel textLabelUser2;
    private javax.swing.JLabel textLabelUser3;
    private javax.swing.JComboBox uhrzeitCombo;
    private javax.swing.JTextField vIDInput;
    private javax.swing.JLabel vIDLabel;
    private javax.swing.JTable vorstellungenTabelle;
    private javax.swing.JTextField wochentagInput;
    // End of variables declaration//GEN-END:variables
}
