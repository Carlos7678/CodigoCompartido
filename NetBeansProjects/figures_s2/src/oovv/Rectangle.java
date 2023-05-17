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
public class Rectangle extends Figura {

    private double altura;
    private double amplada;

    public Rectangle(double altura, double amplada, int x, int y) {
        super(x, y);
        if (altura < 0.1) {
            altura = 0.1;
        }
        if (amplada < 0.1) {
            amplada = 0.1;
        }
        this.altura = altura;
        this.amplada = amplada;
    }

    public Rectangle(double altura, double amplada) {
        this(altura, amplada, 0, 0);
    }

    @Override
    public double getArea() {
        return altura * amplada;
    }

    @Override
    public double getPerimetre() {
        return 2 * (altura + amplada);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0.1) {
            altura = 0.1;
        }
        this.altura = altura;
    }

    public double getAmplada() {
        return amplada;
    }

    public void setAmplada(double amplada) {
        if (amplada < 0.1) {
            amplada = 0.1;
        }
        this.amplada = amplada;
    }

    @Override
    public String toString() {
        return "Rectangle de " + altura + "X" + amplada + " en " + getPosicio();
    }

    @Override
    public String getTextComplet() {
        return String.format("Rectangle> de %.2f X %.2f en %s %s ",
                altura, amplada, getPosicio().toString(), mesuresTXT());

    }

    @Override
    public String getDistanciaA(Punt punt) {
        return String.format("Rectangle en %s a %.2f",
                getPosicio().toString(), Mesurador.getDistancia(this, punt));
    }

    @Override
    public String getTextCurt() {
        return "R" + getPosicio();
    }
}
