/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        } while (N < 0);    
        for (int i = 0; i <= N; i++) {
        factorial = 1;
            for (int j = i; j > 0; j--) {
                factorial = factorial * j;
            }
            System.out.printf("%2d! = %.0f %n", i, factorial);
        }
    }
}
