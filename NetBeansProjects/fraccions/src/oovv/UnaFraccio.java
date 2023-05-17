/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class UnaFraccio {

    private int numerador;
    private int denominador;

    public UnaFraccio(int numerador, int denominador) throws EsZeroEX {
        if (denominador == 0) {
            throw new EsZeroEX("el denominador no pot ser 0");
        }
        if (denominador < 0) {
            numerador = -numerador;
            denominador = -denominador;
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void assignar(UnaFraccio fraccio) {
        this.numerador = fraccio.numerador;
        this.denominador = fraccio.denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void invertir() {
        int tmp = numerador;
        numerador = denominador;
        denominador = tmp;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public double getValor() {
        return (double) numerador / denominador;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.getValor()) ^ (Double.doubleToLongBits(this.getValor()) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnaFraccio other = (UnaFraccio) obj;
        return Double.doubleToLongBits(this.getValor()) == Double.doubleToLongBits(other.getValor());
//        return Double.compare(this.getValor(), other.getValor()) == 0;
    }
    
    public void simplicar(){
        int mcd = MUtils.getMCD(numerador, denominador);
        numerador /= mcd;
        denominador /= mcd;
    }

}
