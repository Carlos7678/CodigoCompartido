/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca valor de N: ");
        N = sc.nextInt(); //

        System.out.println("Primera cifra de " + N + " -> " + (N /100));
        System.out.println("Cifra central de " + N + " -> " + (N % 100/10));
        System.out.println("Última cifra de " + N + " -> " + (N % 10));
    }

}
