/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrador
 */
public class Fitxer {

    private static final String RUTA = "C:\\Users\\Administrador\\Documents\\exercicisProgDAW\\tv7-classesobjectes\\paraules.txt";

    public static void afegeix(String txt) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true));) {
            bw.write(txt);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String llig() {
        String txt = "";
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA));) {
            char[] matCars = new char[1024];
            int carsLlegits = br.read(matCars);
            while (carsLlegits != -1) {
                txt += new String(matCars, 0, carsLlegits); // s’usen únicament els caràcters llegits
                carsLlegits = br.read(matCars);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return txt;
    }

}
