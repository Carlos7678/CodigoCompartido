/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int asteriscos;

        System.out.print("¿Cuántos asteriscos quieres?");
        asteriscos = entrada.nextInt();
        for (int i = asteriscos; i > 0; i--) {
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println("");
            asteriscos--;
        }
    }
}
