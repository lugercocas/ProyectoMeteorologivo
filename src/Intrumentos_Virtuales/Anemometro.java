package Intrumentos_Virtuales;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.MeterInterval;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Anemometro extends ApplicationFrame {

    private static DefaultValueDataset dataset;
    public JFreeChart chart;

    public Anemometro(String titulo, Double dato) {
        super(titulo);
        JPanel chartPanel = createDemoPanel(dato, titulo);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }

    private static JFreeChart createChart(ValueDataset dataset,String titulo) {
        MeterPlot plot = new MeterPlot(dataset);
        //plot.addInterval(new MeterInterval("Alto", new Range(80.0, 100.0)));
        plot.addInterval(new MeterInterval("Brisa", new Range(0.0, 10.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Suave", new Range(10.0, 20.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Leve", new Range(20.0, 30.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Moderado", new Range(30.0, 40.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Regular", new Range(40.0, 50.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Fuertes", new Range(50.0, 60.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Ventarron", new Range(60.0, 70.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Temporal", new Range(70.0, 80.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN)); 
        plot.addInterval(new MeterInterval("Temporal", new Range(80.0, 90.0), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.addInterval(new MeterInterval("Temporal", new Range(90.0,100), 
                Color.RED, new BasicStroke(2.0f), Color.CYAN));
        plot.setMeterAngle(330);
        plot.setDialOutlinePaint(Color.blue);
        plot.setUnits("Km/h");
        JFreeChart chart1 = new JFreeChart(titulo, 
                JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        plot.setNeedlePaint(Color.GRAY);
        return chart1;
    }
    
    public JPanel createDemoPanel(Double dato, String titulo) {
        dataset = new DefaultValueDataset(dato);
        chart = createChart(dataset, titulo);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new ChartPanel(chart));        
        return panel;
    }
}

