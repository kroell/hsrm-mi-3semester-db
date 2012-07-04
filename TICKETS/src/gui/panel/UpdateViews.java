package gui.panel;

import gui.EmpFrame;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import database.Database;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablemodel.FilmeTabelleV;
import tablemodel.VorstellungenTabelle;

/**
 *
 * Panel zum Bearbeiten von Vorstellungen
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class UpdateViews extends javax.swing.JPanel {

    private EmpFrame eF;
    private Database db;
    private String v_id = "";
    private String datum = "";
    private String uhrzeit = "";
    private String saalnr = "";
    private String titel = "";
    private String f_id = "";
    private VorstellungenTabelle vT;
    private DefaultTableModel myModel2 = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private DefaultTableModel myModel = new DefaultTableModel();
    private FilmeTabelleV fTV;

    //Default Konstruktor
    public UpdateViews() {
        initComponents();
    }

    // Angepasster Konstruktor
    public UpdateViews(EmpFrame eF, Database db) throws SQLException {
        initComponents();
        this.db = db;
        this.eF = eF;
        showTableContent();
        // Windows GUI Anpassungen
        saveButton.setOpaque(false);
        saveButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        saveButton.setContentAreaFilled(false);
        saveButton.setBackground(new Color(0, 0, 0, 0));

        deleteButton.setOpaque(false);
        deleteButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        deleteButton.setContentAreaFilled(false);
        deleteButton.setBackground(new Color(0, 0, 0, 0));

        overviewButton.setOpaque(false);
        overviewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        overviewButton.setContentAreaFilled(false);
        overviewButton.setBackground(new Color(0, 0, 0, 0));

        vIDInput.setBackground(Color.WHITE);
        datumInput.setBackground(Color.WHITE);
        filmidInput.setBackground(Color.WHITE);
        titelInput.setBackground(Color.WHITE);
        saalCombo.setBackground(Color.WHITE);
        uhrzeitCombo.setBackground(Color.WHITE);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vIDInput = new javax.swing.JTextField();
        titelInput = new javax.swing.JTextField();
        vIDLabel = new javax.swing.JLabel();
        LabelUser1 = new javax.swing.JLabel();
        datumInput = new javax.swing.JTextField();
        textLabelUser2 = new javax.swing.JLabel();
        LabelUser2 = new javax.swing.JLabel();
        calender = new com.toedter.calendar.JCalendar();
        uhrzeitCombo = new javax.swing.JComboBox();
        saalCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        vIDLabel1 = new javax.swing.JLabel();
        LabelUser3 = new javax.swing.JLabel();
        vIDInput3 = new javax.swing.JTextField();
        bemerkungLabel = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        filmidInput = new javax.swing.JTextField();
        vIDLabel2 = new javax.swing.JLabel();
        LabelUser4 = new javax.swing.JLabel();
        vIDInput4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        vorstellungenTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jLabel3 = new javax.swing.JLabel();
        filmTitelLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmeTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jLabel6 = new javax.swing.JLabel();
        filmTitelLabel = new javax.swing.JLabel();
        bemerkungLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel5.setForeground(new java.awt.Color(238, 162, 35));
        jLabel5.setText("VORSTELLUNG BEARBEITEN");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        vIDInput.setEditable(false);
        vIDInput.setBorder(null);
        add(vIDInput);
        vIDInput.setBounds(10, 100, 230, 20);

        titelInput.setEditable(false);
        titelInput.setBorder(null);
        add(titelInput);
        titelInput.setBounds(10, 310, 230, 20);

        vIDLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(vIDLabel);
        vIDLabel.setBounds(-10, 90, 290, 53);

        LabelUser1.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser1.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser1.setText("VORSTELLUNGS ID");
        add(LabelUser1);
        LabelUser1.setBounds(0, 80, 170, 10);

        datumInput.setEditable(false);
        datumInput.setBorder(null);
        datumInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datumInputMouseClicked(evt);
            }
        });
        add(datumInput);
        datumInput.setBounds(10, 170, 240, 20);

        textLabelUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(textLabelUser2);
        textLabelUser2.setBounds(-10, 160, 290, 53);

        LabelUser2.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser2.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser2.setText("DATUM");
        add(LabelUser2);
        LabelUser2.setBounds(0, 150, 170, 10);

        calender.setFont(new java.awt.Font("Lucida Grande", 0, 9));
        calender.setWeekOfYearVisible(false);
        calender.setWeekdayForeground(new java.awt.Color(0, 0, 0));
        calender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calenderMouseClicked(evt);
            }
        });
        add(calender);
        calender.setBounds(340, 100, 400, 190);

        uhrzeitCombo.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        uhrzeitCombo.setForeground(new java.awt.Color(238, 162, 35));
        uhrzeitCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UHRZEIT", "15:00", "18:00", "20:30", "23:00" }));
        add(uhrzeitCombo);
        uhrzeitCombo.setBounds(460, 320, 120, 27);

        saalCombo.setFont(new java.awt.Font("Futura", 0, 12));
        saalCombo.setForeground(new java.awt.Color(238, 162, 35));
        saalCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SAAL", "1", "2", "3", "4", "5" }));
        add(saalCombo);
        saalCombo.setBounds(320, 320, 120, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/rahmen_cal2.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(310, 80, 450, 240);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(790, 140, 190, 49);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/loeschen_button_h.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(790, 90, 190, 49);

        vIDLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(vIDLabel1);
        vIDLabel1.setBounds(-10, 300, 290, 53);

        LabelUser3.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser3.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser3.setText("FILMTITEL");
        add(LabelUser3);
        LabelUser3.setBounds(0, 290, 170, 10);

        vIDInput3.setBorder(null);
        add(vIDInput3);
        vIDInput3.setBounds(10, 310, 230, 20);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(770, 200, 200, 20);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(880, 20, 120, 28);

        filmidInput.setEditable(false);
        filmidInput.setBorder(null);
        add(filmidInput);
        filmidInput.setBounds(10, 240, 230, 20);

        vIDLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(vIDLabel2);
        vIDLabel2.setBounds(-10, 230, 290, 53);

        LabelUser4.setFont(new java.awt.Font("Futura", 0, 10));
        LabelUser4.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser4.setText("FILM - ID");
        add(LabelUser4);
        LabelUser4.setBounds(0, 220, 170, 10);

        vIDInput4.setBorder(null);
        add(vIDInput4);
        vIDInput4.setBounds(20, 240, 230, 20);

        vorstellungenTabelle.setModel(myModel2);
        vorstellungenTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vorstellungenTabelleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(vorstellungenTabelle);

        add(jScrollPane2);
        jScrollPane2.setBounds(440, 450, 540, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/movieDetailTopLine.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(440, 420, 540, 20);

        filmTitelLabel1.setFont(new java.awt.Font("Futura", 0, 28));
        filmTitelLabel1.setForeground(new java.awt.Color(238, 162, 35));
        filmTitelLabel1.setText("VORSTELLUNGEN (ZUR INFO)"); // NOI18N
        add(filmTitelLabel1);
        filmTitelLabel1.setBounds(440, 380, 430, 50);

        filmeTabelle.setModel(myModel);
        filmeTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmeTabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filmeTabelle);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 450, 400, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/line_kurz.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, 420, 400, 10);

        filmTitelLabel.setFont(new java.awt.Font("Futura", 0, 28));
        filmTitelLabel.setForeground(new java.awt.Color(238, 162, 35));
        filmTitelLabel.setText("ALLE FILME (ZUR INFO)"); // NOI18N
        add(filmTitelLabel);
        filmTitelLabel.setBounds(0, 380, 430, 50);

        bemerkungLabel1.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel1.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel1.setText("Bemerkung");
        add(bemerkungLabel1);
        bemerkungLabel1.setBounds(770, 200, 200, 20);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Datum auswaehlen
     */
    private void calenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calenderMouseClicked

        if (evt.getClickCount() == 1) {             Date date = calender.getDate();             SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");             String datum = sd.format(date).toString();             datumInput.setText(datum);          }     }//GEN-LAST:event_calenderMouseClicked

    /*
     * Panel updaten
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            getViewsInformations();
            setViewsInformations();
            updateTableContent();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateViews.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(UpdateViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        vorstellungenTabelle.setRowSelectionInterval(eF.getRow(), eF.getRow());

    }//GEN-LAST:event_update

    /*
     * Vorstellung in DB speichern
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

        String uhrz = (String) uhrzeitCombo.getSelectedItem();
        String snr = (String) saalCombo.getSelectedItem();
        String fid = filmidInput.getText();

        Date date = calender.getDate();
        SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
        String datum = sd.format(date).toString();

        bemerkungLabel.setText("Bemerkung");
        bemerkungLabel.setForeground(Color.white);
        try {
            db.updateViews(bemerkungLabel, snr, uhrz, datum, v_id, fid);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateViews.class.getName()).log(Level.SEVERE, null, ex);
        }
        updateTableContent();
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Karte showViews laden und Panel reseten
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showViews");

        vIDInput.setText("");
        datumInput.setText("");
        saalCombo.setSelectedItem("");
        filmidInput.setText("");
        bemerkungLabel.setText("Bemerkung");
        bemerkungLabel.setForeground(Color.white);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Warnhinweise wenn ins DatumLabel geschrieben werden will
     */
    private void datumInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datumInputMouseClicked
        if (evt.getClickCount() == 1) {
            JOptionPane.showMessageDialog(null, "Datum mittels Kalender auswählen", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_datumInputMouseClicked

    private void vorstellungenTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vorstellungenTabelleMouseClicked
    }//GEN-LAST:event_vorstellungenTabelleMouseClicked

    private void filmeTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmeTabelleMouseClicked
        /*
        if (evt.getClickCount() == 1) {             int row = filmeTabelle.getSelectedRow();             film_id = (String) filmeTabelle.getValueAt(row, 0);         }     }//GEN-LAST:event_filmeTabelleMouseClicked
         */
    }

    /*
     * Vorstellung loeschen
     */
        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            try {
                db.deleteView(v_id, bemerkungLabel);
            } catch (SQLException ex) {
                Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//GEN-LAST:event_deleteButtonActionPerformed

    /*
     * Vorstellunginformationen aus DB laden
     */
    private void getViewsInformations() throws SQLException {
        ResultSet rs = db.showViewsByVID(eF.getVID());

        while (rs.next()) {
            v_id = rs.getString("v_id");
            datum = rs.getString("datum");
            uhrzeit = rs.getString("uhrzeit");
            saalnr = rs.getString("saalnummer");
            titel = rs.getString("titel");
            f_id = rs.getString("f_id");
        }
    }

    /*
     * Daten in GUI anzeigen
     */
    private void setViewsInformations() throws ParseException {
        vIDInput.setText(v_id);
        datumInput.setText(datum);
        saalCombo.setSelectedItem(saalnr);
        filmidInput.setText(f_id);

        if (uhrzeit.equals("20:30:00")) {
            uhrzeitCombo.setSelectedItem("20:30");
        } else if (uhrzeit.equals("23:00:00")) {
            uhrzeitCombo.setSelectedItem("23:00");
        } else if (uhrzeit.equals("15:00:00")) {
            uhrzeitCombo.setSelectedItem("15:00");
        } else if (uhrzeit.equals("18:00:00")) {
            uhrzeitCombo.setSelectedItem("18:00");
        }

        titelInput.setText(titel);
        vorstellungenTabelle.setRowSelectionInterval(eF.getRow(), eF.getRow());
    }

    /*
     * Tabelleninhalt anzeigen
     */
    private void showTableContent() throws SQLException {
        fTV = new FilmeTabelleV(myModel, filmeTabelle, rowData, columnNames, db);
        vT = new VorstellungenTabelle(myModel2, vorstellungenTabelle, rowData, columnNames, db);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelUser1;
    private javax.swing.JLabel LabelUser2;
    private javax.swing.JLabel LabelUser3;
    private javax.swing.JLabel LabelUser4;
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JLabel bemerkungLabel1;
    private com.toedter.calendar.JCalendar calender;
    private javax.swing.JTextField datumInput;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel filmTitelLabel;
    private javax.swing.JLabel filmTitelLabel1;
    private javax.swing.JTable filmeTabelle;
    private javax.swing.JTextField filmidInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton overviewButton;
    private javax.swing.JComboBox saalCombo;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel textLabelUser2;
    private javax.swing.JTextField titelInput;
    private javax.swing.JComboBox uhrzeitCombo;
    private javax.swing.JTextField vIDInput;
    private javax.swing.JTextField vIDInput3;
    private javax.swing.JTextField vIDInput4;
    private javax.swing.JLabel vIDLabel;
    private javax.swing.JLabel vIDLabel1;
    private javax.swing.JLabel vIDLabel2;
    private javax.swing.JTable vorstellungenTabelle;
    // End of variables declaration//GEN-END:variables
}
