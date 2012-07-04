package gui.panel;

import database.Database;
import gui.MainFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablemodel.BewertungTabelleByID;
import tablemodel.BuchungTabelleByID;
import tablemodel.KundenTabelleByID;

/**
 *
 * Panel zum Anzeigen des Kundenprofils
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ClientProfil extends javax.swing.JPanel {

    private DefaultTableModel myModel = new DefaultTableModel();
    private DefaultTableModel myModel2 = new DefaultTableModel();
    private DefaultTableModel myModel3 = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private Database db;
    private MainFrame mF;
    private BuchungTabelleByID bT;
    private BewertungTabelleByID beT;
    private KundenTabelleByID kT;
    private String b_id;
    private String kunden_id;
    private String bewertungs_id;

    // Default Konstruktor
    public ClientProfil() {
        initComponents();
    }

    // Angepasster Konstruktor
    public ClientProfil(MainFrame mF, Database db) throws SQLException {
        this.db = db;
        this.mF = mF;
        initComponents();
        showTableContent();

        //Windows GUI Anpassung
        jButton1.setOpaque(false);
        jButton1.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        jButton1.setContentAreaFilled(false);
        jButton1.setBackground(new Color(0, 0, 0, 0));

        buchungLoeschenButton.setOpaque(false);
        buchungLoeschenButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        buchungLoeschenButton.setContentAreaFilled(false);
        buchungLoeschenButton.setBackground(new Color(0, 0, 0, 0));

        bewertungLoeschenButton.setOpaque(false);
        bewertungLoeschenButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        bewertungLoeschenButton.setContentAreaFilled(false);
        bewertungLoeschenButton.setBackground(new Color(0, 0, 0, 0));

        datenLoeschenButton.setOpaque(false);
        datenLoeschenButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        datenLoeschenButton.setContentAreaFilled(false);
        datenLoeschenButton.setBackground(new Color(0, 0, 0, 0));

        datenBearbButton.setOpaque(false);
        datenBearbButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        datenBearbButton.setContentAreaFilled(false);
        datenBearbButton.setBackground(new Color(0, 0, 0, 0));

        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bemerkungLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bewertungLoeschenButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kundenTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jScrollPane2 = new javax.swing.JScrollPane();
        buchungTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jScrollPane3 = new javax.swing.JScrollPane();
        bewertungTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filmprogrammButton = new javax.swing.JButton();
        buchungLoeschenButton = new javax.swing.JButton();
        datenLoeschenButton = new javax.swing.JButton();
        datenBearbButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(340, 310, 320, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/stat_kuchen.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-20, 340, 440, 220);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/meineKundendaten.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(560, 330, 440, 110);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_ansehen.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/statistik_ansehen_h.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(120, 560, 160, 23);

        bewertungLoeschenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/bewertungLoeschen.png"))); // NOI18N
        bewertungLoeschenButton.setBorder(null);
        bewertungLoeschenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/bewertungLoeschen_h.png"))); // NOI18N
        bewertungLoeschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bewertungLoeschenButtonActionPerformed(evt);
            }
        });
        add(bewertungLoeschenButton);
        bewertungLoeschenButton.setBounds(860, 290, 130, 23);

        kundenTabelle.setFont(new java.awt.Font("Arial", 0, 12));
        kundenTabelle.setModel(myModel);
        kundenTabelle.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        kundenTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kundenTabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kundenTabelle);

        add(jScrollPane1);
        jScrollPane1.setBounds(590, 450, 390, 110);

        buchungTabelle.setFont(new java.awt.Font("Arial", 0, 12));
        buchungTabelle.setModel(myModel2);
        buchungTabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        buchungTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buchungTabelleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(buchungTabelle);

        add(jScrollPane2);
        jScrollPane2.setBounds(0, 170, 400, 110);

        bewertungTabelle.setModel(myModel3);
        bewertungTabelle.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        bewertungTabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bewertungTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bewertungTabelleMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(bewertungTabelle);

        add(jScrollPane3);
        jScrollPane3.setBounds(580, 180, 390, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        jLabel4.setFont(new java.awt.Font("Futura", 0, 28));
        jLabel4.setForeground(new java.awt.Color(238, 162, 35));
        jLabel4.setText("MEIN PROFIL"); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 60);

        filmprogrammButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button.png"))); // NOI18N
        filmprogrammButton.setBorder(null);
        filmprogrammButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button_h.png"))); // NOI18N
        filmprogrammButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmprogrammButtonActionPerformed(evt);
            }
        });
        add(filmprogrammButton);
        filmprogrammButton.setBounds(840, 20, 170, 28);

        buchungLoeschenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/buchungLoeschen.png"))); // NOI18N
        buchungLoeschenButton.setBorder(null);
        buchungLoeschenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/buchungLoeschen_h.png"))); // NOI18N
        buchungLoeschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buchungLoeschenButtonActionPerformed(evt);
            }
        });
        add(buchungLoeschenButton);
        buchungLoeschenButton.setBounds(290, 280, 120, 23);

        datenLoeschenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/datenLoeschen.png"))); // NOI18N
        datenLoeschenButton.setBorder(null);
        datenLoeschenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/datenLoeschen_h.png"))); // NOI18N
        datenLoeschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datenLoeschenButtonActionPerformed(evt);
            }
        });
        add(datenLoeschenButton);
        datenLoeschenButton.setBounds(590, 560, 97, 23);

        datenBearbButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/datenBearb.png"))); // NOI18N
        datenBearbButton.setBorder(null);
        datenBearbButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/datenBearb_h.png"))); // NOI18N
        datenBearbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datenBearbButtonActionPerformed(evt);
            }
        });
        add(datenBearbButton);
        datenBearbButton.setBounds(880, 560, 110, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/profil3.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-20, 30, 1000, 450);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Buchungsnummer nach Selektion in der Tabelle in Variable speichern
     */
    private void buchungTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buchungTabelleMouseClicked

        if (evt.getClickCount() == 1) {
            int row = buchungTabelle.getSelectedRow();
            b_id = (String) buchungTabelle.getValueAt(row, 0);
        }
        /* 
         if (evt.getClickCount() == 1) {             int row = buchungTabelle.getSelectedRow();             b_id = (String) buchungTabelle.getValueAt(row, 0);          }      }//GEN-LAST:event_buchungTabelleMouseClicked
         */
    }

    /*
     * Karte welcomePanel laden
     */
        private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
            CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
            cL.show(mF.getMainPanel(), "welcomePanel");
            bemerkungLabel.setForeground(Color.white);
        }//GEN-LAST:event_filmprogrammButtonActionPerformed

    /*
     * Reset des Panels
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        refreshAll();
        
    }//GEN-LAST:event_update

    /*
     * Einfacher Klick: Kunden ID nach Selektion in Variable schreiben
     * Doppelklick: Karte updateClientProfil laden
     */
    private void kundenTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kundenTabelleMouseClicked
        if (evt.getClickCount() == 1) {
            int row = kundenTabelle.getSelectedRow();
            kunden_id = (String) kundenTabelle.getValueAt(row, 0);
        }
        if (evt.getClickCount() == 2) {
            CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
            cL.show(mF.getMainPanel(), "updateClientProfil");
        }
    }//GEN-LAST:event_kundenTabelleMouseClicked

    /*
     * Buchung in der DB loeschen
     */
    private void buchungLoeschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buchungLoeschenButtonActionPerformed
        try {
            try {
                db.deleteBooking(b_id, bemerkungLabel);
            } catch (SQLException ex) {
                Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
            //refreshAll();
            refreshBT();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Bitte entsprechender Datensatz in Tabelle anklicken", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buchungLoeschenButtonActionPerformed

    /*
     * Karte updateClientProfil laden
     */
    private void datenBearbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datenBearbButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "updateClientProfil");
    }//GEN-LAST:event_datenBearbButtonActionPerformed

    /*
     * Buchung loeschen
     */
    private void datenLoeschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datenLoeschenButtonActionPerformed

        if (JOptionPane.showConfirmDialog(this, "Sind Sie sicher?", "Sicher?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                db.deleteCostumer(kunden_id, bemerkungLabel);
            } catch (SQLException ex) {
                Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
            }

            mF.getLoginButton().setVisible(true);
            mF.setLoggedInKundenID("");
            mF.getLoggedInLabel().setText("");

            CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
            cL.show(mF.getMainPanel(), "clientDeleted");
        }
    }//GEN-LAST:event_datenLoeschenButtonActionPerformed

    /*
     * Bewertung loeschen
     */
    private void bewertungLoeschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bewertungLoeschenButtonActionPerformed
        try {
            db.deleteReview(bewertungs_id, bemerkungLabel);
        } catch (SQLException ex) {
            Logger.getLogger(ClientProfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        refreshBeT();

    }//GEN-LAST:event_bewertungLoeschenButtonActionPerformed

    /*
     * Bewertungs ID in Variable schreiben nach Selektion in Tabelle
     */
    private void bewertungTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bewertungTabelleMouseClicked
        if (evt.getClickCount() == 1) {
            int row = bewertungTabelle.getSelectedRow();
            bewertungs_id = (String) bewertungTabelle.getValueAt(row, 0);
        }
    }//GEN-LAST:event_bewertungTabelleMouseClicked

    /*
     * Karte statisticPanel aufrufen
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "statisticPanel");
    }//GEN-LAST:event_jButton1ActionPerformed

    /*
     * Tabellen mit Inhalt fuellen
     */
    private void showTableContent() throws SQLException {
        kT = new KundenTabelleByID(myModel, kundenTabelle, rowData, columnNames, db, mF.getLoggedInKundenID());
        bT = new BuchungTabelleByID(myModel2, buchungTabelle, rowData, columnNames, db, mF.getLoggedInKundenID());
        beT = new BewertungTabelleByID(myModel3, bewertungTabelle, rowData, columnNames, db, mF.getLoggedInKundenID());
    }

    /*
     * Reset Panel
     */
    private void refreshAll() {
        
        refreshKT();
        refreshBT();
        refreshBeT();
    }
    
   private void refreshKT(){
    while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            kT.createRow(mF.getLoggedInKundenID());
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
}
   
   private void refreshBT(){
       while (!myModel2.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel2.getRowCount(); i++) {
                myModel2.removeRow(i);
            }
        }
       try {
            bT.createRow(mF.getLoggedInKundenID());
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
   }
   
   private void refreshBeT(){
       while (!myModel3.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel3.getRowCount(); i++) {
                myModel3.removeRow(i);
            }
        }
        
        try {
            beT.createRow(mF.getLoggedInKundenID());
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JButton bewertungLoeschenButton;
    private javax.swing.JTable bewertungTabelle;
    private javax.swing.JButton buchungLoeschenButton;
    private javax.swing.JTable buchungTabelle;
    private javax.swing.JButton datenBearbButton;
    private javax.swing.JButton datenLoeschenButton;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable kundenTabelle;
    // End of variables declaration//GEN-END:variables
}
