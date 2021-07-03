
package est_meteor;

import Intrumentos_Virtuales.Termometro;
import Intrumentos_Virtuales.Tanque;
import Intrumentos_Virtuales.Solarimetro;
import Intrumentos_Virtuales.HumedadR;
import Intrumentos_Virtuales.Brujula;
import Intrumentos_Virtuales.Barometro;
import Intrumentos_Virtuales.Anemometro;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author LUIS GER
 */
public class Multimetro_Virtual {
    BufferedImage im;
    Config_ser_port port;
    double      datos[] = null;//{0,0,0,0,0,0,0,0};
    Termometro  termom1;
    Termometro  termom2;
    Barometro   presion;
    Anemometro  vel_vto;
    Solarimetro rad_sol;
    Brujula     dir_vto;
    HumedadR    hum_rel;
    Tanque      prectcn;
    int         ancho;
    int         largo;
    Graphics2D  g;
    Graphics2D  g2;
    double      calibracion_velvto;
    public Multimetro_Virtual(int x1, int y1){
        ancho = (int)(x1/4);
        largo = (int)(y1/2);
        im = new BufferedImage(x1,y1,BufferedImage.TYPE_INT_BGR);        
        leo_datos();
        hallo_datos();
        visualizo_datos();
    }
    void leo_datos(){
        port = new Config_ser_port();
        port.Uart_Init();
        datos = new double[8];
        String msn = port.leer_datos();
        if(msn==null){
            datos[0]=0.0;
            datos[1]=0.0;
            datos[2]=0.0;
            datos[3]=0.0;
            datos[4]=0.0;
            datos[5]=0.0;
            datos[6]=0.0;
            datos[7]=0.0;
            //datos = null;
        }else{
            datos = port.interpreto_cadena(msn);
            port.cerrar_puerto();
        }                
    }
    void hallo_datos(){
        //Temperatura Superficial --> listo
        try{if(datos==null){
            datos[0]=0.0D;
            datos[1]=0.0D;
            datos[2]=0.0D;
            datos[3]=0.0D;
            datos[4]=0.0D;
            datos[5]=0.0D;
            datos[6]=0.0D;
            datos[7]=0.0D;//datos = null;
        }//else{
        
        datos[0] = (datos[0]*(5.0/1024.0))*100.0-273.0;
        //Temperatura Ambiente --> listo
        datos[1] = (5.0/1024.0)*datos[1]*100.0-273.0;
        //Presión Atmosférica
        datos[2] = ((5.0/1024.0)*datos[2]*0.01*1500.0)+980.0;
        //Velocidad del Viento
        datos[3] = (5.0/1024.0)*datos[3]; //+ calibracion_velvto;
        //Radiación Solar
        datos[4] = (5.0/1024.0)*datos[4];
        //Dirección del Viento
        if(datos[5]==1.0){datos[5]=0;}//N
        if(datos[5]==2.0){datos[5]=45;}//NE
        if(datos[5]==3.0){datos[5]=22.5;}//NNE
        if(datos[5]==4.0){datos[5]=90;}//E
        if(datos[5]==6.0){datos[5]=67.5;}//ENE
        if(datos[5]==8.0){datos[5]=135;}//SE
        if(datos[5]==12.0){datos[5]=112.5;}//ESE
        if(datos[5]==16.0){datos[5]=180;}//S
        if(datos[5]==24.0){datos[5]=157.5;}//SSE
        if(datos[5]==32.0){datos[5]=225;}//SO
        if(datos[5]==48.0){datos[5]=202.5;}//SSO
        if(datos[5]==64.0){datos[5]=270;}//O
        if(datos[5]==96.0){datos[5]=247.5;}//OSO
        if(datos[5]==128.0){datos[5]=315;}//NO
        if(datos[5]==129.0){datos[5]=337.5;}//NNO
        if(datos[5]==192.0){datos[5]=292.5;}//ONO
        //else{datos[5]=0.0;}
        //Humedad Relativa
        if(datos[6]!=0){
        datos[6] = 1.0/(datos[6]*200e-9);//Frecuencia en Hz
        datos[6] = -6.479e-6*datos[6]*datos[6]+0.01005*datos[6]+275.0+1.0849;
        if(datos[6]<0.0)
            datos[6]=0.0;
        if(datos[6]>100.0)
            datos[6]=100.0;
        }
        //Precipitación
        datos[7] = datos[7]*0.8; //tiempo del pulso en alto
        datos[7] = datos[7]*0.4/58.3;//Distancia en cm
        datos[7] = datos[7]*10.0;//-5.0772;//Distancia en mm
        datos[7] = (datos[7])*1.0;//mm3 de agua en el recipiente
        //datos[7] = datos[7]*area_recepcion_en_m2//precipitación en el area de recepción
        
        
        //......Continuara....
        //}
        }catch (Exception ex) {
            System.out.println("Y aqui que???");
            //System.out.println(ex);
        }
    }
    void visualizo_datos(){
        //try{
        //if(datos!=null){
        termom1 = new Termometro("Temperatura Superficial (°C)",datos[0]);
        termom2 = new Termometro("Temperatura Ambiente (°C)",datos[1]);
        presion = new Barometro("Presión Atmosferica (mBar)",datos[2]);
        vel_vto = new Anemometro("Velocidad del Viento (Km/h)",datos[3]);
        rad_sol = new Solarimetro("Radiación Solar (KW/m²)",datos[4]);
        dir_vto = new Brujula("Dirección del Viento",datos[5]);
        hum_rel = new HumedadR("Humedad Relativa (%)",datos[6]);
        prectcn = new Tanque("Precipitación (mm³/m²)",ancho,largo,(int)datos[7],500);
        BufferedImage im2 = 
                termom1.jfreechart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);//.createBufferedImage(ancho, largo,BufferedImage.TYPE_INT_BGR);
        g = (Graphics2D)im.createGraphics();
        im.getSubimage(0, 0, ancho, largo).setData(im2.getData());
        im2 = termom2.jfreechart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);
        im.getSubimage(ancho, 0, ancho, largo).setData(im2.getData());
        im2 = presion.chart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);
        im.getSubimage(ancho*2, 0, ancho, largo).setData(im2.getData());
        im2 = vel_vto.chart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);
        im.getSubimage(ancho*3, 0, ancho, largo).setData(im2.getData());
        im2 = rad_sol.chart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);
        im.getSubimage(0, largo, ancho, largo).setData(im2.getData());
        im2 = dir_vto.chart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);
        im.getSubimage(ancho, largo, ancho, largo).setData(im2.getData());
        im2 = hum_rel.chart.createBufferedImage(ancho, largo, BufferedImage.TYPE_INT_RGB,null);
        im.getSubimage(ancho*2, largo, ancho, largo).setData(im2.getData());
        im2 = prectcn.im;
        im.getSubimage(ancho*3, largo, ancho, largo).setData(im2.getData());
        /*}catch (Exception ex) {
            System.out.println("Aqui es el error");
            //System.out.println(ex);
        }*/
        /*}else{
            datos = null;
        }*/
    }
    
}
