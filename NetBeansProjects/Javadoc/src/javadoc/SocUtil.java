/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoc;

/**
 *
 * @author Carlos
 * @version 1.1 01/26/2023
 */
public class SocUtil {

    /**
     * Comprueba si un numero es capicua o no
     *
     * @param numero
     * @return <code> true </code>Si el numero es capicua<br><code> false </code>Si el numero no es capicua
     * @throws EsNegatiuEX
     * @see EsNegatiuEX
     * @deprecated As of JDK 1.5, replaced by {@link #esCapikua}
     */
    public static boolean esCapicua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int numAlReves = 0;
        int còpia = numero;
        while (numero > 0) {
            numAlReves = numAlReves * 10 + numero % 10;
            numero /= 10;
        }
        return còpia == numAlReves;
    }

    /**
     * Comprueba si un numero es capicua o no
     *
     * @param numero
     * @return <code>true</code>Si el numero es capicua<br><code>false</code>Si el numero no es capicua
     * @throws EsNegatiuEX
     */
    public static boolean esCapikua(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        String cadNum = numero + "";
        String numAlReves = (new StringBuilder(cadNum)).reverse().toString();
        return cadNum.equals(numAlReves);
    }

    /**
     * Devuelve si un numero es primo
     *
     * @param numero
     * @return <code>false</code> si el numero no es primo<br><code>true</code>
     * si el numero es primo
     * @throws EsNegatiuEX
     */
    public static boolean esPrimer(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX();
        }
        int limit = numero / 2 + 1;
        int div = 2;
        while (div < limit) {
            if (numero % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }

    /**
     * saca el factorial
     *
     * @param numero
     * @return fact
     * @throws EsNegatiuEX
     * @see <a href=""http://www.sangakoo.com/es/temas/el-factorial-de-un-numero">“Sangaku Maths</a>
     */
    public static long getFactorial(int numero) throws EsNegatiuEX {
        if (numero < 0) {
            throw new EsNegatiuEX("no es pot calcular el factorial d'un número negatiu");
        }
        long fact = 1L;
        while (numero > 1) {
            fact *= numero;
            numero--;
        }
        return fact;
    }
}
