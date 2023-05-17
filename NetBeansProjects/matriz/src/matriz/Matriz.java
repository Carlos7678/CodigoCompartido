/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        int sumaBordes = 0;
        int sumaInterior = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (fila == 0 || columna == 0 || fila == matriz.length-1  || columna == matriz.length - 1) {
                    sumaBordes += matriz[fila][columna] = (int) (Math.random() * (100 - 1) + 1) + 1;
                } else {
                    sumaInterior += matriz[fila][columna] = (int) (Math.random() * (100 - 1) + 1) + 1;
                }
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println("");
        }
        System.out.println("\nsuma de los bordes:" + sumaBordes);
        System.out.println("suma del interior:" + sumaInterior);
    }
}
