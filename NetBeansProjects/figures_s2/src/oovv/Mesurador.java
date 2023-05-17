/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Eduardo Silvestre
 */
public class Mesurador {

    public static double getDistancia(Punt a, Punt b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2)
                + Math.pow(a.getY() - b.getY(), 2)
        );
    }

    public static double getDistancia(Punt p, Figura f) {
        return getDistancia(p, f.getPosicio());
    }

    public static double getDistancia(Figura f, Punt p) {
        return getDistancia(p, f);
    }

    public static double getDistancia(Figura f1, Figura f2) {
        return getDistancia(f1.getPosicio(), f2.getPosicio());
    }
}
