package gui;

import gui.panel.*;
import database.Database;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * Frame zum Darstellen aller KundenPanels
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class MainFrame extends javax.swing.JFrame {

    private Database db;
    private String loggedInKundenID = "";
    private String ersterFilmID = "1";
    private String zweiterFilmID = "";
    private String dritterFilmID = "";
    private String vierterFilmID ="";
    private String fuenfterFilmID = "";
    private String aktFilmID = "";
    private int filmButton2;
    private boolean istGast;
    private String datumSelect;
    private String uhrzeitSelect;
    private String saalSelect;
    private String buchungsID;
    private String v_id;
    
    // Angepasster Konstruktor
    public MainFrame(Database db) {
        this.db = db;
        db.datenbankConnect();
        db.treiberLaden();
        initComponents();
        
       // Windows GUI Anpassungen
       this.getContentPane().setBackground(Color.WHITE);
       loginButton.setOpaque(false);
       loginButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
       loginButton.setContentAreaFilled(false);
       loginButton.setBackground(new Color(0,0,0,0));
       logOutButton.setOpaque(false);
       logOutButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
       logOutButton.setContentAreaFilled(false);
       logOutButton.setBackground(new Color(0,0,0,0));
       profilButton.setOpaque(false);
       profilButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
       profilButton.setContentAreaFilled(false);
       profilButton.setBackground(new Color(0,0,0,0));       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginButton = new javax.swing.JButton();
        profilButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        loggedInLabel = new javax.swing.JLabel();
        headLabel = new javax.swing.JLabel();
        mainScrollPanel = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        try {
            welcomePanel1 = new gui.panel.WelcomePanel(this,db)
            ;
            clientLogin1 = new gui.panel.ClientLogin(this,db);
            movieDetail1 = new gui.panel.MovieDetail(this,db);
            addReview1 = new gui.panel.AddReview(this,db);
            showReviews1 = new gui.panel.ShowReviews(this,db);
            loggedIn1 = new gui.panel.LoggedIn(this,db);
            newRegister1 = new gui.panel.NewRegister(this,db);
            bookingSummary1 = new gui.panel.BookingSummary(this,db);
            bookingDone1 = new gui.panel.BookingDone(this,db);
            clientProfil1 = new gui.panel.ClientProfil(this,db);
            updateClientProfil1 = new gui.panel.UpdateClientProfil(this,db);
            clientDeleted1 = new gui.panel.ClientDeleted(this,db);
            statistics1 = new gui.panel.Statistics(this,db);

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 255));
            getContentPane().setLayout(null);

            loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/deinLoginButton.png"))); // NOI18N
            loginButton.setBorder(null);
            loginButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/deinLoginButton_hover.png"))); // NOI18N
            loginButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    loginButtonActionPerformed(evt);
                }
            });
            getContentPane().add(loginButton);
            loginButton.setBounds(900, 80, 200, 50);

            profilButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/meinProfil.png"))); // NOI18N
            profilButton.setBorder(null);
            profilButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/meinProfil_h.png"))); // NOI18N
            profilButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    profilButtonActionPerformed(evt);
                }
            });
            getContentPane().add(profilButton);
            profilButton.setBounds(930, 88, 100, 40);

            logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/logoutButton.png"))); // NOI18N
            logOutButton.setBorder(null);
            logOutButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/logoutButton_h.png"))); // NOI18N
            logOutButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    logOutButtonActionPerformed(evt);
                }
            });
            getContentPane().add(logOutButton);
            logOutButton.setBounds(1017, 89, 110, 40);

            loggedInLabel.setFont(new java.awt.Font("Futura", 0, 13));
            loggedInLabel.setForeground(new java.awt.Color(243, 173, 38));
            loggedInLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            loggedInLabel.setText("Logged In");
            getContentPane().add(loggedInLabel);
            loggedInLabel.setBounds(820, 56, 270, 50);

            headLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/HEADER.png"))); // NOI18N
            getContentPane().add(headLabel);
            headLabel.setBounds(-140, -30, 1460, 210);

            mainScrollPanel.setBorder(null);
            mainScrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            mainPanel.setBackground(new java.awt.Color(255, 255, 255));
            mainPanel.setDoubleBuffered(false);
            mainPanel.setLayout(new java.awt.CardLayout());

        } catch (MalformedURLException e) {
        } catch (IOException e) {
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainPanel.add(welcomePanel1, "welcomePanel");
        mainPanel.add(clientLogin1, "clientLogin");
        mainPanel.add(movieDetail1, "movieDetail");
        mainPanel.add(addReview1, "addReview");
        mainPanel.add(showReviews1, "showReview");
        mainPanel.add(loggedIn1, "loggedIn");
        mainPanel.add(newRegister1, "newRegister");
        mainPanel.add(bookingSummary1, "bookingSummary");
        mainPanel.add(bookingDone1, "bookingDone");
        mainPanel.add(clientProfil1, "clientProfil");
        mainPanel.add(updateClientProfil1, "updateClientProfil");
        mainPanel.add(clientDeleted1, "clientDeleted");
        mainPanel.add(statistics1, "statisticPanel");

        mainScrollPanel.setViewportView(mainPanel);

        getContentPane().add(mainScrollPanel);
        mainScrollPanel.setBounds(110, 170, 980, 620);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1200)/2, (screenSize.height-850)/2, 1200, 850);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte clientLogin laden
     */
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        CardLayout cL = (CardLayout) mainPanel.getLayout();
        cL.show(mainPanel,"clientLogin"); 
    }//GEN-LAST:event_loginButtonActionPerformed

    /*
     * Karte welcomePanel laden und bei Gast Email Adresse aus DB loeschen
     */
    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        if (istGast == true){
            try {
                db.deleteEmailGast(loggedInKundenID);
                istGast = false;
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        loginButton.setVisible(true);
        loggedInKundenID = "";
        loggedInLabel.setText("");
        CardLayout cL = (CardLayout) mainPanel.getLayout();
        cL.show(mainPanel,"welcomePanel");
    }//GEN-LAST:event_logOutButtonActionPerformed

    /*
     * Karte clientProfil anzeigen
     */
    private void profilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilButtonActionPerformed
        CardLayout cL = (CardLayout) mainPanel.getLayout();
        cL.show(mainPanel,"clientProfil");
    }//GEN-LAST:event_profilButtonActionPerformed

    /*
     * MitarbeiterFrame anzeigen
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private gui.panel.AddReview addReview1;
    private gui.panel.BookingDone bookingDone1;
    private gui.panel.BookingSummary bookingSummary1;
    private gui.panel.ClientDeleted clientDeleted1;
    private gui.panel.ClientLogin clientLogin1;
    private gui.panel.ClientProfil clientProfil1;
    private javax.swing.JLabel headLabel;
    private javax.swing.JButton logOutButton;
    private gui.panel.LoggedIn loggedIn1;
    private javax.swing.JLabel loggedInLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane mainScrollPanel;
    private gui.panel.MovieDetail movieDetail1;
    private gui.panel.NewRegister newRegister1;
    private javax.swing.JButton profilButton;
    private gui.panel.ShowReviews showReviews1;
    private gui.panel.Statistics statistics1;
    private gui.panel.UpdateClientProfil updateClientProfil1;
    private gui.panel.WelcomePanel welcomePanel1;
    // End of variables declaration//GEN-END:variables


    
    
    public JPanel getMainPanel(){
        return mainPanel;
    }
    
    public String getLoggedInKundenID(){
        return loggedInKundenID;
    }
    
    public void setLoggedInKundenID(String loggedInKundenID){
        this.loggedInKundenID = loggedInKundenID;
        System.out.print("Gesetzte Kunden_id:" +loggedInKundenID+"\n");
    }
    
    
    public String getAktFilmID(){
        return aktFilmID;
    }
    public void setAktFilmID(String aktFilmID){
        this.aktFilmID = aktFilmID;
        //System.out.print("Gesetzte erster Film_id:" +ersterFilmID+"\n");
    }
    
    public int getFilmButton2(){
        return filmButton2;
    }
    public void setFilmButton2(int filmButton2){
        this.filmButton2 = filmButton2;
        //System.out.print("Gesetzter FilmButton:" +filmButton2+"\n");
    }
    
    public JButton getLoginButton(){
        return loginButton;
    }
    
    public JButton getProfilButton(){
        return profilButton;
    }
    
    public JLabel getLoggedInLabel(){
        return loggedInLabel;
    }
    
    public boolean getIstGast(){
        return istGast;
    }
    
    public void setIstGast(boolean istGast){
        this.istGast = istGast;
    }
    
    public String getDatumSelect(){
        return datumSelect;
    }
    public void setDatumSelect(String datumSelect){
        this.datumSelect = datumSelect;
    }
    public String getUhrzeitSelect(){
        return uhrzeitSelect;
    }
    public void setUhrzeitSelect(String uhrzeitSelect){
        this.uhrzeitSelect = uhrzeitSelect;
    }
    public String getSaalSelect(){
        return saalSelect;
    }
    public void setSaalSelect(String saalSelect){
        this.saalSelect = saalSelect;
    }
    public String getBuchungsID(){
        return buchungsID;
    }
    public void setBuchungsID(String buchungsID){
        this.buchungsID = buchungsID;
    }
    public String getVID(){
        return v_id;
    }
    public void setVID(String vID){
        this.v_id = vID;
    }
    

}
