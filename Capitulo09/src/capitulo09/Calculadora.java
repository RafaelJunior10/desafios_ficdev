/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

/**
 *
 * @author ficdev
 */
import static org.junit.Assert.assertEquals;

public class Calculadora {
 
    private Calculadora calc = new Calculadora();

    /**
     * Test of somar method, of class junit.aplicativos.Calculadora
     */
    public void testSomar() {
        assertEquals(30, calc.somar(10, 20));
    }
    
    public int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.testSomar();
    }
}
