package gui.panel;

import database.Database;
import gui.EmpFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import tablemodel.FilmeTabelle;

/**
 *
 * Panel zum Hinzufuegen eines Mitarbeiter
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class AddEmployee extends javax.swing.JPanel { 

    private Database db;
    private DefaultTableModel myModel = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private FilmeTabelle fT;
    private EmpFrame eF;
    
    // Default Konstruktor
    public AddEmployee(){
        initComponents();
    }
    
    // Angepasster Konstruktor
    public AddEmployee(EmpFrame eF, Database db){
        initComponents();
        this.db = db;
        this.eF= eF;
        // Windows GUI Anpassungen
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
        istMitarbeiterCheckbox.setOpaque(false);
        istMitarbeiterCheckbox.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        istMitarbeiterCheckbox.setContentAreaFilled(false);
        istMitarbeiterCheckbox.setBackground(new Color(0,0,0,0));
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        overviewButton = new javax.swing.JButton();
        LabelPassword = new javax.swing.JLabel();
        istMitarbeiterCheckbox = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        LabelUser = new javax.swing.JLabel();
        passwortInput = new javax.swing.JPasswordField();
        benutzernameInput = new javax.swing.JTextField();
        loeschenButton = new javax.swing.JButton();
        textLabelUser = new javax.swing.JLabel();
        textLabelPassword = new javax.swing.JLabel();
        filmBlaseLabel = new javax.swing.JLabel();
        strasseInput = new javax.swing.JTextField();
        vornameInput = new javax.swing.JTextField();
        nameInput = new javax.swing.JTextField();
        gebDatInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        ortInput = new javax.swing.JTextField();
        plzInput = new javax.swing.JTextField();
        hausnummerInput = new javax.swing.JTextField();
        kundenIDInput = new javax.swing.JTextField();
        LabelAdress = new javax.swing.JLabel();
        bemerkungLabel = new javax.swing.JLabel();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/fimhinzufuegen.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/fimhinzufuegen_h.png"))); // NOI18N

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(980, 620));
        setSize(new java.awt.Dimension(980, 620));
        setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

        jLabel5.setFont(new java.awt.Font("Futura", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 162, 35));
        jLabel5.setText("MITARBEITER HINZUFÜGEN");
        add(jLabel5);
        jLabel5.setBounds(0, 0, 430, 60);

        jLabel14.setFont(new java.awt.Font("Futura", 0, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 162, 35));
        jLabel14.setText("MITARBEITER");
        add(jLabel14);
        jLabel14.setBounds(740, 300, 100, 20);

        overviewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton.png"))); // NOI18N
        overviewButton.setBorder(null);
        overviewButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/uebersichtButton_h.png"))); // NOI18N
        overviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewButtonActionPerformed(evt);
            }
        });
        add(overviewButton);
        overviewButton.setBounds(880, 20, 130, 29);

        LabelPassword.setFont(new java.awt.Font("Futura", 0, 10)); // NOI18N
        LabelPassword.setForeground(new java.awt.Color(238, 162, 35));
        LabelPassword.setText("PASSWORT (8 ZEICHEN)");
        add(LabelPassword);
        LabelPassword.setBounds(690, 220, 170, 10);

        istMitarbeiterCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                istMitarbeiterCheckboxActionPerformed(evt);
            }
        });
        add(istMitarbeiterCheckbox);
        istMitarbeiterCheckbox.setBounds(700, 300, 30, 23);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/speichernButton.png"))); // NOI18N
        saveButton.setBorder(null);
        saveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/speichernButton_h.png"))); // NOI18N
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        add(saveButton);
        saveButton.setBounds(730, 400, 190, 40);

        LabelUser.setFont(new java.awt.Font("Futura", 0, 10)); // NOI18N
        LabelUser.setForeground(new java.awt.Color(238, 162, 35));
        LabelUser.setText("BENURTZERNAME (15 ZEICHEN)");
        add(LabelUser);
        LabelUser.setBounds(690, 130, 170, 10);

        passwortInput.setBorder(null);
        passwortInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwortInputActionPerformed(evt);
            }
        });
        add(passwortInput);
        passwortInput.setBounds(710, 240, 230, 20);

        benutzernameInput.setBorder(null);
        add(benutzernameInput);
        benutzernameInput.setBounds(705, 151, 240, 20);

        loeschenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button.png"))); // NOI18N
        loeschenButton.setBorder(null);
        loeschenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reset_button_h.png"))); // NOI18N
        loeschenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschenButtonActionPerformed(evt);
            }
        });
        add(loeschenButton);
        loeschenButton.setBounds(730, 340, 190, 50);

        textLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(textLabelUser);
        textLabelUser.setBounds(680, 140, 280, 53);

        textLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/textfeld.png"))); // NOI18N
        add(textLabelPassword);
        textLabelPassword.setBounds(680, 230, 280, 53);

        filmBlaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/blaseUserPW.png"))); // NOI18N
        add(filmBlaseLabel);
        filmBlaseLabel.setBounds(620, 100, 350, 370);

        strasseInput.setBorder(null);
        add(strasseInput);
        strasseInput.setBounds(15, 413, 160, 20);

        vornameInput.setBorder(null);
        add(vornameInput);
        vornameInput.setBounds(15, 325, 240, 20);

        nameInput.setBorder(null);
        add(nameInput);
        nameInput.setBounds(15, 240, 240, 20);

        gebDatInput.setBorder(null);
        add(gebDatInput);
        gebDatInput.setBounds(355, 327, 240, 20);

        emailInput.setBorder(null);
        add(emailInput);
        emailInput.setBounds(355, 413, 240, 20);

        ortInput.setBorder(null);
        add(ortInput);
        ortInput.setBounds(355, 239, 240, 20);

        plzInput.setBorder(null);
        add(plzInput);
        plzInput.setBounds(355, 153, 240, 20);

        hausnummerInput.setBorder(null);
        add(hausnummerInput);
        hausnummerInput.setBounds(225, 413, 30, 20);

        kundenIDInput.setBorder(null);
        add(kundenIDInput);
        kundenIDInput.setBounds(15, 155, 240, 16);

        LabelAdress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/kundeHinzufuegenBackground.png"))); // NOI18N
        add(LabelAdress);
        LabelAdress.setBounds(-10, 90, 640, 400);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(680, 480, 280, 20);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Laden der Karte showEmployee
     */
    private void overviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewButtonActionPerformed
       
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(),"showEmployee");
        
        // beim Verlassen des Panels die Eingabefelder leeren
        loeschenButtonActionPerformed(evt);
    }//GEN-LAST:event_overviewButtonActionPerformed

    /*
     * Hinzufuegen eines Mitarbeiters in die Datenbank
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
       boolean istMitarbeiter = istMitarbeiterCheckbox.isSelected();
       boolean istGast = false;
        try {
            //Mitarbeiter in Datenbank anlegen
            db.addClientAndEmployee(name, vorname, strasse, hausnummer, plz, ort, gebDatum, email, benutzername, passwort, bemerkungLabel, istMitarbeiter, kundenID, istGast);
        } catch (SQLException ex) {
            Logger.getLogger(NewRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void istMitarbeiterCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_istMitarbeiterCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_istMitarbeiterCheckboxActionPerformed

    
    private void loeschenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loeschenButtonActionPerformed
        istMitarbeiterCheckbox.setSelected(false);
        nameInput.setText("");         vornameInput.setText("");         strasseInput.setText("");         hausnummerInput.setText("");         plzInput.setText("");         ortInput.setText("");         gebDatInput.setText("");         emailInput.setText("");         benutzernameInput.setText("");         passwortInput.setText("");     }//GEN-LAST:event_loeschenButtonActionPerformed

    private void passwortInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwortInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwortInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAdress;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JTextField benutzernameInput;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel filmBlaseLabel;
    private javax.swing.JTextField gebDatInput;
    private javax.swing.JTextField hausnummerInput;
    private javax.swing.JCheckBox istMitarbeiterCheckbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField kundenIDInput;
    private javax.swing.JButton loeschenButton;
    private javax.swing.JTextField nameInput;
    private javax.swing.JTextField ortInput;
    private javax.swing.JButton overviewButton;
    private javax.swing.JPasswordField passwortInput;
    private javax.swing.JTextField plzInput;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField strasseInput;
    private javax.swing.JLabel textLabelPassword;
    private javax.swing.JLabel textLabelUser;
    private javax.swing.JTextField vornameInput;
    // End of variables declaration//GEN-END:variables
}
