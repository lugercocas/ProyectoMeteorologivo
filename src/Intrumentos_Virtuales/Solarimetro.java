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
public class Solarimetro extends ApplicationFrame {

    private static DefaultValueDataset dataset;
    public JFreeChart chart;
    
    /**
     * Creates a new demo.
     *
     * @param title  the frame title.
     */
    public Solarimetro(String titulo, Double dato) {
        super(titulo);
        JPanel chartPanel = createDemoPanel(dato, titulo);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);
    }

    private static JFreeChart createChart(ValueDataset dataset, String titulo) {
        MeterPlot plot = new MeterPlot(dataset);
        plot.setRange(new Range(0, 1373));
        plot.addInterval(new MeterInterval("Poco", new Range(0.0, 150.0), 
                Color.yellow, new BasicStroke(2.0f), 
                Color.YELLOW/*new Color(0, 255, 0, 64)*/));
        plot.addInterval(new MeterInterval("Normal", new Range(150.0, 800.0), 
                Color.orange, new BasicStroke(2.0f), Color.orange/*new Color(255, 255, 0, 64)*/));
        plot.addInterval(new MeterInterval("Alto", new Range(800.0, 1373.0), 
                Color.lightGray, new BasicStroke(2.0f), 
                Color.red/*new Color(255, 0, 0, 128)*/));
        plot.setNeedlePaint(Color.darkGray);
        plot.setDialBackgroundPaint(Color.white);
        plot.setDialOutlinePaint(Color.gray);
        plot.setDialShape(DialShape.CHORD);
        plot.setMeterAngle(180);
        plot.setTickLabelsVisible(true);
        plot.setTickLabelFont(new Font("Dialog", Font.BOLD, 10));
        plot.setTickLabelPaint(Color.darkGray);
        plot.setTickSize(5.0);
        plot.setTickPaint(Color.lightGray);
        plot.setValuePaint(Color.black);
        plot.setValueFont(new Font("Dialog", Font.BOLD, 14));
        plot.setUnits("KW/m²");
        JFreeChart chart1 = new JFreeChart(titulo, 
                JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        return chart1;
    }
  
    public JPanel createDemoPanel(Double valor, String titulo) {
        dataset = new DefaultValueDataset(valor);
        chart = createChart(dataset, titulo);
        JPanel panel = new ChartPanel(chart);
        return panel;
    }
}

