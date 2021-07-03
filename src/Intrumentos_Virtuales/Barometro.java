package Intrumentos_Virtuales;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.MeterInterval;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.Range;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Barometro extends ApplicationFrame {

    private static DefaultValueDataset dataset;
    public JFreeChart chart;

    public Barometro(String titulo, Double dato) {
        super(titulo);
        JPanel chartPanel = createDemoPanel(dato, titulo);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }

    private static JFreeChart createChart(ValueDataset dataset,String titulo) {
        MeterPlot plot = new MeterPlot(dataset);
        plot.setRange(new Range(980, 1080));
       /* plot.addInterval(new MeterInterval("Alto", new Range(0.0,1080), 
                Color.RED, new BasicStroke(1.0f), Color.GRAY));*/
        /*plot.addInterval(new MeterInterval("Alto", new Range(980.0,1080), 
                Color.RED, new BasicStroke(1.0f), Color.GRAY));
        plot.addInterval(new MeterInterval("Alto", new Range(1080.0,2000), 
                Color.RED, new BasicStroke(1.0f), Color.GRAY));*/
        /*plot.addInterval(new MeterInterval("High", new Range(180.0, 280.0)));
        plot.addInterval(new MeterInterval("High", new Range(280.0, 380.0)));
        plot.addInterval(new MeterInterval("High", new Range(380.0, 480.0)));
        plot.addInterval(new MeterInterval("High", new Range(480.0, 580.0)));
        plot.addInterval(new MeterInterval("High", new Range(580.0, 680.0)));
        plot.addInterval(new MeterInterval("High", new Range(680.0, 780.0)));
        plot.addInterval(new MeterInterval("High", new Range(780.0, 880.0)));
        plot.addInterval(new MeterInterval("High", new Range(880.0, 980.0)));
        plot.addInterval(new MeterInterval("High", new Range(980.0, 1080.0)));*/
        //plot.setDialOutlinePaint(Color.RED);
        plot.setMeterAngle(330);
        plot.setForegroundAlpha(1.0F);
        plot.setDialOutlinePaint(Color.blue);
        plot.setUnits("mBar");
        JFreeChart chart1 = new JFreeChart(titulo, 
                JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        
        return chart1;
    }
    
    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public  JPanel createDemoPanel(Double dato, String titulo) {
        dataset = new DefaultValueDataset(dato);        
        chart = createChart(dataset, titulo);        
        JPanel panel = new JPanel(new BorderLayout());        
        panel.add(new ChartPanel(chart));
        return panel;
    }
}

