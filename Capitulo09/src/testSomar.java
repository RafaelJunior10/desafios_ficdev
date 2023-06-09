/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class testSomar {
    
public void testSomar() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(10, 20);
        assertEquals(30, resultado);
    }