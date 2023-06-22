/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.programaPrincipal;

import capitulo03.desafio03.Media;

/**
 *
 * @author ficdev
 */
public class Main {
    
   public static void main(String[] args) {
        double raio = 3.5; // Raio do círculo

        Media circulo = new Media(raio); // Criação do objeto Circulo

        double area = circulo.calcularArea(); // Cálculo da área do círculo

        System.out.println("A área do círculo é: " + area);
    }
}
