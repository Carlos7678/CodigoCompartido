/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Eduardo Silvestre
 */
public class Quadrat extends Rectangle {

    public Quadrat(double costat, int x, int y) {
        super(costat, costat, x, y);
    }

    @Override
    public String toString() {
        return "Quadrat de " + getAltura() + " en " + getPosicio();
    }

    @Override
    public String getTextComplet() {
        return String.format("Quadrat> de %.2f X %.2f en %s %s",
                getAltura(), getAmplada(), getPosicio().toString(), mesuresTXT());

    }

    @Override
    public String getDistanciaA(Punt punt) {
        return String.format("Quadrat en %s a %.2f",
                getPosicio().toString(), Mesurador.getDistancia(this, punt));
    }

    @Override
    public String getTextCurt() {
        return "Q" + getPosicio();
    }
}
