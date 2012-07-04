package gui;

import gui.panel.*;
import database.Database;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * Frame zum Darstellen aller MitarbeiterPanels
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class EmpFrame extends javax.swing.JFrame {

    private Database db;
    private String filmID = "1";
    private String kundenID = "1";
    private String vID = "1";
    private int row = 0;
    
    // Angepasster Konstruktor
    public EmpFrame(Database db) {
        this.db = db;
        db.datenbankConnect();
        initComponents();
        
        // Windows GUI Anpassungen
        this.getContentPane().setBackground(Color.WHITE);
        logoutButton.setOpaque(false);
        logoutButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        logoutButton.setContentAreaFilled(false);
        logoutButton.setBackground(new Color(0,0,0,0)); 
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mainScrollPanel = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        try {
            showMovie1 = new gui.panel.ShowMovie(this,db);
            addMovie1 = new gui.panel.AddMovie(this,db);
            try {
                showClient1 = new gui.panel.ShowClient(this,db);
                showViews1 = new gui.panel.ShowViews(this,db);
                showBooking1 = new gui.panel.ShowBooking(this,db);
                showEmployee1 = new gui.panel.ShowEmployee(this,db);
                addEmployee1 = new gui.panel.AddEmployee(this,db);
                addClient1 = new gui.panel.AddClient(this,db);
                updateMovie1 = new gui.panel.UpdateMovie(this,db);
                updateEmployee1 = new gui.panel.UpdateEmployee(this,db);
                addViews1 = new gui.panel.AddViews(this,db);
                updateViews1 = new gui.panel.UpdateViews(this,db);
                updateClient1 = new gui.panel.UpdateClient(this,db);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));
                getContentPane().setLayout(null);

                logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/logoutButton.png"))); // NOI18N
                logoutButton.setBorder(null);
                logoutButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/logoutButton_h.png"))); // NOI18N
                logoutButton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        logoutButtonActionPerformed(evt);
                    }
                });
                getContentPane().add(logoutButton);
                logoutButton.setBounds(1020, 110, 80, 30);

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/mitarbeiterbereich.png"))); // NOI18N
                getContentPane().add(jLabel2);
                jLabel2.setBounds(880, 80, 210, 30);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/HEADER.png"))); // NOI18N
                getContentPane().add(jLabel1);
                jLabel1.setBounds(-140, -30, 1460, 210);

                mainScrollPanel.setBorder(null);
                mainScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

                mainPanel.setBackground(new java.awt.Color(255, 255, 255));
                mainPanel.setDoubleBuffered(false);
                mainPanel.setLayout(new java.awt.CardLayout());

            } catch (SQLException ex) {
                Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainPanel.add(showMovie1, "showMovie");
            mainPanel.add(addMovie1, "addMovie");

        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainPanel.add(showClient1, "showClient");
        mainPanel.add(showViews1, "showViews");
        mainPanel.add(showBooking1, "showBooking");
        mainPanel.add(showEmployee1, "showEmployee");
        mainPanel.add(addEmployee1, "addEmployee");
        mainPanel.add(addClient1, "addClient");
        mainPanel.add(updateMovie1, "updateMovie");
        mainPanel.add(updateEmployee1, "updateEmployee");
        mainPanel.add(addViews1, "addViews");
        mainPanel.add(updateViews1, "updateViews");
        mainPanel.add(updateClient1, "updateClient");

        mainScrollPanel.setViewportView(mainPanel);

        getContentPane().add(mainScrollPanel);
        mainScrollPanel.setBounds(110, 170, 980, 620);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1200)/2, (screenSize.height-850)/2, 1200, 850);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Anzeigen des KundenFrames und ausblenden des MitarbeiterFrames
     */
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        MainFrame mF = new MainFrame(db);
        mF.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.panel.AddClient addClient1;
    private gui.panel.AddEmployee addEmployee1;
    private gui.panel.AddMovie addMovie1;
    private gui.panel.AddViews addViews1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPanel;
    private gui.panel.ShowBooking showBooking1;
    private gui.panel.ShowClient showClient1;
    private gui.panel.ShowEmployee showEmployee1;
    private gui.panel.ShowMovie showMovie1;
    private gui.panel.ShowViews showViews1;
    private gui.panel.UpdateClient updateClient1;
    private gui.panel.UpdateEmployee updateEmployee1;
    private gui.panel.UpdateMovie updateMovie1;
    private gui.panel.UpdateViews updateViews1;
    // End of variables declaration//GEN-END:variables

    public JPanel getMainPanel(){
        return mainPanel;
    }
    
    public void setFilmID(String filmID){
        this.filmID = filmID;
    }
    public String getFilmID(){
        return filmID;
    }
    public void setKundenID(String kundenID){
        this.kundenID = kundenID;
    }
    public String getKundenID(){
        return kundenID;
    }
    public void setVID(String vID){
        this.vID = vID;
        System.out.print(vID);
    }
    public String getVID(){
        return vID;
    }
    public void setRow(int row){
        this.row = row;
        System.out.print(row);
    }
    public int getRow(){
        return row;
    }

}
