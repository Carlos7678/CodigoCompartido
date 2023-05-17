/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kebapmanolo;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.FPrincipal;

/**
 *
 * @author Alumno
 */
public class KebapManolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { // posa el LAF del sistema
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

}
