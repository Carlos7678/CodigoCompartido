/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Fitxer;
import oovv.UnText;
import vista.FPrincipal;

/**
 *
 * @author Alumno
 */
public class CFPrincipal implements ActionListener {

    private FPrincipal ventana;
    private UnText modelo;

    public CFPrincipal() {

    }

    public CFPrincipal(UnText modelo) {
        modelo = new UnText();
    }

    public FPrincipal getVentana() {
        return ventana;
    }

    public void setVentana(FPrincipal ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Encripta":
                String text = ventana.getTextOriginal();
                modelo = new UnText(text);
                String palabra = JOptionPane.showInputDialog(ventana, "Introduce la palabara de encriptacion");
                modelo.encripta(text);
                ventana.muestraTexto(modelo.getText());
                break;
            case "Desencripta":
                modelo = ventana.getUnTextOriginal();
               palabra = JOptionPane.showInputDialog(ventana, "Introduce la palabara de desencriptacion");
                modelo.encripta(palabra);
                ventana.muestraTexto(modelo.getText());

                break;
            case "Passa":
                ventana.passa();
                break;
            case "Llig fitxer":
 modelo = new UnText(Fitxer.llig());
                break;
            case "Guarda fitxer":
                Fitxer.afegeix(ventana.getTextOriginal());

                break;
            default:
                throw new AssertionError();
        }
    }

}
