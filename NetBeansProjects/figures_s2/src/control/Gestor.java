/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import oovv.Cercle;
import oovv.FiguresMeues;
import oovv.Punt;
import vista.FPrincipal;

/**
 *
 * @author Eduardo Silvestre
 */
public class Gestor implements ActionListener {

    private FPrincipal finestra;
    private FiguresMeues figures;

    public Gestor(FPrincipal finestra) {
        this.finestra = finestra;
        figures = new FiguresMeues();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "afegeix cercle" ->
                    figures.afegir(finestra.getCercle());
                case "afegeix rectangle" ->
                    figures.afegir(finestra.getRectangle());
                case "afegeix quadrat" ->
                    figures.afegir(finestra.getQuadrat());
                case "afegeix aleatori" ->
                    figures.afegirAleatori();
                case "veure tot" ->
                    finestra.mostra(figures.llistatTotal());
                case "veure màxim i Mínim" ->
                    finestra.mostra(figures.getAreaMaxMin());
                case "veure distància a XY" -> {
                    Punt p = finestra.getPuntXY();
                    String dist = figures.getDistanciesA(p);
                    finestra.mostra(dist);
                }
                case "veure distància figures" ->
                    finestra.mostra(figures.getDistanciesFigures());
                case "ordena àrea" ->
                    finestra.mostra(figures.ordenaPerArea());
                case "ordena perímetre" ->
                    finestra.mostra(figures.ordenaPerPerimetre());
                case "elimina figura en X,Y" -> {
                    Punt p = finestra.getPuntXY();
                    if (!figures.eliminaFiguraEn(p)) {
                        JOptionPane.showMessageDialog(finestra, "No hi ha cap figura en " + p);
                    }
                }
                case "elimina figures" -> {
                    String tipus = JOptionPane.showInputDialog("Entra el tipus de figura a eliminar\n"
                            + "cercle/rectangle/quadrat");
                    if (tipus != null) {
                        figures.eliminaFigures(tipus);
                    }
                }
                case "elimina tot" ->
                    figures.eliminaTotes();
                case "suma arees" ->
                    finestra.mostra(figures.sumaDeArees());
                case "suma perimetres" ->
                    finestra.mostra(figures.sumaPerimetres());
                case "suma zona" ->
                    finestra.mostra(figures.llistatTotal());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(finestra, ex.getMessage());
        }

    }

}
