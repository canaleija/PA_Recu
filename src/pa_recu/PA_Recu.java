/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_recu;

import objetos.Dimension;

/**
 *
 * @author betoleija
 */
public class PA_Recu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          // mandar argumentos
          Dimension d1 = new Dimension();
          Dimension d2 = new Dimension();
          System.out.println(d2.getAncho());
          d2.setAncho(5.6);
          System.out.println(d2.getAncho());
           
        
    }
    
}
