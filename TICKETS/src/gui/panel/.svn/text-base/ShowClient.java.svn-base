package gui.panel;

import database.Database;
import gui.EmpFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablemodel.FilmeTabelle;
import tablemodel.KundenTabelle;

/**
 *
 * Panel zum Anzeigen aller Kunden
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ShowClient extends javax.swing.JPanel {

    private Database db;
    private DefaultTableModel myModel = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private FilmeTabelle fT;
    private EmpFrame eF;
    private KundenTabelle kT;
    private String kunden_id;

    // Angepasster Konstruktor
    public ShowClient(EmpFrame eF, Database db) throws SQLException {
        initComponents();
        this.db = db;
        showTableContent();
        this.eF = eF;
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

        kundeBearbButton.setOpaque(false);
        kundeBearbButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        kundeBearbButton.setContentAreaFilled(false);
        kundeBearbButton.setBackground(new Color(0, 0, 0, 0));

        deleteClientButton.setOpaque(false);
        deleteClientButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        deleteClientButton.setContentAreaFilled(false);
        deleteClientButton.setBackground(new Color(0, 0, 0, 0));

        addClientButton.setOpaque(false);
        addClientButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        addClientButton.setContentAreaFilled(false);
        addClientButton.setBackground(new Color(0, 0, 0, 0));
    }

    // Default Konstruktor
    public ShowClient() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        bemerkungsLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kundeBearbButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kundenTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        showMovieButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deleteClientButton = new javax.swing.JButton();
        addClientButton = new javax.swing.JButton();
        filmBlaseLabel = new javax.swing.JLabel();
        showClientButton = new javax.swing.JButton();
        showViewButton = new javax.swing.JButton();
        showBookingButton = new javax.swing.JButton();
        showEmployeeButton = new javax.swing.JButton();

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

        bemerkungsLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungsLabel.setForeground(new java.awt.Color(238, 238, 238));
        bemerkungsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungsLabel.setText("Bemerkung");
        add(bemerkungsLabel);
        bemerkungsLabel.setBounds(570, 160, 370, 20);

        jLabel3.setFont(new java.awt.Font("Futura", 0, 18));
        jLabel3.setForeground(new java.awt.Color(238, 162, 35));
        jLabel3.setText("KUNDENÜBERSICHT"); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(320, 150, 190, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        kundeBearbButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundeBearbButton.png"))); // NOI18N
        kundeBearbButton.setBorder(null);
        kundeBearbButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundeBearbButton_h.png"))); // NOI18N
        kundeBearbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kundeBearbButtonActionPerformed(evt);
            }
        });
        add(kundeBearbButton);
        kundeBearbButton.setBounds(600, 400, 120, 40);

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

        kundenTabelle.setFont(new java.awt.Font("Arial", 0, 12));
        kundenTabelle.setModel(myModel);
        kundenTabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        kundenTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kundenTabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kundenTabelle);

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

        deleteClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundenLoeschenButton.png"))); // NOI18N
        deleteClientButton.setBorder(null);
        deleteClientButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundenLoeschenButton_h.png"))); // NOI18N
        deleteClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClientButtonActionPerformed(evt);
            }
        });
        add(deleteClientButton);
        deleteClientButton.setBounds(720, 400, 110, 40);

        addClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundenHinzufuegenButton.png"))); // NOI18N
        addClientButton.setBorder(null);
        addClientButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundenHinzufuegenButton_h.png"))); // NOI18N
        addClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientButtonActionPerformed(evt);
            }
        });
        add(addClientButton);
        addClientButton.setBounds(820, 400, 140, 40);

        filmBlaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/blaseKunde.png"))); // NOI18N
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
        showBookingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBookingButtonActionPerformed(evt);
            }
        });
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
    }// </editor-fold>//GEN-END:initComponents

    private void showMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMovieButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showMovie");
    }//GEN-LAST:event_showMovieButtonActionPerformed

    private void showViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showViewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showViews");
    }//GEN-LAST:event_showViewButtonActionPerformed

    private void showBookingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBookingButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showBooking");
    }//GEN-LAST:event_showBookingButtonActionPerformed

    private void showEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEmployeeButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showEmployee");
    }//GEN-LAST:event_showEmployeeButtonActionPerformed

    private void showClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showClientButtonActionPerformed
    }//GEN-LAST:event_showClientButtonActionPerformed

    private void addClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "addClient");
    }//GEN-LAST:event_addClientButtonActionPerformed

    /*
     * Kunde in DB loeschen
     */
    private void deleteClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClientButtonActionPerformed
        try {
            db.deleteCostumer(kunden_id, bemerkungsLabel);
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshButtonActionPerformed(evt);
    }//GEN-LAST:event_deleteClientButtonActionPerformed

    /*
     * Kunden ID in Variable schreiben nach Selektion in der Tabelle
     */
    private void kundenTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kundenTabelleMouseClicked
        if (evt.getClickCount() == 1) {
            int row = kundenTabelle.getSelectedRow();
            kunden_id = (String) kundenTabelle.getValueAt(row, 0);
        }
        if (evt.getClickCount() == 2) {
            eF.setKundenID(kunden_id);
            CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
            cL.show(eF.getMainPanel(), "updateClient");
        }
    }//GEN-LAST:event_kundenTabelleMouseClicked

    /*
     * Karte updateClient laden
     */
    private void kundeBearbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundeBearbButtonActionPerformed
        if (kunden_id != null) {
            eF.setKundenID(kunden_id);
            CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
            cL.show(eF.getMainPanel(), "updateClient");
        } else {
            JOptionPane.showMessageDialog(null, "Bitte zuerst einen Kunden in der Tabelle makieren!", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kundeBearbButtonActionPerformed

    /*
     * Tabelleninhalt aktualisieren
     */
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
      while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            kT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    /*
     * Akutalisieren des Tabelleninhalts
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            kT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Tabelleninhalt anzeigen
     */
    private void showTableContent() throws SQLException {
        kT = new KundenTabelle(myModel, kundenTabelle, rowData, columnNames, db);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addClientButton;
    private javax.swing.JLabel bemerkungsLabel;
    private javax.swing.JButton deleteClientButton;
    private javax.swing.JLabel filmBlaseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kundeBearbButton;
    private javax.swing.JTable kundenTabelle;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton showBookingButton;
    private javax.swing.JButton showClientButton;
    private javax.swing.JButton showEmployeeButton;
    private javax.swing.JButton showMovieButton;
    private javax.swing.JButton showViewButton;
    // End of variables declaration//GEN-END:variables
}
