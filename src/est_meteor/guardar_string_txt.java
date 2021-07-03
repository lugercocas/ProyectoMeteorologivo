/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package est_meteor;
import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LUIS GER
 */
public class guardar_string_txt {
 public   void guardar_strin_txt(Date tiempo, double[] datos){
      saveString(tiempo, datos);      
    }
    public static void saveString(Date tiempo, double[] datos){
        String titulos = "Tiempo"
                +"                   T_s °C"
                +"    T_a °C"
                +"   P_a mBar"
                +" Vv Km/h"
                +" Rs W/m^2"
                +"  D_v °"
                +"    Hr %"
                +"    Prtcn mm"
                ;
        //Obtengo el nombre del archivo que es la fecha actual
        SimpleDateFormat sdf=new java.text.SimpleDateFormat("dd/MM/yyyy");
        String nombre_archivo = sdf.format(tiempo).replace('/', '_');        
        //Obtengo la hora del dia que sera la referencia de la variable
        SimpleDateFormat sdf2=new java.text.SimpleDateFormat("hh:mm:ss");
        String time = sdf2.format(tiempo);
        //limito las cifras significativas a solo 2 numeros
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //Obtengo la cadena de datos Aplicando el formato a cada variable y reemplazando
        //la coma por el punto
        String datos_im = tiempo.toLocaleString()
                +"    "+nf.format(datos[0]).replace(',', '.')
                +"    "+nf.format(datos[1]).replace(',', '.')
                +"    "+nf.format(datos[2]).replace(',', '.')
                +"    "+nf.format(datos[3]).replace(',', '.')
                +"    "+nf.format(datos[4]).replace(',', '.')
                +"    "+nf.format(datos[5]).replace(',', '.')
                +"    "+nf.format(datos[6]).replace(',', '.')
                +"    "+nf.format(datos[7]).replace(',', '.')
                ;
        
        try{
            File nombre_txt = new File(nombre_archivo+".txt");
            int a = 0;
            if(nombre_txt.exists())a = 1;
            else a=0;
            FileWriter archivo = new FileWriter(nombre_txt,true);//true: escribe al final de la linea
                                                                 //false: sobrescribe lo que hay o lo actualiza
            PrintWriter fileOut = new PrintWriter(archivo);                      
            if(a==0)fileOut.println(titulos);
            fileOut.println(datos_im);            
            fileOut.close();            
        }catch (IOException ex){
            System.err.println(ex);
        }
        
    }    
    public String[] leer_string_txt(String nombre){
        String texto = "";
        String sCadena;        
        int a = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(nombre));           
            try {
                while ((sCadena = bf.readLine())!=null) {                
                a++;
                }  
                bf.close();
            } catch (IOException ex) {                
                Logger.getLogger(guardar_string_txt.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Ojo un erro al leer");
            Logger.getLogger(guardar_string_txt.class.getName()).log(Level.SEVERE, null, ex);
        }
        //.................................
        String[] sCadena2 = new String[a];
        a = 0;
        try {            
            BufferedReader bf2 = new BufferedReader(new FileReader(nombre));
            try {
                while (a<sCadena2.length) { 
                    sCadena2[a] = bf2.readLine();
                    a++;
                    }
                bf2.close();
            } catch (IOException ex) {
                System.out.println("Quuue pasa");
                Logger.getLogger(guardar_string_txt.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Quuue pasa2");
            Logger.getLogger(guardar_string_txt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sCadena2;
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
//mtcn0929691139 wester junior 172765
}

