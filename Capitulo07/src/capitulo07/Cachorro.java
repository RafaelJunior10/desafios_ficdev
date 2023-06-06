/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo07;

/**
 *
 * @author ficdev
 */
public class Main {
    public static void main(String[] args) {
        Animal[] meusAnimais = new Animal[10];
        meusAnimais[0] = new Animal(4, 30);
        meusAnimais[1] = new Cachorro(4, 15, 2);
    }
}

class Animal {
    private int numPatas;
    private int peso;

    public Animal(int numPatas, int peso) {
        this.numPatas = numPatas;
        this.peso = peso;
    }
}

class Cachorro extends Animal {
    private int idade;

    public Cachorro(int numPatas, int peso, int idade) {
        super(numPatas, peso);
        this.idade = idade;
    }
}