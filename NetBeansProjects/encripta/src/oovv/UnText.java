/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class UnText {

    private String text;

    public UnText() {
        text = "";
    }

    public UnText(String text) {
        if (text == null) {
            text = "";
        }
        this.text = text;
    }

    public void setText(String text) {
        if (text == null) {
            text = "";
        }
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void encripta(String paraula) {
        if (paraula == null || paraula.isEmpty()) {
            return;
        }
        char[] matTxt = text.toCharArray();
        int j = 0;// índex per a paraula
        for (int i = 0; i < matTxt.length; i++) {
            matTxt[i] += paraula.charAt(j);
            j++;
            if (j == paraula.length()) {
                j = 0;
            }
        }
        text = new String(matTxt);
    }

    public void desencripta(String paraula) {
        if (paraula == null || paraula.isEmpty()) {
            return;
        }
        char[] matTxt = text.toCharArray();
        int j = 0;// índex per a paraula
        for (int i = 0; i < matTxt.length; i++) {
            matTxt[i] -= paraula.charAt(j++ % paraula.length());
        }
        text = new String(matTxt);
    }
}
