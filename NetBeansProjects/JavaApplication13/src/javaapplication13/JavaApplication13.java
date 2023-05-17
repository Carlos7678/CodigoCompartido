/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N,i,j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);
        for ( j = 2; j < N; j++) {
             i = 2;
            while (j % i != 0) {
                i++;
            }
            if (i == j) {
                System.out.println(j);
            }
            
        }
    }
}
