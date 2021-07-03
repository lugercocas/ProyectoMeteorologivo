package Intrumentos_Virtuales;

//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Font;
import java.awt.BasicStroke;   
import java.awt.Color;   
import java.awt.Paint;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JPanel;   
import org.jfree.chart.ChartPanel;   
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;   
import org.jfree.chart.plot.ThermometerPlot;   
import org.jfree.data.general.DefaultValueDataset;   
import org.jfree.data.general.ValueDataset;   
import org.jfree.ui.ApplicationFrame;   
import org.jfree.ui.RectangleInsets;   
   
public class Termometro extends ApplicationFrame   
{      
    /**  
     *   
     */  
    public JFreeChart jfreechart;
    private static final long serialVersionUID = 1L;   
   
    public Termometro(String titulo, Double temperatura)   
    {   
        super(titulo);       
        jfreechart = createChart(new DefaultValueDataset(new Double(temperatura)),titulo, temperatura);   
       
         JPanel jpanel1 = new ChartPanel(jfreechart);        
        setContentPane(jpanel1);   
    }   
   
    private static JFreeChart createChart(ValueDataset valuedataset, String titulo, Double temperatura)   
    {                   
        ThermometerPlot thermometerplot = new ThermometerPlot(valuedataset);   
        JFreeChart jfreechart = new JFreeChart(titulo, JFreeChart.DEFAULT_TITLE_FONT, thermometerplot, false);           
        thermometerplot.setInsets(new RectangleInsets(3D, 100D, 3D, 100D));   
        thermometerplot.setThermometerStroke(new BasicStroke(3.0F));   
        thermometerplot.setThermometerPaint(Color.lightGray);       
        thermometerplot.setUseSubrangePaint(false);
        thermometerplot.setValuePaint(Color.PINK);
        thermometerplot.setBulbRadius(25);
        thermometerplot.setColumnRadius(15);        
        thermometerplot.setUnits(ThermometerPlot.UNITS_CELCIUS);
        thermometerplot.setUpperBound(40.0);//Maximo valor mostrado 
        thermometerplot.setLowerBound(10);//Minimo valor mostrado
        thermometerplot.setSubrange(0, 10D, 20D);
        thermometerplot.setSubrange(1, 21D, 29D);
        thermometerplot.setSubrange(2, 30D, 35D);        
        thermometerplot.setSubrangePaint(1, Color.YELLOW.brighter());
        thermometerplot.setSubrangePaint(2, Color.ORANGE);
        thermometerplot.setSubrangePaint(3, Color.ORANGE);         
        if(temperatura<=20D){
            thermometerplot.setMercuryPaint(Color.GREEN);
        }else{
            if(temperatura>=29D){
                thermometerplot.setMercuryPaint(Color.ORANGE);
            }else{
                thermometerplot.setMercuryPaint(Color.YELLOW.brighter());
            }
        }        
        return jfreechart;   
    }     
}
 /*try   
        {   
            File file = new File("Termometro1.png");   
            //BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(file));   
            //java.awt.image.BufferedImage bufferedimage = jfreechart.createBufferedImage(300, 300, 400D, 400D, null);   
            ChartUtilities.saveChartAsPNG(file, jfreechart, 300, 300);//.writeBufferedImageAsPNG(bufferedoutputstream, bufferedimage);   
        }   
        catch(IOException ioexception)   
        {   
            System.out.println(ioexception.toString());   
        }*/