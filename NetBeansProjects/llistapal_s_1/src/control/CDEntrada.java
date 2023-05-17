/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.CancelatEX;
import oovv.DTOEntrada;
import oovv.Maex;
import vista.DEntrada;
import vista.FPrincipal;

/**
 *
 * @author Administrador
 */
public class CDEntrada implements ActionListener {

    private DEntrada finestra;
    private DTOEntrada dto;

    public CDEntrada(DEntrada finestra) {
        this.finestra = finestra;
    }

    public DTOEntrada getDto() {
        return dto;
    }

    public String getParaula() throws CancelatEX {
        if (dto == null) {
            throw new CancelatEX();
        }
        return dto.getParaula();
    }

    public int getPosicio() throws CancelatEX {
        if (dto == null) {
            throw new CancelatEX();
        }
        return dto.getPosicio();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getActionCommand().equals("Valida")) {
                dto = finestra.getDto();
                finestra.dispose();
            } else {
                dto = null;
                finestra.dispose();
            }

        } catch (Maex ex) {
            JOptionPane.showMessageDialog(finestra, ex.getMessage());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(finestra, "la posició ha de ser un enter");
        }

    }

}
