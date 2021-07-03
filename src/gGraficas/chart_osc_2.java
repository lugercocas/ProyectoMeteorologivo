/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gGraficas;

import java.awt.image.BufferedImage;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author LUIS GER
 */
public class chart_osc_2 {
    public ImageIcon ic;
    public chart_osc_2(String titulo, String text_x, String text_y,String[] x, double[] y,int ancho, int alto){
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        TimeSeries s1 = new TimeSeries("Series 1", Second.class);
        int i = x.length;
        int[] ttime = new int[6];
        int dato_ant_s = 0;
        int dato_ant_m = 0;
        int dato_ant_h = 0;
        for(int j = 0;j<i;j++){
            ttime = string_to_int_time(x,j);
            //if((ttime[0]!=ttime[1])&& ttime[1]!=ttime[2] && ttime[2]!=ttime[3]&& ttime[3]!=ttime[4]&& ttime[4]!=ttime[5])
            System.out.println(ttime[0]);
            System.out.println(ttime[1]);
            System.out.println(ttime[2]);
            System.out.println(ttime[3]);
            System.out.println(ttime[4]);
            System.out.println(ttime[5]);
            if(j==0){
                s1.add(new Second(ttime[0], ttime[1], ttime[2], ttime[3], ttime[4], ttime[5]), y[j]);
            }else{
              if(ttime[0]!=dato_ant_s){
                s1.add(new Second(ttime[0], ttime[1], ttime[2], ttime[3], ttime[4], ttime[5]), y[j]);                            
              }else{
                  if(ttime[1]!=dato_ant_m){
                     s1.add(new Second(ttime[0], ttime[1], ttime[2], ttime[3], ttime[4], ttime[5]), y[j]);
                  }else{
                      if(ttime[2]!=dato_ant_h){
                          s1.add(new Second(ttime[0], ttime[1], ttime[2], ttime[3], ttime[4], ttime[5]), y[j]);
                      }
                  }
              }
            }
            dato_ant_s = ttime[0];  
            dato_ant_m = ttime[1];
            dato_ant_h = ttime[2];
        }                        
        dataset.addSeries(s1);
        XYDataset XYDataset_dataset = dataset;
        JFreeChart chart = ChartFactory.createTimeSeriesChart(titulo,
                text_x,
                text_y, XYDataset_dataset, false, false, false);
        BufferedImage im;
        im = chart.createBufferedImage(ancho, alto);
        ic = new ImageIcon(im);
    } 
 public int[] string_to_int_time(String[] dato, int j){
    int[] reg_tiempo = new int[6];    
    //______________________________________________
    //String a Date
      SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
      String strFecha = dato[j];//"30/04/2012 03:07:24 PM";
      Date t = null;
      try {
          t = formatoDelTexto.parse(strFecha);
          
      } catch (ParseException ex) {
          System.out.println("Error en la conversion de String a Date");
          ex.printStackTrace();
      }
      //System.out.println(t.toString());            
      //__________________________________________
      //Extraigo los dias meses años hora minutos y segundos
      SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd");
      String dia = sdf.format(t);
      //System.out.println(dia);
      //Mes
      SimpleDateFormat sdf1=new SimpleDateFormat("MM");
      String mes = sdf1.format(t);
      //System.out.println(mes);
      //Año
      SimpleDateFormat sdf2=new SimpleDateFormat("yyyy");
      String año = sdf2.format(t);
      //System.out.println(año);
      //Hora
      SimpleDateFormat sdf3=new SimpleDateFormat("HH");
      String hora = sdf3.format(t);
      //System.out.println(hora);
      //Minutos
      SimpleDateFormat sdf4=new SimpleDateFormat("mm");
      String minutos = sdf4.format(t);
      //System.out.println(minutos);
      //Hora
      SimpleDateFormat sdf5=new SimpleDateFormat("ss");
      String segundos = sdf5.format(t);
      //System.out.println(segundos);
      //________________________________________
      //Almaceno datos hallados para retornarlos
      reg_tiempo[0] = Integer.parseInt(segundos);
      reg_tiempo[1] = Integer.parseInt(minutos);
      reg_tiempo[2] = Integer.parseInt(hora);
      reg_tiempo[3] = Integer.parseInt(dia);
      reg_tiempo[4] = Integer.parseInt(mes);
      reg_tiempo[5] = Integer.parseInt(año);
      //________________________________________
    return reg_tiempo;
}   
}
    
