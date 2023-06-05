/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo06;

/**
 *
 * @author ficdev
 */
import java.util.Queue;
import java.util.LinkedList;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public static void main(String[] args) {
        Queue<Carro> minhaFila = new LinkedList<>();

        minhaFila.add(new Carro("Ford", "Mustang", 2020));
        minhaFila.add(new Carro("Chevrolet", "Camaro", 2021));
        minhaFila.add(new Carro("Dodge", "Charger", 2019));

        Carro carroRemovido = minhaFila.remove();
        System.out.println("Carro removido: " + carroRemovido.marca + " " + carroRemovido.modelo + " " + carroRemovido.ano);
    }
}

