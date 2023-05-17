/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorakelvins;

import control.CFPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.FPrincipal;

/**
 *
 * @author Alumno
 */
public class inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // defineix el LAF
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FPrincipal finestra = new FPrincipal(); // objecte per a la visualització
                CFPrincipal control = new CFPrincipal(finestra); // objecte per a la lògica amb la finestra associada
                finestra.setOidor(control); // associa l'oïdor d’esdeveniments a la finestra
                finestra.setLocationRelativeTo(finestra); // posa la finestra al centre de la pantalla
                finestra.setVisible(true); // mostra la finestra
            }
        });
    }
}
    

