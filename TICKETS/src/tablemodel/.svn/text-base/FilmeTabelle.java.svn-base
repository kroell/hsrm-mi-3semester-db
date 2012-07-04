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
 * TableModel zum Befuellen der FilmTabelle
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class FilmeTabelle implements Serializable {

    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;

    // Angepasster Konstruktor
    public FilmeTabelle(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db) throws SQLException {
        this.myModel = myModel;
        this.table = table;
        this.rowData = rowData;
        this.columnNames = columnNames;
        this.db = db;
        createColumn();
        createRow();
        setColumWidth();
    }

    // Spaten erstellen
    public void createColumn() {
        int size = myModel.getRowCount();
        Vector newDatas = createDataVector("column", size);
        myModel.addColumn("ID", newDatas);
        myModel.addColumn("Titel", newDatas);
        myModel.addColumn("Genre", newDatas);
        myModel.addColumn("FSK", newDatas);
        myModel.addColumn("Jahr", newDatas);
        myModel.addColumn("Land", newDatas);
        myModel.addColumn("Länge", newDatas);
        myModel.addColumn("Inhalt", newDatas);
        myModel.addColumn("3D", newDatas);
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
            rowOne.addElement(rs.getString("genre"));
            rowOne.addElement(rs.getString("fsk"));
            rowOne.addElement(rs.getString("jahr"));
            rowOne.addElement(rs.getString("land"));
            rowOne.addElement(rs.getString("laenge"));
            rowOne.addElement(rs.getString("inhalt"));
            rowOne.addElement(rs.getString("dreiD"));
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
        table.getColumn("ID").setPreferredWidth(35);
        table.getColumn("FSK").setPreferredWidth(25);
        table.getColumn("3D").setPreferredWidth(15);
        table.getColumn("Länge").setPreferredWidth(30);
        table.getColumn("Jahr").setPreferredWidth(30);
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
}
