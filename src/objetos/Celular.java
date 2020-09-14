/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import herencia.DElectronico;
import java.awt.Color;




/**
 * "contexto" ( ¿Dónde?) nos ayuda a diferenciar algunas identidades (variables)
 * @author betoleija
 */
public class Celular extends DElectronico {
    
    // definir los atributos global (caractersiticas que describen al Celular)
    
    private Procesador procesador;
    private int bateria;
    private int ram;
    private int rom;
    private int n_cam;
    private String otros; 
    
   
    public Celular(){}

    public Celular(double costo, 
            Color color,
            String modelo, 
            String marca,
            Dimension dimensiones,
            Procesador procesador,
            int bateria, int ram, int rom, int n_cam, String otros) {
        super(costo,color,modelo,marca,dimensiones);
        this.procesador = procesador;
        this.bateria = bateria;
        this.ram = ram;
        this.rom = rom;
        this.n_cam = n_cam;
        this.otros = otros;
    }
   
    

    /**
     * @return the procesador
     */
    public Procesador getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the bateria
     */
    public int getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the rom
     */
    public int getRom() {
        return rom;
    }

    /**
     * @param rom the rom to set
     */
    public void setRom(int rom) {
        this.rom = rom;
    }

    /**
     * @return the n_cam
     */
    public int getN_cam() {
        return n_cam;
    }

    /**
     * @param n_cam the n_cam to set
     */
    public void setN_cam(int n_cam) {
        this.n_cam = n_cam;
    }

    /**
     * @return the otros
     */
    public String getOtros() {
        return otros;
    }

    /**
     * @param otros the otros to set
     */
    public void setOtros(String otros) {
        this.otros = otros;
    }

    
    }
