/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traficoaereo;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TraficoAereo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.flightradar24.com/data/flights/"); //URL para ver el trafico aereo en tiempo real
        Scanner scan = new Scanner(url.openStream()); //Abre la conexion con la URL y lee los datos de la misma
        while (scan.hasNext()) { //Mientras haya datos en la URL, los imprime por pantalla
            System.out.println(scan.nextLine());
        }
        scan.close(); //Cierra la conexion con la URL una vez se han leido todos los datos de ella 
    }
}


