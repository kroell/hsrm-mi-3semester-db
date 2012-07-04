
package controller;

import database.Database;
import gui.MainFrame;
import java.sql.*;

/**
 *
 * TICKETS - Kinoreservierungssystem
 * 
 * Dies ist eine Applikation zum Interagieren mit einer Kinodatenbank.
 * Details sind der dazugehoerigen Dokumentation zu entnehmen
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class Controller {

    /**
     * Erstellen eines neuen Database Objekts sowie erzeugen des Haupt-
     * frames
     */
    public static void main(String[] args) throws SQLException{
        
        Database db = new Database();
        
        MainFrame mF = new MainFrame(db);
        mF.setVisible(true);
        
    }
}
