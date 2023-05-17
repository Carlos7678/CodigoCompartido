/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class MUtils {

    /**
     * calcula el màxim comù divisor.
     *
     * @param num1 primer nombre
     * @param num2 segon nombre
     * @return el màxim comù divisor de num1 i num2
     */
    public static int getMCD(int num1, int num2) {
        int resta;
        while (num2 != 0) {
            resta = num1 % num2;
            num1 = num2;
            num2 = resta;
        }
        return num1;
    }
}
