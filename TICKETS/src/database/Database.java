package database;

import java.awt.Color;
import java.sql.*;
import javax.swing.JLabel;

/**
 *
 * Klasse die gekapselt zur GUI saemtliche Datenbankbefehle (SELECTS, INSERTS, 
 * UPDATES, etc.) beinhaltet. 
 * 
 * Einzelne Interaktionen mit der Datenbank sind nach Bedarf in einzelne 
 * Methoden geschrieben. 
 * Des Weiteren beinhaltet die Klasse auch eine Connect Methode um Verbindung
 * zur Datenbank mit den entsprechenden Zugangsdaten zu erhalten.
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class Database {

    private Statement statement;
    private Statement selectStatement;
    private Statement selectStatement2;
    private Connection con = null;

    public Database() throws SQLException {
        treiberLaden();
        datenbankConnect();
        this.statement = con.createStatement();
    }

    public void treiberLaden() {
        // Laden des Treibers
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {

            System.out.println("Postgres Treiber konnte nicht geladen werden!");
            System.exit(-1);
        }
    }

    /*
     * Herstellen der Verbindung zur ausgewaehlten Datenbank.
     * - Server: db.intern.mi.hs-rm.de
     * - Datenbankname: skroe001_tickets
     * - Benutzername: skroe001
     * - Passwort: kino
     * 
     */
    public void datenbankConnect() {

        try {
            con = DriverManager.getConnection("jdbc:postgresql://db.intern.mi.hs-rm.de:5432/skroe001_tickets", "skroe001", "kino");
            System.out.print("Verbindung hergestellt!\n");
        } catch (SQLException e) {
            System.out.println("Keine Verbindung zur Datenbank!");
            System.exit(-1);
        }
    }

    /* -------------------------------- INSERTS ----------------------------- */
    /*
     * Hinzufuegen eines neuen Kunden bzw Mitarbeiter
     * gelockt durch Transaktion
     */
    public void addClientAndEmployee(String name, String vorname, String strasse, String hausnummer, String plz, String ort, String gebDatum, String email, String benutzername, String passwort, JLabel bemerkungLabel, boolean istMitarbeiter, String kundenID, boolean istGast) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            statement.executeUpdate("INSERT INTO kunde VALUES ('" + kundenID + "','" + name + "', '" + vorname + "', '" + email + "', '" + istMitarbeiter + "', '" + istGast + "')");
            statement.executeUpdate("INSERT INTO reg_kunde (kunden_id, geb_datum, strasse, hausnr, plz, ort, benutzername, passwort) VALUES ('" + kundenID + "','" + gebDatum + "','" + strasse + "','" + hausnummer + "'," + plz + ",'" + ort + "','" + benutzername + "','" + passwort + "')");
            //statement.executeUpdate("UPDATE kunde SET name ='" + name + "', vorname = '" + vorname + "', email = '" + email + "', istmitarbeiter = '" + istMitarbeiter + "', istgast = '" + istGast + "' WHERE kunden_id ='"+kundenID+"'");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Datensatz eingepflegt!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Datensatz nicht eingepflegt!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /*
     * Hinzufuegen eines neuen Gasts
     * gelockt mittels Transaktion
     */
    public boolean addGast(String kundenID, String name, String vorname, String email, boolean istMitarbeiter, boolean istGast, JLabel bemerkungLabel) throws SQLException {
        boolean gastGespeichert = false;
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            statement.executeUpdate("INSERT INTO kunde (name,vorname,email,istmitarbeiter, istgast) VALUES ('" + name + "','" + vorname + "','" + email + "','" + istMitarbeiter + "','" + istGast + "')");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Als Gast eingetragen!");
            bemerkungLabel.setForeground(Color.green);
            return gastGespeichert = true;
        } catch (Exception ex) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("E-Mail Adresse bereits im System!");
            bemerkungLabel.setForeground(Color.red);
            return gastGespeichert = false;
        }
    }

    /*
     * Neuen Film hinzufuegen
     * gelockt mittels Transaktion
     */
    public void addMovie(String titel, String genre, String fsk, String jahr, String land, String laenge, String inhalt, Boolean dreiD, String regisseur, String hauptdarsteller, String kinostart, String coverUrl, String trailerUrl, JLabel bemerkungLabel, String filmID, String regID, String darstellerID, String wfReg, String wfDarst) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            // Film erstellen
            statement.executeUpdate("INSERT INTO film (f_id, titel, genre, fsk, jahr, land, laenge, inhalt, dreiD, kinostart,cover_url, trailer_url) VALUES ('" + filmID + "','" + titel + "','" + genre + "'," + fsk + "," + jahr + ",'" + land + "'," + laenge + ",'" + inhalt + "','" + dreiD + "','" + kinostart + "','" + coverUrl + "','" + trailerUrl + "')");

            // Mitwirkende erstellen
            statement.executeUpdate("INSERT INTO mitwirkende (m_id,name,weitere_filme) VALUES ('" + regID + "','" + regisseur + "','" + wfReg + "')");
            statement.executeUpdate("INSERT INTO mitwirkende (m_id,name,weitere_filme) VALUES ('" + darstellerID + "','" + hauptdarsteller + "','" + wfDarst + "')");

            // Regisseuer und Hauptdarsteller erstellen
            statement.executeUpdate("INSERT INTO regisseur (m_id) VALUES ('" + regID + "')");
            statement.executeUpdate("INSERT INTO hauptdarsteller (m_id) VALUES ('" + darstellerID + "')");

            // Hat_mitwirkende erstellen
            statement.executeUpdate("INSERT INTO hat_mitwirkende (f_id, m_id) VALUES ('" + filmID + "','" + regID + "')");
            statement.executeUpdate("INSERT INTO hat_mitwirkende (f_id, m_id) VALUES ('" + filmID + "','" + darstellerID + "')");

            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Datensatz eingefügt!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Datensatz nicht eingefügt!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /*
     * Neue Buchung hinzufugen
     * gelockt mittels Transaktion
     */
    public boolean addBooking(String b_id, String v_id, String reihe, String platz, String kunden_id, String saalnummer, String preis, JLabel bemerkungLabel) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        boolean gebucht = false;

        try {
            statement.executeUpdate("INSERT INTO bucht (b_nr, v_id, reihe, platznummer, saalnummer, kunden_id, preis) VALUES ('" + b_id + "','" + v_id + "','" + reihe + "','" + platz + "','" + saalnummer + "','" + kunden_id + "','" + preis + "')");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Reserviert!");
            bemerkungLabel.setForeground(Color.green);
            return gebucht = true;
        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Reservierung überprüfen!");
            bemerkungLabel.setForeground(Color.red);
            return gebucht = false;
        }
    }

    /*
     * Neue Bewertung einfuegen
     * gelockt mittels Transaktion
     */
    public void addReview(String f_id, String kunden_id, String sterne, String kommentar, JLabel bemerkungLabel) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            statement.executeUpdate("INSERT INTO bewertet (f_id,kunden_id, sterne, kommentar) VALUES ('" + f_id + "','" + kunden_id + "','" + sterne + "','" + kommentar + "')");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Bewertung gespeichert!");
            bemerkungLabel.setForeground(Color.green);

        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Bewertung nicht gespeichert!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /*
     * Neue Vorstellung einfuegen
     * gelockt mittels Transaktion
     */
    public void addView(String v_id, String f_id, String datum, String uhrzeit, String saalnr, JLabel bemerkungLabel, String wochentag) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            // Vorstellung befuellen
            statement.executeUpdate("INSERT INTO vorstellung (v_id, f_id, saalnummer) VALUES ('" + v_id + "','" + f_id + "','" + saalnr + "')");
            // Zeit befuellen
            statement.executeUpdate("INSERT INTO zeit (v_id, wochentag, datum, uhrzeit) VALUES ('" + v_id + "','" + wochentag + "','" + datum + "','" + uhrzeit + "')");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Vorstellung gespeichert!");
            bemerkungLabel.setForeground(Color.green);

        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Vorstellung nicht gespeichert!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /* -------------------------------- DELETE ----------------------------- */
    /*
     * Kunde loeschen mittels Trigger und Funktion
     */
    public void deleteCostumer(String kunden_id, JLabel bemerkungLabel) throws SQLException {
        try {
            statement.executeUpdate("DELETE FROM kunde WHERE kunden_id = " + kunden_id + "");
            bemerkungLabel.setText("Kunde gelöscht!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception ex) {
            bemerkungLabel.setText("Kunde nicht gelöscht!");
            bemerkungLabel.setForeground(Color.red);
            System.out.print("Fehler beim Löschen eines Kunden\n");
        }
    }

    /*
     * Vorstellungen loeschen
     */
    public void deleteView(String v_id, JLabel bemerkungLabel) throws SQLException {
        try {
            statement.executeUpdate("DELETE FROM zeit WHERE v_id = " + v_id + "");
            statement.executeUpdate("DELETE FROM vorstellung WHERE v_id = " + v_id + "");
            bemerkungLabel.setText("Datensatz gelöscht!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception ex) {
            bemerkungLabel.setText("Datensatz nicht gelöscht!");
            bemerkungLabel.setForeground(Color.red);
            System.out.print("Fehler beim Löschen einer Vorstellung\n");
        }
    }

    /*
     * Film loeschen mittels Trigger und Funktion
     */
    public void deleteMovie(String film_id, JLabel bemerkungLabel) throws SQLException {
        try {
            statement.executeUpdate("DELETE FROM bewertet WHERE f_id = " + film_id + "");
            statement.executeUpdate("DELETE FROM hat_mitwirkende WHERE f_id = " + film_id + "");
            // Trigger before delelte vorstellung
            // geloescht wird die entsprechende vorstellung in zeit und bucht
            statement.executeUpdate("DELETE FROM vorstellung WHERE f_id = " + film_id + "");
            statement.executeUpdate("DELETE FROM film WHERE f_id = " + film_id + "");
            bemerkungLabel.setText("Datensatz gelöscht!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception ex) {
            bemerkungLabel.setText("Datensatz nicht gelöscht!");
            bemerkungLabel.setForeground(Color.red);
            System.out.print("Fehler beim Löschen eines Films!\n");
        }
    }

    /*
     * Email des Gastes beim Ausloggen loeschen, damit er sich erneut mit dieser
     * als Gast anmelden kann
     */
    public void deleteEmailGast(String kunden_id) throws SQLException {
        try {
            statement.executeUpdate("update kunde set email = null where kunden_id = " + kunden_id + "");
        } catch (Exception ex) {
            System.out.print("Fehler beim Löschen der Gast Email!\n");
        }

    }

    /*
     * Buchung loeschen
     */
    public void deleteBooking(String b_id, JLabel bemerkungLabel) throws SQLException {
        try {
            statement.executeUpdate("DELETE FROM bucht WHERE b_nr = " + b_id + "");
            bemerkungLabel.setText("Datensatz gelöscht!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception ex) {
            bemerkungLabel.setText("Datensatz nicht gelöscht!");
            bemerkungLabel.setForeground(Color.red);
            System.out.print("Fehler beim Löschen einer Buchung!\n");
        }
    }

    /*
     * Bewertung loeschen
     */
    public void deleteReview(String bewertungs_id, JLabel bemerkungLabel) throws SQLException {
        try {
            statement.executeUpdate("DELETE FROM bewertet WHERE bewertungs_id = " + bewertungs_id + "");
            bemerkungLabel.setText("Datensatz gelöscht!");
            bemerkungLabel.setForeground(Color.green);
        } catch (Exception ex) {
            bemerkungLabel.setText("Datensatz nicht gelöscht!");
            bemerkungLabel.setForeground(Color.red);
            System.out.print("Fehler beim Löschen einer Bewertung!\n");
        }
    }

    /* -------------------------------- UPDATE ----------------------------- */
    /*
     * Aktualisieren von Filminformationen
     */
    public void updateMovie(String titel, String genre, String fsk, String jahr, String land, String laenge, String inhalt, Boolean dreiD, String kinostart, String coverUrl, String trailerUrl, String filmID, String film_id, String regisseur, String reg_id, String darsteller, String darsteller_id, JLabel bemerkungLabel) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            // Update Film
            statement.executeUpdate("UPDATE film SET titel = '" + titel + "', fsk = '" + fsk + "', jahr = '" + jahr + "',land = '" + land + "', laenge = '" + laenge + "', kinostart = '" + kinostart + "', cover_url = '" + coverUrl + "', trailer_url = '" + trailerUrl + "', dreid = '" + dreiD + "', inhalt = '" + inhalt + "' WHERE f_id = " + film_id + "");

            // Update Mitwirkende
            statement.executeUpdate("UPDATE mitwirkende SET name = '" + regisseur + "' WHERE m_id = " + reg_id + "");
            statement.executeUpdate("UPDATE mitwirkende SET name = '" + darsteller + "' WHERE m_id = " + darsteller_id + "");

            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();

            bemerkungLabel.setText("Datensatz aktualisiert!");
            bemerkungLabel.setForeground(Color.green);

        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Datensatz nicht aktualisiert!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /*
     * Aktualisieren von Kundeninformationen
     */
    public void updateClient(JLabel bemerkungLabel, String name, String vorname, String strasse, String nr, String plz, String ort, String gebDat, String email, String benutzername, String passwort, Boolean isMitarbeiter, String kunden_id) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            // Update kunde
            statement.executeUpdate("UPDATE kunde SET name = '" + name + "', email = '" + email + "', vorname = '" + vorname + "',istmitarbeiter = '" + isMitarbeiter + "' WHERE kunden_id = " + kunden_id + "");
            // Update reg_kunde
            statement.executeUpdate("UPDATE reg_kunde SET geb_datum = '" + gebDat + "', strasse = '" + strasse + "', hausnr = '" + nr + "',plz = '" + plz + "',ort = '" + ort + "',benutzername = '" + benutzername + "',passwort = '" + passwort + "' WHERE kunden_id = " + kunden_id + "");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Datensatz aktualisiert!");
            bemerkungLabel.setForeground(Color.green);

        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Datensatz nicht aktualisiert!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /*
     * Aktualisieren von Vorstellungsinformationen
     */
    public void updateViews(JLabel bemerkungLabel, String saalnr, String uhrzeit, String datum, String v_id, String f_id) throws SQLException {
        // Auto-Commit deaktivieren
        con.setAutoCommit(false);

        try {
            // Vorstellung befuellen
            statement.executeUpdate("UPDATE vorstellung SET saalnummer = '" + saalnr + "' WHERE v_id = " + v_id + "");
            // Zeit befuellen
            statement.executeUpdate("UPDATE zeit SET datum = '" + datum + "', uhrzeit = '" + uhrzeit + "' WHERE v_id = " + v_id + "");
            // Wenn keine Fehler aufgetreten sind, Aenderungen festschreiben
            con.commit();
            bemerkungLabel.setText("Vorstellung gespeichert!");
            bemerkungLabel.setForeground(Color.green);

        } catch (Exception e) {
            // Beim Auftreten einer Exception Rollback durchführen
            con.rollback();
            bemerkungLabel.setText("Vorstellung nicht gespeichert!");
            bemerkungLabel.setForeground(Color.red);
        }
    }

    /* -------------------------------- SELECTS ----------------------------- */
    /*
     * Befuellen der Tabelle Kunde
     */
    public ResultSet showCostumerTabelle() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM kunde JOIN reg_kunde ON kunde.kunden_id = reg_kunde.kunden_id AND kunde.istmitarbeiter = false order by kunde.kunden_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("showCostumerTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Befuellen der Tabelle Kunden anhand der Kunden ID
     */
    public ResultSet showCostumerTabelleByID(String kunden_ID) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM kunde JOIN reg_kunde ON kunde.kunden_id = reg_kunde.kunden_id AND kunde.istmitarbeiter = false and kunde.kunden_id = '" + kunden_ID + "' order by kunde.kunden_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("showCostumerTabelleByID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Befuellen der Tabelle Bewertungen anhand der Kunden ID
     */
    public ResultSet showReviewsTabelleByID(String kunden_ID) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select b.bewertungs_id, f.titel, b.sterne, b.kommentar from bewertet b, film f where b.f_id = f.f_id and kunden_id = '" + kunden_ID + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("showReviewsTabelleByID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Befuellen der Mitarbeitertabelle
     */
    public ResultSet showEmployeeTabelle() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM kunde JOIN reg_kunde ON kunde.kunden_id = reg_kunde.kunden_id AND kunde.istmitarbeiter = true");
            return rs;
        } catch (Exception ex) {
            System.out.print("showEmployeeTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Befuellen der Vorstellungstabelle
     */
    public ResultSet showViewsTabelle() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT DISTINCT v.v_id, f.titel, v.saalnummer, z.wochentag, z.datum, z.uhrzeit FROM vorstellung v,film f, zeit z WHERE v.v_id = z.v_id AND v.f_id = f.f_id ORDER BY v.v_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("showViewsTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Befuellen der Buchungentabelle
     */
    public ResultSet showBookingsTabelle() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select distinct b.b_nr,b.kunden_id,b.v_id,f.titel, z.datum, z.uhrzeit, b.saalnummer, b.reihe, b.platznummer, b.preis from bucht b, zeit z, film f, vorstellung v where b.v_id = z.v_id and f.f_id = v.f_id and b.v_id = v.v_id order by b_nr;");
            return rs;
        } catch (Exception ex) {
            System.out.print("showBookingTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Befuellen der Buchungentabelle anhand der Kunden ID
     */
    public ResultSet showBookingsTabelleByKundenID(String kundenID) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select distinct b.b_nr,b.kunden_id,b.v_id,f.titel, z.datum, z.uhrzeit, b.saalnummer, b.reihe, b.platznummer, b.preis from bucht b, zeit z, film f, vorstellung v where b.v_id = z.v_id and f.f_id = v.f_id and b.v_id = v.v_id and kunden_id = '" + kundenID + "'order by b_nr;");
            return rs;
        } catch (Exception ex) {
            System.out.print("showBookingsTabelleByKundenID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Filminformationen mittels Film ID anzeigen
     */
    public ResultSet showMovieByID(String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM film WHERE f_id = " + film_id + "");
            return rs;
        } catch (Exception ex) {
            System.out.print("showMovieByID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Kundeninformationen mittels Kunden ID anzeigen
     */
    public ResultSet showClientByID(String kunden_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select * from kunde k , reg_kunde r WHERE k.kunden_id = " + kunden_id + " AND r.kunden_id = " + kunden_id + "");
            return rs;
        } catch (Exception ex) {
            System.out.print("showClientByID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Regisseurinformationen mittels Film ID anzeigen
     */
    public ResultSet showRegisseurByMovieID(String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select m.m_id, m.name from mitwirkende m, hat_mitwirkende h, regisseur r where h.f_id = " + film_id + " and h.m_id = r.m_id and r.m_id = m.m_id;");
            return rs;
        } catch (Exception ex) {
            System.out.print("showRegisseurByMovieID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Darstellerinformationen mittels Film ID anzeigen
     */
    public ResultSet showDarstellerByMovieID(String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select m.m_id, m.name from mitwirkende m, hat_mitwirkende h, hauptdarsteller d where h.f_id = " + film_id + " and h.m_id = d.m_id and d.m_id = m.m_id;");
            return rs;
        } catch (Exception ex) {
            System.out.print("showDarstellerByMovieID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle Filme anzeigen
     */
    public ResultSet showMovie() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM film");
            return rs;
        } catch (Exception ex) {
            System.out.print("showMovie konnte nicht durchgeführt werden!\n");
        }
        return null;

    }

    /*
     * Filmtabelle sortiert nach Film ID
     */
    public ResultSet showMovieTabelle() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM film order by f_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("showMovieTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Filmtitel anzeigen
     */
    public ResultSet showMovieTitel() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT * FROM film");
            return rs;
        } catch (Exception ex) {
            System.out.print("showCostumerTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Vorstellung anhand Film ID anzeigen
     */
    public ResultSet showViewsByFilmID(String f_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select v.v_id,f.f_id, f.titel,v.saalnummer,z.datum,z.uhrzeit,z.wochentag from vorstellung v, zeit z, film f where v.v_id = z.v_id and f.f_id = v.f_id and v.f_id=" + f_id + " order by v_id ");
            return rs;
        } catch (Exception ex) {
            System.out.print("Select ShowViewsByF_ID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Vorstellungen anhand Vorstellung ID anzeigen
     */
    public ResultSet showViewsByVID(String v_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select v.v_id,f.f_id, f.titel,v.saalnummer,z.datum,z.uhrzeit from vorstellung v, zeit z, film f where v.v_id = z.v_id and v.v_id = " + v_id + " and f.f_id = v.f_id order by v_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("Select ShowViewsByV_ID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Bewertungen anhand Film ID anzeigen
     */
    public ResultSet showReviewsByFilmIDVorvorletzter(String film_id) throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select k.benutzername, b.sterne, b.kommentar from reg_kunde k, bewertet b where b.kunden_id=k.kunden_id and f_id = '" + film_id + "' order by bewertungs_id desc limit 3");
        return rs;
        } catch (Exception ex) {
            System.out.print("showReviewsByFilmIDVorvorletzter konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Bewertungen anhand Film ID anzeigen
     */
    public ResultSet showReviewsByFilmIDVorletzter(String film_id) throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select k.benutzername, b.sterne, b.kommentar from reg_kunde k, bewertet b where b.kunden_id=k.kunden_id and f_id = '" + film_id + "' order by bewertungs_id desc limit 2");

        return rs;
        } catch (Exception ex) {
            System.out.print("showReviewsByFilmIDVorletzter konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Bewertungen anhand Film ID anzeigen 
     */
    public ResultSet showReviewsByFilmIDLetzter(String film_id) throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select k.benutzername, b.sterne, b.kommentar from reg_kunde k, bewertet b where b.kunden_id=k.kunden_id and f_id = '" + film_id + "' order by bewertungs_id desc limit 1");
        return rs;
        } catch (Exception ex) {
            System.out.print("showCostumerTabelle konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Durchschnittswert der Bewertungssterne anhand einer Film ID anzeigen
     */
    public ResultSet showAvgStars(String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select round(avg(sterne)) from bewertet where f_id = '" + film_id + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("showAvgStars konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Buchungsnummer generieren
     */
    public ResultSet getBookingNr() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT nextval ('b_nr_seq')");
            return rs;
        } catch (Exception e) {
            System.out.print("Fehler beim Generieren der Buchungsnummer!\n");
        }
        return null;
    }

    /*
     * Kunden ID generieren
     */
    public ResultSet getKundenID() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT nextval ('kunden_id_seq')");
            return rs;
        } catch (Exception e) {
            System.out.print("Fehler beim Generieren der Kunden - ID!\n");
        }
        return null;
    }

    /*
     * Movie ID generieren
     */
    public ResultSet getMovieID() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT nextval ('film_id_seq')");
            return rs;
        } catch (Exception e) {
            System.out.print("Fehler beim Generieren der Film - ID!\n");
        }
        return null;
    }

    /*
     * Mitwirkende ID generieren
     */
    public ResultSet getActorID() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT nextval ('mitwirkende_id_seq')");
            return rs;
        } catch (Exception e) {
            System.out.print("Fehler beim Generieren der Mitwirkenden - ID!\n");
        }
        return null;
    }
    
    /*
     * Vorstellung ID generieren
     */
    public ResultSet getVorstellungID() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT nextval ('vorstellung_id_seq')");
            return rs;
        } catch (Exception e) {
            System.out.print("Fehler beim Generieren der Vorstellungs - ID!\n");
        }
        return null;
    }

    /*
     * Filminformationen erhalten
     */
    public ResultSet getMovieDetailsLetzter() throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select f_id,titel,kinostart from film order by kinostart desc, f_id desc limit 1");
        return rs;
        } catch (Exception ex) {
            System.out.print("getMovieDetails konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Filminformationen erhalten
     */
    public ResultSet getMovieDetailsVorletzter() throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select f_id,titel,kinostart from film order by kinostart desc, f_id desc limit 2");
        return rs;
        } catch (Exception ex) {
            System.out.print("getMovieDetails konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Filminformationen erhalten
     */
    public ResultSet getMovieDetailsVorvorletzter() throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select f_id,titel,kinostart from film order by kinostart desc, f_id desc limit 3");
        return rs;
        } catch (Exception ex) {
            System.out.print("getMovieDetails konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Filminformationen erhalten
     */
    public ResultSet getMovieDetailsVorvorvorletzter() throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select f_id,titel,kinostart from film order by kinostart desc, f_id desc limit 4");
        return rs;
        } catch (Exception ex) {
            System.out.print("getMovieDetails konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Filminformationen erhalten
     */
    public ResultSet getMovieDetailsVorvorvorvorletzter() throws SQLException {
try{
        ResultSet rs = statement.executeQuery("select f_id,titel,kinostart from film order by kinostart desc, f_id desc limit 5");
        return rs;
        } catch (Exception ex) {
            System.out.print("getMovieDetails konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle Kunden IDs erhalten
     */
    public ResultSet getAllKundenID() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT kunden_id FROM kunde order by kunden_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllKundenID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle Filmtitel erhalten
     */
    public ResultSet getAllMovie() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT titel FROM film order by titel");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllMovie konnte nicht ausgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle Vorstellungen erhalten
     */
    public ResultSet getAllVorstellungen() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select v.v_id, f.titel,z.datum, z.uhrzeit, v.saalnummer from zeit z, vorstellung v, film f where z.v_id = v.v_id and v.f_id = f.f_id;");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllVorstellungen konnte nicht ausgeführt werden!\n");
        }
        return null;
    }

    /*
     * Vorstellung ID mittels versch. Argumenten erhalten
     */
    public ResultSet getVIDByMisc(String datum, String uhrzeit, String saalnummer, String filmID) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select v.v_id from vorstellung v, zeit z where z.datum = '" + datum + "' and z.uhrzeit = '" + uhrzeit + "' and v.saalnummer = '" + saalnummer + "' and v.f_id = " + filmID + " and v.v_id = z.v_id");
            return rs;
        } catch (Exception ex) {
            System.out.print("getVIDByMisc konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Film ID mittels Filmtitel erhalten
     */
    public ResultSet getFilmIDByMovie(String titel) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT f_id FROM film where titel = '" + titel + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getFilmIDByMovie konnte nicht ausgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle freihen Reihen erhalten
     */
    public ResultSet getAllReiheFree(String saalnummer, String v_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select p.reihe from platz p where not exists (select b.reihe, b.platznummer, b.saalnummer from bucht b where b.reihe = p.reihe and b.platznummer = p.platznummer and b.saalnummer = p.saalnummer and b.v_id ='" + v_id + "') and p.saalnummer = " + saalnummer + " group by p.reihe order by p.reihe");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllReiheFree konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle freihen Plaetze erhalten
     */
    public ResultSet getAllPlatzFree(String saalnummer, String reihe, String v_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select p.reihe, p.platznummer, p.saalnummer from platz p where not exists (select b.reihe, b.platznummer, b.saalnummer from bucht b where b.reihe = p.reihe and b.platznummer = p.platznummer and b.saalnummer = p.saalnummer and b.v_id ='" + v_id + "') and p.saalnummer = " + saalnummer + " and p.reihe = '" + reihe + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllPlatzFree konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle Saalnummern erhalten
     */
    public ResultSet getAllSaalNr() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT saalnummer FROM saal order by saalnummer");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllSaalNr konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Alle Reihen erhalten
     */
    public ResultSet getAllReihe(String saalnummer) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select reihe, saalnummer from platz where saalnummer = '" + saalnummer + "' group by reihe, saalnummer order by reihe");
            return rs;
        } catch (Exception ex) {
            System.out.print("getAllReihe konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln aller Plaetze wenn Saal und Reihe gegeben
     */
    public ResultSet getAllPlatz(String saalnummer, String reihe) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select platznummer, saalnummer from platz where saalnummer = '" + saalnummer + "' and reihe = '" + reihe + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Ermitteln des Platzes!\n");
        }
        return null;
    }

    /*
     * Berechnen des Einzelpreis anhand von Reihe und Platz
     */
    public ResultSet getSinglePrice(String reihe, String platznummer) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_single_price ('" + reihe + "','" + platznummer + "')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Berechnen des Einzelpreises!\n");
        }
        return null;
    }

    /*
     * Berechnen des Gesamtpreis anhand von Reihe und Platz
     */
    public ResultSet getTotalPrice(String preis, String kunden_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_entire_price ('" + preis + "','" + kunden_id + "')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Berechnen des Gesamtpreises!\n");
        }
        return null;
    }

    /*
     * Berechnen des Preis anhand von Reihe und Platz
     */
    public ResultSet getPrice(String reihe, String platz, String saal, String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_price('" + reihe + "'," + platz + "," + saal + "," + film_id + ")");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Berechnen des Preises!\n");
        }
        return null;
    }

    /*
     * Berechnen des Preis anhand von Reihe und Platz
     */
    public ResultSet getPrice(String reihe, String platz, String reihe2, String platz2, String saal, String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_price ('" + reihe + "'," + platz + ",'" + reihe2 + "'," + platz2 + "," + saal + "," + film_id + ")");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Berechnen des Preises!\n");
        }
        return null;
    }

    /*
     * Berechnen des Preis anhand von Reihe und Platz
     */
    public ResultSet getPrice(String reihe, String platz, String reihe2, String platz2, String reihe3, String platz3, String saal, String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_price ('" + reihe + "'," + platz + ",'" + reihe2 + "'," + platz2 + ",'" + reihe3 + "'," + platz3 + "," + saal + "," + film_id + ")");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Berechnen des Preises!\n");
        }
        return null;
    }

    /*
     * Berechnen des Preis anhand von Reihe und Platz
     */
    public ResultSet getPrice(String reihe, String platz, String reihe2, String platz2, String reihe3, String platz3, String reihe4, String platz4, String saal, String film_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_price ('" + reihe + "'," + platz + ",'" + reihe2 + "'," + platz2 + ",'" + reihe3 + "'," + platz3 + ",'" + reihe4 + "'," + platz4 + "," + saal + "," + film_id + ")");
            return rs;
        } catch (Exception ex) {
            System.out.print("Fehler beim Berechnen des Preises!\n");
        }
        return null;
    }

    /*
     * Berechnen des Rabattpreis bei Buchung einer Vorstellung
     */
    public ResultSet getDiscountPrice(String summe, String kunden_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_discount_price ('" + summe + "','" + kunden_id + "')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Rabattpreis konnte nicht berechnet werden!\n");
        }
        return null;
    }

    /*
     * Berechnen des Rabatts bei Buchung einer Vorstellung
     */
    public ResultSet getDiscount(String wertA, String wertB) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select calculate_discount ('" + wertA + "','" + wertB + "')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Rabatt konnte nicht berechnet werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln der KundenID wenn der Benutzername gegeben ist
     */
    public ResultSet getKundenIDByUsername(String benutzername) throws SQLException {
        try {
            selectStatement = con.createStatement();
            ResultSet rs = selectStatement.executeQuery("SELECT kunden_id FROM reg_kunde WHERE benutzername = '" + benutzername + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getKundenIDByUsername konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln des Benutzernamen wenn die KundenID gegeben ist
     */
    public ResultSet getUsernameByKundenID(String kundenID) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT benutzername FROM reg_kunde WHERE kunden_id = '" + kundenID + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getUsernameByKundenID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln ob hinter einem Benutzername ein Mitarbeiter steht
     */
    public ResultSet getIstMitarbeiterByUsername(String benutzername) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select k.istmitarbeiter FROM kunde k, reg_kunde r WHERE r.kunden_id = k.kunden_id AND r.benutzername = '" + benutzername + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getIstMitarbeiterByUsername konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln ob ein Kunde als Gast regisitriert ist, wenn die KundenID 
     * gegeben ist
     */
    public ResultSet getIstGastByKundenID(String kundenID) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select istgast FROM kunde WHERE kunden_id = '" + kundenID + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getIstGastByKundenID konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln der KundenID wenn die Email gegeben ist
     */
    public ResultSet getKundenIDByEmail(String email) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("select kunden_id FROM kunde WHERE email = '" + email + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("getKundenIDByEmail konnte nicht durchgeführt werden!\n");
        }
        return null;
    }

    /*
     * Ermitteln der Buchungsnummer wenn VorstellungsID, Reihe, Platz, Saal und 
     * KundenID gegeben sind
     */
    public ResultSet getBuchungsNrByMisc(String v_id, String reihe, String platznummer, String saalnummer, String kunden_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT b_nr FROM bucht WHERE v_id = '" + v_id + "' and reihe = '" + reihe + "' and platznummer = '" + platznummer + "' and saalnummer = '" + saalnummer + "' and kunden_id = '" + kunden_id + "'");
            return rs;
        } catch (Exception ex) {
            System.out.print("Buchungsnummer konnte nicht ermittelt werden!\n");
        }
        return null;
    }

    /*
     * Berechnen des Sternenwerts des mitgegebenen Films zum Erstellen einer
     * Statistik
     */
    public ResultSet getStarStatisic(String f_id, String star) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT value_star('" + f_id + "','" + star + "')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Sternenwert konnte nicht berechnet werden!\n");
        }
        return null;
    }

    /*
     * Berechnen der belegten Plätze eines Saals zum Erstellen einer Statistik
     */
    public ResultSet getBlockedSeats(String saalnummer, String v_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT count(*) FROM platz p WHERE EXISTS (SELECT b.reihe, b.platznummer, b.saalnummer FROM bucht b WHERE b.reihe = p.reihe and b.platznummer = p.platznummer AND b.saalnummer = p.saalnummer AND b.v_id = '"+v_id+"' ) AND p.saalnummer = '"+saalnummer+"'");
            return rs;
        } catch (Exception ex) {
            System.out.print("Belegte Plätze konnten nicht berechnet werden!\n");
        }
        return null;
    }

    /*
     * Berechnen der freien Plätze eines Saals zum Erstellen einer Statistik
     */
    public ResultSet getFreeSeats(String saalnummer, String v_id) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT count(*) FROM platz p WHERE NOT EXISTS (SELECT b.reihe, b.platznummer, b.saalnummer FROM bucht b WHERE b.reihe = p.reihe and b.platznummer = p.platznummer AND b.saalnummer = p.saalnummer AND b.v_id = '"+v_id+"') AND p.saalnummer = '"+saalnummer+"'");
            return rs;
        } catch (Exception ex) {
            System.out.print("Freie Sitze konnten nicht berechnet werden!\n");
        }
        return null;
    }

    /*
     * Berechnen des Wochentags durch Mitgabe eines Datums
     */
    public ResultSet getWochentag(String datum) throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT wochentag('" + datum + "')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Wochentag konnte nicht berechnet werden!\n");
        }
        return null;
    }

    /*
     * Erhalten des aktuellen Datums
     */
    public ResultSet getAktDate() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT CURRENT_DATE");
            return rs;
        } catch (Exception ex) {
            System.out.print("Aktuelles Datum konnte nicht erstellt werden!\n");
        }
        return null;
    }

    /*
     * Erhalten des aktuellen Timestamps
     */
    public ResultSet getAktDateTime() throws SQLException {
        try {
            ResultSet rs = statement.executeQuery("SELECT to_char(current_timestamp,'DD.MM.YYYY HH24:MI')");
            return rs;
        } catch (Exception ex) {
            System.out.print("Aktuelle Timestamp konnte nicht geladen werden!\n");
        }
        return null;
    }

    /* -------------------------------- MISC ----------------------------- */
    /*
     * Abgleich des Benutzernamen und der Datenbank um den Login zu erlauben
     * bzw. zu verbieten
     */
    public boolean customerLoginCheck(String benutzername, String passwort) throws SQLException {

        boolean loginCorrect = false;
        try {
            selectStatement = con.createStatement();
            selectStatement2 = con.createStatement();
            ResultSet rs = selectStatement.executeQuery("SELECT * FROM reg_kunde");
            ResultSet rs2 = selectStatement2.executeQuery("SELECT * FROM reg_kunde");

            while (rs.next()) {
                if (rs.getString("benutzername").equals(benutzername)) {
                    while (rs2.next()) {
                        if (rs.getString("passwort").equals(passwort)) {
                            loginCorrect = true;
                            loginCorrect = true;
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.print("Logincheck war nicht erfolgreich!\n");
        }
        return loginCorrect;
    }
}
