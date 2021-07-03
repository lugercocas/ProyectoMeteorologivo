/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package est_meteor;

import giovynet.nativelink.SerialPort;
import giovynet.serial.Baud;
import giovynet.serial.Com;
import giovynet.serial.Parameters;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author LUIS GERARDO COLLAZOS CASTRO 2012
 */
public class Config_ser_port { 
   SerialPort serialPort = new SerialPort();
   Com com = null;
   int bandera = 0;
   List<String> portFree;
   /**
    * Función que permite inicializar el primer puerto disponible que encuentre 
    * con              los                siguientes                 parámetros:                                            
    * -    4800     bps,     8     bits     de     datos,      sin      paridad.                                 
    * Además      también     abre     el           puerto         seleccionado.                               
    * Ejemplo:                                                                  
    * //Declaro a variable del objeto a utilizar
    *   Config_ser_port comm = new Config_ser_port();
    *   comm.Uart_Init();       //Inicializo el puerto
    *   envio_datos("Cadena");  //envio el Array Cadena
    *   // leo Array 45 caracteres
    *   String data = leer_datos(); 
    *   cerrar_puerto(); //cierro el puerto
    *   //Proceso cadena de caracteres y obtengo las
    *   //variables, donde el formato que tendrá la
    *   //cadena recibida sera:
    *   //data = "i d0 d1 d2 d3 d4 d5 d6 d7 f";
    *   //Donde d0 = temperatura1, d1 = temperatura2, 
    *   //d2 = presión atmosférica, d3 = velocidad del viento,
    *   //d4 = radiación solar, d5 = dirección del viento,
    *   //d6 = humedad relativa, d7 = precipitación.
    *   double var[] = new double[7];
    *   var = interpreto_cadena(data);
    *   //Seguidamente utilizo las variables como quiera.
    */
    void Uart_Init(){
        
        try {
            /*List<String>*/ portFree = serialPort.getFreeSerialPort();
            if (portFree!=null&&portFree.size()>0) {
				for (String free : portFree) {
					System.out.println("Free port: "+free);
				}
				/****Open the port.****/
                                Parameters parameters = new Parameters();
				parameters.setPort(portFree.get(0));
				parameters.setBaudRate(Baud._4800);
				//System.out.println("Abriendo puerto: "+portFree.get(0));
				com = new Com(parameters);
                                bandera = 1;                              
                                }
                            else 
                            {//System.out.println("No hay puertos libres!!!");
                            JOptionPane.showMessageDialog(null,"No Hay Puertos Libres o el \n dispositivo esta desconectado.");
                            }
        } catch (Exception ex) {
            //Logger.getLogger(Config_ser_port.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No Hay Puertos Libres o el \n dispositivo esta desconectado.");
        }             
    }    
    
    void envio_datos(String data){
      if(bandera==1){
      //System.out.println("<Send Data>");
      for (int i = 0; i < data.toCharArray().length; i++) {
	//Thread.sleep(100);
                try {
                    com.sendSingleData(data.toCharArray()[i]);
                } catch (Exception ex) {
                    System.out.println("Error al enviar un caracter");
                    Logger.getLogger(Config_ser_port.class.getName()).log(Level.SEVERE, null, ex);
                }
	//System.out.print(data.toCharArray()[i]);
	}
        //System.out.println("\n<End Send Data>");     
      }
    }
    String leer_caracter(){
        String caracter;
        char cart1;
        if(bandera==1){
        try {
            cart1 = com.receiveSingleChar();
            caracter = String.valueOf(cart1);
        } catch (Exception ex) {
            caracter = "NaN";
            Logger.getLogger(Config_ser_port.class.getName()).log(Level.SEVERE, null, ex);
        }}else{
            caracter="NaN";
        }
        return caracter;
    }
    
    String leer_datos(){        
        String cadena = "";
        if(bandera==1){
        //System.out.println("\n<Recibiendo datos>");
        int i = 1;
        while(i<=45){
                try {
                    char cadena1 = com.receiveSingleChar();
                    if(cadena1=='i'){
                        if(i==1){
                            cadena = "i";                                     
                            i++;
                            }
                        else{
                            while(i<=45){
                                cadena = cadena+com.receiveSingleString();
                                i++;
                                }
                            }
                        }
                } catch (Exception ex) {
                    System.out.println("Error al leer los datos del puerto");
                    Logger.getLogger(Config_ser_port.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        //System.out.println(cadena);
        //System.out.println("\n<Fin de recepción de datos...>");
        }
        else{
            System.out.println("No hay datos que leer!!!");
        }
        return cadena;
        }

    void cerrar_puerto(){ //throws Exception{
     if(bandera==1){
            try {
                bandera = 0;
                com.close();
                System.out.println("Puerto Cerrado");
            } catch (Exception ex) {
                System.out.println("Error al Cerrar el Puerto");
                bandera = 0;
                Logger.getLogger(Config_ser_port.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    }
    
    double[] interpreto_cadena(String cadena){
        double datos[]=new double[8];        
        if(cadena.length()==45){            
            datos[0] = Double.valueOf(cadena.substring(2, 6));
            datos[1] = Double.valueOf(cadena.substring(7, 11));
            datos[2] = Double.valueOf(cadena.substring(12, 16));
            datos[3] = Double.valueOf(cadena.substring(17, 21));
            datos[4] = Double.valueOf(cadena.substring(22, 26));
            datos[5] = Double.valueOf(cadena.substring(27, 31));
            datos[6] = Double.valueOf(cadena.substring(32, 37));
            datos[7] = Double.valueOf(cadena.substring(38, 43));            
        }else{
          datos = null;
        }
        return datos;
    }
}