/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Intrumentos_Virtuales;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.DialShape;
import org.jfree.chart.plot.MeterInterval;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A simple demonstration application showing how to create a meter chart.
 */
public class HumedadR extends ApplicationFrame {

    private static DefaultValueDataset dataset;
    public JFreeChart chart;
    
    /**
     * Creates a new demo.
     *
     * @param title  the frame title.
     */
    public HumedadR(String titulo, Double dato) {
        super(titulo);
        JPanel chartPanel = createDemoPanel(dato, titulo);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }
    
    /**
     * Creates a sample chart.
     * 
     * @param dataset  a dataset.
     * 
     * @return The chart.
     */
    private static JFreeChart createChart(ValueDataset dataset, String titulo) {
        MeterPlot plot = new MeterPlot(dataset);
        plot.setRange(new Range(0, 100));
        plot.addInterval(new MeterInterval("Bajo", new Range(0.0, 35.0), 
                Color.lightGray, new BasicStroke(2.0f), 
                new Color(255, 255, 0, 64)));
        plot.addInterval(new MeterInterval("Normal", new Range(35.0, 70.0), 
                Color.lightGray, new BasicStroke(2.0f), new Color(0, 255, 0, 64)));
        plot.addInterval(new MeterInterval("Saturado", new Range(70.0, 100.0), 
                Color.lightGray, new BasicStroke(2.0f), 
                new Color(0, 0, 255, 200)));
        plot.setNeedlePaint(Color.darkGray);
        plot.setDialBackgroundPaint(Color.white);
        plot.setDialOutlinePaint(Color.gray);
        plot.setDialShape(DialShape.CHORD);
        plot.setMeterAngle(300);
        plot.setTickLabelsVisible(true);
        plot.setTickLabelFont(new Font("Dialog", Font.BOLD, 10));
        plot.setTickLabelPaint(Color.darkGray);
        plot.setTickSize(5.0);
        plot.setTickPaint(Color.lightGray);
        
        plot.setValuePaint(Color.black);
        plot.setValueFont(new Font("Dialog", Font.BOLD, 14));
        plot.setUnits("%");
        JFreeChart chart1 = new JFreeChart(titulo, 
                JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        return chart1;
    }
    
    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public /*static*/ JPanel createDemoPanel(Double valor, String titulo) {
        dataset = new DefaultValueDataset(valor);
        /*JFreeChart*/ chart = createChart(dataset, titulo);
        JPanel panel = new ChartPanel(chart);
        return panel;
    }
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
   /* public static void main(String[] args) {
        MeterChartDemo demo = new MeterChartDemo("Meter Chart Demo 1");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }*/

}
