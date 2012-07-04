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

/**
 *
 * Panel zum Anzeigen aller Filme
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ShowMovie extends javax.swing.JPanel {

    private Database db;
    private DefaultTableModel myModel = new DefaultTableModel();
    private Vector<String> columnNames = new Vector<String>();
    private Vector<Vector> rowData = new Vector<Vector>();
    private FilmeTabelle fT;
    private EmpFrame eF;
    private String film_id;
    private boolean clicked;

    // Angepasster Konstruktor
    public ShowMovie(EmpFrame eF, Database db) throws SQLException {
        initComponents();
        this.db = db;
        showTableContent();
        this.eF = eF;
       
        // Windows GUI Anpassungen
        showMovieButton.setOpaque(false);
        showMovieButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        showMovieButton.setContentAreaFilled(false);
        showMovieButton.setBackground(new Color(0,0,0,0)); 
        
        showViewButton.setOpaque(false);
        showViewButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        showViewButton.setContentAreaFilled(false);
        showViewButton.setBackground(new Color(0,0,0,0));
     
        showClientButton.setOpaque(false);
        showClientButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        showClientButton.setContentAreaFilled(false);
        showClientButton.setBackground(new Color(0,0,0,0));
        
        showBookingButton.setOpaque(false);
        showBookingButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        showBookingButton.setContentAreaFilled(false);
        showBookingButton.setBackground(new Color(0,0,0,0));
        
        showEmployeeButton.setOpaque(false);
        showEmployeeButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        showEmployeeButton.setContentAreaFilled(false);
        showEmployeeButton.setBackground(new Color(0,0,0,0));
        
        refreshButton.setOpaque(false);
        refreshButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        refreshButton.setContentAreaFilled(false);
        refreshButton.setBackground(new Color(0,0,0,0));
        
        filmBearbButton.setOpaque(false);
        filmBearbButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        filmBearbButton.setContentAreaFilled(false);
        filmBearbButton.setBackground(new Color(0,0,0,0));
        
        deleteMovieButton.setOpaque(false);
        deleteMovieButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        deleteMovieButton.setContentAreaFilled(false);
        deleteMovieButton.setBackground(new Color(0,0,0,0));
        
        addMovieButton.setOpaque(false);
        addMovieButton.setBorder(new javax.swing.border.EmptyBorder(0,0,0,0));
        addMovieButton.setContentAreaFilled(false);
        addMovieButton.setBackground(new Color(0,0,0,0));
    }

    // Default Konstruktor
    public ShowMovie() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();
        filmBearbButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmeTabelle = new javax.swing.JTable(rowData,columnNames){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        bemerkungsLabel = new javax.swing.JLabel();
        showMovieButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deleteMovieButton = new javax.swing.JButton();
        addMovieButton = new javax.swing.JButton();
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

        jLabel3.setFont(new java.awt.Font("Futura", 0, 18));
        jLabel3.setForeground(new java.awt.Color(238, 162, 35));
        jLabel3.setText("FILMÜBERSICHT"); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(320, 150, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/LINE4.png"))); // NOI18N
        add(jLabel2);
        jLabel2.setBounds(0, 40, 980, 20);

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

        filmBearbButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmBearbButton.png"))); // NOI18N
        filmBearbButton.setBorder(null);
        filmBearbButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmBearbButton_h.png"))); // NOI18N
        filmBearbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmBearbButtonActionPerformed(evt);
            }
        });
        add(filmBearbButton);
        filmBearbButton.setBounds(640, 400, 100, 40);

        filmeTabelle.setModel(myModel);
        filmeTabelle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        filmeTabelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filmeTabelleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(filmeTabelle);

        add(jScrollPane1);
        jScrollPane1.setBounds(320, 200, 620, 200);

        bemerkungsLabel.setFont(new java.awt.Font("Arial", 1, 12));
        bemerkungsLabel.setForeground(new java.awt.Color(238, 238, 238));
        bemerkungsLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bemerkungsLabel.setText("Bemerkung");
        add(bemerkungsLabel);
        bemerkungsLabel.setBounds(530, 160, 410, 20);

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

        deleteMovieButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmloeschen.png"))); // NOI18N
        deleteMovieButton.setBorder(null);
        deleteMovieButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmloeschen_h.png"))); // NOI18N
        deleteMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMovieButtonActionPerformed(evt);
            }
        });
        add(deleteMovieButton);
        deleteMovieButton.setBounds(750, 400, 97, 40);

        addMovieButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmAddButton.png"))); // NOI18N
        addMovieButton.setBorder(null);
        addMovieButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/filmAddButton_h.png"))); // NOI18N
        addMovieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMovieButtonActionPerformed(evt);
            }
        });
        add(addMovieButton);
        addMovieButton.setBounds(840, 400, 120, 40);

        filmBlaseLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/pics/mitarbeiter/blaseFilm.png"))); // NOI18N
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

    /*
     * Inhalt Filmtabelle anzeigen
     */
    private void showMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMovieButtonActionPerformed
        if (clicked == false) {
            try {
                fT = new FilmeTabelle(myModel, filmeTabelle, rowData, columnNames, db);
                clicked = true;
            } catch (SQLException ex) {
                Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            clicked = true;
        }
    }//GEN-LAST:event_showMovieButtonActionPerformed

    private void addMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMovieButtonActionPerformed
        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "addMovie");
    }//GEN-LAST:event_addMovieButtonActionPerformed

    private void showClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showClientButtonActionPerformed

        CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
        cL.show(eF.getMainPanel(), "showClient");
    }//GEN-LAST:event_showClientButtonActionPerformed

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

    /*
     * Film ID in Variable schreiben nach Selektion in der Tabelle
     * Doppelklick laden der Karte updateMovie
     */
    private void filmeTabelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filmeTabelleMouseClicked
        if (evt.getClickCount() == 1) {
            int row = filmeTabelle.getSelectedRow();
            film_id = (String) filmeTabelle.getValueAt(row, 0);

        }
        if (evt.getClickCount() == 2) {
            eF.setFilmID(film_id);
            CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
            cL.show(eF.getMainPanel(), "updateMovie");
        }
    }//GEN-LAST:event_filmeTabelleMouseClicked

    /*
     * Film aus DB loeschen
     */
    private void deleteMovieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMovieButtonActionPerformed
        try {
            db.deleteMovie(film_id, bemerkungsLabel);
        } catch (SQLException ex) {
            Logger.getLogger(ShowMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
        refreshButtonActionPerformed(evt);
    }//GEN-LAST:event_deleteMovieButtonActionPerformed

    /*
     * Karte updateMovie laden
     */
    private void filmBearbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmBearbButtonActionPerformed
    if (film_id != null) {
            eF.setFilmID(film_id);
            CardLayout cL = (CardLayout) eF.getMainPanel().getLayout();
            cL.show(eF.getMainPanel(), "updateMovie");
        } else {
            JOptionPane.showMessageDialog(null, "Bitte zuerst einen Film in der Tabelle makieren!", "Warnhinweis", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_filmBearbButtonActionPerformed

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
            fT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    /*
     * Tabelleninhalt aktualisieren, wenn Panel neu geladen wird
     */
    private void update(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_update
        while (!myModel.getDataVector().isEmpty()) {
            for (int i = 0; i < myModel.getRowCount(); i++) {
                myModel.removeRow(i);
            }
        }
        try {
            fT.createRow();
        } catch (SQLException ex) {
            Logger.getLogger(ShowClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update

    /*
     * Tabelleninhalt anzeigen
     */
    private void showTableContent() throws SQLException {
        fT = new FilmeTabelle(myModel, filmeTabelle, rowData, columnNames, db);
        clicked = true;
    }

    /*
     * FilmID getter
     */
    public String getFilmId() {
        return film_id;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMovieButton;
    private javax.swing.JLabel bemerkungsLabel;
    private javax.swing.JButton deleteMovieButton;
    private javax.swing.JButton filmBearbButton;
    private javax.swing.JLabel filmBlaseLabel;
    private javax.swing.JTable filmeTabelle;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton showBookingButton;
    private javax.swing.JButton showClientButton;
    private javax.swing.JButton showEmployeeButton;
    private javax.swing.JButton showMovieButton;
    private javax.swing.JButton showViewButton;
    // End of variables declaration//GEN-END:variables
}
