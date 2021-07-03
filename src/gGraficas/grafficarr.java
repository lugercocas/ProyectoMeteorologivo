/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gGraficas;

import java.awt.image.BufferedImage;
import java.util.Date;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author LUIS GER
 */
public class grafficarr {
    public ImageIcon icono;
    public grafficarr(double[] x, double[] y, String title, String text_x, String text_y,int ancho, int largo){
        icono = creaImagen(x,y,title,text_x,text_y,ancho,largo);
    }
    public ImageIcon creaImagen(double[] x, double[] y, String title, String text_x, String text_y,int ancho, int largo){
        
        int x1 = x.length;
        int y1 = y.length;        
        if(x1==y1){
            //TimeSeries series = new TimeSeries("Date", Date.class);
            XYSeries series = new XYSeries("Evolucion");
            for(int i = 0;i <= x1-1;i++){
                Date gm = new Date();
                double gm1 = (double)Date.parse(String.valueOf(x[i]));
                series.add(gm1, y[i]);
                
            }
            //TimeSeriesCollection dataset1 = new TimeSeriesCollection(series);
            XYDataset juegoDatos= new XYSeriesCollection(series);
            JFreeChart chart = ChartFactory.createXYLineChart
                    (title,
                     text_x,text_y,juegoDatos/*dataset1*/,PlotOrientation.VERTICAL,
                     false,
                     false,
                     true                // Show legend
            );
            BufferedImage image = chart.createBufferedImage(ancho,largo);
            icono = new ImageIcon(image);
        }else{
            icono = null;
            System.out.println("X y Y no son iguales...");
        }
        return icono;
    }
   /* public ImageIcon creaImagen(String titulo)
    {
        XYSeries series = new XYSeries("Evolucion");
        series.add(1, 23);
        series.add(2, 34);
        series.add(3, 51);
        series.add(4, 67);
        series.add(5, 89);
        series.add(6, 121);
        series.add(7, 137);
        XYDataset juegoDatos= new XYSeriesCollection(series);

        JFreeChart chart = ChartFactory.createXYLineChart
        ("Sesiones en Adictos al Trabajo",
        "Meses","Sesiones",juegoDatos,PlotOrientation.VERTICAL,
        false,
        false,
        true                // Show legend
        );

         BufferedImage image = chart.createBufferedImage(300,300);
         icono = new ImageIcon(image);
        return icono;
    }*/
    
}
