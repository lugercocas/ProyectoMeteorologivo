/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Intrumentos_Virtuales;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.GraphicsConfiguration;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;

public class Tanque{
//double ancho_ventana =
double nivel = 0;
Container c;
Graphics2D g;
public BufferedImage im;
int ancho;
int largo;
String titulo1;
Icon icono;
int max_val;
public Tanque(String title, int x, int y, int nivl, int max) {
ancho = x;
largo = y;
nivel = nivl;
titulo1 = title;
max_val = max;
im = new BufferedImage(x,y,BufferedImage.TYPE_INT_BGR);
g = im.createGraphics();
paint(g);
icono = new ImageIcon(im);
}
public void paint (Graphics g){
//Variables
//Ventana
int ancho_ventana = ancho;
int alto_ventana  = largo;
//rectangulo exterior
float ancho_linea_ext = 5.0f;
int in_rect_ex_x = 5;
int in_rect_ex_y = in_rect_ex_x + 25;
int ancho_rectangulo_ext = ancho_ventana-in_rect_ex_x-in_rect_ex_x;
int alto_rectangulo_ext  = alto_ventana-in_rect_ex_y-in_rect_ex_x;
Color color_rec_ext = Color.GRAY;
//Texto titulo
String titulo = titulo1;
String tipo_letra = "Arial";
int tamaño_letra  = 20;
Color color_letra = Color.BLACK;
int ajuste_letra = 6;
//tanque
int margen_tank = 45;
int marg_alto_tank = 15;
int ini_tank_x = in_rect_ex_x + margen_tank;
int ini_tank_y = in_rect_ex_y + margen_tank-marg_alto_tank;
int ancho_tank = ancho_rectangulo_ext-2*margen_tank-(int)ancho_linea_ext/2;
int alto_tank  = alto_rectangulo_ext -2*margen_tank + (int)2.0*marg_alto_tank;
Color color_lin_tank = Color.LIGHT_GRAY;
float ancho_linea_tank = 6.0f;
//Relleno tanque
int min_niv_tank_r = 0;
int max_niv_tank_r = alto_tank;
int max_niv_tank_g = max_val;//500;
float unidad_niv_tank = (float)max_niv_tank_r/max_niv_tank_g;
int nivel11 = (int)nivel;
if(nivel>max_niv_tank_g){
    nivel11=max_niv_tank_g;
}
float nivel_tank = nivel11*unidad_niv_tank;
float nivel1 = ini_tank_y + alto_tank - nivel_tank;
//Indicador de nivel
Color color_letra_ind = Color.CYAN;
int tamaño_letra_ind = 12;
String tipo_letra_ind = "Arial";
int ajuste_letra_ind = 1;
String unidades = "mm³";
//Indicador escala
int cant = 10;
int val_esc = (int)max_niv_tank_g/cant;
int nivel_es;
float coor_nivel=0;
float coor_nivel2 = 0;
String esc_niv_g ;
int ajuste_esc = 20;
Color color_ind_esc = Color.BLACK;
//------------------------------------------------------------------
//Inicio ventana grafica
Graphics2D g2 = (Graphics2D)g;
//-------------------------------------------------------------------
//Fondo Ventana grafica
Color color = new Color(240,240,240,231);
//AlphaComposite acc =
//AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f);
g2.setColor(color);
Rectangle2D q22 = new Rectangle2D.Double(
0, 0, ancho, largo);
//g2.setComposite(acc);
g2.fill(q22);
//-------------------------------------------------------------------
//Divujo el rectangulo exterior
g2.setColor(color_rec_ext);
Rectangle2D r2 = new Rectangle2D.Double(in_rect_ex_x, in_rect_ex_y, 
        ancho_rectangulo_ext, alto_rectangulo_ext);
Stroke pincel = new BasicStroke(ancho_linea_ext, BasicStroke.CAP_ROUND,
        BasicStroke.CAP_ROUND);//JOIN_MITER
g2.setStroke(pincel);
g2.draw(r2);//Colorea la linea
//Titulo
FontRenderContext frc = g2.getFontRenderContext();
//Dimension tamaño = getSize();
Font f = new Font(tipo_letra, Font.CENTER_BASELINE, tamaño_letra);
TextLayout tl = new TextLayout(titulo, f, frc);
g2.setColor(color_letra);
tl.draw(g2, (float)(ancho - tl.getBounds().getWidth())/2,
in_rect_ex_x+ancho_linea_ext+ajuste_letra);
// Dibujo del rectángulo redondeado (Tanque)
g2.setColor(color_lin_tank);
g2.setStroke(new BasicStroke(ancho_linea_tank));
RoundRectangle2D q = new RoundRectangle2D.Float(
ini_tank_x, ini_tank_y, ancho_tank, alto_tank, 25.0f, 25.0f);
g2.draw(q);
//Dibujo el relleno del tanque
//Coloreo el interior del rectangulo
AlphaComposite ac =
AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f);
g2.setColor(Color.BLUE);
RoundRectangle2D q2 = new RoundRectangle2D.Float(
ini_tank_x, nivel1, ancho_tank, alto_tank, 25.0f, 25.0f);
g2.setComposite(ac);
Area a1 = new Area(q);
Area a2 = new Area(q2);
a1.intersect(a2);
g2.fill(a1); //Colorea el fondo, (llenar) fondo
// Dibujo del rectángulo redondeado (Tanque)
g2.setColor(color_lin_tank);
g2.draw(q);
//Indicador de nivel
Font f1 = new Font(tipo_letra_ind, Font.CENTER_BASELINE, tamaño_letra_ind);
TextLayout tl1 = new TextLayout(Double.toString(nivel)+unidades, f1, frc);
g2.setColor(color_letra_ind);
tl1.draw(g2, (float)(ancho - tl1.getBounds().getWidth())/2,
(float)(in_rect_ex_x+alto_tank-ajuste_letra_ind));
//Indicador escala
Font f2 = new Font(tipo_letra_ind, Font.CENTER_BASELINE, 12);
for(int i = 0;i<=cant+1; i++){    
    nivel_es = val_esc*i;
    coor_nivel = ini_tank_y + alto_tank - nivel_es*unidad_niv_tank;
    esc_niv_g = Integer.toString(nivel_es);
    if(i<=cant){
    TextLayout tl2 = new TextLayout(esc_niv_g+"__", f2, frc);
    g2.setColor(color_ind_esc);
    tl2.draw(g2, (float)(ancho - tl2.getBounds().getWidth())/2-ancho_tank/2-ajuste_esc,
    coor_nivel);
    }
    if(i>0){
        TextLayout tl3 = new TextLayout("_", f2, frc);
        g2.setColor(color_ind_esc);
        tl3.draw(g2, (float)(ancho - tl3.getBounds().getWidth())/2-ancho_tank/2-ajuste_esc+10,
        (coor_nivel2-(coor_nivel-coor_nivel2)/2));        
        coor_nivel2 = coor_nivel;        
    }     
}
//Indicador leds

}
}

