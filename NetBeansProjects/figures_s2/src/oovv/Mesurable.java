/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package oovv;

/**
 *
 * @author Alumno
 */
public interface Mesurable {

    double getArea();

    double getPerimetre();

    default String mesuresTXT() {
    return String.format("Àrea= %.2f Perímetre= %.2f", getArea(),getPerimetre());
    }
}
