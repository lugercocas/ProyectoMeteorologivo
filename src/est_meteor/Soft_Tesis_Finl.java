package est_meteor;

import gGraficas.chart_osc_2;
import gGraficas.grafficarr;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.TableView.TableRow;

public class Soft_Tesis_Finl extends javax.swing.JFrame {
    /**
     * Creates new form Soft_Tesis_Finl
     */   
    /*Variables*/
    Config_ser_port comm;
    int i = 0;
    int ban = 0;
    Timer timer = new Timer();
    int h = 0;
    int muestreo = 0;
    Boolean ban0 = true;
    Date tt11;
    int j = 0;
    Multimetro_Virtual mm;
    String[] texto;
    double[] ts1;
    double[] ta1;
    double[] pa1;
    double[] vv1;
    double[] rs1;
    double[] dv1;
    double[] hr1;
    double[] pr1;
    String[] tmp;
    public Soft_Tesis_Finl() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        monitor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        ts = new javax.swing.JTextField();
        ti = new javax.swing.JTextField();
        pra = new javax.swing.JTextField();
        ta = new javax.swing.JTextField();
        vv = new javax.swing.JTextField();
        rs = new javax.swing.JTextField();
        dv = new javax.swing.JTextField();
        hr = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        conectar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_texto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        terminar = new javax.swing.JButton();
        iniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        medidores_graficos = new javax.swing.JPanel();
        meter_med = new javax.swing.JLabel();
        graficas = new javax.swing.JPanel();
        osciloscopio = new javax.swing.JLabel();
        graficar = new javax.swing.JButton();
        opcion_grafica1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        fuente = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        tablas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla1_dir = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        reportes = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        report_txt = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        sal0 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        sal1 = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        extraer_variable = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        sal3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        sal2 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        sal5 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        sal4 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        sal7 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        sal6 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        sal8 = new javax.swing.JTextArea();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADQUISICIÓN Y TRATAMIENTO DE DATOS METEOROLÓGICOS");
        setMaximumSize(new java.awt.Dimension(1366, 689));

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        monitor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Variables", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bell MT", 3, 14), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel3.setText("Tiempo:");

        jLabel4.setText("Temperatura Superficial:");

        jLabel5.setText("Presión Atmosférica:");

        jLabel6.setText("Temperatura Ambiente:");

        jLabel7.setText("Velocidad del Viento:");

        jLabel8.setText("Radiación Solar:");

        jLabel9.setText("Dirección del Viento:");

        jLabel10.setText("Humedad Relativa:");

        jLabel11.setText("Precipitación:");

        jLabel13.setText("dd/mm/aa hh:mm:ss");

        jLabel14.setText("°C");

        jLabel15.setText("°C");

        jLabel16.setText("mBar");

        jLabel17.setText("Km/h");

        jLabel18.setText("W/m^2");

        jLabel19.setText("°");

        jLabel21.setText("%");

        jLabel23.setText("mm");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rs, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel23)))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        conectar.setText("Conectar");
        conectar.setToolTipText("Cerrar");
        conectar.setMultiClickThreshhold(2L);
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        campo_texto.setColumns(20);
        campo_texto.setRows(5);
        campo_texto.setWrapStyleWord(true);
        campo_texto.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setViewportView(campo_texto);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("MONITOR SERIAL");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel2)
                        .addGap(0, 229, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(conectar)
                .addGap(20, 20, 20))
        );

        conectar.getAccessibleContext().setAccessibleDescription("");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        terminar.setText("Terminar");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        iniciar.setText("Iniciar");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminar)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar)
                    .addComponent(terminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tiempo de Muestreo en minutos");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10", "15", "20", "30" }));
        jComboBox1.setEnabled(false);

        jRadioButton2.setText("Habilitar");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jRadioButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout monitorLayout = new javax.swing.GroupLayout(monitor);
        monitor.setLayout(monitorLayout);
        monitorLayout.setHorizontalGroup(
            monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(monitorLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        monitorLayout.setVerticalGroup(
            monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(monitorLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(monitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Monitor", monitor);

        medidores_graficos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        meter_med.setBackground(new java.awt.Color(255, 255, 255));
        meter_med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/est_meteor/med_graf_ini.png"))); // NOI18N
        meter_med.setOpaque(true);

        javax.swing.GroupLayout medidores_graficosLayout = new javax.swing.GroupLayout(medidores_graficos);
        medidores_graficos.setLayout(medidores_graficosLayout);
        medidores_graficosLayout.setHorizontalGroup(
            medidores_graficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medidores_graficosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meter_med, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
                .addContainerGap())
        );
        medidores_graficosLayout.setVerticalGroup(
            medidores_graficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medidores_graficosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meter_med, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medidores Graficos", medidores_graficos);

        graficas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        osciloscopio.setBackground(new java.awt.Color(255, 255, 255));
        osciloscopio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/est_meteor/graficas.png"))); // NOI18N
        osciloscopio.setOpaque(true);

        graficar.setText("Graficar");
        graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarActionPerformed(evt);
            }
        });

        opcion_grafica1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Temperatura Superficial", "Temperatura Ambiental", "Presión Atmosférica", "Velocidad del Viento", "Radiación Solar", "Direccion del Viento", "Humedad Relativa", "Precipitación" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("Variable:");

        fuente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puerto", "Archivo" }));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Fuente de datos");

        javax.swing.GroupLayout graficasLayout = new javax.swing.GroupLayout(graficas);
        graficas.setLayout(graficasLayout);
        graficasLayout.setHorizontalGroup(
            graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graficasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(graficasLayout.createSequentialGroup()
                        .addComponent(osciloscopio, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graficasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcion_grafica1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))))
        );
        graficasLayout.setVerticalGroup(
            graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graficasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(osciloscopio, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(graficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(opcion_grafica1)
                        .addComponent(graficar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(fuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gráficas", graficas);

        tablas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        tabla1_dir.setAutoCreateRowSorter(true);
        tabla1_dir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tiempo", "Temperatura Superficial", "Temperatura Ambiente", "Presión Atmosferica", "Velocidad del Viento", "Radiación Solar", "Dirección del Viento", "Humedad Relativa", "Precipitación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla1_dir.setColumnSelectionAllowed(true);
        tabla1_dir.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla1_dir);
        tabla1_dir.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel20.setFont(new java.awt.Font("Tandelle", 1, 24)); // NOI18N
        jLabel20.setText("Datos Recebidos");

        javax.swing.GroupLayout tablasLayout = new javax.swing.GroupLayout(tablas);
        tablas.setLayout(tablasLayout);
        tablasLayout.setHorizontalGroup(
            tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablasLayout.createSequentialGroup()
                .addGroup(tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablasLayout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tablasLayout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 730, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tablasLayout.setVerticalGroup(
            tablasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tablas", tablas);

        reportes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        report_txt.setColumns(20);
        report_txt.setRows(5);
        jScrollPane4.setViewportView(report_txt);

        jLabel12.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jLabel12.setText("Datos de entrada");

        jButton2.setText("Cargar Datos...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        sal0.setColumns(20);
        sal0.setRows(5);
        jScrollPane3.setViewportView(sal0);

        sal1.setColumns(20);
        sal1.setRows(5);
        jScrollPane5.setViewportView(sal1);

        jLabel24.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Tiempo");

        extraer_variable.setText("Extraer Variables");
        extraer_variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraer_variableActionPerformed(evt);
            }
        });

        sal3.setColumns(20);
        sal3.setRows(5);
        jScrollPane6.setViewportView(sal3);

        sal2.setColumns(20);
        sal2.setRows(5);
        jScrollPane7.setViewportView(sal2);

        sal5.setColumns(20);
        sal5.setRows(5);
        jScrollPane8.setViewportView(sal5);

        sal4.setColumns(20);
        sal4.setRows(5);
        jScrollPane9.setViewportView(sal4);

        sal7.setColumns(20);
        sal7.setRows(5);
        jScrollPane10.setViewportView(sal7);

        sal6.setColumns(20);
        sal6.setRows(5);
        jScrollPane11.setViewportView(sal6);

        sal8.setColumns(20);
        sal8.setRows(5);
        jScrollPane12.setViewportView(sal8);

        jLabel27.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel27.setText("Temperatura");

        jLabel28.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel28.setText("Superficial");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel29.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel29.setText("Temperatura");

        jLabel30.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel30.setText("Ambiental");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel31.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel31.setText("Presión");

        jLabel32.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel32.setText("Atmosférica");
        jLabel32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel33.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel33.setText("Velocidad");

        jLabel34.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel34.setText("Viento");
        jLabel34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel35.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel35.setText("Radiación");

        jLabel36.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel36.setText("Solar");
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel37.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel37.setText("Dirección");

        jLabel38.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel38.setText("Viento");
        jLabel38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel39.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel39.setText("Humedad");

        jLabel40.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel40.setText("Relativa");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel41.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel41.setText("Precipitación");

        javax.swing.GroupLayout reportesLayout = new javax.swing.GroupLayout(reportes);
        reportes.setLayout(reportesLayout);
        reportesLayout.setHorizontalGroup(
            reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesLayout.createSequentialGroup()
                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportesLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jButton2)
                        .addGap(134, 134, 134)
                        .addComponent(jButton3)
                        .addGap(206, 206, 206)
                        .addComponent(extraer_variable))
                    .addGroup(reportesLayout.createSequentialGroup()
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        reportesLayout.setVerticalGroup(
            reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportesLayout.createSequentialGroup()
                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reportesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(reportesLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30))
                            .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel24))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reportesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38))
                            .addGroup(reportesLayout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel40))
                            .addComponent(jLabel41))))
                .addGap(18, 18, 18)
                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(extraer_variable))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Importar", reportes);

        jMenu1.setText("Archivo");

        cerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        monitor m;        
        if(conectar.getText()=="Conectar"){
            conectar.setText("Desconectar");
            h = 0;
            ban0 = true;
            campo_texto.setText(campo_texto.getText()+evt.getActionCommand()+"\n");
            m = new monitor("hilo1");
            m.start();
        }else{             
            conectar.setText("Conectar");
            ban0 = false;
            m = null;                        
        }        
    }//GEN-LAST:event_conectarActionPerformed

    void leo_datos_serial(){
        Date tt = new Date();
        if(i<100){
        //try{
        int x1 = meter_med.getWidth();
        int y1 = meter_med.getHeight();
        /*Multimetro_Virtual*/ mm = new Multimetro_Virtual(x1,y1);
        if(mm.datos==null)ban = 1;        
        String tiempo = tt.toLocaleString();
        ti.setText(tiempo);        
        meter_med.setIcon(new ImageIcon(mm.im));
        ts.setText(String.valueOf(mm.datos[0]));
        ta.setText(String.valueOf(mm.datos[1]));
        pra.setText(String.valueOf(mm.datos[2]));
        vv.setText(String.valueOf(mm.datos[3]));
        rs.setText(String.valueOf(mm.datos[4]));
        dv.setText(String.valueOf(mm.datos[5]));
        hr.setText(String.valueOf(mm.datos[6]));
        pre.setText(String.valueOf(mm.datos[7])); 
        //-----------------------------------
        //Guardo los datos en un archivo txt
        guardar_string_txt gtxt = new guardar_string_txt();
        gtxt.guardar_strin_txt(tt, mm.datos);
        //-----------------------------------
            if(i==0){
                tabla1_dir.setValueAt(ti.getText(), i, 0);
                tabla1_dir.setValueAt((double)mm.datos[0], i, 1);
                tabla1_dir.setValueAt((double)mm.datos[1], i, 2);
                tabla1_dir.setValueAt((double)mm.datos[2], i, 3);
                tabla1_dir.setValueAt((double)mm.datos[3], i, 4);
                tabla1_dir.setValueAt((double)mm.datos[4], i, 5);
                tabla1_dir.setValueAt(String.valueOf(mm.datos[5]), i, 6);
                tabla1_dir.setValueAt((double)mm.datos[6], i, 7);
                tabla1_dir.setValueAt((double)mm.datos[7], i, 8);
                i++;
            }else{
                if(ti.getText()!= String.valueOf(tabla1_dir.getValueAt(i-1, 0))){
                    tabla1_dir.setValueAt(ti.getText(), i, 0);
                    tabla1_dir.setValueAt((double)mm.datos[0], i, 1);
                    tabla1_dir.setValueAt((double)mm.datos[1], i, 2);
                    tabla1_dir.setValueAt((double)mm.datos[2], i, 3);
                    tabla1_dir.setValueAt((double)mm.datos[3], i, 4);
                    tabla1_dir.setValueAt((double)mm.datos[4], i, 5);
                    tabla1_dir.setValueAt(String.valueOf(mm.datos[5]), i, 6);
                    tabla1_dir.setValueAt((double)mm.datos[6], i, 7);
                    tabla1_dir.setValueAt((double)mm.datos[7], i, 8);
                    i++;
                }
            } 
        }else{
            //Borrar la tabla promediar datos e inicializar i=0
            //Almaceno en memoria temporal los datos
            String[] tiem_r = new String[100];
            double[] temp_s = new double[100];
            double[] temp_a = new double[100];
            double[] prec_a = new double[100];
            double[] velc_v = new double[100];
            double[] radi_s = new double[100];
            double[] dirc_v = new double[100];
            double[] hume_r = new double[100];
            double[] pres_a = new double[100];
            for(int g = 0; g<100;g++){
                tiem_r[g]=(String)tabla1_dir.getValueAt(g,0);                        
                temp_s[g]=(double)tabla1_dir.getValueAt(g,1);                        
                temp_a[g]=(double)tabla1_dir.getValueAt(g,2);                        
                prec_a[g]=(double)tabla1_dir.getValueAt(g,3);                        
                velc_v[g]=(double)tabla1_dir.getValueAt(g,4);                        
                radi_s[g]=(double)tabla1_dir.getValueAt(g,5);                        
                dirc_v[g]=Double.valueOf((String)tabla1_dir.getValueAt(g,6)); 
                hume_r[g]=(double)tabla1_dir.getValueAt(g,7);                        
                pres_a[g]=(double)tabla1_dir.getValueAt(g,8);                 
            }
            limpio_tabla();
            j=1;
            i=0;            
        } 
        //Secuencia de tiempo
        //Periodo de muestreo
        int m = 0;
        int valor_pas = 0;
        while(m<muestreo && ban == 0){
        SimpleDateFormat sdf4=new SimpleDateFormat("mm");        
        int minutos = Integer.valueOf(sdf4.format(tt));      
        if(valor_pas==0)valor_pas = minutos;
        if(minutos!=valor_pas){
            m++;
            if(m!=muestreo)valor_pas = minutos;
        }
        tt = new Date();
      }
}
    
    private void limpio_tabla(){
       for(int g = 0; g<100;g++){
                tabla1_dir.setValueAt(null, g, 0);
                tabla1_dir.setValueAt(null, g, 1);
                tabla1_dir.setValueAt(null, g, 2);
                tabla1_dir.setValueAt(null, g, 3);
                tabla1_dir.setValueAt(null, g, 4);
                tabla1_dir.setValueAt(null, g, 5);
                tabla1_dir.setValueAt(null, g, 6);
                tabla1_dir.setValueAt(null, g, 7);
                tabla1_dir.setValueAt(null, g, 8);
            } 
    }    
    
    private double getPromedioDouble(double numero[]){
        double promedio = 0.0;
        int l = numero.length;
        for(int g = 0;g<l;g++){
            promedio = numero[g]+promedio;
        }
        promedio = promedio/((double)l);
        return promedio;
    }    
    
    private double getMaxDouble(double numero[]){
        double max_num = 0.0;
        int l = numero.length;
        for(int g = 0;g<l;g++){
            if(g==0)max_num=numero[0];
            else{
                if(numero[g-1]<=numero[g])
                    max_num=numero[g];
                else
                    max_num=numero[g-1];                
            }
        }
        return max_num;
    }  
    
    private double getMinDouble(double numero[]){
        double min_num = 0.0;
        int l = numero.length;
        for(int g = 0;g<l;g++){
            if(g==0)min_num=numero[0];
            else{
                if(numero[g-1]<=numero[g])
                    min_num=numero[g-1];
                else
                    min_num=numero[g];                
            }
        }
        return min_num;
    }    
    
    public class monitor extends Thread{
        public monitor(String t2){
            super(t2);
        }
        public void run(){            
            while(ban0){                
                if(h<=80){
                   comm = new Config_ser_port();
                   comm.Uart_Init();
                   if(comm.bandera==0){
                       ban0=false;
                       conectar.setText("Conectar");
                       campo_texto.setText(campo_texto.getText()+comm.leer_caracter()+"\n");
                       campo_texto.show();
                   }else{
                   campo_texto.setText(campo_texto.getText()+comm.leer_caracter());
                   comm.cerrar_puerto();
                   h++;}
                }else{
                   campo_texto.setText(campo_texto.getText()+"\n");
                   h = 0;
                }
                if(ban0==false){
                    campo_texto.setText(campo_texto.getText()+"\n"+"Puerto Cerrado..."+"\n");
                }
            }
        }
    }
    
    public class ejecfun1 extends Thread{
        public ejecfun1(String t){
            super(t);
        }
        public void  run(){
            while(ban==0){
                try{
                leo_datos_serial();                
                }catch (Exception ex){
                    /*if(mm.datos==null && i<=1 && j == 0)ban = 1;*/
                    /*else*/ ban = 0;                    
                }
            }
        }
    }
    
    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
        conectar.disable();//.enable(false);
        jRadioButton2.disable();//.enable(false);
        if(jRadioButton2.isSelected()){
            if(jComboBox1.getSelectedIndex()==0){
                muestreo = 1;
                System.out.println("1");
            }else{
                if(jComboBox1.getSelectedIndex()==1){
                    muestreo = 5;
                    System.out.println("5");
                }else{
                    if(jComboBox1.getSelectedIndex()==2){
                        muestreo = 10;
                        System.out.println("10");
                    }else{
                        if(jComboBox1.getSelectedIndex()==3){
                            muestreo = 15;
                            System.out.println("15");
                        }else{
                            if(jComboBox1.getSelectedIndex()==4){
                                muestreo = 20;
                                System.out.println("20"); 
                            }else{
                                if(jComboBox1.getSelectedIndex()==5){
                                    muestreo = 30;
                                    System.out.println("30"); 
                                } 
                                }
                            }
                        }
                    }
                }
            }
        else{
            muestreo = 0;
        }       
        if(ban==1)ban=0;
        ejecfun1 f1 = new ejecfun1("M");
        f1.start();
    }//GEN-LAST:event_iniciarActionPerformed
    
    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        ban=1;
        conectar.enable(true);
        jRadioButton2.enable(true);
    }//GEN-LAST:event_terminarActionPerformed

    private void graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarActionPerformed
        if(fuente.getSelectedItem().toString()=="Puerto"){
        int ancho = osciloscopio.getWidth();
        int largo = osciloscopio.getHeight();
        String[] Dx;
        double[] Dy;
        if(i>0){        
        Dx = new String[i];
        Dy = new double[i];                        
        for(int ii = 0;ii <= i-1;ii++){           
            Dx[ii] = (String)tabla1_dir.getValueAt(ii, 0);            
        }        
        String opcion = opcion_grafica1.getSelectedItem().toString();
        if(opcion=="Temperatura Superficial"){
            for(int jj = 0;jj <= i-1;jj++){
                Dy[jj] = (double) tabla1_dir.getValueAt(jj, 1);
                //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Temperatura Ambiental"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double) tabla1_dir.getValueAt(jj, 2);
            //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Presión Atmosférica"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double) tabla1_dir.getValueAt(jj, 3);
            //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Velocidad del Viento"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double) tabla1_dir.getValueAt(jj, 4);
            //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Radiación Solar"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double) tabla1_dir.getValueAt(jj, 5);
            //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Direccion del Viento"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double)Double.valueOf(tabla1_dir.getValueAt(jj, 6).toString());
            //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Humedad Relativa"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double) tabla1_dir.getValueAt(jj, 7);
            //System.out.println(Dy[jj]);
            }
        }
        if(opcion=="Precipitación"){
            for(int jj = 0;jj <= i-1;jj++){
            Dy[jj] = (double) tabla1_dir.getValueAt(jj, 8);
            //System.out.println(Dy[jj]);
            }
        }
        try{
        chart_osc_2 grafica1 = new chart_osc_2(opcion,
                "Tiempo",
                "Valor",
                Dx,Dy,ancho,largo);        
        osciloscopio.setIcon(grafica1.ic);
        //System.out.println(i);
        }catch(Exception ex){            
            System.out.println("No se pudo graficar disque porque hay datos repetidos");            
            System.out.println(Dx);
        }
        }else{
            JOptionPane.showMessageDialog(null,"No hay datos disponibles.");
        }
        }else{
            if(tmp!=null){
            int ancho = osciloscopio.getWidth();
            int largo = osciloscopio.getHeight();
            String[] Dxx = new String[tmp.length];
            double[] Dyy = new double[tmp.length];
            Dxx = tmp;
            String opcion = opcion_grafica1.getSelectedItem().toString();
        if(opcion=="Temperatura Superficial"){
                Dyy = ts1;
        }
        if(opcion=="Temperatura Ambiental"){
            Dyy = ta1;           
        }
        if(opcion=="Presión Atmosférica"){            
            Dyy = pa1;
        }
        if(opcion=="Velocidad del Viento"){            
            Dyy =vv1;                    
        }
        if(opcion=="Radiación Solar"){
            Dyy = rs1;
        }
        if(opcion=="Direccion del Viento"){
            Dyy = dv1;
        }
        if(opcion=="Humedad Relativa"){
            Dyy = hr1;
        }
        if(opcion=="Precipitación"){
            Dyy = pr1;
        }
        chart_osc_2 grafica1 = new chart_osc_2(opcion,
                "Tiempo",
                "Valor",
                Dxx,Dyy,ancho,largo);        
        osciloscopio.setIcon(grafica1.ic);
            }else{
              JOptionPane.showMessageDialog(null,"No ha cargado los datos del archivo");  
            }
        }
    }//GEN-LAST:event_graficarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setApproveButtonText("Cargar datos...");
        chooser.showDialog(reportes, null);        
        File archivo = chooser.getSelectedFile();
        String nombre = archivo.toString();        
        guardar_string_txt leo_archivo = new guardar_string_txt();
        texto = leo_archivo.leer_string_txt(nombre);
        int aa= 0;
        while(aa<texto.length){           
           report_txt.setText(report_txt.getText()+texto[aa]+"\n");                      
           aa++;
        }              
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        report_txt.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
      if(jRadioButton2.isSelected())
        jComboBox1.enable(true);                 
      else
        jComboBox1.enable(false);                 
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void extraer_variableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraer_variableActionPerformed
        // TODO add your handling code here:
        extraer_substring();
        int im = 0;
        while(im<=tmp.length-1){
            sal0.setText(sal0.getText()+tmp[im]+"\n");
            sal1.setText(sal1.getText()+String.valueOf(ts1[im])+"\n");
            sal2.setText(sal2.getText()+String.valueOf(ta1[im])+"\n");
            sal3.setText(sal3.getText()+String.valueOf(pa1[im])+"\n");
            sal4.setText(sal4.getText()+String.valueOf(vv1[im])+"\n");
            sal5.setText(sal5.getText()+String.valueOf(rs1[im])+"\n");
            sal6.setText(sal6.getText()+String.valueOf(dv1[im])+"\n");
            sal7.setText(sal7.getText()+String.valueOf(hr1[im])+"\n");
            sal8.setText(sal8.getText()+String.valueOf(pr1[im])+"\n");
            im++;
        }
        
        
    }//GEN-LAST:event_extraer_variableActionPerformed
   
    void extraer_substring(){
        int t = 1;
        tmp = new String[texto.length-1];
        ts1 = new double[texto.length-1];
        ta1 = new double[texto.length-1];
        pa1 = new double[texto.length-1];
        vv1 = new double[texto.length-1];
        rs1 = new double[texto.length-1];
        dv1 = new double[texto.length-1];
        hr1 = new double[texto.length-1];
        pr1 = new double[texto.length-1];
        while(t<=texto.length-1){
           String[] x= texto[t].split(" ");           
           tmp[t-1] = x[0]+" "+x[1]+" "+x[2];//Tiempo
           ts1[t-1] = (double)Double.valueOf(x[6]);  //Temperatura Superficial
           ta1[t-1] = (double)Double.valueOf(x[10]); //Temperatura Ambiental
           pa1[t-1] = (double)Double.valueOf(x[14]); //Presión Atmosféricas
           vv1[t-1] = (double)Double.valueOf(x[18]); //Velocidad del Viento
           rs1[t-1] = (double)Double.valueOf(x[22]); //Radiación Solar
           dv1[t-1] = (double)Double.valueOf(x[26]); //Dirección del Viento
           hr1[t-1] = (double)Double.valueOf(x[30]); //Humedad  Relativa
           pr1[t-1] = (double)Double.valueOf(x[34]); //Precipitación
           t++;           
        }       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Soft_Tesis_Finl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soft_Tesis_Finl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soft_Tesis_Finl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soft_Tesis_Finl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Soft_Tesis_Finl().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea campo_texto;
    private javax.swing.JMenuItem cerrar;
    private javax.swing.JToggleButton conectar;
    private javax.swing.JTextField dv;
    private javax.swing.JButton extraer_variable;
    private javax.swing.JComboBox fuente;
    private javax.swing.JButton graficar;
    private javax.swing.JPanel graficas;
    private javax.swing.JTextField hr;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel medidores_graficos;
    private javax.swing.JLabel meter_med;
    private javax.swing.JPanel monitor;
    private javax.swing.JComboBox opcion_grafica1;
    private javax.swing.JLabel osciloscopio;
    private javax.swing.JTextField pra;
    private javax.swing.JTextField pre;
    private javax.swing.JTextArea report_txt;
    private javax.swing.JPanel reportes;
    private javax.swing.JTextField rs;
    private javax.swing.JTextArea sal0;
    private javax.swing.JTextArea sal1;
    private javax.swing.JTextArea sal2;
    private javax.swing.JTextArea sal3;
    private javax.swing.JTextArea sal4;
    private javax.swing.JTextArea sal5;
    private javax.swing.JTextArea sal6;
    private javax.swing.JTextArea sal7;
    private javax.swing.JTextArea sal8;
    private javax.swing.JTextField ta;
    private javax.swing.JTable tabla1_dir;
    private javax.swing.JPanel tablas;
    private javax.swing.JButton terminar;
    private javax.swing.JTextField ti;
    private javax.swing.JTextField ts;
    private javax.swing.JTextField vv;
    // End of variables declaration//GEN-END:variables
}
