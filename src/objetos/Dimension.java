/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author betoleija
 */
public class Dimension {
    
    private double ancho;
    private double largo;
    private double profundidad;
    private double peso; 
   
    public void setAncho (double ancho){
        this.ancho = ancho;
    }
    public double getAncho (){
        return this.ancho;
    }
    // encapsulamiento completo de esta clases y el resto
}
