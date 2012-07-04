package tablemodel;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import database.Database;

/**
 *
 * TableModel zum Befuellen der FilmTabelleV
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class FilmeTabelleV implements Serializable {

    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;

    // Angepasster Konstruktor
    public FilmeTabelleV(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db) throws SQLException {
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
        myModel.addColumn("Film ID", newDatas);
        myModel.addColumn("Titel", newDatas);
        myModel.addColumn("Kinostart", newDatas);
    }

    // Reihen erstellen
    public void createRow() throws SQLException {

        Vector<String> rowOne;
        rs = db.showMovieTabelle();
        while (rs.next()) {
            rowOne = new Vector<String>();
            rowOne.addElement(rs.getString("f_id"));
            rowOne.addElement(rs.getString("titel"));
            rowOne.addElement(rs.getString("kinostart"));

            myModel.addRow(rowOne);
        }
    }

    // Reihen loeschen
    public void deleteRow() {
        myModel.getDataVector().removeAllElements();
    }

    // Spaltenbreite definieren
    public void setColumWidth() {
        table.getColumn("Film ID").setPreferredWidth(100);
        table.getColumn("Titel").setPreferredWidth(400);
        table.getColumn("Kinostart").setPreferredWidth(200);
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
}
