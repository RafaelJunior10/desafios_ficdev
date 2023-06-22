/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo03.desafio03;

/**
 *
 * @author ficdev
 */
public class Media {
    

// Classe que representa um círculo

    private double raio; // Raio do círculo

    // Construtor da classe Circulo
    public Media(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}

