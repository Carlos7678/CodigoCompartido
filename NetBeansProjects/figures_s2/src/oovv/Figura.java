/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oovv;

import java.util.Objects;

/**
 *
 * @author Eduardo Silvestre
 */
public abstract class Figura implements Comparable<Figura>, Mesurable{

    private Punt posicio;

    public Figura(Punt posicio) {
        this.posicio = posicio;
    }

    public Figura(int x, int y) {
        posicio = new Punt(x, y);
    }

    public Punt getPosicio() {
        return posicio;
    }

    public void setPosicio(Punt posicio) {
        this.posicio = posicio;
    }

    @Override
    public String toString() {
        return posicio.toString();
    }

    public abstract double getArea();

    public abstract double getPerimetre();

    public abstract String getTextCurt();

    @Override
    public int compareTo(Figura o) {
        return Double.compare(this.getArea(), o.getArea());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.posicio);
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
        if (!(obj instanceof Figura)) {
            return false;
        }
        final Figura other = (Figura) obj;
        return Objects.equals(this.posicio, other.posicio);
    }

    public abstract String getTextComplet();

    public abstract String getDistanciaA(Punt punt);

}
