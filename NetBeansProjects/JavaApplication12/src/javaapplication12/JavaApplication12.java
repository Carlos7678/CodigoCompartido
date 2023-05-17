/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int  suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (int i = 1; i <n; i++) {
            if (n % i == 0) {
                suma +=i;     
            } 
        }
        if (suma == n) {
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");
        }    
    }
}
