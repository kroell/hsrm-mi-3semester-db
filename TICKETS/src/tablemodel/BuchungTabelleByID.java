package tablemodel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import database.Database;

/**
 *
 * TableModel zum Befuellen der BuchungsTabelleByID
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class BuchungTabelleByID {

    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;
    private String kundenID;

    // Angepasster Konstruktor
    public BuchungTabelleByID(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db, String kundenID) throws SQLException {
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
        myModel.addColumn("Nr", newDatas);
        myModel.addColumn("Filmtitel", newDatas);
        myModel.addColumn("Datum", newDatas);
        myModel.addColumn("Uhrzeit", newDatas);
        myModel.addColumn("Saal", newDatas);
        myModel.addColumn("Reihe", newDatas);
        myModel.addColumn("Platz", newDatas);
        myModel.addColumn("Preis", newDatas);
    }

    // Reihen erstellen
    public void createRow(String kundenID) throws SQLException {
        try {
            Vector<String> rowOne;
            rs = db.showBookingsTabelleByKundenID(kundenID);
            while (rs.next()) {
                rowOne = new Vector<String>();
                rowOne.addElement(rs.getString("b_nr"));
                rowOne.addElement(rs.getString("titel"));
                rowOne.addElement(rs.getString("datum"));
                rowOne.addElement(rs.getString("uhrzeit"));
                rowOne.addElement(rs.getString("saalnummer"));
                rowOne.addElement(rs.getString("reihe"));
                rowOne.addElement(rs.getString("platznummer"));
                rowOne.addElement(rs.getString("preis"));

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

    // Spaltenbreiten defiinieren
    public void setColumWidth() {
        table.getColumn("Nr").setPreferredWidth(30);
        table.getColumn("Saal").setPreferredWidth(40);
        table.getColumn("Reihe").setPreferredWidth(40);
        table.getColumn("Platz").setPreferredWidth(40);
        table.getColumn("Preis").setPreferredWidth(40);
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
}
