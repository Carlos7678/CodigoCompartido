/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

/**
 *
 * @author Eduardo Silvestre
 */
public class Cercle extends Figura {

    private double radi;

    public Cercle(double radi, int x, int y) {
        super(x, y);
        this.radi = radi;
    }

    public Cercle(double radi) {
        this(radi, 0, 0);
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    @Override
    public double getArea() {
        return Math.PI * radi * radi;
    }

    @Override
    public double getPerimetre() {
        return Math.PI * radi * 2;
    }

    @Override
    public String toString() {
        return "Cercle de radi" + radi + " en " + getPosicio();
    }

    @Override
    public String getTextComplet() {
        return String.format("Cercle> radi=%.2f en %s %s",
                radi, getPosicio().toString(), mesuresTXT());
    }

    @Override
    public String getDistanciaA(Punt punt) {
        return String.format("Cercle en %s a %.2f",
                getPosicio().toString(), Mesurador.getDistancia(this, punt));
    }

    @Override
    public String getTextCurt() {
        return "C" + getPosicio();
    }

}
