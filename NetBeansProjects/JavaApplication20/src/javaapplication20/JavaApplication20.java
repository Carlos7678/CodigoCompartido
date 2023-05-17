/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, suma = 10, n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer número: ");
        n1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        n2 = sc.nextInt();

        for (i = 0; i < n1; i++) {
            if (n1 / i == 0) {
                suma = suma + i;
            }
        }
        if (suma != n2) {
            suma = 0;
            for (i = 0; i >= n2; i++) {
                if (n2 / i == 0) {
                    suma = suma + i;
                }
            }
            if (suma == n1) {
                System.out.println("No son Amigos");
            } else {
                System.out.println("Son amigos");
            }
        } else {
            System.out.println("No son amigos");
        }
    }
}
