package tablemodel;

import java.awt.Color;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import database.Database;

/**
 *
 * TableModel zum Befuellen der VorstellungsTabelle
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class VorstellungenTabelle implements Serializable {
    
    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;

    // Angepasster Konstruktor
    public VorstellungenTabelle(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db) throws SQLException {
        this.myModel = myModel;
        this.table = table;
        this.rowData = rowData;
        this.columnNames = columnNames;
        this.db = db;
        createColumn();
        createRow();
        setColumWidth();
    }

    // Spalten erstellen
    public void createColumn() {
        int size = myModel.getRowCount();
        Vector newDatas = createDataVector("column", size);
        myModel.addColumn("ID", newDatas);
        myModel.addColumn("Titel", newDatas);
        myModel.addColumn("Saalnummer", newDatas);
        myModel.addColumn("Wochentag", newDatas);
        myModel.addColumn("Datum", newDatas);
        myModel.addColumn("Uhrzeit", newDatas);
        
    }

    // Reihen erstellen
    public void createRow() throws SQLException {
        
        Vector<String> rowOne;
        rs = db.showViewsTabelle();
        while (rs.next()) {
            rowOne = new Vector<String>();
            rowOne.addElement(rs.getString("v_id"));
            rowOne.addElement(rs.getString("titel"));
            rowOne.addElement(rs.getString("saalnummer"));
            rowOne.addElement(rs.getString("wochentag"));
            rowOne.addElement(rs.getString("datum"));
            rowOne.addElement(rs.getString("uhrzeit"));
            
            myModel.addRow(rowOne);
        }
    }

    // Reihen loeschen
    public void deleteRow() {
        myModel.getDataVector().removeAllElements();
    }
    
    // Spaltebreite definieren
    public void setColumWidth(){
        table.getColumn("ID").setPreferredWidth(50);
        table.getColumn("Titel").setPreferredWidth(250);
        table.getColumn("Saalnummer").setPreferredWidth(90);
        table.getColumn("Datum").setPreferredWidth(100);
        table.getColumn("Uhrzeit").setPreferredWidth(100);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
    
}
