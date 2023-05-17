/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenacar;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Cadenacar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        Scanner lector = new Scanner(System.in);
        String cadena = getCadena(lector);
        String caracter = getCaracter(lector);
        contador = comparar(cadena, caracter, contador);
        muestraMensajes(cadena, caracter, contador);
    }

    private static String getCadena(Scanner lector) {
        System.out.print("Introduce una cadena de texto: ");
        String cadena = lector.nextLine();
        return cadena;
    }

    private static String getCaracter(Scanner lector) {
        System.out.print("Introduce un caracter: ");
        String caracter = lector.next();
        if (caracter.length() != 1) {
            do {
                System.out.println("Solo tiene que haber un caracter");
                System.out.print("Introduce un caracter: ");
                caracter = lector.next();
            } while (caracter.length() != 1);
        }
        return caracter;
    }

    private static int comparar(String cadena, String caracter, int contador) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter.charAt(0)) {
                contador++;
            }
        }
        return contador;
    }

    private static void muestraMensajes(String cadena, String caracter, int contador) {
        System.out.println("La cadena introducida es " + cadena);
        System.out.println("La longitud de la cadena es " + cadena.length());
        System.out.println("El caracter " + caracter + " se repite " + contador + " veces/vez");
    }
}
