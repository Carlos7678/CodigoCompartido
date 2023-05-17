/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

import control.Gestor;
import javax.swing.UnsupportedLookAndFeelException;
import oovv.Cercle;
import oovv.FiguresMeues;
import oovv.Rectangle;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException classNotFoundException) {
        }
        
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FPrincipal f = new FPrincipal();
                Gestor g = new Gestor(f);
                f.setOidor(g);
                f.setVisible(true);
            }
        });
    }
    
}
