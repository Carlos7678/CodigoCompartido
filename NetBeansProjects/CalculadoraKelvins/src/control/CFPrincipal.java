/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.calculadora;
import vista.FPrincipal;

/**
 *
 * @author Alumno
 */
public class CFPrincipal implements ActionListener {

    private final FPrincipal ventana;

    public CFPrincipal(FPrincipal ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getActionCommand().equals("Convertir K")) {
                double celsius = ventana.getCelsius();
            ventana.MostrarKelvins(calculadora.pasarAkelvins(celsius));
            }else{
                   double fahrenheits = ventana.getCelsius();
            ventana.MostrarFahrenhaits(calculadora.pasarAfahrenhaits(fahrenheits));
            }    
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(ventana, "Los datos tienen que ser doubles", "Calculadora", JOptionPane.ERROR_MESSAGE);
//            ventana.MostrarError();
        }
    }
}
