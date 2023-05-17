/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package calculador;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class CalculadorNGTest {
    
    public CalculadorNGTest() {
    }

    /**
     * Test of suma method, of class Calculador.
     */
//    @Test
    public void testSuma() {
        System.out.println("suma");
        double numero1 = 4.99;
        double numero2 = 5.0;
        Calculador instance = new Calculador();
        double expResult = 10.0;
        double result = instance.suma(numero1, numero2);
        assertEquals(result, expResult, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculador.
     */
   
    public void testResta() {
        System.out.println("resta");
        double numero1 = 4.99;
        double numero2 = 5.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.resta(numero1, numero2);
        assertEquals(result, expResult, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculador.
     */
//     @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.multiplica(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of divideix method, of class Calculador.
     */
     @Test
    public void testDivideix() {
        System.out.println("divideix");
        double numero1 = 0.0;
        double numero2 = 0.0;
        Calculador instance = new Calculador();
        double expResult = 0.0;
        double result = instance.divideix(numero1, numero2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
