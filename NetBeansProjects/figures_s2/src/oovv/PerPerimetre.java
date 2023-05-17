/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.Comparator;

/**
 *
 * @author Administrador
 */
public class PerPerimetre implements Comparator<Figura>{

    @Override
    public int compare(Figura o1, Figura o2) {
        return Double.compare(o1.getPerimetre(), o2.getPerimetre());
    }

    @Override
    public Comparator<Figura> reversed() {
        return Comparator.super.reversed(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
