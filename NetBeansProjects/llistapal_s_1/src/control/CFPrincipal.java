/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import llistapal.Constant;
import oovv.CancelatEX;
import oovv.DTOEntrada;
import oovv.Maex;
import oovv.Paraules;
import vista.DEntrada;
import vista.FPrincipal;

/**
 *
 * @author Administrador
 */
public class CFPrincipal implements ActionListener {

    private FPrincipal finestra;
    private Paraules paraules;
    private DEntrada dialeg;
    private CDEntrada cDialeg;

    public CFPrincipal(FPrincipal finestra) {
        this.finestra = finestra;
        paraules = new Paraules();
        finestra.setTitle("els separadors són " + paraules.getSeparadors());
        dialeg = new DEntrada(finestra, true);
        cDialeg = new CDEntrada(dialeg);
        dialeg.setOidor(cDialeg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            switch (e.getActionCommand()) {
                case "afegir una paraula" -> {
                    dialeg.configura(0);
                    String paraula = cDialeg.getParaula();
                    paraules.afegeix(paraula);
                }
                case "afegir una  paraula en" -> {
                    dialeg.configura(1);
                    DTOEntrada dto = cDialeg.getDto();
                    paraules.inserir(dto);
                }
                case "afegir paraules d'un text" -> {
                    dialeg.configura(3);
                    String text = cDialeg.getParaula();
                    paraules.afegeixText(text);
                }
                case "visualitzar totes les paraules" ->
                    finestra.mostra(paraules.llistaComplet());
                case "visualitzar una  paraula" -> {
                    dialeg.configura(2);
                    int posicio = cDialeg.getPosicio();
                    finestra.mostra(paraules.getLaParaula(posicio));
                }
                case "passar a majúscules" ->
                    paraules.passaAmajuscules();
                case "posar inicial a majúscules" ->
                    paraules.passaInicialAmajuscules();
                case "definir separadors" -> {
                    dialeg.configura(4);
                    String separadors = cDialeg.getParaula();
                    paraules.setSeparadors(separadors);
                    finestra.setTitle("els separadors són " + paraules.getSeparadors());
                }
                case "esborrar paraules repetides" ->
                    paraules.eliminaRepetides();
                case "esborrar paraules d'un text" -> {
                    dialeg.configura(5);
                    String text = cDialeg.getParaula();
                    paraules.esborrarText(text);
                }
                case "esborrar una paraula" -> {
                    dialeg.configura(6);
                    DTOEntrada dto = cDialeg.getDto();
                    if (dto.getParaula().equals("NO_ASSIGNAT")) {
                        paraules.esborra(dto.getPosicio());
                    } else if (dto.getPosicio() == Constant.NO_ASSIGNAT) {
                        paraules.esborra(dto.getParaula());
                    } else {
                        paraules.esborra(dto);
                    }
                }
                case "Eixir" ->
                    System.exit(0);
            }
        } catch (IndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(finestra, "la posició està fora de la llista");
        } catch (CancelatEX ex) {

        } catch (Maex ex) {
            JOptionPane.showMessageDialog(finestra, ex.getMessage());
        }
    }

}
