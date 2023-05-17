/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.ListIterator;
import llistapal.Constant;

/**
 *
 * @author Administrador
 */
public class Paraules {

    private ArrayList<String> lesParaules;
    private String separadors;

    public Paraules() {
        lesParaules = new ArrayList<>();
        separadors = "[ ]";
    }

    public String getSeparadors() {
        return separadors;
    }

    public void setSeparadors(String separadors) throws Maex {
        if (separadors == null || separadors.isEmpty()) {
            throw new Maex("els separadors no poden estar buits");
        }
        this.separadors = "[" + separadors + "]";
    }

    public void afegeix(String paraula) {
        lesParaules.add(paraula);
    }

    public String llistaComplet() {
        String llistat = "Llistat de totes les paraules\n--------------------------\n";
        int con = 1;
        for (String paraula : lesParaules) {
            llistat += "[" + (con - 1) + "/" + paraula + (con++ % 12 == 0 ? "]\n" : "]");
        }
        return llistat;
    }

    public void inserir(DTOEntrada dto) {
        lesParaules.add(dto.getPosicio(), dto.getParaula());
    }

    public String getLaParaula(int pos) {
        return lesParaules.get(pos);
    }

    public void afegeixText(String text) throws Maex {
        lesParaules.addAll(oovv.SocUtil.separa(text, separadors));
    }

    public void passaAmajuscules() {
        for (ListIterator<String> iterator = lesParaules.listIterator(); iterator.hasNext();) {
            iterator.set(iterator.next().toUpperCase());
        }
    }

    public void passaInicialAmajuscules() {
        for (ListIterator<String> iterator = lesParaules.listIterator(); iterator.hasNext();) {
            String paraula = iterator.next().toLowerCase();
            paraula = paraula.substring(0, 1).toUpperCase()
                    + paraula.substring(1);
            iterator.set(paraula);
        }
    }

    public void eliminaRepetides() {
        lesParaules = new ArrayList<>(new HashSet<>(lesParaules));
    }

    public void esborrarText(String paraulaText) throws Maex {
        lesParaules.removeAll(SocUtil.separa(paraulaText, separadors));
    }

    public void esborra(DTOEntrada dto) {
        if (lesParaules.get(dto.getPosicio()).equals(dto.getParaula())) {
            lesParaules.remove(dto.getPosicio());
        }
    }

    public void esborra(int posicio) {
        lesParaules.remove(posicio);
    }

    public void esborra(String paraula) {
        lesParaules.removeAll(Arrays.asList(paraula));
    }
}
