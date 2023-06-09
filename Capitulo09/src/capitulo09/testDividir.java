/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

/**
 *
 * @author ficdev
 */
public class testDividir {
 
 public void testDividir() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 2);
        assertEquals(5, resultado);
    }
 public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(10, 20);
        System.out.println("Resultado da soma: " + resultado);
        
        try {
            int resultadoDivisao = calculadora.dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir: " + e.getMessage());
        }
    }
}