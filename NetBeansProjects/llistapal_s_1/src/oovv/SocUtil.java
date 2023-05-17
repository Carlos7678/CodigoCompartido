/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class SocUtil {
    
    public static int getAleatori(int inf, int sup) {
        if (inf > sup) {
            return getAleatori(sup, inf);
        }
        return inf + (int) (Math.random() * (sup - inf + 1));
    }
    
    public static List<String> separa(String text, String separadors) throws Maex {
        if (text == null || separadors == null
                || text.isBlank() || separadors.isEmpty()) {
            throw new Maex("no poden estar buits");
        }
        String regex = "[" + separadors + "]";
        String[] matTxt = text.split(regex);
        List<String> listTxt = new LinkedList<>(Arrays.asList(matTxt));
        listTxt.removeAll(Arrays.asList(""));
        return listTxt;
    }
}
