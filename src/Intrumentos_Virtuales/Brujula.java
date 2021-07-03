
package Intrumentos_Virtuales;


import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CompassPlot;
import org.jfree.data.general.DefaultValueDataset;
import org.jfree.data.general.ValueDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Brujula extends ApplicationFrame {
    public JFreeChart chart;
    public Brujula(String titulo, Double dato) {
        super(titulo);
        ValueDataset dataset = new DefaultValueDataset(new Double(dato));
        JFreeChart chart = createChart(dataset, titulo);        
        // add the chart to a panel...
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        chartPanel.setEnforceFileExtensions(false);
        setContentPane(chartPanel);
    }    
    private /*static*/ JFreeChart createChart(ValueDataset dataset, String titulo) {        
        CompassPlot plot = new CompassPlot(dataset);
        plot.setSeriesNeedle(9);
        plot.setSeriesPaint(0, Color.red);
        plot.setSeriesOutlinePaint(0, Color.red);
        plot.setRoseHighlightPaint(Color.cyan);
        plot.setDrawBorder(true);
        /*JFreeChart*/ chart = new JFreeChart(titulo,plot);
        return chart;        
    }
   /* public JPanel createDemoPanel(String titulo, Double dato) {
        chart = createChart(new DefaultValueDataset(new Double(dato)),titulo);
        return new ChartPanel(chart);
    }*/
}

