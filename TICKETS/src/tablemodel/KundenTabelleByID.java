package tablemodel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import database.Database;

/**
 *
 * TableModel zum Befuellen der KundenTabelleByID
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class KundenTabelleByID {

    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;
    private String kundenID;

    // Angepasster Konstruktor
    public KundenTabelleByID(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db, String kundenID) throws SQLException {
        this.myModel = myModel;
        this.table = table;
        this.rowData = rowData;
        this.columnNames = columnNames;
        this.db = db;
        this.kundenID = kundenID;
        createColumn();
        createRow(kundenID);
        setColumWidth();
    }

    // Spalten erstellen
    public void createColumn() {
        int size = myModel.getRowCount();
        Vector newDatas = createDataVector("column", size);

        myModel.addColumn("ID", newDatas);
        myModel.addColumn("Name", newDatas);
        myModel.addColumn("Vorname", newDatas);
        myModel.addColumn("E-Mail", newDatas);
        myModel.addColumn("GebDatum", newDatas);
        myModel.addColumn("Str", newDatas);
        myModel.addColumn("Nr", newDatas);
        myModel.addColumn("PLZ", newDatas);
        myModel.addColumn("Ort", newDatas);
        myModel.addColumn("Benutzername", newDatas);
        myModel.addColumn("Passwort", newDatas);
    }

    // Reihen erstellen
    public void createRow(String kundenID) throws SQLException {
        try {
            Vector<String> rowOne;
            rs = db.showCostumerTabelleByID(kundenID);
            while (rs.next()) {
                rowOne = new Vector<String>();
                rowOne.addElement(rs.getString("kunden_id"));
                rowOne.addElement(rs.getString("name"));
                rowOne.addElement(rs.getString("vorname"));
                rowOne.addElement(rs.getString("email"));
                rowOne.addElement(rs.getString("geb_datum"));
                rowOne.addElement(rs.getString("strasse"));
                rowOne.addElement(rs.getString("hausnr"));
                rowOne.addElement(rs.getString("plz"));
                rowOne.addElement(rs.getString("ort"));
                rowOne.addElement(rs.getString("benutzername"));
                rowOne.addElement(rs.getString("passwort"));

                myModel.addRow(rowOne);
            }
        } catch (Exception ex) {
            System.out.print("Noch keine KundenID festgelegt!\n");
        }
    }

    // Reihen loeschen
    public void deleteRow() {
        myModel.getDataVector().removeAllElements();
    }

    // Spaltenbreite definieren
    public void setColumWidth() {
        table.getColumn("ID").setPreferredWidth(30);
        table.getColumn("Nr").setPreferredWidth(30);
        table.getColumn("PLZ").setPreferredWidth(50);
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
}
