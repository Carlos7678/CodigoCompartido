/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitllettrenm;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class BitllettrenM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("El precio del billete es %.2f euros", getPreuBitllet());
    }

    private static double getPreuBitllet() {
        Scanner lector = new Scanner(System.in);
        double precio;
        double descuento = 0;
        int tipoBillete = getTipoBillete(lector);
        double km = getKm(lector);
        boolean interrail = tieneInterrail(lector);
        if (tipoBillete == 1) {
            precio = km * 0.33;
        } else {
            precio = km * 0.26;
        }
        descuento = getDescuento(interrail, descuento, precio);
        precio = precio - descuento;
        return precio;
    }

    private static double getDescuento(boolean interrail, double descuento, double precio) {
        if (interrail) {
            descuento = precio * 25 / 100;
        } else if (precio > 110) {
            descuento = precio * 10 / 100;
        } else {
            if (precio > 50) {
                descuento = precio * 5 / 100;
            }
        }
        return descuento;
    }

    private static boolean tieneInterrail(Scanner lector) {
        System.out.print("¿Tienes tarjeta interrail? (true/false)");
        boolean interrail = lector.nextBoolean();
        return interrail;
    }

    private static double getKm(Scanner lector) {
        System.out.print("Introduce la distancia en kilometros: ");
        double km = lector.nextDouble();
        return km;
    }

    private static int getTipoBillete(Scanner lector) {
        int tipoBillete = 0;
        do {
            System.out.println("---------------------------------------");
            System.out.println("Introduce el tipo de billete que quieres comprar (valor entre 1 y 2)");
            System.out.println("1<-Ida");
            System.out.println("2<-Ida y vuelta");
            System.out.println("---------------------------------------");
            tipoBillete = lector.nextInt();
        } while (tipoBillete < 1 || tipoBillete > 2);
        return tipoBillete;
    }
}
