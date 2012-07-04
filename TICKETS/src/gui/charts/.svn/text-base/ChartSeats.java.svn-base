package gui.charts;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * Klasse erstellt ein 3D Diagramm zur Auslastung eines Kinosaals
 * 
 * 
 * @author Soeren Kroell, Mareike Schulz, Sebastian Fuchs
 * @version 28.02.2012
 */
public class ChartSeats extends JFrame{
  
    private String bezeichnung1;
    private String bezeichnung2;
    private String bezeichnung3;
    private String bezeichnung4;
    private int wert1;
    private int wert2;
    private int wert3;
    private int wert4;
    private String filmtitel;
    private String saal;
    
    // Default Konstruktor
    public ChartSeats () {
    }
    
    // Angepasster Konstruktor
    public ChartSeats (String saal, String bezeichnung1, String bezeichnung2, int wert1, int wert2) {   
        this.saal = saal;
        this.bezeichnung1 = bezeichnung1;
        this.bezeichnung2 = bezeichnung2;
        this.wert1 = wert1;
        this.wert2 = wert2;
    }
    
    // Angepasster Konstruktor
    public ChartSeats(String filmtitel, String bezeichnung1, String bezeichnung2, String bezeichnung3, String bezeichnung4, int wert1, int wert2, int wert3, int wert4){
        this.filmtitel = filmtitel;
        this.bezeichnung1 = bezeichnung1;
        this.bezeichnung2 = bezeichnung2;
        this.bezeichnung3 = bezeichnung3;
        this.bezeichnung4 = bezeichnung4;
        this.wert1 = wert1;
        this.wert2 = wert2;
        this.wert3 = wert3;
        this.wert4 = wert4;
    }
    
    /*
     * Erstellen einer Chartgrafik und Rueckgabe eines BufferedImage
     */
    public BufferedImage makeChart(){ 
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(bezeichnung1+" ("+wert1+")", wert1);
        dataset.setValue(bezeichnung2+" ("+wert2+")", wert2);
        
        JFreeChart chart3 = ChartFactory.createPieChart3D("Auslastung von Saal "+saal, dataset, true, false, false);
        PiePlot3D plot3 = (PiePlot3D) chart3.getPlot();
        plot3.setForegroundAlpha(0.6f);
        plot3.setBackgroundPaint(new Color(238, 238, 238));
        plot3.setCircular(true);
        
        BufferedImage img = chart3.createBufferedImage(600, 300);
        
        return img;
    }
}