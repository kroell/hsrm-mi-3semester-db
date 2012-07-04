package tablemodel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import database.Database;
import gui.MainFrame;

/**
 *
 * TableModel zum Befuellen der SpielzeitTabelle
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class SpielzeitTabelle {

    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;
    private MainFrame mF;

    // Angepasster Konstruktor
    public SpielzeitTabelle(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db, MainFrame mF) throws SQLException {
        this.myModel = myModel;
        this.table = table;
        this.rowData = rowData;
        this.columnNames = columnNames;
        this.db = db;
        this.mF = mF;
        createColumn();
        createRow();
    }

    // Spalten erstellen
    public void createColumn() throws SQLException {

        int size = myModel.getRowCount();
        Vector newDatas = createDataVector("column", size);
        myModel.addColumn("Wochentag", newDatas);
        myModel.addColumn("Datum", newDatas);
        myModel.addColumn("Uhrzeit", newDatas);
        myModel.addColumn("Saal", newDatas);
    }

    // Reihen erstellen
    public void createRow() throws SQLException {
        try {
            Vector<String> rowOne;
            rs = db.showViewsByFilmID(mF.getAktFilmID());
            while (rs.next()) {
                rowOne = new Vector<String>();
                rowOne.addElement(rs.getString("wochentag"));
                rowOne.addElement(rs.getString("datum"));
                rowOne.addElement(rs.getString("uhrzeit"));
                rowOne.addElement(rs.getString("saalnummer"));
                myModel.addRow(rowOne);
            }
        } catch (Exception ex) {
            System.out.print("Fehler beim Erstellen der SpielzeitReihe\n");
        }
    }

    // Reihen loeschen
    public void deleteRow() {
        myModel.getDataVector().removeAllElements();
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
}
