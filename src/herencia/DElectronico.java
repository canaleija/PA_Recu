/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.Color;
import objetos.Dimension;

/**
 *
 * @author betoleija
 */
public class DElectronico {
   
    private double costo;
    private Color color;
    private String modelo;
    private String marca;
    private Dimension dimensiones; 

    public DElectronico() {
        
    }

    public DElectronico(double costo, Color color, String modelo, String marca, Dimension dimensiones) {
        this.costo = costo;
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.dimensiones = dimensiones;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the dimensiones
     */
    public Dimension getDimensiones() {
        return dimensiones;
    }

    /**
     * @param dimensiones the dimensiones to set
     */
    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    
  
    

}
