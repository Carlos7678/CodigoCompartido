/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Calculadora;
import oovv.EsZeroEX;
import oovv.UnaFraccio;
import vista.FPrincipal;

/**
 *
 * @author Administrador
 */
public class CFPrincipal implements ActionListener {

    private FPrincipal finestra;

    public CFPrincipal(FPrincipal finestra) {
        this.finestra = finestra;
        finestra.setLocationRelativeTo(finestra);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            UnaFraccio f1 = finestra.getFraccio1();
            UnaFraccio f2 = finestra.getFraccio2();
            switch (e.getActionCommand()) {
                case "sumar":

                    UnaFraccio res = Calculadora.sumar(f1, f2);
                    finestra.mostra(res);
                    break;
                case "restar":
                    res = Calculadora.restar(f1, f2);
                    finestra.mostra(res);
                    break;
                case "multiplicar":
                    res = Calculadora.multiplicar(f1, f2);
                    finestra.mostra(res);
                    break;
                case "dividir":
                    res = Calculadora.dividir(f1, f2);
                    finestra.mostra(res);
                    break;
                case "comparar":
                    JOptionPane.showMessageDialog(finestra,
                            "les fraccions "
                            + (f1.equals(f2) ? "" : " no ")
                            + "són iguals");
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (EsZeroEX ex) {
            JOptionPane.showMessageDialog(finestra, "no pots posar un 0 en el denominador");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(finestra, "els valors han de ser enters");
        }
    }

}
