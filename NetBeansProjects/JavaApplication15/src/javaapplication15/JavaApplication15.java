/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numfiguras;
        do {
            System.out.print("¿Cuántas figuras quieres?");
            numfiguras = entrada.nextInt();
        } while (numfiguras < 2);
        int nfiguras = numfiguras;
        int numlinea;
        do {
            System.out.print("¿Cuántos asteriscos quieres?");
            numlinea = entrada.nextInt();
        } while (numlinea < 2);
        int numespacios = 0;
        int posasterisco;
        int nespacios;
        while (numlinea > 0) {
            numfiguras = nfiguras;
            posasterisco = numlinea;
            nespacios = numespacios;
            while (numfiguras > 0) {
                while (posasterisco > 0) {
                    System.out.print("*");

                    while (nespacios > 0) {
                        System.out.print(" ");

                        if (numfiguras > 1) {
                            System.out.print("||");
                        }
                    }
                }
                numfiguras = numfiguras - 1;
                System.out.println("");
            }
            System.out.println("");
            numlinea = numlinea - 1;
            numespacios = numespacios + 1;
        }

    }
}
