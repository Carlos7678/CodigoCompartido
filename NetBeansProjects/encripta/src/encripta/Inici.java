/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encripta;

import control.CFPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class Inici {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
         FPrincipal f=new FPrincipal();
         CFPrincipal c=new CFPrincipal();
         c.setVentana(f);
         f.setOidor(c);
         f.setVisible(true);
    }

}
