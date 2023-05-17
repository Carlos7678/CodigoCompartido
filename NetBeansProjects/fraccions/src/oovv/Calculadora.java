/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oovv;

/**
 *
 * @author Administrador
 */
public class Calculadora {

    public static UnaFraccio multiplicar(UnaFraccio f1, UnaFraccio f2) throws EsZeroEX {
        int numerador = f1.getNumerador() * f2.getNumerador();
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new UnaFraccio(numerador, denominador);
    }

    public static UnaFraccio dividir(UnaFraccio f1, UnaFraccio f2) throws EsZeroEX {
        f2.invertir();
        return multiplicar(f1, f2);
    }

    public static UnaFraccio sumar(UnaFraccio f1, UnaFraccio f2) throws EsZeroEX {
        int numerador = f1.getNumerador() * f2.getDenominador() + f1.getDenominador() * f2.getNumerador();
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new UnaFraccio(numerador, denominador);
    }

    public static UnaFraccio restar(UnaFraccio f1, UnaFraccio f2) throws EsZeroEX {
        int numerador = f1.getNumerador() * f2.getDenominador() - f1.getDenominador() * f2.getNumerador();
        int denominador = f1.getDenominador() * f2.getDenominador();
        return new UnaFraccio(numerador, denominador);
    }
}
