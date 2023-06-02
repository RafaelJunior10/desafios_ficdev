/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package capitulo05;

/**
 *
 * @author ficdev
 */
public class PassagemDeParametros {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    
        System.out.println("antes de chamar o método:");
        System.out.println("a = " + a + ", b = " + b);

        // Chamada do método soma
        soma(a, b);

        System.out.println("Depois de chamar o método:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void soma(int x, int y) {
        int resultado = x + y;

        System.out.println("Resultado da soma: " + resultado);

        // Altera o valor da variável local x
        x = 0;
        System.out.println("valor de x dentro do método: " + x);
    }
}