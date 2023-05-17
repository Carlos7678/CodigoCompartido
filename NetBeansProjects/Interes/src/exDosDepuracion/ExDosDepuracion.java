/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exDosDepuracion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class ExDosDepuracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] myArray=new int[3];
    ExDosDepuracion.getValues(myArray);
        System.out.println("El valor más grande del array es: "+findMax(myArray));
}
    public static void getValues(int[]  array) {
     Scanner scan=new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un número");
            array[i]=scan.nextInt();
            
        }
    }
    public static int findMax(int [] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            max= array[i];
            
        }
        return max;
    }
}
