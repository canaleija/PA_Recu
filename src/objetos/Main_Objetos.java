/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.awt.Color;

/**
 *
 * @author betoleija
 */
public class Main_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Celular moto = new Celular();
        moto.setBateria(4500);
        moto.setColor(new Color(23, 223, 254));
        moto.setCosto(13456.76);
        Dimension d1 = new Dimension();
        d1.setAncho(5);
        d1.setLargo(12);
        d1.setProfundidad(1);
        d1.setPeso(300);
        moto.setDimensiones(d1);
        moto.setMarca("Motorola");
        moto.setModelo("Edge");
        moto.setN_cam(4);
        moto.setOtros("Está bien padre");
        moto.setProcesador(new Procesador());
        moto.getProcesador().setFabricante("Fabricante 1");
        moto.getProcesador().setModelo("RTWE");
        moto.getProcesador().setVelocidad("2.3");
        moto.setRam(4);
        moto.setRom(64);
    
        // establecer otras formas de construir los objetos
        // metodo constructor se crean los objetos, establecer otros constructores
        // sobrecarga de constructores para establecer mas de 1 constructor
        
        Celular samsung = new Celular(9500, Color.yellow,"A5","Samsung",
                  new Dimension(4,10,1.5,250),
                  new Procesador("Snapsragoncv23","Samsung","2.1"),
                  3500, 3, 32, 2,"Reparado");
      
        
        // sobre carga de constructor en clases Dimension y Procesador
        
        System.out.println();
       
      
    }
    
}
