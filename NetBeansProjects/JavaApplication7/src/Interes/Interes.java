/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumno
 */
public class Interes {

    /**
     * @param args the command line arguments
     */

        public static void main(String[] args) throws IOException {
            double cantidadDeDinero = 0;
            do {
                cantidadDeDinero = leeNumero("Entra la cantidad de dinero inicial");
            } while (cantidadDeDinero <= 0);
            double interes = 0;
            do {
                interes = leeNumero("Entra el interes anual");
            } while (interes <= 0 || interes >= 100);
            int años = 0;
            do {
                años = (int) leeNumero("Entra el número de años");
            } while (años <= 0);
            for (int año = 1; año <= años; año++) {
                 double interesAnual = cantidadDeDinero * interes / 100; // breakpoint A
                System.out.printf("año %3d> capital %11.2f intereses %11.2f\n",
                        año, cantidadDeDinero, interesAnual);
                cantidadDeDinero += interesAnual;
            }
            System.out.println("Capital final = " + cantidadDeDinero);
        }

        private static double leeNumero(String mensaje) throws IOException {
            System.out.println(mensaje);
            BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
            double numero = -1;
            try {
                numero = Double.parseDouble(lector.readLine()); // breakpoint B
            } catch (NumberFormatException e) {
            }
            return numero;
        }
    }

