/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca primer n�mero: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca segundo n�mero: ");
        n2 = sc.nextInt();
        if (n1 % 10 != n2 % 10) {
            System.out.println("Los n�meros acaban con cifras distintas");
        } else {
            System.out.println("Los dos n�meros acaban con la misma cifra");
        }
    }
}
