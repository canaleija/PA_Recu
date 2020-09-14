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
    
    
    public Dimension(){
    }
    
    public Dimension (double ancho, double largo, double profundidad, double peso){
        this.ancho = ancho;
        this.largo = largo;
        this.profundidad = profundidad;
        this.peso = peso;
    }
   
    public void setAncho (double ancho){
        this.ancho = ancho;
    }
    public double getAncho (){
        return this.ancho;
    }
    // encapsulamiento completo de esta clases y el resto

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the profundidad
     */
    public double getProfundidad() {
        return profundidad;
    }

    /**
     * @param profundidad the profundidad to set
     */
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
