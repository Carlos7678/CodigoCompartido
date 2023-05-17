/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package inicio;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class SeparaNGTest {
    
    public SeparaNGTest() {
    }

    /**
     * Test of separa method, of class Separa.
     */
    @Test
    public void testSepara() {
        System.out.println("separa");
        String text = "Mezgustazprogramar";
        String separador = "z";
        Separa instance = new Separa();
        String[] expResult = {"me" , "gusta" , "programar"};
        String[] result = instance.separa(text, separador);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
//        @Test
    public void testSeparaDos() {
        System.out.println("separa");
        String text = null;
        String separador = null;
        Separa instance = new Separa();
        String[] expResult = null;
        String[] result = instance.separa(text, separador);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
