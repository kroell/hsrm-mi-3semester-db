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
import tablemodel.BuchungTabelle;
import tablemodel.BuchungTabelleByID;

/**
 *
 * Panel zum Anzeigen der Buchungen
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ShowBooking extends javax.swing.JPanel {

    private Database db;
    private DefaultTableModel myModel = new DefaultTableModel();
    private DefaultTableModel myModel2 = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private BuchungTabelle bT;
    private BuchungTabelleByID bTByID;
    private EmpFrame eF;
    private String b_id;

    // Angepasster Konstruktor
    public ShowBooking(EmpFrame eF, Database db) throws SQLException {
        initComponents();
        this.db = db;
        this.eF = eF;
        showTableContent();

        // Windows GUI Anpassungen
        showMovieButton.setOpaque(false);
        showMovieButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        showMovieButton.setContentAreaFilled(false);
        showMovieButton.setBackground(new Color(0, 0, 0, 0));

        showViewButton.setOpaque(false);
        showViewButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        showViewButton.setContentAreaFilled(false);
        showViewButton.setBackground(new Color(0, 0, 0, 0));

        showClientButton.setOpaque(false);
        showClientButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        showClientButton.setContentAreaFilled(false);
        showClientButton.setBackground(new Color(0, 0, 0, 0));

        showBookingButton.setOpaque(false);
        showBookingButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        showBookingButton.setContentAreaFilled(false);
        showBookingButton.setBackground(new Color(0, 0, 0, 0));

        showEmployeeButton.setOpaque(false);
        showEmployeeButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        showEmployeeButton.setContentAreaFilled(false);
        showEmployeeButton.setBackground(new Color(0, 0, 0, 0));

        refreshButton.setOpaque(false);
        refreshButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        refreshButton.setContentAreaFilled(false);
        refreshButton.setBackground(new Color(0, 0, 0, 0));

        deleteButton.setOpaque(false);
        deleteButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        deleteButton.setContentAreaFilled(false);
        deleteButton.setBackground(new Color(0, 0, 0, 0));
    }

    // Default Konstruktor
    public ShowBooking() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        bemerkungsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buchungTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        showMovieButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filmBlaseLabel = new javax.swing.JLabel();
        showClientButton = new javax.swing.JButton();
        showViewButton = new javax.swing.JButton();
        showBookingButton = new javax.swing.JButton();
        showEmployeeButton = new javax.swing.JButton();
        kundenIDCombo = new javax.swing.JComboBox();

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

        jLabel3.setFont(new java.awt.Font("Futura", 0, 18));
        jLabel3.setForeground(new java.awt.Color(238, 162, 35));
        jLabel3.setText("BUCHUNGEN"); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(320, 150, 310, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/buchungLoeschen.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/buchungLoeschen_h.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton);
        deleteButton.setBounds(820, 403, 126, 30);

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/refresh.png"))); // NOI18N
        refreshButton.setBorder(null);
        refreshButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/refresh_h.png"))); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        add(refreshButton);
        refreshButton.setBounds(310, 400, 50, 40);

        bemerkungsLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungsLabel.setForeground(new java.awt.Color(238, 238, 238));
        bemerkungsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungsLabel.setText("Bemerkung");
        add(bemerkungsLabel);
        bemerkungsLabel.setBounds(530, 160, 410, 20);

        buchungTabelle.setModel(myModel);
        buchungTabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        buchungTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buchungTabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(buchungTabelle);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 200, 620, 200);

        showMovieButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmanzeigenButton.png"))); // NOI18N
        showMovieButton.setBorder(null);
        showMovieButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmanzeigenButton_h.png"))); // NOI18N
        showMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMovieButtonActionPerformed(evt);
            }
        });
        add(showMovieButton);
        showMovieButton.setBounds(0, 140, 256, 49);

        jLabel4.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel4.setForeground(new java.awt.Color(238, 162, 35));
        jLabel4.setText("MITARBEITERBEREICH"); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 60);

        filmBlaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/blaseBuchung.png"))); // NOI18N
        add(filmBlaseLabel);
        filmBlaseLabel.setBounds(250, 120, 760, 340);

        showClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundenanzeigenButton.png"))); // NOI18N
        showClientButton.setBorder(null);
        showClientButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundenanzeigenButton_h.png"))); // NOI18N
        showClientButton.setSize(new java.awt.Dimension(256, 49));
        showClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showClientButtonActionPerformed(evt);
            }
        });
        add(showClientButton);
        showClientButton.setBounds(0, 200, 256, 49);

        showViewButton.setBackground(new java.awt.Color(255, 255, 255));
        showViewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/vorstellungenanzeigenButton.png"))); // NOI18N
        showViewButton.setBorder(null);
        showViewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/vorstellungenanzeigenButton_h.png"))); // NOI18N
        showViewButton.setSize(new java.awt.Dimension(256, 49));
        showViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showViewButtonActionPerformed(evt);
            }
        });
        add(showViewButton);
        showViewButton.setBounds(0, 260, 256, 49);

        showBookingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/buchungenanzeigenButton.png"))); // NOI18N
        showBookingButton.setBorder(null);
        showBookingButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/buchungenanzeigenButton_h.png"))); // NOI18N
        showBookingButton.setSize(new java.awt.Dimension(256, 49));
        add(showBookingButton);
        showBookingButton.setBounds(0, 320, 256, 49);

        showEmployeeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/mitarbeiteranzeigenButton.png"))); // NOI18N
        showEmployeeButton.setBorder(null);
        showEmployeeButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/mitarbeiteranzeigenButton_h.png"))); // NOI18N
        showEmployeeButton.setSize(new java.awt.Dimension(256, 49));
        showEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEmployeeButtonActionPerformed(evt);
            }
        });
        add(showEmployeeButton);
        showEmployeeButton.setBounds(0, 380, 256, 49);

        kundenIDCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KUNDE AUSWÄHLEN" }));
        kundenIDCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kundenIDComboItemStateChanged(evt);
            }
        });
        kundenIDCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kundenIDComboActionPerformed(evt);
            }
        });
        add(kundenIDCombo);
        kundenIDCombo.setBounds(410, 400, 200, 40);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte showMovie laden
     */
    private void showMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMovieButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showMovie");
    }//GEN-LAST:event_showMovieButtonActionPerformed

    /*
     * Karte showClient laden
     */
    private void showClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showClientButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showClient");
    }//GEN-LAST:event_showClientButtonActionPerformed

    /*
     * Karte showViews laden
     */
    private void showViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showViewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showViews");
    }//GEN-LAST:event_showViewButtonActionPerformed

    /*
     * Karte showEmployee laden
     */
    private void showEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmployeeButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showEmployee");
    }//GEN-LAST:event_showEmployeeButtonActionPerformed

    private void kundenIDComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundenIDComboActionPerformed
    }//GEN-LAST:event_kundenIDComboActionPerformed

    /*
     * Wird beim Laden des Panels ausgefuehrt
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            kundenIDCombo.setVisible(false);
            getAllKundenID();
        } catch (SQLException ex) {
            Logger.getLogger(ShowBooking.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Tabelleninhalt aktualisieren
        while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            bT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        bemerkungsLabel.setText("Bemerkung");
        bemerkungsLabel.setForeground(new Color(238, 238, 238));

    }//GEN-LAST:event_update

    private void kundenIDComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kundenIDComboItemStateChanged
    }//GEN-LAST:event_kundenIDComboItemStateChanged

    /*
     * BuchungsID in Variable speichern nach Selektion in der Tabelle
     */
    private void buchungTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buchungTabelleMouseClicked
        if (evt.getClickCount() == 1) {
            int row = buchungTabelle.getSelectedRow();
            b_id = (String) buchungTabelle.getValueAt(row, 0);
        }
    }//GEN-LAST:event_buchungTabelleMouseClicked

    /*
     * Buchung aus DB loeschen
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            db.deleteBooking(b_id, bemerkungsLabel);
        } catch (SQLException ex) {
            Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshButtonActionPerformed(evt);

    }//GEN-LAST:event_deleteButtonActionPerformed

    /*
     * Refresh des Panels
     */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        /*
        while (!myModel.getDataVector().isEmpty()) {             for (int i = 0; i < myModel.getRowCount(); i++) {                 myModel.removeRow(i);             }         }         try {             fT.createRow();         } catch (SQLException ex) {             Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);         }     }//GEN-LAST:event_refreshButtonActionPerformed
         */

        while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            bT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     * Alle Kunden IDs ermitteln
     */
    private void getAllKundenID() throws SQLException {
        ResultSet rs = db.getAllKundenID();
        kundenIDCombo.addItem("KUNDE AUSWÄHLEN");
        while (rs.next()) {
            String kunden_id = rs.getString("kunden_id");

            kundenIDCombo.addItem(kunden_id);
        }
    }

    /*
     * Tabelleninhalt anzeigen
     */
    private void showTableContent() throws SQLException {
        bT = new BuchungTabelle(myModel, buchungTabelle, rowData, columnNames, db);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungsLabel;
    private javax.swing.JTable buchungTabelle;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel filmBlaseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox kundenIDCombo;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton showBookingButton;
    private javax.swing.JButton showClientButton;
    private javax.swing.JButton showEmployeeButton;
    private javax.swing.JButton showMovieButton;
    private javax.swing.JButton showViewButton;
    // End of variables declaration//GEN-END:variables
}
