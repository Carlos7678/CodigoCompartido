/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class EntradaDTO {

    private String paraula;
    private int posicio;
    private static final int NO_ASSIGNAT = -1;

    public EntradaDTO(String paraula, int posicio) throws Maex {
        if (paraula.isBlank()) {
            throw new Maex("la paraula no pot estar buida");
        }
        if (posicio < 0) {
            throw new Maex("la posició no pot ser negativa");
        }
        this.paraula = paraula;
        this.posicio = posicio;
    }

    public EntradaDTO(String paraula) throws Maex {
        if (paraula.isBlank()) {
            throw new Maex("la paraula no pot estar buida");
        }
        this.paraula = paraula;
        this.posicio = NO_ASSIGNAT;
    }

    public EntradaDTO(int posicio) throws Maex {
        if (posicio < 0) {
            throw new Maex("la posició no pot ser negativa");
        }
        this.paraula = NO_ASSIGNAT + "";
        this.posicio = posicio;
    }

    public String getParaula() {
        return paraula;
    }

    public int getPosicio() {
        return posicio;
    }

}
