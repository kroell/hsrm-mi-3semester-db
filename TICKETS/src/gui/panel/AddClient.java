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
 * Panel zum Hinzufuegen eines Kunden
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class AddClient extends javax.swing.JPanel { 

    private Database db;
    private DefaultTableModel myModel = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private FilmeTabelle fT;
    private EmpFrame eF;
    private String kundenNr;
    
    // Default Konstruktor
    public AddClient(){
        initComponents();    
    }
    
    // Angepasster Konstruktor 
    public AddClient(EmpFrame eF, Database db){
        initComponents();
        this.eF = eF;
        this.db = db;
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
        usedIDCombo.setBackground(Color.WHITE);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usedIDCombo = new javax.swing.JComboBox();
        saveButton = new javax.swing.JButton();
        overviewButton = new javax.swing.JButton();
        nameInput = new javax.swing.JTextField();
        vornameInput = new javax.swing.JTextField();
        strasseInput = new javax.swing.JTextField();
        hausnummerInput = new javax.swing.JTextField();
        ortInput = new javax.swing.JTextField();
        plzInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        gebDatInput = new javax.swing.JTextField();
        benutzernameInput = new javax.swing.JTextField();
        kundenIDInput = new javax.swing.JTextField();
        bemerkungLabel = new javax.swing.JLabel();
        passwortInput = new javax.swing.JPasswordField();
        loeschenButton = new javax.swing.JButton();
        neuRegLabel = new javax.swing.JLabel();

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
        jLabel5.setText("KUNDE HINZUFÜGEN");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 60);

        usedIDCombo.setForeground(new java.awt.Color(238, 162, 35));
        usedIDCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VORHANDENE KUNDEN-ID" }));
        usedIDCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usedIDComboActionPerformed(evt);
            }
        });
        add(usedIDCombo);
        usedIDCombo.setBounds(0, 70, 230, 27);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/speichern_button_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(740, 390, 180, 50);

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

        nameInput.setBorder(null);
        add(nameInput);
        nameInput.setBounds(20, 230, 230, 30);

        vornameInput.setBorder(null);
        add(vornameInput);
        vornameInput.setBounds(20, 320, 230, 20);

        strasseInput.setBorder(null);
        add(strasseInput);
        strasseInput.setBounds(20, 410, 160, 20);

        hausnummerInput.setBorder(null);
        add(hausnummerInput);
        hausnummerInput.setBounds(220, 410, 40, 20);

        ortInput.setBorder(null);
        add(ortInput);
        ortInput.setBounds(355, 229, 240, 30);

        plzInput.setBorder(null);
        add(plzInput);
        plzInput.setBounds(355, 144, 240, 30);

        emailInput.setBorder(null);
        add(emailInput);
        emailInput.setBounds(355, 402, 240, 30);

        gebDatInput.setBorder(null);
        add(gebDatInput);
        gebDatInput.setBounds(355, 316, 230, 30);

        benutzernameInput.setBorder(null);
        add(benutzernameInput);
        benutzernameInput.setBounds(715, 141, 230, 30);

        kundenIDInput.setEditable(false);
        kundenIDInput.setBorder(null);
        add(kundenIDInput);
        kundenIDInput.setBounds(25, 148, 230, 20);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(690, 480, 280, 20);

        passwortInput.setBorder(null);
        add(passwortInput);
        passwortInput.setBounds(714, 230, 230, 30);

        loeschenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button.png"))); // NOI18N
        loeschenButton.setBorder(null);
        loeschenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button_h.png"))); // NOI18N
        loeschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschenButtonActionPerformed(evt);
            }
        });
        add(loeschenButton);
        loeschenButton.setBounds(740, 340, 180, 49);

        neuRegLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundeHinzufuegenBackground.png"))); // NOI18N
        add(neuRegLabel);
        neuRegLabel.setBounds(-10, 50, 1000, 470);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Reset aller Eingabefelder
     */
    private void loeschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loeschenButtonActionPerformed
        nameInput.setText("");         
        vornameInput.setText("");         
        strasseInput.setText("");         
        hausnummerInput.setText("");         
        plzInput.setText("");         
        ortInput.setText("");         
        gebDatInput.setText("");         
        emailInput.setText("");         
        benutzernameInput.setText("");         
        passwortInput.setText("");    
        bemerkungLabel.setText("");
        bemerkungLabel.setForeground(Color.white);
    }//GEN-LAST:event_loeschenButtonActionPerformed

    /*
     * Laden der Karte showClient
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(),"showClient");
        
        // beim Verlassen des Panels die Eingabefelder leeren
        loeschenButtonActionPerformed(evt);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Kunde in Datenbank speichern
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //Daten aus Eingabe auslesen
       String name = nameInput.getText();
       String vorname = vornameInput.getText();
       String strasse = strasseInput.getText();
       String hausnummer = hausnummerInput.getText();
       String plz = plzInput.getText();
       String ort = ortInput.getText();
       String gebDatum = gebDatInput.getText();
       String email = emailInput.getText();
       String benutzername = benutzernameInput.getText();
       String passwort = passwortInput.getText();
       String kundenID = kundenIDInput.getText();
       boolean istMitarbeiter = false;
       boolean istGast = false;
       
        try {
            getKundenID();
        } catch (SQLException ex) {
            Logger.getLogger(AddClient.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
            db.addClientAndEmployee(name, vorname, strasse, hausnummer, plz, ort, gebDatum, email, benutzername, passwort, bemerkungLabel,istMitarbeiter, kundenNr, istGast);
        } catch (SQLException ex) {
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
     * Wird beim Laden des Panels aufgerufen
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        usedIDCombo.setVisible(false);        
    }//GEN-LAST:event_update

    private void usedIDComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usedIDComboActionPerformed
    }
        // TODO add your handling code here:}//GEN-LAST:event_usedIDComboActionPerformed
    
    /*
     * Generieren einer Kunden ID
     */
    private void getKundenID() throws SQLException {

        ResultSet rs = db.getKundenID();
        while (rs.next()) {
            kundenNr = rs.getString("nextval");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField benutzernameInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JTextField gebDatInput;
    private javax.swing.JTextField hausnummerInput;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kundenIDInput;
    private javax.swing.JButton loeschenButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel neuRegLabel;
    private javax.swing.JTextField ortInput;
    private javax.swing.JButton overviewButton;
    private javax.swing.JPasswordField passwortInput;
    private javax.swing.JTextField plzInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField strasseInput;
    private javax.swing.JComboBox usedIDCombo;
    private javax.swing.JTextField vornameInput;
    // End of variables declaration//GEN-END:variables
}
