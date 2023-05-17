/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import static llistapal.Constant.NO_ASSIGNAT;

/**
 *
 * @author Administrador
 */
public class DTOEntrada {

    private String paraula;
    private int posicio;

    public DTOEntrada(String paraula, int posicio) throws Maex {
        if (paraula.isBlank()) {
            throw new Maex("la paraula no pot estar buida");
        }
        if (posicio < 0) {
            throw new Maex("la posició no pot ser negativa");
        }
        this.paraula = paraula;
        this.posicio = posicio;
    }

    public DTOEntrada(String paraula, String posicio) throws Maex {
        if (paraula.isBlank() && posicio.isBlank()) {
            throw new Maex("la informació no pot estar buida");
        }
        this.paraula = paraula.isBlank() ? "NO_ASSIGNAT" : paraula;
        this.posicio = posicio.isBlank() ? NO_ASSIGNAT : Integer.parseInt(posicio);
    }

    public DTOEntrada(String paraula) throws Maex {
        if (paraula.isBlank()) {
            throw new Maex("la paraula no pot estar buida");
        }
        this.paraula = paraula;
        this.posicio = NO_ASSIGNAT;
    }

    public DTOEntrada(int posicio) throws Maex {
        if (posicio < 0) {
            throw new Maex("la posició no pot ser negativa");
        }
        this.paraula = "NO_ASSIGNAT";
        this.posicio = posicio;
    }

    public String getParaula() {
        return paraula;
    }

    public int getPosicio() {
        return posicio;
    }

}
