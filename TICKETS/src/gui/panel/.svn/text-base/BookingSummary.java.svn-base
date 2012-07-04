package gui.panel;

import database.Database;
import gui.MainFrame;
import gui.Sitzplan1_4;
import gui.Sitzplan5;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * Panel zum Anzeigen der Buchungsuebersicht
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class BookingSummary extends javax.swing.JPanel {

    private MainFrame mF;
    private Database db;
    private String coverUrl;
    private String v_id;
    private String saal;
    private String kunden_id;
    private String film_id;
    private String allReihe;
    private String allPlatz;
    private String platzAuswahl;
    private String reiheAuswahl;
    private String platzAuswahl_2;
    private String reiheAuswahl_2;
    private String platzAuswahl_3;
    private String reiheAuswahl_3;
    private String platzAuswahl_4;
    private String reiheAuswahl_4;
    private String titel;
    private String preis;
    private String rabattpreis;
    private String discountPreis;
    private boolean gebucht;
    private String buchungsNr;

    // Default Konstruktor
    public BookingSummary() {
        initComponents();
    }

    // Angepasster Konstruktor
    public BookingSummary(MainFrame mF, Database db) {
        this.mF = mF;
        this.db = db;
        initComponents();

        //Windows GUI Anpassung
        preisBerechnenButton.setOpaque(false);
        preisBerechnenButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        preisBerechnenButton.setContentAreaFilled(false);
        preisBerechnenButton.setBackground(new Color(0, 0, 0, 0));

        bookButton.setOpaque(false);
        bookButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        bookButton.setContentAreaFilled(false);
        bookButton.setBackground(new Color(0, 0, 0, 0));

        filmprogrammButton.setOpaque(false);
        filmprogrammButton.setBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0));
        filmprogrammButton.setContentAreaFilled(false);
        filmprogrammButton.setBackground(new Color(0, 0, 0, 0));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginLabel = new javax.swing.JLabel();
        lineLabel = new javax.swing.JLabel();
        filmprogrammButton = new javax.swing.JButton();
        coverLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        calenderLabel = new javax.swing.JLabel();
        reiheAuswahl1 = new javax.swing.JComboBox();
        platzAuswahl1 = new javax.swing.JComboBox();
        reiheAuswahl2 = new javax.swing.JComboBox();
        platzAuswahl2 = new javax.swing.JComboBox();
        euroZeichen = new javax.swing.JLabel();
        line = new javax.swing.JLabel();
        reiheAuswahl3 = new javax.swing.JComboBox();
        platzAuswahl3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        reiheAuswahl4 = new javax.swing.JComboBox();
        platzAuswahl4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        einzelPreis = new javax.swing.JLabel();
        titelLabel = new javax.swing.JLabel();
        uhrzeitLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        datumLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        preisLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rabattLabel = new javax.swing.JLabel();
        rabattPreis = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        gesamtPreisLabel = new javax.swing.JLabel();
        gesamtPreis = new javax.swing.JLabel();
        shadowLabel = new javax.swing.JLabel();
        bookButton = new javax.swing.JButton();
        bemerkungLabel = new javax.swing.JLabel();
        preisBerechnenButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        saalnrLabel = new javax.swing.JLabel();
        saalPlanButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                update(evt);
            }
        });
        setLayout(null);

        loginLabel.setFont(new java.awt.Font("Futura", 0, 28));
        loginLabel.setForeground(new java.awt.Color(238, 162, 35));
        loginLabel.setText("FILMRESERVIERUNG"); // NOI18N
        add(loginLabel);
        loginLabel.setBounds(0, 0, 430, 60);

        lineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(lineLabel);
        lineLabel.setBounds(0, 40, 980, 20);

        filmprogrammButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button.png"))); // NOI18N
        filmprogrammButton.setBorder(null);
        filmprogrammButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/filmuebersicht_button_h.png"))); // NOI18N
        filmprogrammButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmprogrammButtonActionPerformed(evt);
            }
        });
        add(filmprogrammButton);
        filmprogrammButton.setBounds(850, 20, 150, 28);

        coverLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/empty.png"))); // NOI18N
        add(coverLabel);
        coverLabel.setBounds(0, 170, 178, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/bookingHeadline.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, 70, 980, 80);

        calenderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/calender.png"))); // NOI18N
        add(calenderLabel);
        calenderLabel.setBounds(270, 170, 160, 150);

        reiheAuswahl1.setFont(new java.awt.Font("Futura", 0, 12));
        reiheAuswahl1.setForeground(new java.awt.Color(238, 162, 35));
        reiheAuswahl1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "REIHE" }));
        reiheAuswahl1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                reiheAuswahl1ItemStateChanged(evt);
            }
        });
        reiheAuswahl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiheAuswahl1ActionPerformed(evt);
            }
        });
        add(reiheAuswahl1);
        reiheAuswahl1.setBounds(540, 170, 140, 27);

        platzAuswahl1.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        platzAuswahl1.setForeground(new java.awt.Color(238, 162, 35));
        platzAuswahl1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLATZ" }));
        add(platzAuswahl1);
        platzAuswahl1.setBounds(540, 200, 140, 27);

        reiheAuswahl2.setFont(new java.awt.Font("Futura", 0, 12));
        reiheAuswahl2.setForeground(new java.awt.Color(238, 162, 35));
        reiheAuswahl2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "REIHE" }));
        reiheAuswahl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiheAuswahl2ActionPerformed(evt);
            }
        });
        add(reiheAuswahl2);
        reiheAuswahl2.setBounds(540, 230, 140, 40);

        platzAuswahl2.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        platzAuswahl2.setForeground(new java.awt.Color(238, 162, 35));
        platzAuswahl2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLATZ" }));
        add(platzAuswahl2);
        platzAuswahl2.setBounds(540, 260, 140, 40);

        euroZeichen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/euroZeichen.png"))); // NOI18N
        add(euroZeichen);
        euroZeichen.setBounds(810, 170, 110, 130);

        line.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/line_short_thin.png"))); // NOI18N
        add(line);
        line.setBounds(540, 210, 140, 40);

        reiheAuswahl3.setFont(new java.awt.Font("Futura", 0, 12));
        reiheAuswahl3.setForeground(new java.awt.Color(238, 162, 35));
        reiheAuswahl3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "REIHE" }));
        reiheAuswahl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiheAuswahl3ActionPerformed(evt);
            }
        });
        add(reiheAuswahl3);
        reiheAuswahl3.setBounds(540, 300, 140, 40);

        platzAuswahl3.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        platzAuswahl3.setForeground(new java.awt.Color(238, 162, 35));
        platzAuswahl3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLATZ" }));
        add(platzAuswahl3);
        platzAuswahl3.setBounds(540, 330, 140, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/line_short_thin.png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(540, 280, 140, 40);

        reiheAuswahl4.setFont(new java.awt.Font("Futura", 0, 12));
        reiheAuswahl4.setForeground(new java.awt.Color(238, 162, 35));
        reiheAuswahl4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "REIHE" }));
        reiheAuswahl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiheAuswahl4ActionPerformed(evt);
            }
        });
        add(reiheAuswahl4);
        reiheAuswahl4.setBounds(540, 370, 140, 40);

        platzAuswahl4.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        platzAuswahl4.setForeground(new java.awt.Color(238, 162, 35));
        platzAuswahl4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLATZ" }));
        add(platzAuswahl4);
        platzAuswahl4.setBounds(540, 400, 140, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/line_short_thin.png"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(540, 350, 140, 40);

        einzelPreis.setFont(new java.awt.Font("Arial", 0, 14));
        einzelPreis.setForeground(new java.awt.Color(255, 255, 255));
        einzelPreis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        einzelPreis.setText("€");
        add(einzelPreis);
        einzelPreis.setBounds(880, 330, 80, 17);

        titelLabel.setFont(new java.awt.Font("Arial", 0, 14));
        add(titelLabel);
        titelLabel.setBounds(350, 370, 70, 16);

        uhrzeitLabel.setFont(new java.awt.Font("Arial", 0, 14));
        uhrzeitLabel.setText("zeit");
        add(uhrzeitLabel);
        uhrzeitLabel.setBounds(350, 390, 70, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel10.setText("Saal:");
        add(jLabel10);
        jLabel10.setBounds(280, 410, 70, 16);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel11.setText("Filmtitel:");
        add(jLabel11);
        jLabel11.setBounds(280, 370, 60, 17);

        datumLabel.setFont(new java.awt.Font("Arial", 1, 14));
        datumLabel.setText("Datum");
        add(datumLabel);
        datumLabel.setBounds(280, 330, 130, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel13.setText("Preis:");
        add(jLabel13);
        jLabel13.setBounds(790, 330, 90, 17);

        preisLabel.setFont(new java.awt.Font("Arial", 0, 14));
        preisLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(preisLabel);
        preisLabel.setBounds(890, 330, 60, 0);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel15.setText("Rabatt:");
        add(jLabel15);
        jLabel15.setBounds(790, 350, 90, 17);

        rabattLabel.setFont(new java.awt.Font("Arial", 0, 14));
        rabattLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(rabattLabel);
        rabattLabel.setBounds(890, 350, 60, 0);

        rabattPreis.setFont(new java.awt.Font("Arial", 0, 14));
        rabattPreis.setForeground(new java.awt.Color(255, 255, 255));
        rabattPreis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rabattPreis.setText("€");
        add(rabattPreis);
        rabattPreis.setBounds(880, 350, 80, 17);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel18.setText("Gesamtpreis:");
        add(jLabel18);
        jLabel18.setBounds(790, 390, 110, 17);

        gesamtPreisLabel.setFont(new java.awt.Font("Arial", 1, 14));
        gesamtPreisLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        add(gesamtPreisLabel);
        gesamtPreisLabel.setBounds(890, 390, 60, 0);

        gesamtPreis.setFont(new java.awt.Font("Arial", 1, 14));
        gesamtPreis.setForeground(new java.awt.Color(255, 255, 255));
        gesamtPreis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gesamtPreis.setText("€");
        add(gesamtPreis);
        gesamtPreis.setBounds(880, 390, 80, 17);

        shadowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/cover_shadow3.png"))); // NOI18N
        add(shadowLabel);
        shadowLabel.setBounds(0, 200, 190, 270);

        bookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reservierenButton.png"))); // NOI18N
        bookButton.setBorder(null);
        bookButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/reservierenButton_h.png"))); // NOI18N
        bookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookButtonActionPerformed(evt);
            }
        });
        add(bookButton);
        bookButton.setBounds(790, 530, 190, 50);

        bemerkungLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungLabel.setForeground(new java.awt.Color(255, 255, 255));
        bemerkungLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungLabel.setText("Bemerkung");
        add(bemerkungLabel);
        bemerkungLabel.setBounds(750, 580, 220, 20);

        preisBerechnenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/preisBerechnen.png"))); // NOI18N
        preisBerechnenButton.setBorder(null);
        preisBerechnenButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/preisBerechnen_h.png"))); // NOI18N
        preisBerechnenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preisBerechnenButtonActionPerformed(evt);
            }
        });
        add(preisBerechnenButton);
        preisBerechnenButton.setBounds(790, 480, 190, 50);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14));
        jLabel12.setText("Uhrzeit:");
        add(jLabel12);
        jLabel12.setBounds(280, 390, 70, 17);

        saalnrLabel.setFont(new java.awt.Font("Arial", 0, 14));
        add(saalnrLabel);
        saalnrLabel.setBounds(350, 410, 70, 16);

        saalPlanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sitzplan.png"))); // NOI18N
        saalPlanButton.setBorder(null);
        saalPlanButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/kunde/sitzplan_h.png"))); // NOI18N
        saalPlanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saalPlanButtonActionPerformed(evt);
            }
        });
        add(saalPlanButton);
        saalPlanButton.setBounds(550, 440, 130, 23);
    }// </editor-fold>//GEN-END:initComponents

    /*
     * Karte movieDetail laden und Inhalt reseten
     */
    private void filmprogrammButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmprogrammButtonActionPerformed
        CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
        cL.show(mF.getMainPanel(), "movieDetail");
        resetAll();
        reiheAuswahl1.removeAllItems();
        reiheAuswahl1.addItem("REIHE");
        reiheAuswahl1.setSelectedItem("REIHE");
        platzAuswahl1.removeAllItems();
        platzAuswahl1.addItem("PLATZ");
        platzAuswahl1.setSelectedItem("PLATZ");

        reiheAuswahl2.removeAllItems();
        reiheAuswahl2.addItem("REIHE");
        reiheAuswahl2.setSelectedItem("REIHE");
        platzAuswahl2.removeAllItems();
        platzAuswahl2.addItem("PLATZ");
        platzAuswahl2.setSelectedItem("PLATZ");

        reiheAuswahl3.removeAllItems();
        reiheAuswahl3.addItem("REIHE");
        reiheAuswahl3.setSelectedItem("REIHE");
        platzAuswahl3.removeAllItems();
        platzAuswahl3.addItem("PLATZ");
        platzAuswahl3.setSelectedItem("PLATZ");

        reiheAuswahl4.removeAllItems();
        reiheAuswahl4.addItem("REIHE");
        reiheAuswahl4.setSelectedItem("REIHE");
        platzAuswahl4.removeAllItems();
        platzAuswahl4.addItem("PLATZ");
        platzAuswahl4.setSelectedItem("PLATZ");

        bemerkungLabel.setForeground(Color.white);

        //CardLayout cL = (CardLayout) mainPanel.getLayout();         //cL.show(mainPanel,"welcomePanel");}//GEN-LAST:event_filmprogrammButtonActionPerformed
    }

    /*
     * ComboBox Platz mittels Auswahl der Reihe befuellen 
     */
        private void reiheAuswahl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiheAuswahl1ActionPerformed
            platzAuswahl1.removeAllItems();
            reiheAuswahl = (String) reiheAuswahl1.getSelectedItem();
            try {
                getPlatz();
            } catch (SQLException ex) {
                Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_reiheAuswahl1ActionPerformed

    /*
     * ComboBox Platz mittels Auswahl der Reihe befuellen 
     */
    private void reiheAuswahl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiheAuswahl2ActionPerformed
        platzAuswahl2.removeAllItems();
        reiheAuswahl = (String) reiheAuswahl2.getSelectedItem();
        try {
            getPlatz();
        } catch (SQLException ex) {
            Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reiheAuswahl2ActionPerformed

    /*
     * ComboBox Platz mittels Auswahl der Reihe befuellen 
     */
    private void reiheAuswahl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiheAuswahl3ActionPerformed
        platzAuswahl3.removeAllItems();
        reiheAuswahl = (String) reiheAuswahl3.getSelectedItem();
        try {
            getPlatz();
        } catch (SQLException ex) {
            Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reiheAuswahl3ActionPerformed

    /*
     * ComboBox Platz mittels Auswahl der Reihe befuellen 
     */
    private void reiheAuswahl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiheAuswahl4ActionPerformed
        platzAuswahl4.removeAllItems();
        reiheAuswahl = (String) reiheAuswahl4.getSelectedItem();
        try {
            getPlatz();
        } catch (SQLException ex) {
            Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_reiheAuswahl4ActionPerformed

    /*
     * Wird beim Laden des Panels ausgefuehrt
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        try {
            resetAll();
            setBookingInformations();
            getVID();
            getReihe();
            getPlatz();
        } catch (SQLException ex) {
            Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Durchfuehren einer Buchung 
     */
    private void bookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookButtonActionPerformed
        try {
            book();
        } catch (SQLException ex) {
            Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
        }

        // wenn Buchung erfolgreich Karte bookingDone laden
        if (gebucht == true) {
            resetAll();
            CardLayout cL = (CardLayout) mF.getMainPanel().getLayout();
            cL.show(mF.getMainPanel(), "bookingDone");
        } else {
            try {
                bemerkungLabel.setText("Fehler beim Reservieren");
                bemerkungLabel.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Bitte Reservierung überprüfen. Evtl. ist ihre Platzauswahl nicht mehr verfügbar.", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                getReihe();
                getPlatz();
            } catch (SQLException ex) {
                Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bookButtonActionPerformed

    private void reiheAuswahl1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reiheAuswahl1ItemStateChanged
    }//GEN-LAST:event_reiheAuswahl1ItemStateChanged

    /*
     * Berechnen des Preises
     */
    private void preisBerechnenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preisBerechnenButtonActionPerformed
        try {
            try {
                calcPrice();
            } catch (ParseException ex) {
                Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookingSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_preisBerechnenButtonActionPerformed

    /*
     * Anzeigen des Saalplan Frames
     */
    private void saalPlanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saalPlanButtonActionPerformed
        if (mF.getSaalSelect().equals("5")) {
            Sitzplan5 sitzplan = new Sitzplan5();
            sitzplan.setVisible(true);
        } else {
            Sitzplan1_4 sitzplan = new Sitzplan1_4();
            sitzplan.setVisible(true);
        }
    }//GEN-LAST:event_saalPlanButtonActionPerformed

    /*
     * Buchungsinformationen in die entsprechenden Labels eintragen
     */
    private void setBookingInformations() throws SQLException {
        // CoverURL aus ausgwaehltem Film 
        ResultSet rs = db.showMovieByID(mF.getAktFilmID());
        while (rs.next()) {
            coverUrl = rs.getString("cover_url");
            titel = rs.getString("titel");
        }
        // Coverbild laden
        try {
            URL url = new URL(coverUrl);
            java.awt.Image image = java.awt.Toolkit.getDefaultToolkit().getDefaultToolkit().createImage(url);
            Image imageNewScale = image.getScaledInstance(178, 270, 270);
            ImageIcon cover = new ImageIcon(imageNewScale);
            coverLabel.setIcon(cover);

        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        titelLabel.setText(titel);
        datumLabel.setText(mF.getDatumSelect());
        uhrzeitLabel.setText(mF.getUhrzeitSelect());
        saalnrLabel.setText(mF.getSaalSelect());
        shadowLabel.setIcon(new ImageIcon("src/data/pics/cover_shadow3.png"));
    }

    /*
     * Reset des Panels
     */
    private void resetAll() {
        datumLabel.setText("");
        uhrzeitLabel.setText("");
        titelLabel.setText("");
        preisLabel.setText("");
        rabattLabel.setText("");
        gesamtPreisLabel.setText("");
        coverLabel.setIcon(new ImageIcon(""));
        shadowLabel.setIcon(new ImageIcon(""));
        einzelPreis.setText("");
        rabattPreis.setText("");
        gesamtPreis.setText("");
    }

    /*
     * Alle freien Reihen laden und in die ComboBoxen eintragen
     */
    private void getReihe() throws SQLException {
        ResultSet rs = db.getAllReiheFree(saal, v_id);
        while (rs.next()) {
            allReihe = rs.getString("reihe");
            // Reihen in ComboBox
            reiheAuswahl1.addItem(allReihe);
            reiheAuswahl2.addItem(allReihe);
            reiheAuswahl3.addItem(allReihe);
            reiheAuswahl4.addItem(allReihe);
        }
    }

    /*
     * Alle freien Plaetze laden und in die ComboBoxen eintragen
     */
    private void getPlatz() throws SQLException {
        ResultSet rs = db.getAllPlatzFree(saal, reiheAuswahl, v_id);
        while (rs.next()) {
            allPlatz = rs.getString("platznummer");
            platzAuswahl1.addItem(allPlatz);
            platzAuswahl2.addItem(allPlatz);
            platzAuswahl3.addItem(allPlatz);
            platzAuswahl4.addItem(allPlatz);
        }
    }

    /*
     * Vorstellungs ID ermitteln
     */
    private void getVID() throws SQLException {
        saal = mF.getSaalSelect();
        film_id = mF.getAktFilmID();
        ResultSet rs = db.getVIDByMisc(mF.getDatumSelect(), mF.getUhrzeitSelect(), saal, mF.getAktFilmID());
        while (rs.next()) {
            v_id = rs.getString("v_id");
        }
    }

    /*
     * Buchung durchfuehren
     */
    private void book() throws SQLException {

        // Global gesetzte Kunden ID laden
        kunden_id = mF.getLoggedInKundenID();

        getBuchungsNr();
        mF.setBuchungsID(buchungsNr);

        // Buchung in Datenbank speichern, sofern Reihe und Platz ausgewaehlt wurden
        if (!reiheAuswahl.equals("REIHE") || !platzAuswahl.equals("PLATZ")) {
            gebucht = db.addBooking(buchungsNr, v_id, reiheAuswahl, platzAuswahl, kunden_id, saal, discountPreis, bemerkungLabel);
        }
        // Buchungen durchfuehren, sofern Reihe und Platz nicht doppelt ausgewaehlt
        if (!reiheAuswahl_2.equals("REIHE") || !platzAuswahl_2.equals("PLATZ")) {
            gebucht = db.addBooking(buchungsNr, v_id, reiheAuswahl_2, platzAuswahl_2, kunden_id, saal, discountPreis, bemerkungLabel);
        }
        // Buchungen durchfuehren, sofern Reihe und Platz nicht doppelt ausgewaehlt
        if (!reiheAuswahl_3.equals("REIHE") || !platzAuswahl_3.equals("PLATZ")) {
            gebucht = db.addBooking(buchungsNr, v_id, reiheAuswahl_3, platzAuswahl_3, kunden_id, saal, discountPreis, bemerkungLabel);
        }
        // Buchungen durchfuehren, sofern Reihe und Platz nicht doppelt ausgewaehlt
        if (!reiheAuswahl_4.equals("REIHE") || !platzAuswahl_4.equals("PLATZ")) {
            gebucht = db.addBooking(buchungsNr, v_id, reiheAuswahl_4, platzAuswahl_4, kunden_id, saal, discountPreis, bemerkungLabel);
        }
    }

    /*
     * Preis berechnen
     */
    private void calcPrice() throws SQLException, ParseException {

        bemerkungLabel.setForeground(Color.white);

        reiheAuswahl = (String) reiheAuswahl1.getSelectedItem();
        platzAuswahl = (String) platzAuswahl1.getSelectedItem();

        reiheAuswahl_2 = (String) reiheAuswahl2.getSelectedItem();
        platzAuswahl_2 = (String) platzAuswahl2.getSelectedItem();

        reiheAuswahl_3 = (String) reiheAuswahl3.getSelectedItem();
        platzAuswahl_3 = (String) platzAuswahl3.getSelectedItem();

        reiheAuswahl_4 = (String) reiheAuswahl4.getSelectedItem();
        platzAuswahl_4 = (String) platzAuswahl4.getSelectedItem();

        double preis = 0;
        double preis1 = 0;
        double preis2 = 0;
        double preis3 = 0;
        double preis4 = 0;

        if (!reiheAuswahl.equals("REIHE") || !platzAuswahl.equals("PLATZ")) {

            ResultSet rs = db.getPrice(reiheAuswahl, platzAuswahl, saal, film_id);
            while (rs.next()) {
                preis = rs.getDouble("calculate_price");
            }

            // Preis berechnen, jedoch nur wenn der ausgewaehlten Sitzplatz zuvor nicht schon einmal ausgewaehlt wurde
            if (!reiheAuswahl_2.equals("REIHE") || !platzAuswahl_2.equals("PLATZ")) {
                if (!(reiheAuswahl_2.equals(reiheAuswahl) && platzAuswahl_2.equals(platzAuswahl))) {

                    ResultSet rs2 = db.getPrice(reiheAuswahl, platzAuswahl, saal, film_id);
                    while (rs2.next()) {
                        preis1 = rs2.getDouble("calculate_price");
                    }
                    ResultSet rs3 = db.getPrice(reiheAuswahl_2, platzAuswahl_2, saal, film_id);
                    while (rs3.next()) {
                        preis2 = rs3.getDouble("calculate_price");
                    }
                    preis = preis1 + preis2;

                } else {
                    JOptionPane.showMessageDialog(null, "Doppelte Platzauswahl", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Preis berechnen, jedoch nur wenn der ausgewaehlten Sitzplatz zuvor nicht schon einmal ausgewaehlt wurde
            if (!reiheAuswahl_3.equals("REIHE") || !platzAuswahl_3.equals("PLATZ")) {
                if (!(reiheAuswahl_3.equals(reiheAuswahl_2) && platzAuswahl_3.equals(platzAuswahl_2))) {
                    if (!(reiheAuswahl_3.equals(reiheAuswahl) && platzAuswahl_3.equals(platzAuswahl))) {
                        ResultSet rs2 = db.getPrice(reiheAuswahl, platzAuswahl, saal, film_id);
                        while (rs2.next()) {
                            preis1 = rs2.getDouble("calculate_price");
                        }
                        ResultSet rs3 = db.getPrice(reiheAuswahl_2, platzAuswahl_2, saal, film_id);
                        while (rs3.next()) {
                            preis2 = rs3.getDouble("calculate_price");
                        }
                        ResultSet rs4 = db.getPrice(reiheAuswahl_3, platzAuswahl_3, saal, film_id);
                        while (rs4.next()) {
                            preis3 = rs4.getDouble("calculate_price");
                        }
                        preis = preis1 + preis2 + preis3;
                    } else {
                        JOptionPane.showMessageDialog(null, "Doppelte Platzauswahl", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Doppelte Platzauswahl", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                }

            }

            // Preis berechnen, jedoch nur wenn der ausgewaehlten Sitzplatz zuvor nicht schon einmal ausgewaehlt wurde
            if (!reiheAuswahl_4.equals("REIHE") || !platzAuswahl_4.equals("PLATZ")) {
                if (!(reiheAuswahl_4.equals(reiheAuswahl_3) && platzAuswahl_4.equals(platzAuswahl_3))) {
                    if (!(reiheAuswahl_4.equals(reiheAuswahl_2) && platzAuswahl_4.equals(platzAuswahl_2))) {
                        if (!(reiheAuswahl_4.equals(reiheAuswahl) && platzAuswahl_4.equals(platzAuswahl))) {
                            ResultSet rs2 = db.getPrice(reiheAuswahl, platzAuswahl, saal, film_id);
                            while (rs2.next()) {
                                preis1 = rs2.getDouble("calculate_price");
                            }
                            ResultSet rs3 = db.getPrice(reiheAuswahl_2, platzAuswahl_2, saal, film_id);
                            while (rs3.next()) {
                                preis2 = rs3.getDouble("calculate_price");
                            }
                            ResultSet rs4 = db.getPrice(reiheAuswahl_3, platzAuswahl_3, saal, film_id);
                            while (rs4.next()) {
                                preis3 = rs4.getDouble("calculate_price");
                            }
                            ResultSet rs5 = db.getPrice(reiheAuswahl_4, platzAuswahl_4, saal, film_id);
                            while (rs5.next()) {
                                preis4 = rs5.getDouble("calculate_price");
                            }
                            preis = preis1 + preis2 + preis3 + preis4;
                        } else {
                            JOptionPane.showMessageDialog(null, "Doppelte Platzauswahl", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Doppelte Platzauswahl", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Doppelte Platzauswahl", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
                }
            }

            String stringPreis = Double.toString(preis);

            einzelPreis.setForeground(Color.black);
            einzelPreis.setText(stringPreis + "0 €");

            // Gesamtpreis berechnen und ausweisen
            ResultSet rs3 = db.getDiscountPrice(stringPreis, mF.getLoggedInKundenID());
            while (rs3.next()) {
                discountPreis = rs3.getString("calculate_discount_price");
            }
            gesamtPreis.setForeground(Color.black);
            gesamtPreis.setText(discountPreis + " €");

            // Rabattanteil ausrechnen und ausweisen
            ResultSet rs4 = db.getDiscount(stringPreis, discountPreis);
            while (rs4.next()) {
                rabattpreis = rs4.getString("calculate_discount");
            }
            rabattPreis.setText(rabattpreis + " €");
            rabattPreis.setForeground(Color.black);

        } else {
            JOptionPane.showMessageDialog(null, "Bitte zuerst Sitzplatz auswählen", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
        }

    }

    /*
     * Buchungsnumemr ermitteln
     */
    private void getBuchungsNr() throws SQLException {
        ResultSet rs = db.getBookingNr();
        while (rs.next()) {
            buchungsNr = rs.getString("nextval");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemerkungLabel;
    private javax.swing.JButton bookButton;
    private javax.swing.JLabel calenderLabel;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JLabel datumLabel;
    private javax.swing.JLabel einzelPreis;
    private javax.swing.JLabel euroZeichen;
    private javax.swing.JButton filmprogrammButton;
    private javax.swing.JLabel gesamtPreis;
    private javax.swing.JLabel gesamtPreisLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel line;
    private javax.swing.JLabel lineLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JComboBox platzAuswahl1;
    private javax.swing.JComboBox platzAuswahl2;
    private javax.swing.JComboBox platzAuswahl3;
    private javax.swing.JComboBox platzAuswahl4;
    private javax.swing.JButton preisBerechnenButton;
    private javax.swing.JLabel preisLabel;
    private javax.swing.JLabel rabattLabel;
    private javax.swing.JLabel rabattPreis;
    private javax.swing.JComboBox reiheAuswahl1;
    private javax.swing.JComboBox reiheAuswahl2;
    private javax.swing.JComboBox reiheAuswahl3;
    private javax.swing.JComboBox reiheAuswahl4;
    private javax.swing.JButton saalPlanButton;
    private javax.swing.JLabel saalnrLabel;
    private javax.swing.JLabel shadowLabel;
    private javax.swing.JLabel titelLabel;
    private javax.swing.JLabel uhrzeitLabel;
    // End of variables declaration//GEN-END:variables
}
