/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inicio;

/**
 *
 * @author Alumno
 */
    public class Separa {
    public String[] separa(String text, String separador) {
        if (text == null || separador == null) {
            return null;
        }
        return text.split(separador);
    }
}

