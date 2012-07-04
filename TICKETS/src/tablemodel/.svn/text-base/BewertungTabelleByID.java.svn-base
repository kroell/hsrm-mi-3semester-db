package tablemodel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import database.Database;

/**
 *
 * TableModel zum Befuellen der BewertungsTabelle
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class BewertungTabelleByID {
    
    private DefaultTableModel myModel;
    private JTable table;
    private Vector<Vector> rowData;
    private Vector<String> columnNames;
    private Database db;
    private ResultSet rs;
    private String kundenID;

    // Angepasster Konstruktor
    public BewertungTabelleByID(DefaultTableModel myModel, JTable table, Vector<Vector> rowData, Vector<String> columnNames, Database db, String kundenID) throws SQLException {
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
        myModel.addColumn("Filmtitel", newDatas);
        myModel.addColumn("Sterne", newDatas);
        myModel.addColumn("Kommentar", newDatas);
    }

    // Reihen erstellen
    public void createRow(String kundenID) throws SQLException {
        try{
        Vector<String> rowOne;
        rs = db.showReviewsTabelleByID(kundenID);
        while (rs.next()) {
            rowOne = new Vector<String>();
            rowOne.addElement(rs.getString("bewertungs_id"));
            rowOne.addElement(rs.getString("titel"));
            rowOne.addElement(rs.getString("sterne"));
            rowOne.addElement(rs.getString("kommentar"));            
            myModel.addRow(rowOne);
        }
        }catch(Exception ex){
            System.out.print("Noch keine KundenID festgelegt!\n");
        }
    }

    // Reihen loeschen
    public void deleteRow() {
        myModel.getDataVector().removeAllElements();
    }
    
    // Spaltenbreiten definieren
    public void setColumWidth(){
        table.getColumn("ID").setPreferredWidth(20);
        table.getColumn("Filmtitel").setPreferredWidth(150);
        table.getColumn("Sterne").setPreferredWidth(40);
        table.getColumn("Kommentar").setPreferredWidth(161);
        
    }

    public static Vector createDataVector(String prefix, int size) {
        Vector vector = new Vector(size);
        for (int i = 0; i < size; i++) {
            vector.add(prefix + " : " + size + " : " + i);
        }
        return vector;
    }
}
